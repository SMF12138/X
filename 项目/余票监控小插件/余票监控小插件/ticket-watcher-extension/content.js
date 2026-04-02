let isListening = true; // 核心开关
// 定义所有定时器/监听器，用于销毁，必须全局！
let pollTimer = null;     // 5秒余票检查定时器
let autoQueryTimer = null;// 10秒自动点击查询定时器
let domObserver = null;   // DOM变化监听器
let soundTimer = null;    // 声音提醒定时器

// 配置查询车辆及其座次
const WATCH_TRAINS = [
  { train: "G373", seat: "ZE" },
  { train: "G1205", seat: "ZE" }
];

const TicketState = {
  NONE: "none", // 无票（包括候补）
  LOW: "low",   // 票少
  AVAILABLE: "available" // 有票
};
const SOUND_INTERVAL = 500;
const lastStateMap = {};

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

// 模拟点击查询按钮
function simulateQueryClick() {
  const queryButton = document.getElementById("query_ticket");
  if (queryButton) {
    const event = new MouseEvent("click", { bubbles: true, cancelable: true, view: window });
    queryButton.dispatchEvent(event);
  }
}

// 自动查询逻辑
function autoQuery() {
  const queryBtn = document.getElementById("query_ticket");
  if(!queryBtn) {
    console.log("⚠️ 查询按钮未找到，跳过本次自动点击");
    return;
  }
  simulateQueryClick();
  console.log("🔄 自动点击查询按钮");
}

// ✅ 彻底启动所有监听任务
function startAll() {
  if (!isListening) return;
  domObserver = new MutationObserver(() => setTimeout(checkOnce, 200));
  domObserver.observe(document.body, { childList: true, subtree: true, attributes: true, attributeFilter: ["aria-label"] });
  if (!pollTimer) pollTimer = setInterval(checkOnce, 5000);
  //轮询速度设置为1000
  if (!autoQueryTimer) autoQueryTimer = setInterval(autoQuery, 1000);
  console.log("✅ 余票监听-所有功能已启动");
}

// ✅ 彻底停止所有任务（核心暂停逻辑，无任何残留）
function stopAll() {
  isListening = false;
  if (domObserver) domObserver.disconnect();
  if (pollTimer) { clearInterval(pollTimer); pollTimer = null; }
  if (autoQueryTimer) { clearInterval(autoQueryTimer); autoQueryTimer = null; }
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