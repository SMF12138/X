my_list = [["a", 33], ["b", 55], ["c", 11]]


def choose_sort_key(element):
    return element[1]


# 选择下标排序
my_list.sort(key=choose_sort_key, reverse=True)
print(my_list)
my_list.sort(key=lambda element: element[1], reverse=True)
print(my_list)
