package NewLearn.Learn66;

public class Learn66 {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    //由于B继承了A，优先加载A类
    private static final A a = new B();//B的构造方法执行，但先隐式调用了A的构造方法

    static {
        System.out.println("A的静态代码块执行了");//上面代码执行完后执行静态代码块
    }

    {
        System.out.println("A的构造代码块执行了");//构造代码块在A构造方法前执行，因此第一位
    }

    public A() {
        System.out.println("A的构造方法执行了");//构造方法第二位
    }
}

class B extends A {
    static {
        System.out.println("B的静态代码块执行了");//A类加载完后加载B类，之后调用B的构造方法重复上面顺序执行方法后跳出
    }

    {
        System.out.println("B的构造代码块执行了");//B的构造代码块第三位执行
    }

    public B() {
        //这里隐式调用super();
        System.out.println("B的构造方法执行了");//B的构造方法第四位执行，执行完返回A类
    }
}
