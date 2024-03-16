package LearnJava.Learn4;

public class Learn4 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        System.out.println(a>b);//括号中结果为布尔类型&&和&不同在于前者一旦不符合条件不再向后判断
        //二进制左移<<一位符号位不变右补0相当于乘二，操作的是补码
        //右移时正数补0，负数补1,0结果仍为0,相当于除二
        //1>>1==0
        //无符号右移>>>最高位补0，结果为正数，对正数右移一位相当于除2，但负数会变成一个很大的数
        byte c = -128;
        System.out.println(c>>>2);//小于int的类型会直接提升至int位移
        System.out.println((byte)(c>>>2));//若强转成byte结果是-32
    }
}
