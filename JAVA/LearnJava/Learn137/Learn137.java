package NewLearn.Learn137;

public class Learn137 {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread();//获取当前运行线程的对象(引用)
        System.out.println("默认名字" + mainthread.getName());
        Thread t1 = new MyThread();
        t1.start();
        Thread t2 = new MyThread();
        t2.start();
        t2.setName("爸爸");

    }
}

class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {//或者创建构造方法后直接传入名字MyThread("名字")
        super(name);
    }

    @Override
    public void run() {
        Thread mainthread = Thread.currentThread();//获取当前线程的引用
        System.out.println("默认名字" + mainthread.getName());
    }
}