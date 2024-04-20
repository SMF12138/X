# Socket服务器开发
import socket

# 创建socket对象
socket_server = socket.socket()
# 绑定ip地址和端口
socket_server.bind(("localhost", 8888))
# 监听窗口,允许连接数量为1
socket_server.listen(1)
# 等待用户连接,返回类型为二元元组,accept()是阻塞的方法,也就是说没有连接不继续执行
result: tuple = socket_server.accept()
# 第一个元素表示客户端和服务端的连接对象
conn = result[0]
# 第二个元素表示客户端的地址信息
address = result[1]
print(f"已接收，客户{address}")
while True:
    # 接受客户端信息
    data = conn.recv(1024).decode("UTF-8")
    # recv接受信息,1024为缓冲区大小,返回值是字节数组可以通过decode将其转为字符串
    print(f"苏:{data}")
    msg = input("你:")
    if msg == 'exit':
        break
    conn.send(msg.encode("UTF-8"))
conn.close()
socket_server.close()
