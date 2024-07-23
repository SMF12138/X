package NewLearn.Learn60;

import java.util.Scanner;

public class Learn60 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册:");
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        UserService userService = new UserService();
        /**
         * try {
         *     userService.register(name,age);
         *     System.out.println("如果出现异常，这句不会执行");
         * }catch (AgeException | NameException e){//Java7后新特性
         *     System.out.println("对不起，出现异常");
         * }
         */
        try {//在前端页面(主函数)进行捕捉
            userService.register(name,age);//可能出现异常的代码
            System.out.println("如果出现异常，这句不会执行");
        }catch (AgeException e){//e为异常变量(地址)
            System.out.println("对不起，年龄不合法");
        }catch (NameException e){
            System.out.println("对不起，用户名不合法");
        }
        System.out.println("捕捉后继续执行代码");
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
    public void save(String name, int age)throws NameException, AgeException {
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
