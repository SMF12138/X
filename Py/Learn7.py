A = [1, 2, 3, 4, 5, 6]
B = (1, 2, 3, 4, 5, 6)
C = {1, 2, 3, 4, 5, 6}
D = "123456"
E = {1: 1, 2: 2, 3: 3, 4: 4, 5: 5, 6: 6}
print(sorted(A))
print(sorted(B))
print(sorted(C))
print(sorted(D))
print(sorted(E))
# 对容器进行排序，放入列表之中(字典值丢失)
print(sorted(A, reverse=True))
print(sorted(B, reverse=True))
print(sorted(C, reverse=True))
print(sorted(D, reverse=True))
print(sorted(E, reverse=True))


# reverse表示反转


def test():
    return 1, 2, 3, "bb"


# 可以返回多个不同值


A, B, C, D = test()
print(A)
print(B)
print(C)
print(D)


def RR(name, age, gender):
    print(name)
    print(age)
    print(gender)


RR(name=1, gender=3, age=3)


# 可以通过键值方式传递参数


def RX(name, age, gender="男"):
    # 可以给自定义函数赋值，如果没有传参用默认值,但如果设置默认值必须把参数放在最后
    print(name)
    print(age)
    print(gender)


RX(1, 2)


def user1(*p):
    # *p是一个不定长传参的表示，p默认为元组类型
    print(p)


user1('a', 's', 'd', 'f', "baba")


def user2(**p):
    # **p是一个不定长传参的表示，p默认为字典类型
    print(p)


user2(name="baba", age=3, oo="我是你爹")


