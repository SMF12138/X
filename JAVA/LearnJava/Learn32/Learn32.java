package NewLearn.Learn32;
//final表示的方法无法覆盖
//final表示的类无法被继承
//final表示的变量一旦赋值无法重新赋值
//final表示的实例变量必须在构造方法执行完前手动赋值(不能只声明)(并且一般用static修饰变成常量)
// )
public class Learn32 {
    public static void main(String[] args) {
        final int k = 1;
        final A a = new A();//此时由于a被修饰，再用a接受(指向)其他对象是不被允许的，但可以修改a中的特征值(set方法)
        a.F();
    }
}

class A{
    static final double MATH_PAI = 3.1415926;//常量
    public final void F(){
        System.out.println("不能覆盖");
        System.out.println(MATH_PAI);
    }
}
