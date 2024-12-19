package NewLearn.Learn189;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Learn189 {
    public static void main(String[] args) {
        //除了遍历forEach之外的终止操作
        Stream.of(1, 2, 3, 4).allMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer.equals(3);//匹配所有元素是否为3，返回boolean类型
            }
        });
        System.out.println(Stream.of(1, 2, 3, 4).allMatch(value -> value.equals(3)));

        System.out.println(Stream.of(1, 2, 3, 4).anyMatch(value -> value.equals(3)));//匹配是否包含3

        System.out.println(Stream.of(1, 2, 3, 4).noneMatch(value -> value.equals(3)));//匹配是否不包含3

        Optional<Integer> firstOptional = Stream.of(1, 2, 3, 4).findFirst();
        System.out.println(firstOptional.get());//获取流中第一个元素

        System.out.println(Stream.of(1,2,3).findFirst().get());//findFirst()已经关闭流，因此调用get的对象不是流


    }
}
