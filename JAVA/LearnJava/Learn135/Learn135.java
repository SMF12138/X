package NewLearn.Learn135;

public class Learn135 {
    public static void main(String[] args) {//main属于主线程
        //在多线程中，栈是不共享的，只有堆和方法区共享，因此静态变量和实例变量共享，要考虑线程安全问题，局部变量私有无需考虑
        MyThread mt = new MyThread();
        mt.start();//启动线程(开辟新栈空间)，启动过程瞬间结束，启动时执行run代码
        for (int i = 0; i < 100; i++) {
            System.out.println("主函数线程" + i);
        }
    }
}

class MyThread extends Thread {//自定义线程需要继承Thread然后重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("自定义线程" + i);
        }
    }
}