package NewLearn.Learn147;

public class Learn147 {
    public static void main(String[] args) {
        Object o1 = new Object();//两个线程分别持有o1，o2造成死锁
        Object o2 = new Object();
        new Thread(new MyRunnable1(o1,o2)).start();
        new Thread(new MyRunnable2(o1,o2)).start();
    }
}
class MyRunnable1 implements Runnable {
    private Object o1;
    private Object o2;

    public MyRunnable1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }


    @Override
    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o2) {

            }
        }
    }
}class MyRunnable2 implements Runnable {
    private Object o1;
    private Object o2;

    public MyRunnable2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }


    @Override
    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o1) {

            }
        }
    }
}