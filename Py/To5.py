# 魔术方法
class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # 通过下面定义的方法使打印出的student不再是地址
    def __str__(self):
        return f"{self.name},{self.age}"

    # 比较大小的魔术方法
    def __lt__(self, other):
        return self.age < other.age

    # 比较大小等于的魔术方法
    def __le__(self, other):
        return self.age <= other.age

    # 比较相等的魔术方法
    def __eq__(self, other):
        return self.age == other.age


student1 = Student("爸爸", 22)
student2 = Student("爸爸", 42)
# 若没有__str__(self)方法则以下输出的都是地址
print(student1)
print(str(student1))
# 若没有魔术方法__lt__(self, other)就无法比较
print(student1 < student2)
# 若没有魔术方法__le__(self, other)就无法比较
print(student1 <= student2)
# 若没有魔术方法__eq__(self, other)就无法比较
print(student1 == student1)
