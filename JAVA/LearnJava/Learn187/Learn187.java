package NewLearn.Learn187;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Learn187 {
    public static void main(String[] args) {
        Stream.of("abc", "def", "xyz").map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();//映射，转大写
            }
        }).forEach(System.out::println);

        Stream.of("abc", "def", "xyz").map(String::toUpperCase).forEach(System.out::println);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(133);
        list1.add(1444);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(12);
        list2.add(133);
        list2.add(1444);

        Stream<List<Integer>> twoListStream = Stream.of(list1, list2);
        twoListStream.flatMap(new Function<List<Integer>, Stream<?>>() {
            @Override
            public Stream<?> apply(List<Integer> integers) {//flatMap将一个集合中的元素放入一个Stream中
                return integers.stream();
            }
        }).forEach(System.out::println);

        twoListStream.flatMap(List<Integer>::stream).forEach(System.out::println);


    }
}
