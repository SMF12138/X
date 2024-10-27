package NewLearn.Learn138;

public class Learn138 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);//主线程休眠(阻塞)1秒，主意sleep是静态方法，如果用对象调用作用不会改变
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {//run在重写时不能在方法声明位置抛出异常否则报错
        for (int i = 0; i < 100; i++) {
            System.out.println("第一个自定义线程" + i);
        }
        try {//因此只能使用try-catch
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
