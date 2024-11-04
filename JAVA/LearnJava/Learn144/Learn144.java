package NewLearn.Learn144;

public class Learn144 {
    public static void main(String[] args) {
        //线程排队执行被称为同步(需要等待但安全)，否则为异步
        Account account = new Account("act",10000);
        Thread t1 = new Thread(new Withdraw(account));
        Thread t2 = new Thread(new Withdraw(account));
        t1.start();
        t2.start();//两个线程操作同一个账户导致问题发生
    }
}

class Withdraw implements Runnable {
    private Account act;

    public Withdraw(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(1000);
    }
}