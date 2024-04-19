# 装饰器 outer,它接受一个函数作为参数,并返回一个内部函数 inner
# 一般写法

def outer(func):
    def inner():
        print("哈")
        func()
        print("起")

    return inner


# 糖写法,相当于执行了 sleep = outer(sleep)
@outer
def sleep():
    print("睡")


fn = outer(sleep)
fn()
# @之后就可以直接调用函数,并且此时func()等价于
sleep()
