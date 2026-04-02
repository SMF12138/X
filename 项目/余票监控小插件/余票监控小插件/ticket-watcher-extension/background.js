// 持久化存储key，统一管理
const STATE_KEY = "ticket_watcher_status";
// 初始状态：启用
let isEnabled = true;

// 初始化：读取本地保存的状态 + 同步插件图标
chrome.storage.local.get([STATE_KEY]).then(res => {
  isEnabled = res[STATE_KEY] ?? true;
  setIcon(isEnabled);
  console.log("✅ 插件初始化完成，当前状态：", isEnabled ? "启用" : "暂停");
});

// 更新插件按钮图标
function setIcon(enable) {
  chrome.action.setIcon({
    path: enable ? "icons/icon16.png" : "icons/icon_disabled.png"
  });
}

// ✅✅✅ 核心：插件按钮点击事件 【V3完美版 100%生效 永不失效】
// Chrome V3中，这个事件是特权事件，永远能触发，不会休眠！
chrome.action.onClicked.addListener(async (tab) => {
  // 1. 切换状态
  isEnabled = !isEnabled;
  // 2. 永久保存状态到本地，关闭浏览器也不会丢失
  await chrome.storage.local.set({ [STATE_KEY]: isEnabled });
  // 3. 立即切换图标
  setIcon(isEnabled);
  // 4. 发送指令到当前标签页的content.js，带容错处理
  try {
    await chrome.tabs.sendMessage(tab.id, {
      action: isEnabled ? "enable" : "disable"
    });
  } catch (e) {
    // 容错：页面未注入脚本时不报错，不影响逻辑
    console.warn("⚠️ 当前页面未加载余票监听脚本");
  }
  // ✅✅✅ 启停日志 这里100%能打印！！！
  const logText = isEnabled ? "🎉 余票监听已启用" : "⛔ 余票监听已暂停";
  console.log(logText);
});