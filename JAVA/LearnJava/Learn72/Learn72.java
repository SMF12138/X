package NewLearn.Learn72;

public class Learn72 {
    public static void main(String[] args) {
        Integer x = 1000;//自动装箱，编译时自动调用构造方法
        Integer y = 1000;
        System.out.println(x == y);//两个对象不同，结果为false
        m(100);//这个过程实际发生了自动装箱，100为Integer类型
        int num = x;//自动拆箱，Integer转变为int型，如果x为null会发生空指针异常!!!
        Integer A = 127;
        Integer B = 127;
        System.out.println(A == B);//在Java中，对于整数范围在-128到127之间的情况(整数型常量池数组，存储着256个对象)，Java会对Integer对象进行缓存，
        // 所以当你将一个值在这个范围内的整数赋给一个Integer变量时，它们会引用同一个缓存的对象
    }

    private static void m(Object obj) {

    }
}
