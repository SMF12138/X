package NewLearn.Learn174;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "动力节点".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length, InetAddress.getLocalHost(),8888);
        ds.send(dp);
        ds.close();
    }
}
