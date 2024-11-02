package NewLearn.Learn143;

public class Learn143 {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 10){
                Thread.yield();//放弃目前占有的时间片，进入就绪态重新抢夺，保证大概率的让位而不是绝对让位
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}