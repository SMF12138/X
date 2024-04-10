# 注解(告诉编译器变量什么类型),可以提示自己
import random

from typing import List, Tuple, Dict, Union

var1: int = 10
var2: str = "11223"
var3: bool = True


class Student:
    pass


stu: Student = Student()
# 通过变量加:进行注解和详细注解
my_list1: list = [1, 2, 3]
my_tuple1: tuple = (1, 2, 3)
my_dict1: dict = {"zhangsan": 2}
my_list2: List[int] = [1, 2, 3]
my_tuple2: Tuple[int, str, bool] = (1, "2", True)
my_dict2: Dict[str, int] = {"zhangsan": 2}

# 或通过这种方法
i = random.randint(1, 10)  # type: int
# 混合型注释
liebiao: List[Union[str, int]] = [1, 2, "bb", "aa"]


# ->表示返回的类型
def add(x: int, y: int) -> int:
    return x + y


add(1, 5)
