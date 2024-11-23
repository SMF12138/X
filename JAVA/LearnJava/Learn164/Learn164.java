package NewLearn.Learn164;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Learn164 {
    public static void main(String[] args) {
        //获取父类泛型信息
        Class<Cat> catClass = Cat.class;
        Type genericSuperclass = catClass.getGenericSuperclass();//获取父类泛型，返回Type型，若没用泛型返回Class型
        System.out.println(genericSuperclass instanceof Class<?>);//Class类也实现了Type接口
        System.out.println(genericSuperclass instanceof ParameterizedType);//ParameterizedType接口代表参数化类型，即泛型
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();//或取泛型的实际类型，返回数组
            for (Type a : actualTypeArguments){
                System.out.println(a);
            }
        }
    }
}


