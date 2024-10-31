package NewLearn.Learn141;

public class Learn141 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        try {
            t.start();
            t.join();//t线程合并到主线程中，阻塞当前线程(主线程)直到t线程结束
            t.join(10);//合并10毫秒，与sleep()不同的是，如果join()参数过大，当t线程结束阻塞就会解除
            System.out.println("主线程执行结束");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行结束");
    }
}