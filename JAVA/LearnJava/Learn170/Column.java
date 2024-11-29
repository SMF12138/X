package NewLearn.Learn170;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//只能标注字段
@Retention(RetentionPolicy.RUNTIME)//保持性可反射
public @interface Column {//自定义指定属性建表语句的注解
    String name();//字段的名字
    String type() default "varchar";//字段的类型，默认为varchar
}
