# 用__all__ 修饰，当被使用from L11 import *导入时只能导入这个列表中的函数(*就代表all)
__all__ = ["main1"]


def main1():
    print("baba")


def main2():
    print("baba")


# __name__ 为内置变量，运行时自动赋值为 __name__,当作为模块被导入时赋值改变
if __name__ == '__main__':
    main1()
