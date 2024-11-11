package NewLearn.Learn151;

public class Singleton1 {//饿汉式单例模式，对象的实例在类加载时创建
    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){

    }

    public static Singleton1 getSingleton() {
        return singleton;
    }
}
