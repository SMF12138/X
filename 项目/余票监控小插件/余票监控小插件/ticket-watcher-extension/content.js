let isListening = true; // 核心开关
// 定义所有定时器/监听器，用于销毁，必须全局！
let pollTimer = null;     // 5秒余票检查定时器
let domObserver = null;   // DOM变化监听器
let soundTimer = null;    // 声音提醒定时器
let apiPollTimer = null;  // API轮询定时器

// 配置查询车辆及其座次
const WATCH_TRAINS = [
  { train: "G6290", seat: "ZE" },
  { train: "G1704", seat: "ZE" }
];

// API查询配置（从URL参数中提取）
const API_CONFIG = {
  date: "",        // 查询日期，首次运行时从页面URL获取
  fromStation: "", // 出发站代码
  toStation: "",   // 到达站代码
};

const TicketState = {
  NONE: "none", // 无票（包括候补）
  LOW: "low",   // 票少
  AVAILABLE: "available" // 有票
};
const SOUND_INTERVAL = 500;
const lastStateMap = {};

// 从页面URL获取查询参数
function extractQueryParams() {
  const url = new URL(window.location.href);
  // 尝试从页面的隐藏表单或URL参数获取
  const trainDateInput = document.getElementById("train_date");
  const fromStationInput = document.getElementById("fromStationText");
  const toStationInput = document.getElementById("toStationText");

  if (trainDateInput) {
    API_CONFIG.date = trainDateInput.value;
  }
  if (fromStationInput && fromStationInput.value) {
    // 需要从station标签获取stationCode
    const fromTag = document.getElementById("fromStation");
    const toTag = document.getElementById("toStation");
    if (fromTag) API_CONFIG.fromStation = fromTag.getAttribute("value") || fromTag.value;
    if (toTag) API_CONFIG.toStation = toTag.getAttribute("value") || toTag.value;
  }
  console.log("📡 API配置:", API_CONFIG);
}

// 通过API获取余票数据
async function fetchTicketData() {
  if (!API_CONFIG.date || !API_CONFIG.fromStation || !API_CONFIG.toStation) {
    extractQueryParams();
    console.log("📡 提取参数 - 日期:", API_CONFIG.date, "出发:", API_CONFIG.fromStation, "到达:", API_CONFIG.toStation);
    if (!API_CONFIG.date || !API_CONFIG.fromStation || !API_CONFIG.toStation) {
      console.log("⚠️ 无法获取查询参数，跳过API轮询");
      return null;
    }
  }

  const apiUrl = `https://kyfw.12306.cn/otn/leftTicket/queryG?leftTicketDTO.train_date=${API_CONFIG.date}&leftTicketDTO.from_station=${API_CONFIG.fromStation}&leftTicketDTO.to_station=${API_CONFIG.toStation}&purpose_codes=ADULT`;

  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    return data;
  } catch (e) {
    console.error("API请求失败:", e);
    return null;
  }
}

// 从API数据中提取指定车次的余票信息
function parseTrainTicket(apiData, trainNo, seatType) {
  if (!apiData || !apiData.data || !apiData.data.result) return null;

  for (const item of apiData.data.result) {
    const fields = item.split("|");
    if (fields[3] === trainNo) {
      const seatIndex = { "ZE": 30, "ZY": 31, "SW": 32 };
      const idx = seatIndex[seatType];
      if (idx !== undefined) return fields[idx];
    }
  }
  return null;
}

// API轮询检查余票
async function apiCheckOnce() {
  if (!isListening) return;

  const data = await fetchTicketData();
  if (!data) return;

  const seatName = { "ZE": "二等座", "ZY": "一等座", "SW": "商务座" };
  const summary = [];

  WATCH_TRAINS.forEach(({ train, seat }) => {
    const countStr = parseTrainTicket(data, train, seat);
    if (countStr === null || countStr === undefined) return;

    let count;
    if (countStr === "有") {
      count = "有";
    } else if (countStr === "无" || countStr === "" || countStr === "*") {
      count = 0;
    } else {
      count = parseInt(countStr, 10);
      if (isNaN(count)) count = 0;
    }

    const state = parseState(count);
    const key = `${train}_${seat}`;
    const last = lastStateMap[key];

    // 构建摘要
    let status;
    if (count === "有") status = "✅ 有票";
    else if (count === 0) status = "❌ 无票";
    else if (count === "候补") status = "⏳ 候补";
    else status = `🎫 余${count}张`;
    summary.push(`${train} ${seatName[seat]}: ${status}`);

    if (!last) {
      lastStateMap[key] = { state, count };
      return;
    }

    if (state !== last.state || count !== last.count) {
      if (last.state === TicketState.NONE && state !== TicketState.NONE) {
        const msg = `🚄 ${train} 放票了！余票 ${count}`;
        notify(msg);
        startSoundLoop();
      }
      lastStateMap[key] = { state, count };
    }
  });

  if (summary.length > 0) {
    console.log(`[${new Date().toLocaleTimeString()}] ${summary.join(" | ")}`);
  }
}

// 解析余票状态
function parseState(count) {
  if (count === "有") return TicketState.AVAILABLE;
  if (count === 0 || count === "候补" || count === "--" || count === "*") return TicketState.NONE;
  if (count <= 3) return TicketState.LOW;
  return TicketState.AVAILABLE;
}

// 解析余票数量
function parseCountFromTd(td) {
  if (!td) return null;
  const aria = td.getAttribute("aria-label");
  if (!aria) return null;
  if (aria.includes("余票有")) return "有";
  if (aria.includes("余票无") || aria.includes("余票候补")) return "候补";
  const textContent = td.textContent.trim();
  if (textContent === "--" || textContent === "*") return "--";
  const match = aria.match(/余票(\d+)/);
  return match ? parseInt(match[1], 10) : null;
}

// 弹窗提醒
function notify(msg) {
  const oldTip = document.querySelector('.ticket-tip');
  if (oldTip) oldTip.remove();
  const div = document.createElement("div");
  div.className = 'ticket-tip';
  div.innerText = msg;
  Object.assign(div.style, {
    position: "fixed", top: "20px", right: "20px", padding: "12px 16px",
    background: "#ff4d4f", color: "#fff", zIndex: 999999, borderRadius: "6px",
    fontSize: "14px", cursor: "pointer"
  });
  div.title = "点击停止声音提醒";
  div.onclick = stopSound;
  document.body.appendChild(div);
}

// 播放提示音
function playBeep() {
  const audio = new Audio("https://actions.google.com/sounds/v1/alarms/beep_short.ogg");
  audio.play().catch(() => {});
}

// 循环播放提示音
function startSoundLoop() {
  if (soundTimer) return;
  playBeep();
  soundTimer = setInterval(playBeep, SOUND_INTERVAL);
}

// 停止声音提醒
function stopSound() {
  if (soundTimer) {
    clearInterval(soundTimer);
    soundTimer = null;
    console.log("🔕 已停止声音提醒");
  }
}

// 单次检查余票
function checkOnce() {
  if (!isListening) return;
  WATCH_TRAINS.forEach(({ train, seat }) => {
    const td = document.querySelector(`td[id^="${seat}_"][aria-label^="${train}次列车"]`);
    if (!td) return;
    const count = parseCountFromTd(td);
    if (count === null) return;
    const state = parseState(count);
    const key = `${train}_${seat}`;
    const last = lastStateMap[key];
    if (!last) {
      lastStateMap[key] = { state, count };
      console.log(`初始化 ${train}:`, state, count);
      return;
    }
    if (state !== last.state || count !== last.count) {
      console.log(`🎫 ${train} 状态变化：`, last.state, "→", state, "票数: ", count);
      if (last.state === TicketState.NONE && state !== TicketState.NONE) {
        const msg = `🚄 ${train} 放票了！余票 ${count}`;
        notify(msg);
        startSoundLoop();
      }
      lastStateMap[key] = { state, count };
    }
  });
}

// ✅ 彻底启动所有监听任务
function startAll() {
  if (!isListening) return;
  // DOM变化监听（页面自然刷新时触发）
  domObserver = new MutationObserver(() => setTimeout(checkOnce, 200));
  domObserver.observe(document.body, { childList: true, subtree: true, attributes: true, attributeFilter: ["aria-label"] });
  // DOM轮询检查（备用）
  if (!pollTimer) pollTimer = setInterval(checkOnce, 5000);
  // API轮询（核心：自动刷新数据）
  extractQueryParams();
  if (!apiPollTimer) apiPollTimer = setInterval(apiCheckOnce, 10000);
  console.log("✅ 余票监听-所有功能已启动（含API自动刷新）");
}

// ✅ 彻底停止所有任务（核心暂停逻辑，无任何残留）
function stopAll() {
  isListening = false;
  if (domObserver) domObserver.disconnect();
  if (pollTimer) { clearInterval(pollTimer); pollTimer = null; }
  if (apiPollTimer) { clearInterval(apiPollTimer); apiPollTimer = null; }
  stopSound();
  Object.keys(lastStateMap).forEach(k => delete lastStateMap[k]);
  console.log("⛔ 余票监听-所有功能已彻底暂停");
}

// 监听背景页的指令，百分百响应
chrome.runtime.onMessage.addListener((message) => {
  if (message.action === "enable") {
    isListening = true;
    startAll();
    console.log("🎉 余票监听已启用【页面日志】");
  } else if (message.action === "disable") {
    stopAll();
    console.log("⛔ 余票监听已暂停【页面日志】");
  }
});

// 初始化启动
startAll();
console.log("=================================");
console.log("✅ 余票监听脚本已成功注入12306页面");
console.log("✅ 初始状态：余票监听已启用");
console.log("=================================");