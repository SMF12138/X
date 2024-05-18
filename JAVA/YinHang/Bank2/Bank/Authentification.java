package NewLearn.Bank;

import java.sql.*;

public class Authentification {
    private static final String username = "root";
    private static final String password = "FLYJs-SMF12138";
    private static final String url = "jdbc:mysql://localhost:3306/account?serverTimezone=UTC";
    public static boolean checkout(Account account) {

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * FROM bankaccount WHERE cardNumber = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, account.getCardNumber());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (!resultSet.next()) {
                        System.out.println("没有该账户");
                        return false;
                    } else {
                        String storedPassword = resultSet.getString("password");
                        if (storedPassword.equals(account.getPassword())) {
                            System.out.println("登录成功");
                            return true;
                        } else {
                            System.out.println("密码错误");
                            return false;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
