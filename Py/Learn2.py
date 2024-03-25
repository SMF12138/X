print("Hello Py")
print(type("333"))
# 输出类型信息
print("1+1=", 1 + 1)
print("11//2", 11 // 2)
# 整除
print("11/2", 11 / 2)
print("11**2", 11 ** 2)
# 幂运算
# ctrl+shift+上下移动行代码
print("我是" + "你爸爸")
你爸爸 = "你爸爸"
print("我是" + 你爸爸)
爸爸 = 250
print("我是" + str(爸爸))
# 无法直接字符和int拼接
message = "我是%s" % 你爸爸
print(message)
message = "我是%d,大大的%d" % (爸爸, 爸爸)
print(message)
# 通过占位符拼接
baba = 1.1314
print("%5.2f" % baba)
# 此处5.2表示整数部分宽度5，不够不生效，小数部分宽度2，不够用空格补
ZXR = "张稀然"
print(f"{ZXR}说{你爸爸}是伟大的SMF")
# f{}这种形式，不用管数据类型，也不能控制精度
print(f"{ZXR}说{你爸爸}是伟大的{125 + 125}")
# 括号里也可以加表达式
爸爸 = input("你是谁\n")
# input默认存入字符串
print(f"我知道了，你是{爸爸}")
num1 = 10
num2 = 10
print(f"{num1 == num2}类型{type(num1 == num2)}")
if baba == "SMF":
    print("对")
else:
    print("爸爸是我")
zhishang = 120
if zhishang == 120:
    print("好人")
elif zhishang < 120:
    # Py中的else if
    print("傻")
else:
    print("不傻")
while baba != "我":
    print("太好了")
    baba = "我"
i = 0
i += 1
# Py中没有++
print("Hello", end=' ')
print("World", end=' ')
# 不换行
print("\tHello", end=' ')
# 制表符

