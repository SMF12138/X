package NewLearn.Learn8;
import java.util.Scanner;
public class Learn8 {
    public static void main(String[] args) {
        m1();//如果方法和调用处于同一类，则可类名省
        A.m2();//否则不可省

    }
    public static void m1(){
        System.out.println("wsnbb");
    }
    public static boolean check(String username,String password){
        return username.equals("admin")&&password.equals("abc");//equals用于比较字符串是否相等
    }

    //Java方法创建时不分配内存，调用时才分配栈，编译后的字节码储存在元空间，函数不断压栈(在JVM中)，栈顶函数活跃，函数结束时弹栈
    //元空间字节码使用本地内存防止内存溢出
    class A{
        public static void m2(){
            System.out.println("wysnbb");
        }
    }
}

