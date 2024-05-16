package NewLearn.Learn7;
import java.util.Scanner;
public class Learn7 {
    public static void main(String[] args) {
        for1:for(int i = 0; i < 5; i++) {
            for2:for(int j = 0; j < 6; j++) {
                break for1;//这样写可以直接结束某个特定循环,continue同理
            }
        }
        //方法的返回值可以不接收，但要保持一致
        //方法如果修饰符有static，则要使用类名.方法名调用
    }
}
