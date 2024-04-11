from pymysql import Connection

# 构建链接
conn = Connection(
    host="localhost",  # 主机名
    port=3306,  # 端口
    user="root",  # 账户
    password="FLYJs-SMF12138",  # 密码
    autocommit=True  # 这里设置更改数据自动提交则可以忽略下方的手动提交
)
# 获取并打印数据库基本信息
print(conn.get_server_info())
# 获取游标对象
cursor = conn.cursor()
# 选择数据库
conn.select_db("test")
# 执行sql(通过游标对象),execute输入sql语句(并且在Py中执行语句;可省)
try:
    cursor.execute("insert into student values(1,'学妹',18);")
except Exception:
    print("已有学妹")
# 要产生数据更改时需要手动数据确认
conn.commit()
conn.close()
