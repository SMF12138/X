package NewLearn.Learn6;
import java.util.Scanner;
public class Learn6 {
    public static void main(String[] args) {
        byte a = 10;
        //a = 10 + a; 由于类型转换会报错
        a += 10;//实际相当于(byte)(a+10),损失精度不改变运算类型
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        switch (a){
            case 1,2,3,4,5->System.out.println(a);//case新语法，但不能和之前case:语法混用
        }//()中只能放int,或比int小的类型(强制转换)
        System.out.println();//换行
    }
}
