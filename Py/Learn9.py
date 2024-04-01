# w 覆盖写入，文件不存在则创建
f = open("C:\\Users\\86177\\Desktop\\交互文件.txt", "w", encoding="UTF-8")
f.write("我是爸爸，爸爸是我，我是爸爸")
# 将内存中的内容放入磁盘中
f.flush()
# close内置了flush()功能
f.close()

# a追加写入，文件不存在创建
f = open("C:\\Users\\86177\\Desktop\\交互文件.txt", "a", encoding="UTF-8")
f.write("\n我是爸爸，爸是我爸，我是爸爸")
f.write("\n我是爸爸，爸爸是我，我是爸爸")
f.close()

fr = open("C:\\Users\\86177\\Desktop\\交互文件.txt", "r", encoding="UTF-8")
fw = open("C:\\Users\\86177\\Desktop\\交互文件2.txt", "w", encoding="UTF-8")
for line in fr:
    line = line.strip()
    if line.split("，")[1] == "爸爸是我":
        continue
    fw.write(line)
    fw.write("\n")
fr.close()
fw.close()
