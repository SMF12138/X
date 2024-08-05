package NewLearn.Learn73;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Learn73 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("9999999999999999999999");//大整数以字符串的形式传入
        BigInteger bigInteger2 = new BigInteger("8");
        System.out.println(bigInteger1.add(bigInteger2));//加减乘除
        System.out.println(bigInteger1.subtract(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
        System.out.println(bigInteger1.divide(bigInteger2));
        System.out.println(bigInteger2.pow(3));//3次方
        System.out.println(bigInteger2.sqrt());//开平方(取整)
        BigDecimal bigDecimal1 = new BigDecimal("10");
        BigDecimal bigDecimal2 = new BigDecimal("2");
        //同样大浮点的加减乘除和上面类似
        System.out.println(bigDecimal1.movePointLeft(3));//左移右移
        System.out.println(bigDecimal1.movePointRight(3));
        DecimalFormat decimalFormat1 = new DecimalFormat("###,###.##");//三位一隔，保留两位小数
        DecimalFormat decimalFormat2 = new DecimalFormat("###,###.0000");//三位一隔，保留四位小数，不够补零
        String s1 = decimalFormat1.format(12345678.123);
        System.out.println(s1);
        String s2 = decimalFormat2.format(12345678.123);
        System.out.println(s2);
    }
}
