package NewLearn.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService account = new BankService();
        int count = 0;

        while (true){
            System.out.println("请选择您的业务：");
            System.out.println("1. 创建账户");
            System.out.println("2. 登录");
            System.out.println("0. 退出");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    account.createAccount();
                    break;
                case 2:
                    User.register(account, count);
                    User.select(account);
                    if(count == 0) count++;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }
    }
}


