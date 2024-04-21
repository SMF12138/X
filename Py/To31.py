import os


def test_os():
    # 将路径文件列出
    print(os.listdir("C:\\Users\\86177\\Desktop\\风不死"))
    # 判断路径是否是文件夹
    print(os.path.isdir("C:\\Users\\86177\\Desktop\\风不死"))
    # 判断路径是否存在
    print(os.path.exists("C:\\Users\\86177\\Desktop\\风不死"))


def get_file(path):
    """
    从指定文件夹中使用递归的方式获取全部文件列表
    :param path: 被判断的文件夹
    :return: list,包含全部文件,若目录不存在或无文件返回空list
    """
    file_list = []
    if os.path.exists(path):
        for f in os.listdir(path):
            new_past = path + "\\" + f
            if os.path.isdir(new_past):
                file_list += get_file(new_past)
            else:
                file_list.append(new_past)
    else:
        print(f"指定的目录{path},不存在")
        return []

    return file_list


if __name__ == '__main__':
    test_os()
    print(get_file("C:\\Users\\86177\\Desktop\\风不死\\编码\\软件\\SMF的自制软件"))
