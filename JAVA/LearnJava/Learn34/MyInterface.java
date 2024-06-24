package NewLearn.Learn34;
//interface关键字表示接口，接口是完全抽象的，没有构造方法，也无法实例化
//接口中只能定义常量和抽象方法(JDK8之前)，并且static final可以省略，abstract也可以省略
//接口中所有方法和变量都是public
//接口支持多继承
//JDK8之后接口中允许出现默认方法和静态方法
//所有接口隐式的继承Object，所以Object中方法也可以调用
public interface MyInterface {
    public void m();
    int m=0;
    private void privateMethod(){
        //JDK9之后允许出现私有静态方法和实例方法给静态方法和默认方法服务
        System.out.println("privateMethod执行了");
    }

    default void defaultMethod(){
        //默认方法是默认继承的方法，避免了所有类都要实现所有抽象方法
        System.out.println("一个默认方法");
        privateMethod();
    }
    private static void privateStaticMethod(){
        System.out.println("privateStaticMethod执行了");
    }
    static void staticMethod(){
        System.out.println("接口的静态方法");
        //但接口中的静态方法只允许通过接口名调用
        privateStaticMethod();
    }
}

interface A{

}

interface B{

}

interface C extends A,B{

}

class MyInterfaceImpl implements MyInterface,C{
    //类和接口间的关系叫实现(可以多个)，非抽象类必须将接口中所有抽象方法全部实现

    @Override
    public void m() {
        System.out.println("m执行了");
    }
}