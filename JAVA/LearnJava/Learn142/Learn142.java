package NewLearn.Learn142;

public class Learn142 {
    public static void main(String[] args) {//JVM是抢占式调动，优先级越高获取时间片总概率越高
        System.out.println(Thread.MIN_PRIORITY);//最低，最高，和默认优先级
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());//获取当前线程优先级
        Thread.currentThread().setPriority(10);//设置优先级
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());//获取当前线程优先级

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}