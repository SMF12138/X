package NewLearn.Learn127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Learn127 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {//标准输入流转字符流
            //标准输出流和输入流性质类似，默认像控制台输出，无需刷新
            PrintStream out = System.out;
            out.println("输出");
            System.setOut(new PrintStream("src\\NewLearn\\Learn127\\linshii.txt"));//更改输出方向
            System.out.println("输出");//同样初始化后更改调用要从System开始(因为out对象没有更改)
            String s;
            while ((s = br.readLine()) != null) {//一次接收一行
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
