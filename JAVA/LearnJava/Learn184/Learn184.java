package NewLearn.Learn184;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Learn184 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return "1".equals(str);//·µ»ØtrueÔòÉ¾³ý
            }
        });

        list.removeIf(str -> "1".equals(str));//ÏàÍ¬×Ö·û´®É¾³ý

        list.removeIf("1"::equals);

    }
}
