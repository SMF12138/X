package NewLearn.Learn173;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        //基于TCP协议实现单向通信
        Socket clientSocket = null;
        ServerSocket serverSocket = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            serverSocket = new ServerSocket(8888);//创建服务器套接字对象
            System.out.println("服务器启动成功，等待客户端访问");
            clientSocket = serverSocket.accept();//接收客户端请求
            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String s = null;
            Scanner scanner = new Scanner(System.in);
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                System.out.println("->:");
                bw.write("客户端->:");
                bw.write(scanner.nextLine());
                bw.write("\n");//这里要加换行符否则客户端会认为是同一行因此一直读取
                bw.flush();
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (br != null) {
                try {
                    br.close();
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
            if (serverSocket != null) {
                try {
                    serverSocket.close();//关闭服务器端套接字
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
