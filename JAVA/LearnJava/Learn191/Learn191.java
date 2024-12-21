package NewLearn.Learn191;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learn191 {
    public static void main(String[] args) {
        Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toList());//收集为List集合，哪种集合不知道
        Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toSet());//收集为Set集合，哪种集合不知道
        Stream.of("1:zhangsan", "2:lisi", "3:wangwu").collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(0, s.indexOf(":"));
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(s.indexOf(":") + 1);
            }
        }));//收集为Map集合，哪种集合不知道
        Stream.of("1:zhangsan", "2:lisi", "3:wangwu").collect(Collectors.toMap(s -> s.substring(0, s.indexOf(":")), s -> s.substring(s.indexOf(":") + 1)));

        ArrayList<String> arrayList = Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toCollection(ArrayList::new));//以特定的集合收集
    }
}
