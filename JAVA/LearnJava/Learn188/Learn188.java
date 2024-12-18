package NewLearn.Learn188;

import java.util.Comparator;
import java.util.stream.Stream;

public class Learn188 {
    public static void main(String[] args) {
        Stream.of(1, 1, 1, 1, 1, 1, 2).distinct().forEach(System.out::println);//去重
        //去重是基于hashCode + equals方法的，如果根据属性去重自定义类需要重写
        //同样也可以先映射到某个属性再去重

        Stream.of(1, 2, 5, 8, 9, -5, 9, 9, 6, 4).sorted().forEach(System.out::println);//排序
        //同样排序自定义类需要在类中实现Comparable<>接口

        Stream.of(1, 2, 5, 8, 9, -5, 9, 9, 6, 4).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).forEach(System.out::println);

        Stream.of(1, 2, 5, 8, 9, -5, 9, 9, 6, 4).sorted(Integer::compareTo).forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(1,2,4);
        Stream.concat(stream1,stream2).forEach(System.out::println);//concat合并不同于上面方法，属于静态，通过类名去调

        Stream.of(1,2,3,4,5,6,7,8,9).skip(3).limit(3).forEach(System.out::println);//跳过3个取3个元素
    }
}
