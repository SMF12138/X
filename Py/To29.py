# 正则表达式,验证字符串是否匹配
import re

s = 'wsbb wsbb kkk'
# re.match对开头进行匹配,没有成功返回NULL
result1 = re.match('wsbb', s)
print(result1)
# 匹配到的下标
print(result1.span())
# 匹配的内容
print(result1.group())
# re.match对全局进行匹配,没有成功返回NULL
result2 = re.search('kkk', s)
print(result2)
print(result2.span())
print(result2.group())
# re.findall对全局进行匹配,返回所有成功值,没有成功返回NULL
result3 = re.findall('wsbb', s)
# 返回列表
print(result3)
