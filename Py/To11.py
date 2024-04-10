class Animal:
    # 父类定义一个抽象方法(接口)
    def speak(self):
        pass


class Dog(Animal):
    def speak(self):
        print("狗叫")


class Cat(Animal):
    def speak(self):
        print("喵喵")


# 类型要求传递的父类，实际传递了子类
def make_noise(animal: Animal):
    animal.speak()


# 多态
dog = Dog()
cat = Cat()
make_noise(cat)
make_noise(dog)
