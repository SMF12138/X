package NewLearn.Learn10;
//Java带包编译 javac -d [编译后路径] [Java源文件路径]
//运行时找到类根目录，java 包名.类名
//在一个包下的函数包名可省，否则不行，因此为便捷使用import导包，只有(java.lang包不需要手动导入)
//如import java.util.*;(类用*代表表示随时调用)
import static java.lang.System.*;//静态导入，导入了类中所有静态变量和方法
public class Learn10 {
    public static void main(String []args){
        int n = 12;
        int a = Fbnq(n);
        out.println("兔子"+a);//因此这里省略了类名System.
    }
    public static int Fbnq(int n){
        if(n==1||n==2)
            return  1;
        return Fbnq(n-1)+Fbnq(n-2);
    }
}

