package NewLearn.Learn136;

public class Learn136 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());//将可运行对象传入线程对象
        t1.start();//一般情况下采用实现接口的方式创建线程更优，因为保留了线程类的继承能力
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }

        Thread t2 = new Thread(new Runnable() {//也可以使用匿名内部类，无需显式implements Runnable(编译器自动识别)
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("第二个自定义线程" + i);
                }
            }
        });
        t2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("第三个自定义线程" + i);
                }
            }
        }).start();//或更为简单的省去变量直接执行
    }
}

class MyRunnable implements Runnable {//自定义线程的另一种方法是实现Runnable接口，严格来说这不是一个线程类
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第一个自定义线程" + i);
        }
    }
}
