package JAVA.YinHang;
import java.util.Date;
class TimeDepositAccount extends Account {
    private Date maturityDate;
    private double interestRate;

    public TimeDepositAccount(Depositor depositor, double balance, Date maturityDate, double interestRate) {
        super(depositor, balance);
        this.maturityDate = maturityDate;
        this.interestRate = interestRate;
    }

    // ���ڴ����ʾ�߼�
    public void displayTimeDepositInfo() {
        System.out.println("���������: " + getDepositor().getName());
        System.out.println("�˺�: " + getDepositor().getAccountNumber());
        System.out.println("�����: " + getBalance());
        System.out.println("����ʱ��: " + maturityDate);
        System.out.println("������Ϣ: " + calculateInterest());
    }

    // ������Ϣ
    private double calculateInterest() {
        // ����򻯴���ʵ��Ӧ������Ҫ���ݴ�����޺�����������
        return getBalance() * interestRate;
    }
}

