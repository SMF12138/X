package NewLearn.Learn185;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Learn185 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream1 = list.stream();//创建Stream对象，顺序流
        Stream<Integer> parallelStream = list.parallelStream();//并行流，底层启动多线程运算，数据量大时启用
        stream1.parallel();//转为并行流，但地址不变

        String[] names = {"zhangsan", "lisi"};
        Stream<String> stream2 = Arrays.stream(names);//另一种创建方法

        Stream<String> stream3 = Stream.of("abc", "def", "ghi");//第三种创建方法，参数也可传入数组

    }
}
