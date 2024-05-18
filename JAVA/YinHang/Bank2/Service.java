package NewLearn.Bank;

import java.sql.*;
import java.util.Scanner;

public class Service extends Account{
    private static final String username = "root";
    private static final String password = "FLYJs-SMF12138";
    private static final String url = "jdbc:mysql://localhost:3306/account?serverTimezone=UTC";
    public void save() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要存的钱数");
        double money = scanner.nextDouble();
        String cardNumber = getCardNumber();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            // 查询对应卡号的初始余额
            String selectQuery = "SELECT balance FROM bankaccount WHERE cardNumber = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, cardNumber);
            ResultSet resultSet = selectStatement.executeQuery();
            double balance = 0.0;
            if (resultSet.next()) {
                balance = resultSet.getDouble("balance");
            }

            // 更新余额
            double newBalance = balance + money;
            String updateQuery = "UPDATE bankaccount SET balance = ? WHERE cardNumber = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setDouble(1, newBalance);
            updateStatement.setString(2, cardNumber);
            updateStatement.executeUpdate();

            System.out.println("余额：" + sqlBalance());

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要取的钱数");
        double money = scanner.nextDouble();

        if (getBalance() >= money) {
            String cardNumber = getCardNumber();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);

                // 查询对应卡号的初始余额
                String selectQuery = "SELECT balance FROM bankaccount WHERE cardNumber = ?";
                PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                selectStatement.setString(1, cardNumber);
                ResultSet resultSet = selectStatement.executeQuery();
                double balance = 0.0;
                if (resultSet.next()) {
                    balance = resultSet.getDouble("balance");
                }

                // 更新余额
                double newBalance = balance - money;
                String updateQuery = "UPDATE bankaccount SET balance = ? WHERE cardNumber = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setDouble(1, newBalance);
                updateStatement.setString(2, cardNumber);
                updateStatement.executeUpdate();

                System.out.println("余额：" + sqlBalance());

                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("余额不足");
        }
    }
    public int sqlBalance(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String cardNumber = getCardNumber();

            // 查询对应卡号的余额
            String selectQuery = "SELECT balance FROM bankaccount WHERE cardNumber = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, cardNumber);
            ResultSet resultSet = selectStatement.executeQuery();
            int balance = 0;
            if (resultSet.next()) {
                balance = resultSet.getInt("balance");
                setBalance(balance);
            }

            connection.close();
            return balance;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // 返回-1表示查询失败
        }
    }

}
