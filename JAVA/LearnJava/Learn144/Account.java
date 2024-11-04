package NewLearn.Learn144;

public class Account {
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

    public void withdraw(double money) {
        double before = getBalance();
        System.out.println(before);
        setBalance(before - money);
        System.out.println(getBalance());
    }
}
