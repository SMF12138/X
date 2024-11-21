package NewLearn.Learn162;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class Learn162 {
    public static void main(String[] args) throws Exception {//反射机制实现框架
    //读取属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("NewLearn.Learn162.config");
        String className = bundle.getString("className");
        String methodName = bundle.getString("methodName");
        String parameterTypes = bundle.getString("parameterTypes");
        String parameterValues = bundle.getString("parameterValues");
        Class<?> clazz = Class.forName(className);
        Constructor<?> defaultCon = clazz.getDeclaredConstructor();
        Object obj = defaultCon.newInstance();
        String[] strParameterTypes = parameterTypes.split(",");//拆分参数
        Class[] classParameterTypes = new Class[strParameterTypes.length];
        for (int i = 0; i < strParameterTypes.length; i++) {
            classParameterTypes[i]=Class.forName(strParameterTypes[i]);
        }
        Method method = clazz.getDeclaredMethod(methodName, classParameterTypes);//传参为对象名和保存了参数类型的数组
        Object retValue = method.invoke(obj, parameterValues.split(","));//传入拆分后的参数值，支持可变长数组(split返回数组)
        System.out.println(retValue);//输出函数返回值
    }
}
