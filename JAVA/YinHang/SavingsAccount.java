package JAVA.YinHang;

class SavingsAccount extends Account {
    public SavingsAccount(Depositor depositor, double balance) {
        super(depositor, balance);
    }

    // ���ڴ����ʾ�߼�
    public void displaySavingsInfo() {
        System.out.println("���������: " + getDepositor().getName());
        System.out.println("�˺�: " + getDepositor().getAccountNumber());
        System.out.println("�����: " + getBalance());
        System.out.println("���: " + getBalance());
    }
}
