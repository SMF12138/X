import webbrowser
import os
import sys
import subprocess
import socket
import time
from urllib.parse import quote

BS_URL = "http://localhost:3000"
PROJECT_ROOT = r"D:/风不死/编码/Git/前端/Vue"

if len(sys.argv) > 1:
    current_file = sys.argv[1]
else:
    print("No file provided.")
    sys.exit(1)

def is_bs_running():
    try:
        s = socket.create_connection(("localhost", 3000), timeout=1)
        s.close()
        return True
    except Exception:
        return False

if not is_bs_running():
    print("Browsersync is not running. Starting it now...")
    startup = subprocess.STARTUPINFO()
    startup.dwFlags |= subprocess.STARTF_USESHOWWINDOW

    subprocess.Popen(
        [
            r"D:\NodeJs\npx.cmd",
            "browser-sync",
            "start",
            "--server",
            "--port",
            "3000",
            "--files",
            "**/*.html",
            "--watch-options-usePolling",
            "false",
            "--no-open"
        ],
        cwd=PROJECT_ROOT,
        startupinfo=startup
    )
    # 把等待时间尽可能调小
    time.sleep(1.2)

relative_path = quote(os.path.relpath(current_file, PROJECT_ROOT).replace("\\", "/"))
url = f"{BS_URL}/{relative_path}"
chrome_path = r"C:\Program Files\Google\Chrome\Application\chrome.exe %s"
webbrowser.get(chrome_path).open(url)
