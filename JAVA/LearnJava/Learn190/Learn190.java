package NewLearn.Learn190;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Learn190 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4).reduce(new BinaryOperator<Integer>() {//有一个隐藏参数默认初始值为0
            @Override
            public Integer apply(Integer x, Integer y) {
                return x + y;//制定规则为求和
            }
        }).get();
        System.out.println(Stream.of(1, 2, 3, 4).reduce((x, y) -> x + y).get());
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Integer::sum).get());//使用方法引用
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::addExact).get());

        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::multiplyExact).get());//相乘

        Stream.of("abc", "bc", "hell", "xet").reduce(new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return s1.length() > s2.length() ? s1 : s2;
            }
        }).get();
        System.out.println(Stream.of("abc", "bc", "hell", "xet").reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get());

        System.out.println(Stream.of(1, 2).count());//统计数量
        System.out.println(Stream.of(1, 2).max((s1, s2) -> s1 - s2).get());//统计最大值
        System.out.println(Stream.of(1, 2).min((s1, s2) -> s1 - s2).get());//统计最小值
    }
}
