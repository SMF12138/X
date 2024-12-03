package NewLearn.Learn173;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket clientSocket = null;
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            InetAddress ip = InetAddress.getLocalHost();
            int port = 8888;
            //创建客户端套接字，需要指定ip和端口
            clientSocket = new Socket(ip, port);
            bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要发送的消息");
            while (true) {
                System.out.println("->:");
                bw.write("客户端->:");
                bw.write(scanner.nextLine());
                bw.write("\n");//这里要加换行符否则服务端会认为是同一行因此一直读取
                bw.flush();
                Thread.sleep(1000);
                System.out.println(br.readLine());
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bw != null) {
                try {
                    bw.close();//先关闭流再关闭套接字
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
