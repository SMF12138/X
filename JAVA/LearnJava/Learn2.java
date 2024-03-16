package LearnJava.Learn2;

import java.io.PrintStream;
import java.security.Permission;
import java.security.PublicKey;

public class Learn2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);//此时s相当于键盘扫描器
        int a = s.nextInt();
        double b = s.nextDouble();
        String c = s.next();//接收字符串，空格之前的内容
        s.nextLine();//读取缓存中回车符
        String d = s.nextLine();//接收字符串，换行符之前的内容
        //在Java中方法执行时，会为方法分配局部变量表(存储局部变量),操作数栈(参与运算的数据)
        //在字节码中，bipush代表由操作数栈弹出到局部变量表的数据
        //iload_1表示将局部变量表一号位上的数据复制一份到操作数栈
        //istore_1代表弹出到1号位
        //iinc 2,1代表将2号位数据加1
        int i = 10;
        int k = i++ + ++i;//22
        int x = 10;
        x = x++;//由于后置++，开始的x覆盖了x++的值，结果为10
        int y = 10;
        y = ++y;//11
    }
}