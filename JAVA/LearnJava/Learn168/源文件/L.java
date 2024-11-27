package NewLearn.Learn168.源文件;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.CLASS)//注解保存字节码中，不能被反射，注解的默认保持性(底层属性是枚举)
public @interface L {

}
