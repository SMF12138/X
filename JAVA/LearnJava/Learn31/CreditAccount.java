package NewLearn.Learn31;

public class CreditAccount extends Account{
    double credit;

    public CreditAccount() {
        //这里默认有super()，所以父类一定写一个无参构造，否则会影响子类创建
        //在Java中只要创建对象Object无参构造方法一定会执行
    }

    public CreditAccount(String actno, double balance, double credit) {
        //super()只能放第一行，初始化父类特征
        super(actno,balance);
        //通过子类的构造方法调用父类的构造方法，但不额外创建对象
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
