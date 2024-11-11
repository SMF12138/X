package NewLearn.Learn151;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton2 {//懒汉式单例模式，对象的实例在第一次使用时创建
    private static final ReentrantLock lock = new ReentrantLock();//创立锁对象(让所有线程共享的对象)
    private static Singleton2 singleton2;

    private Singleton2() {

    }

    public static Singleton2 getSingleton2() {//解决方案是static后加入synchronized(类锁)关键字，或者同步代码块保证判断条件与构造同时进行
        if (singleton2 == null) {
            try {
                Thread.sleep(2000);//如果两个线程同时进入到这里，就会产生两个不同的对象，因此这里是非线程安全的
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static Singleton2 getSingleton() {
        //由于是静态方法，可以获取某个类作为锁的共享对象，但放置类锁效率较低
        if (singleton2 == null) {//因此在锁外再放一层判断避免在已经构造对象的情况下重复的阻塞和释放锁提高效率
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public static Singleton2 getSingletonLock() {
        //Lock机制是Java5出现的可重入锁，相较synchronized更加灵活
        try {
            if (singleton2 == null) {
                lock.lock();
                    if (singleton2 == null) {
                        singleton2 = new Singleton2();
                    }
            }
        } finally {//Ctrl+Alt+T自动代码包裹
            lock.unlock();//将unlock放入finally保证解锁
        }
        return singleton2;
    }
}
