package NewLearn.Learn71;

public class Learn71 {
    public static void main(String[] args) {
        int result = Integer.compare(30, 20);//比较大小，第一个数大返回1，否则返回-1，相等返回0
        System.out.println(result);
        System.out.println(Integer.max(10, 20));//求最大值最小值
        System.out.println(Integer.min(10, 20));
        int num1 = Integer.parseInt("123");//将字符串转成int
        double num2 = Double.parseDouble("3.14");
        double num3 = Long.parseLong("650");
        int num4 = 16;
        System.out.println(Integer.toHexString(num4));//对应的十六进制
        System.out.println(Integer.toBinaryString(num4));//二进制
        System.out.println(Integer.toOctalString(num4));//八进制
        String str = Integer.toString(1);//int转字符串
        int num = 100;
        Integer i = Integer.valueOf(num);//将int型转换成Integer(装箱)
        i.intValue();//拆箱
        Integer integer = Integer.valueOf("567");//字符串转Integer
    }
}
