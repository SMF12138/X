package NewLearn.Learn145;

public class Learn145 {
    public static void main(String[] args) {
        //线程排队执行被称为同步(需要等待但安全)，否则为异步
        Account account = new Account("act", 10000);
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

class Account {
    private String actNo;
    private double balance;

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money) {//或者将synchronized加在方法体中，整个方法体都需要同步
        synchronized (this){//this为线程共享的(账户)对象，用这种语法创建同步区保证顺序执行
            double before = getBalance();//原理是线程顺序获取对象锁
            System.out.println(before);
            setBalance(before - money);
        }
        System.out.println(getBalance());//同步区要尽可能小保证效率
    }
}
