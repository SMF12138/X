package NewLearn.Learn168.源文件;

import java.lang.annotation.*;

@Inherited//表示该注解修饰的注解可以被继承，即子类继承父类时会将被其修饰的注解也隐式继承过去
@Documented//表示可以生成API文档，如果去掉则该注解不会出现在帮助文档当中
@Target({ElementType.METHOD,ElementType.TYPE})//标注注解的注解被称为元注解
//这个标注表示注解只能在方法，类，或其他限定的位置中使用

public @interface Author {

}
