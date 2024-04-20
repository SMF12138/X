# 客户端
import socket

# 创建socket对象
socket_client = socket.socket()
socket_client.connect(("localhost", 8888))
while True:
    msg = input("你:")
    if msg == 'exit':
        break
    socket_client.send(msg.encode("UTF-8"))
    recv_data = socket_client.recv(1024)
    print(f"林:{recv_data.decode('UTF-8')}")
socket_client.close()
