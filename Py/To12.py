from pymysql import Connection

# 构建链接
conn = Connection(
    host="localhost",  # 主机名
    port=3306,  # 端口
    user="root",  # 账户
    password="FLYJs-SMF12138"  # 密码
)
# 获取并打印数据库基本信息
print(conn.get_server_info())
# 获取游标对象
cursor = conn.cursor()
# 选择数据库
conn.select_db("test")
# 执行sql(通过游标对象),execute输入sql语句(并且在Py中执行语句;可省)
try:
    cursor.execute("create table py(id int);")
except Exception:
    print("已有该表")
# 查询
cursor.execute("select * from student;")
# fetchall()获取查询结果
results: tuple = cursor.fetchall()
for r in results:
    print(r)
conn.close()
