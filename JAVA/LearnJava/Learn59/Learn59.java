package NewLearn.Learn59;

import java.util.Scanner;

public class Learn59 {
    public static void main(String[] args) throws NameException, AgeException {//这里也可以写父异常Exception
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册:");
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        UserService userService = new UserService();
        userService.register(name,age);
    }
}

class UserService{//用户业务类
    public void register(String name,int age) throws NameException, AgeException {
        System.out.println("正在注册，请稍后....");
        UserDao userDao = new UserDao();
        userDao.save(name,age);
        System.out.println("注册成功，欢迎[" +name+ "]");
    }
}
class UserDao{//数据库的类
    /**
     * 保存用户名和年龄
     * @param name
     * @param age
     */
    public void save(String name, int age)throws NameException,AgeException{
        //throws关键字的含义是当出现异常时将异常交给调用者处理(直到被捕捉或从主函数抛出)
        System.out.println("用户["+name+"]的信息正在保存....");
        if (name.length()<6||name.length()>12){
            throw new NameException();//编译型异常不处理会报错(抛出或捕捉)，如果出现异常则程序不往下执行
        }
        if (age<18){
            throw new AgeException();
        }
        System.out.println("用户["+name+"]的信息被保存成功!");
    }
}
