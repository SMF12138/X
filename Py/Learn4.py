X = (1, 2, 3, 4, 5, 6, 7, 8)
Y = tuple([1, 2, 3, 4, 5, 7, 8])
# 定义一个元组，与列表不同在于无法改变
Z = ("hello",)
# 定义一个元素的元组要加逗号
A = (("a", "a"), ("b", "b"))
print(A[1][1])
B = (1, 2, 3, [4, 5, 6])
B[3][0] = 1
print(B)
# 元组本身不能修改，但若元组中有列表则可
C = "wsnbb"
print(C.index("b"))
D = C.replace("bb", "爸爸")
# 注意这里是产生了新字符串而不是替换了字符串
print(D)
# 替换
E = "Hello son ha ha"
_E = E.split(" ")
print(f"{_E},类型为{type(_E)}")
print(E.strip("ah"))
# 去除前后指定字符(按照单个进行)
print(E[2:])
# 切片
print(X[1:])
print(X[::-1])
# 若步长为负数则代表倒着取
W = {1, 2, 3, 4, 5, 6, 7, 8, 5}
# 集合自动去除重复
print(W)
W = set(X)
print(W)
# 集合不支持下标索引，但允许修改
W.add("PY")
W.remove(7)
WW = W.pop()
# 集合取出元素只能随机取
print(WW)
print(W)
W.clear()
WW = {1, 2, 3, 4}
WWW = WW.difference(W)
# 取差集(相同元素)
print(WWW)
WW.difference_update(WWW)
# 令WW消除差集，WWW不变
print(WWW)
print(WW)
XX = WW.union(WWW)
# WW和WWW不变，但是得到合并后新集合XX
print(XX)
Y = {1, 2, 3, 4, 5, 5, 6, 8}
print(len(Y))
# 计算长度时要注意去掉重复
for ele in Y:
    print(ele)
    # 由于集合不能下标索引遍历时不能用while只能用for
