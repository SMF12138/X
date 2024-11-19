package NewLearn.Learn159;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Learn159 {
    public static void main(String[] args) {
        //使用反射机制调用方法

        UserService userService = new UserService();//创建类对象
        Class clazz = null;
        try {
            clazz = Class.forName("NewLearn.Learn159.UserService");
            Method login = clazz.getDeclaredMethod("login", String.class, String.class);//获取方法必须连同参数类型确定具体是哪个方法
            Object retValue = login.invoke(userService, "admin", "123456");//传入对象和参数使用方法并返回方法值
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class UserService {//登录方法

    public boolean login(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }

    private void logout() {
        System.out.println("系统已安全退出! ");
    }
}