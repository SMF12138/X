from To24 import str_tool
# 单例模式,避免设计大量对象节省内存,创建对象时间,一个实例改变所有对象都改变
s1 = str_tool
s2 = str_tool
print(id(s1))
print(id(s2))
print(id(str_tool))
