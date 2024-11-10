package NewLearn.Learn150;

public class Learn150 {
    private static final Object lock = new Object();//设置共同对象锁
    private static boolean t1 = true;//假设初始t1线程最先输出
    private static boolean t2 = false;
    private static boolean t3 = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t1) {//假设当前线程是t1
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + " A");
                        t1 = false;//输出后立刻更改值
                        t2 = true;
                        lock.notifyAll();//唤醒等待线程
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t2) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + " B");
                        t2 = false;
                        t3 = true;
                        lock.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t3) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + " C");
                        t3 = false;
                        t1 = true;
                        lock.notifyAll();
                    }
                }
            }
        }).start();
    }
}

