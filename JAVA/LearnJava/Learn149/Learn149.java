package NewLearn.Learn149;
/**
 * 线程通讯涉及到三个方法wait()，notify()，notifyAll()
 * wait()有三个重载，其中无参构造使线程进入等待状态，另两个进入超时等待状态(有时间限制)
 * 这些方法都通过共享对象调用，notify()唤醒等待的线程(唤醒优先级最高的其中一个线程)
 * notifyAll()唤醒所有等待的线程
 * 只有在同步代码块中才能使用这些函数，并且调用这些函数的共享对象必须唯一
 */
public class Learn149 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private int count;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();//被共享对象调用，唤醒等待的线程(唤醒优先级最高的其中一个线程)
                if (count >= 100) break;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + (++count));
                try {
                    wait();//被共享对象调用，让其中一个线程等待，同时释放对象锁
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}