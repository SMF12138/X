package NewLearn.Learn174;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws Exception {
        //基于UDP协议的编程(无客户端服务端)
        DatagramSocket ds = new DatagramSocket(8888);//类似于服务器端口
        byte[] bytes = new byte[64 * 1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);//创建接收包对象
        ds.receive(dp);//接收到包
        String s = new String(bytes, 0, dp.getLength());
        System.out.println("接收到的消息:" + s);
        ds.close();
    }
}
