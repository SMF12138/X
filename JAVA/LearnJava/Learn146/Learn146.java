package NewLearn.Learn146;

public class Learn146 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Thread t1 = new Thread(new MyRunnable(mc));
        Thread t2 = new Thread(new MyRunnable(mc));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();//方法1和方法2都使用了synchronized修饰，因此共用一把锁，需同步进行
        t2.start();//如果只修饰一个方法则无法达到效果，如果mc对象不是一个也无法达到效果
        //如果synchronized出现在静态方法上，则方法占有的是类锁(只有一个)，因此需同步进行
    }
}

class MyClass {
    public synchronized void m1() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 over");
    }

    public synchronized void m2() {
        System.out.println("doSome begin");
        System.out.println("m2 over");
    }
}
class MyRunnable implements Runnable{
    private MyClass mc;

    public MyRunnable(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if("t1".equals(Thread.currentThread().getName())){
            mc.m1();
        }
        if("t2".equals(Thread.currentThread().getName())){
            mc.m2();
        }
    }
}