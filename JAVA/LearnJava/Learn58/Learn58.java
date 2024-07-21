package NewLearn.Learn58;

import NewLearn.Learn59.AgeException;
import NewLearn.Learn59.NameException;

public class Learn58 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b==0){
            System.out.println("除数不能为0");
            return;
        }
        int c = a / b;
        //在Java中异常以对象和类的形式存在，因此定义异常就是定义类，异常所有子类除了RuntimeException是运行时异常(因程序员)，其他归类为编译时异常(因外在因素)
        //所有编译时异常要求必须在编译时被处理，而运行时异常可不处理
        System.out.println(a + "/" + b + "=" + c);
        throw new NullPointerException();//手动抛出异常
    }
}
