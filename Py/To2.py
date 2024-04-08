class Student:
    name = None

    # 方法中自动默认带有self,并且访问属性时需要如下调用
    def say(self):
        print(f"大家好我是{self.name}")

    def sayup(self, msg):
        print(f"我是爸爸{msg}")


stu = Student()
stu.name = "周杰伦"
stu.say()
stu.sayup("诶呦不错u")






