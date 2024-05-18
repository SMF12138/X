package JAVA.YinHang;
import java.util.Scanner;
import java.util.Date;

public class BankSystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("��ӭ������������ϵͳ��");
        System.out.println("��ѡ�������ͣ�");
        System.out.println("1. ���ڴ��");
        System.out.println("2. ���ڴ��");
        System.out.print("������ѡ��1��2����");

        int choice = scanner.nextInt();
        if (choice == 1) {
            // ���ڴ��
            System.out.print("���������");
            double amount = scanner.nextDouble();
            Depositor depositor = new Depositor("������", "123456789");  // �޸Ĵ˴�
            SavingsAccount savingsAccount = new SavingsAccount(depositor, amount);  // �޸Ĵ˴�
            savingsAccount.displaySavingsInfo();  // �޸Ĵ˴�
        } else if (choice == 2) {
            // ���ڴ��
            System.out.print("���������");
            double amount = scanner.nextDouble();
            System.out.print("�����뵽��ʱ�䣨��-��-�գ���");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            Date maturityDate = new Date(year - 1900, month - 1, day);
            System.out.print("�����������ʣ�����3��ʾ3%����");
            double interestRate = scanner.nextDouble() / 100.0;
            Depositor depositor = new Depositor("������", "123456789");  // �޸Ĵ˴�
            TimeDepositAccount timeDepositAccount = new TimeDepositAccount(depositor, amount, maturityDate, interestRate);
            timeDepositAccount.displayTimeDepositInfo();
        } else {
            System.out.println("��Ч��ѡ�����������г���");
            return;
        }

        scanner.close();
    }
}



