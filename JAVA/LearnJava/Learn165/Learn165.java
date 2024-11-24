package NewLearn.Learn165;

import java.lang.reflect.*;
import java.util.List;
import java.util.Map;

public class Learn165 {
    public static void main(String[] args) throws Exception {
        Class<Mouse> mouseClass = Mouse.class;
        Type[] genericInterfaces = mouseClass.getGenericInterfaces();//获取类的接口，返回数组
        for (Type genericInterface : genericInterfaces) {
            System.out.println(genericInterface);
            if (genericInterface instanceof ParameterizedType) {//如果使用了泛型
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();//获取泛型
                for (Type a : actualTypeArguments) {
                    System.out.println(a.getTypeName());
                }
            }
        }

        Field mapfield = mouseClass.getDeclaredField("map");//获取该属性(getField只能获取公开)
        Type genericType = mapfield.getGenericType();//获取属性上的泛型
        if (genericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type a : actualTypeArguments) {
                System.out.println(a.getTypeName());
            }
        }

        Method method = mouseClass.getDeclaredMethod("m1", List.class);
        Type[] genericParameterTypes1 = method.getGenericParameterTypes();//获取参数泛型，返回数组
        for (Type g : genericParameterTypes1) {
            if (g instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) g;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type a : actualTypeArguments) {
                    System.out.println(a.getTypeName());
                }
            }
        }

        Type genericReturnType = method.getGenericReturnType();//返回方法返回类型(包括泛型)
        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type a : actualTypeArguments) {
                System.out.println(a.getTypeName());
            }
        }

        Constructor<Mouse> con = mouseClass.getDeclaredConstructor(Map.class);
        Type[] genericParameterTypes2 = con.getGenericParameterTypes();//获取构造方法参数
        for (Type g : genericParameterTypes2) {
            if (g instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) g;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type a : actualTypeArguments) {
                    System.out.println(a.getTypeName());
                }
            }
        }
    }
}
