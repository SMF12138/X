package JAVA.YinHang;

class Account {
    private Depositor depositor;
    private double balance;

    public Account(Depositor depositor, double balance) {
        this.depositor = depositor;
        this.balance = balance;
    }
 // ����
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // Getters and Setters
    public Depositor getDepositor() {
        return depositor;
    }

    public double getBalance() {
        return balance;
    }
}

// �������
enum DepositType {
    SAVING, TIME_DEPOSIT
}