package NewLearn.Learn62;

import NewLearn.Learn59.AgeException;
import NewLearn.Learn59.NameException;

import java.util.Scanner;

public class Learn62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册:");
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        UserService userService = new UserService();
        try {
            userService.register(name, age);
        } catch (NameException | AgeException e) {
            String massage = e.getMessage();//可获取创建异常时给构造方法传递的message值
            System.out.println(massage);
            e.printStackTrace();//异常堆栈信息(通过多线程方式打印)
        }
    }
}

class UserService {//用户业务类

    public void register(String name, int age) throws NameException, AgeException {
        System.out.println("正在注册，请稍后....");
        UserDao userDao = new UserDao();
        userDao.save(name, age);
        System.out.println("注册成功，欢迎[" + name + "]");
    }
}

class UserDao {//数据库的类

    /**
     * 保存用户名和年龄
     *
     * @param name
     * @param age
     */
    public void save(String name, int age) throws NameException, AgeException {
        System.out.println("用户[" + name + "]的信息正在保存....");
        if (name.length() < 6 || name.length() > 12) {
            throw new NameException("无效名字异常");//这里添加了异常信息
        }
        if (age < 18) {
            throw new AgeException("无效年龄异常");
        }
        System.out.println("用户[" + name + "]的信息被保存成功!");
    }
}