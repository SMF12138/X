import threading


# 多线程

def sing(msg):
    while True:
        print(msg)


def dance(msg):
    while True:
        print(msg)


if __name__ == '__main__':
    # 创建线程
    sing_thread = threading.Thread(target=sing, args=("我也吃过",))
    # 分别传入元组格式(一个元素括号内要加逗号)和字典格式
    dance_thread = threading.Thread(target=dance, kwargs={"msg": "我是你爸爸"})
    sing_thread.start()
    dance_thread.start()
