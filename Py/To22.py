# 闭包,避免设置全局变量被随意修改
def outer(logo):
    def inner(msg):
        print(f"{logo},{msg},{logo}")

    return inner


fn1 = outer("baba")
# 此时fn1变成了一个可以传参的函数
fn1("大家好")


def account_create(initial_amount=0):
    def atm(num, deposit=True):
        # 在内部函数中修改外部函数中定义的变量需要用nonlocal声明
        nonlocal initial_amount
        if deposit:
            initial_amount += num
            print(f"存款:+{num},账户余额:{initial_amount}")
        else:
            initial_amount -= num
            print(f"取款:-{num},账户余额:{initial_amount}")

    return atm


atm = account_create()
atm(100)
atm(200)
atm(100, deposit=False)
