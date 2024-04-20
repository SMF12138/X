# 正则表达式元字符匹配
import re

s = "FLYJs.SMF@qq.12138"
# \d表示数字,前面加r表示字符串里的转义字符无效,为普通字符
result1 = re.findall(r'\d', s)
# \W表示非单词字符,\w表示单词字符
result2 = re.findall(r'\W', s)
# []表示对范围的限定,比如限定所有的英文字母
# {}表示对长度的限定
# ^表示从头开始匹配
# $表示匹配到结尾
result3 = re.findall(r'^[a-zA-Z]{6,10}$', s)
# 第一位范围1-9,后面范围0-9,长度5-11位
result4 = re.findall(r'^[1-9][0-9]{4,10}$', s)
# +表示至少一个
# ()表示一个分组
# \.表示匹配.本身
# *表示()中内容可以出现任意次
# |表示匹配左右任意一个表达式
result5 = re.findall(r'(^[\w-]+(\.[\w-]+)*@(qq|163|gmail)(\.[\w-]+)+$)', s)
print(result1)
print(result2)
print(result3)
print(result4)
print(result5)
print(re.match(r'(^[\w-]+(\.[\w-]+)*@(qq|163|gmail)(\.[\w-]+)+$)', s).group())
