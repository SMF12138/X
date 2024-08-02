package NewLearn.Learn70;

public class Learn70 {
    public static void main(String[] args) {
        MyInteger myinteger = new MyInteger();
        m(myinteger);//自定义包装类解决基本数据类型无法传入函数的问题，JDK提供了八种对应基本数据类型的包装类(只不过JDK9后包装类的构造方法不建议使用)
        System.out.println(Integer.MAX_VALUE);//常量的最大值和最小值
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        int i = 100;
        /**下面的构造方法在高版本中已经废弃(装箱)
         * Boolean flag1 = new Boolean(true);
         * Boolean flag2 = new Boolean("true");
         * Boolean flag3 = new Boolean("True");
         * Boolean flag4 = new Boolean("TRUE");
         * Boolean flag4 = new Boolean("TRUE1");//结果为False
         * Integer i1 = new Integer(i);
         * Integer i2 = new Integer("100");
         * Integer i3 = new Integer("abc"); //但实际上abc字符串不能放入构造函数中，会出现数字格式化异常
         */
    }

    private static void m(Object obj) {
        Integer integer = (Integer) obj;
        integer.intValue();//将JDK提供的引用类型integer转为int型，也被称之为拆箱，六个引用数字类型(如Integer)都继承了Number类，类中有对应的拆箱方法
    }
}
