def myprint1():
    print("一个模块函数")


def myprint2():
    print("令一个模块函数")


def str_reverse(s):
    """
    功能将字符串反转
    :param s: 要反转的字符串
    :return: 反转后的字符串
    """
    return s[::-1]


def substr(s, x, y):
    """
    按照指定下标对字符串切片
    :param s: 即将被切片的字符串
    :param x: 开始下标
    :param y: 结束下标
    :return: 切片后的字符串
    """
    return s[x:y]


def print_file_info(file_name):
    """
    功能是将给定路径的文件内容输出
    :param file_name: 文件路径
    :return: None
    """
    f = None
    try:
        f = open(file_name, "r", encoding="UTF-8")
        content = f.read()
        print("文件内容如下")
        print(content)
    except Exception as e:
        print(f"出现异常{e}")
    finally:
        # 如果异常则f为None不进入
        if f:
            f.close()


def append_to_file(file_name, data):
    """
    功能是将指定的数据添加到文件
    :param file_name: 文件路径
    :param data: 指定的数据
    :return: None
    """
    f = open(file_name,"a",encoding="UFT-8")
    f.write(data)
    f.write("\n")
    f.close()


if __name__ == '__main__':
    # 测试要写在main里
    print("厉害的我")
    print_file_info("C:\\Users\\86177\\Desktop\\风不死\\编码\\Git\\C\\Learn C\\Git3.c")
