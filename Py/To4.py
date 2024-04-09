class Student:
    # 构造方法
    def __init__(self, name, gender, age):
        self.name = name
        self.age = age
        self.gender = gender
        print("创建了一个对象")


# 通过这种方法直接定义对象
stu = Student("周杰伦", "男", 31)
