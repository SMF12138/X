# json语言是为了两种不同语言之间的转换(作为Py中的字典列表或字典可以无缝切换)
import json

data = [{"name": "老王", "age": 16}, {"name": "张三", "age": 18}]
# 将Py数据转成json(本质是字符串),ensure_ascii参数设置为了正确展示中文，即不使用ASC转换(unicode字符)而是直接输出内容
data = json.dumps(data, ensure_ascii=False)
print(data)
# 将json数据转成Py(字符串变列表)
data = json.loads(data)
print(data)
data = json.loads('{"name": "老王", "age": 16}')
print(data)
