package NewLearn.Learn181;

import java.util.function.Function;

public class Learn181 {
    public static void main(String[] args) {
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> function2 = aDouble -> Math.round(aDouble);

        Function<Double, Long> function3 = Math::round;//静态方法引用，类名::方法名
    }
}
