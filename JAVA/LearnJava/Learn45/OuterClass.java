package NewLearn.Learn45;

public class OuterClass {
    private static int i = 20;
    private int j = 10;
    public static void m1(){
        System.out.println("这是一个静态方法");
    }
    public void m2(){
        System.out.println("这是一个实例方法");
    }
    //静态内部类，对于静态内部类来说四个访问权限都可以用(一般类只有public和protected)
    public static class InnerClass{
        public void m3(){
            //静态内部类中可以访问静态方法，变量，无法直接访问实例相关的数据
            System.out.println(i);
            m1();
        }
        public static void m4(){
            System.out.println(i);
            m1();
        }
    }
}
