package NewLearn.Learn192;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learn192 {
    public static void main(String[] args) {
        Object[] array1 = Stream.of(1, 2).toArray();//未指定类型默认转换为Object[]数组
        Object[] array2 = Stream.of(1, 2).toArray(Integer[]::new);//指定数组类型
        Stream.of(1,2,3).collect(Collectors.counting());//求数量
        Stream.of(1,2,3).collect(Collectors.maxBy((s1,s2)->s1-s2));//求最大
        Stream.of(1,2,3).collect(Collectors.minBy((s1,s2)->s1-s2));//求最小
        Double aDouble = Stream.of(1, 2).collect(Collectors.averagingDouble(Integer::intValue));//求平均值
        Stream.of(1,2,3).collect(Collectors.summingInt(Integer::intValue));//求和
        DoubleSummaryStatistics collect = Stream.of(1, 2, 3).collect(Collectors.summarizingDouble(Integer::intValue));//获取上述五个信息封装成对象
        collect.getAverage();//同时collect可单独获取某个值

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 5).collect(Collectors.groupingBy(Integer::intValue)));//分组(可按属性分组)
        String s = Stream.of("a", "ss", "fd").map(String::strip).collect(Collectors.joining(","));//接合
        System.out.println(s);
    }
}
