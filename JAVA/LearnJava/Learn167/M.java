package NewLearn.Learn167;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)//这个注解只被保留在源码中，字节码没有(默认是可保存于class文件但运行没有)
public @interface M {//自定义一个注解

    String driver() default "com";//定义一个属性，需要在后面加小括号

    int age();

    L L();

    String[] schools();

    String[] m();

    String value();
}