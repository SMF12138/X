package NewLearn.Learn183;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Learn183 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.forEach(new Consumer<Integer>() {//参数为消费型接口
            @Override
            public void accept(Integer elt) {//elt代表集合每个元素
                System.out.println(elt);//实现遍历
            }
        });

        list.forEach(elt -> System.out.println(elt));

        list.forEach(System.out::println);//如果两个参数则无法引用了
    }
}
