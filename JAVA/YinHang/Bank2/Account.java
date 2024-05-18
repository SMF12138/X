package NewLearn.Bank;

import java.util.Scanner;

public class Account {
    private String name;
    private String cardNumber;
    private String password;
    private double balance;
    public Account() {
    }

    public Account(String name, String cardNumber, String password) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("请输入银行卡号：");
        String cardNumber = scanner.nextLine();
        setCardNumber(cardNumber);
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        setPassword(password);
        MySql.addAccount(cardNumber,password,0);
        System.out.println("开户成功");
    }
}