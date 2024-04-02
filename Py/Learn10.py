# 捕获异常
try:
    f = open("C:\\Users\\86177\\Desktop\\交互文件X.txt", "r", encoding="UTF-8")
except:
    print("异常，文件不存在")
    f = open("C:\\Users\\86177\\Desktop\\交互文件3.txt", "w", encoding="UTF-8")
# 捕获特定异常
try:
    print(bb)
except NameError:
    print("异常，未定义")
# 将异常设置成e
try:
    print(bb)
except NameError as e:
    print("异常，未定义")
    print(e)
# 捕获多个异常
try:
    print(bb)
except (NameError, ZeroDivisionError) as e:
    print("异常，未定义或除以0")
    print(e)

# 捕获所有异常
try:
    print(bb)
except Exception as e:
    print("有异常")
    print(e)

try:
    print("爸爸")
except Exception as e:
    print("有异常")
    print(e)
# 没有异常跳转到else
else:
    print("没有异常")
# 不管有没有异常都执行
finally:
    f.close()


# 异常具有传递型
def func1():
    print("func1 开始执行")
    num = 1 / 0
    print("func1 结束")


def func2():
    print("func2 开始执行")
    func1()
    print("func2 结束")


def main():
    try:
        func2()
    except Exception as e:
        print(f"出现了{e}异常")


main()
