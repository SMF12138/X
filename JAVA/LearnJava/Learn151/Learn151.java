package NewLearn.Learn151;

public class Learn151 {
    private static Singleton2 s1;
    private static Singleton2 s2;

    public static void main(String[] args) {
        Singleton1 singleton11 = Singleton1.getSingleton();
        Singleton1 singleton12 = Singleton1.getSingleton();
        System.out.println(singleton11 == singleton12);//单例模式对象地址相同
        Singleton2 singleton21 = Singleton2.getSingleton2();
        Singleton2 singleton22 = Singleton2.getSingleton2();
        System.out.println(singleton21 == singleton22);//单例模式对象地址相同

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton2.getSingleton2();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton2.getSingleton2();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
