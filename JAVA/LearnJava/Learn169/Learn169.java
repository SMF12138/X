package NewLearn.Learn169;

import java.lang.annotation.Annotation;

@Annotation1(name = "SMF", age = 0)
@Annotation2(email = "SZY", price = 0.0)
public class Learn169 {
    public static void main(String[] args) {
        Class<Learn169> mcClass = Learn169.class;
        Annotation[] annotations = mcClass.getAnnotations();//返回注解数组
        for (Annotation a:annotations){
            System.out.println(a);
        }
        if (mcClass.isAnnotationPresent(Annotation1.class)){//判断类上是否存在指定注解
            Annotation1 a1 = mcClass.getAnnotation(Annotation1.class);//获取指定注解
            System.out.println(a1.name());//获取注解中属性
            System.out.println(a1.age());//获取字段和方法上的注解与其类似，通过反射机制先获取对应方法或字段，再获取注解
        }
    }
}
