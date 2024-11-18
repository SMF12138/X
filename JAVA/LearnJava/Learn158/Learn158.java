package NewLearn.Learn158;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Learn158 {
    public static void main(String[] args) throws Exception {
        //通过反射机制获取方法
        Class clazz = Class.forName("NewLearn.Learn158.UserService");
        Method[] methods = clazz.getDeclaredMethods();//获取包含私有在内的所有方法(不包含构造方法)
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()));//获取方法修饰符
            System.out.println(method.getReturnType().getSimpleName());//获取返回值类型
            System.out.println(method.getName());//获取方法名
            Class<?>[] parameterTypes = method.getParameterTypes();//获取方法所有参数类型，返回数组
            for (Class ParameterType : parameterTypes) {
                System.out.println(ParameterType.getSimpleName());
            }
            Parameter[] parameters = method.getParameters();//获取方法所有参数，返回数组
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType().getSimpleName());//通过获取到的参数调用类型
                System.out.println(parameter.getName());//通过获取到的参数调用参数名(这里实际不会返回真实方法名，而是用arg0，arg1代指参数名)
            }
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