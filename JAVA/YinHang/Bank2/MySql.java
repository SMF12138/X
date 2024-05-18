package NewLearn.Bank;

import java.sql.*;

public class MySql {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String dbName = "Account";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "FLYJs-SMF12138";

    // 创建数据库和表
    private static void createSql() {
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            // 创建数据库
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);

            // 连接到指定数据库
            connection = DriverManager.getConnection(url + dbName, userName, password);
            statement = connection.createStatement();

            // 创建表
            String createTableQuery = "CREATE TABLE IF NOT EXISTS BankAccount (" +
                    "cardNumber VARCHAR(255) PRIMARY KEY," +
                    "password VARCHAR(255)," +
                    "balance INT" +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("创建数据库和表成功");

            // 关闭资源
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    public static void addAccount(String cardNumber, String password, double initialBalance) {
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url + dbName, userName, MySql.password);
            Statement statement = connection.createStatement();

            // 检查是否已存在相同的卡号
            String checkAccountQuery = "SELECT * FROM BankAccount WHERE cardNumber = '" + cardNumber + "'";
            ResultSet resultSet = statement.executeQuery(checkAccountQuery);

            if (!resultSet.next()) {
                // 插入新账户数据
                String insertAccountQuery = "INSERT INTO BankAccount (cardNumber, password, balance) VALUES ('" + cardNumber + "', '" + password + "', " + initialBalance + ")";
                statement.executeUpdate(insertAccountQuery);
            } else {
                System.out.println("账户已存在");
            }

            // 关闭资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delAccount(String cardNumber, String password) {
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url + dbName, userName, MySql.password);
            Statement statement = connection.createStatement();

            // 检查是否存在相同的卡号
            String checkAccountQuery = "SELECT * FROM BankAccount WHERE cardNumber = '" + cardNumber + "'";
            ResultSet resultSet = statement.executeQuery(checkAccountQuery);

            if (resultSet.next()) {
                // 删除账户数据
                String deleteAccountQuery = "DELETE FROM BankAccount WHERE cardNumber = '" + cardNumber + "' AND password = '" + password + "'";
                statement.executeUpdate(deleteAccountQuery);

                System.out.println("账户已注销");
            } else {
                System.out.println("账户不存在");
            }

            // 关闭资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
