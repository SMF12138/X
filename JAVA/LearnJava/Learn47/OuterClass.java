package NewLearn.Learn47;

public class OuterClass {
    private static int i = 20;
    private int j = 10;
    public void m1(){
        //JDK8之前局部内部类访问局部变量k时必须用final修饰，JDK8之后默认有(不能改k值)
        int k = 100;
        //定义在方法中的局部内部类，不能有访问权限
        class InnerClass{
            public void m2(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.m2();
    }
    public static void m3(){
        class InnerClass{
            public void m2(){
                System.out.println(i);
            }
        }
    }
}
