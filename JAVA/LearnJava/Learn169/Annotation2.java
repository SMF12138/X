package NewLearn.Learn169;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented

public @interface Annotation2 {
    String email();
    double price();
}
