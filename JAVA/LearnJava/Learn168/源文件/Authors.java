package NewLearn.Learn168.源文件;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)//可以被反射
public @interface Authors {
    Author[] value();
}
