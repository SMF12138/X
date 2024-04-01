import time


def test_func(computer):
    result = computer(1, 2)
    print(result)
    print(type(computer))


def computer(x, y):
    return x + y


test_func(computer)
test_func(lambda x, y: x - y)
# 通过lambda的方式可以传递匿名函数，只能一次性调用，:前是传参形式，:后是返回形式


f = open("C:\\Users\\86177\\Desktop\\思修.txt", "r", encoding="UTF-8")
# r 只读
print(type(f))
# f是一个对象，read函数读取，括号中读取的是字节长度，若没有传入读取所有
print(f.read(10))
# 第二次读取会接着第一次,若第一次读取只剩下一个换行符，则下一次会直接换行
print(f.read(10))
# 按照行的形式一次性读取并返回一个列表，每行数据为一个元素,若为readline则每次读取一行
print(f.readlines())
f.close()
# 关闭文件
time.sleep(5)
# 睡眠50秒
with open("C:\\Users\\86177\\Desktop\\思修.txt", "r", encoding="UTF-8") as f:
    # 用with open 打开可以执行完语句块后自动关闭f
    for line in f:
        print(line)
        # 每个line临时变量代表了文件的一行数据

f = open("C:\\Users\\86177\\Desktop\\英语.txt", "r", encoding="UTF-8")
content = f.read()
print(type(content))
count = content.count(" ")
# 可以获得文件里特定字符的数目
print(count)
f.close()
f = open("C:\\Users\\86177\\Desktop\\英语.txt", "r", encoding="UTF-8")
sum1 = 0
for line in f:
    line=line.strip()
    # 去除开头结尾的空格和换行符
    words = line.split(" ")
    # 用空格切片并打印
    print(words)
    for word in words:
        if word == 'in':
            sum1 += 1
print(sum1)
