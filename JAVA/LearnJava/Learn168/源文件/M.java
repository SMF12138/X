package NewLearn.Learn168.源文件;

import java.lang.annotation.Repeatable;

@Repeatable(Ms.class)//该注解修饰的注解可以重复出现使用，参数必须传父类注解类(Target范围一致，且父类中有M[] value()属性)
public @interface M {
}
