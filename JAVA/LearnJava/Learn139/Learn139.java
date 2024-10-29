package NewLearn.Learn139;

public class Learn139 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            final boolean run = true;

            @Override
            public void run() {
                try {
                    if (run) {
                        Thread.sleep(1000 * 60 * 60);
                        for (int i = 0; i < 100; i++) {
                            System.out.println(i);
                        }
                    } else {
                        return;//一般用标记法终止线程
                    }
                } catch (InterruptedException e) {
//                    e.printStackTrace();//打印异常信息是允许的
//                    throw new RuntimeException(e);//这行代码不能存在因为interrupt抛出异常后无法解决会导致程序终止
                }
                System.out.println(Thread.currentThread().getName() + " do some!");
                while (true){//这里设置了死循环，但因是守护线程，在主线程结束后自动结束(并且守护线程一般都是死循环)

                }
            }
        });
        //线程分为用户线程和守护线程(JVM中GC线程)，所有用户线程结束后守护线程自动退出
        thread.setDaemon(true);//在启动线程前设置线程为守护线程
        thread.start();
        thread.interrupt();//唤醒线程，通过让sleep抛出异常的机制终止睡眠
//        thread.stop();终止线程(已废除，容易数据丢失)
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
