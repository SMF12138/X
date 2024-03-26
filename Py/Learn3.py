X = ["我", "儿子", "媳妇"]
# 列表
print(X)
print(type(X))
X = [['BB', 'MM'], ['TBB', 'TMM', 666], [666]]
print(X)
print(X[0][1])
print(X[0][-1])
print(X.index([666]))
# 位置
X.insert(2, "我是爸爸")
# 插入元素
print(X)
X.append("真的吗")
# 追加一个元素
print(X)
X.extend(["哈哈哈哈", "笑死我了"])
X.extend("dd")
# 可以将其他容器添加到列表尾部
print(X)
del X[1][2]
print(X)
ele = X.pop(2)
# pop函数删除并返回取出的元素
print(f"取出的元素:{ele}")
print(X)
X.remove("d")
# 删除列表中第一个匹配项
print(X)
X.clear()
print(X)
X = [1, 1, 1, 2, 3, 3, 4, 5, 7]
count = X.count(1)
# 某元素的数量
print(count)
print(len(X))
index = 0
while index < len(X):
    ele = X[index]
    print(ele)
    index += 1

for index in X:
    print(index)
