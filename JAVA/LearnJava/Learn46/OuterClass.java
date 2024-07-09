package NewLearn.Learn46;

public class OuterClass {
    private static int i = 20;
    private int j = 10;
    public static void m1(){
        System.out.println("这是一个静态方法");
    }
    public void m2(){
        System.out.println("这是一个实例方法");
    }
    public class InnerClass{
        public void m3(){
            //实例内部类中可以访问外部类中的实例和静态成员
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();
        }
    }
}
