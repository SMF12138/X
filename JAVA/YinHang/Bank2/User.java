package NewLearn.Bank;

import java.util.Scanner;

public class User {
    public static void select(BankService account){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("选择你的业务：");
            System.out.println("1. 存钱");
            System.out.println("2. 取钱");
            System.out.println("3. 查询余额");
            System.out.println("0. 退出系统");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.save();
                    break;
                case 2:
                    account.draw();
                    break;
                case 3:
                    int balance = account.sqlBalance();
                    System.out.println("余额：" + balance);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }
    }
    public static void register(Account account,int count){
        while (true) {
            if(count != 1){
                Scanner scanner = new Scanner(System.in);
                System.out.println("输入你的姓名");
                String name = scanner.nextLine();
                account.setName(name);
                System.out.println("输入你的银行卡号");
                String cardNumber = scanner.nextLine();
                account.setCardNumber(cardNumber);
                System.out.println("输入你的密码");
                String password = scanner.nextLine();
                account.setPassword(password);
                if (Authentification.checkout(account)) {
                    break;
                } else {
                    System.out.println("认证失败，请重新输入账号和密码。");
                }
            }
        }
    }
}
