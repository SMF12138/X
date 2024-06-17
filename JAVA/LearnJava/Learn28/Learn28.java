package NewLearn.Learn28;

public class Learn28 {
    public static void main(String[] args) {
         A a = new B();
         //实例变量同样没有多态，打印结果为A
        System.out.println(a.name);
    }
}
class A{
    String name = "A";
}
class B extends A{
    String name = "B";

}
