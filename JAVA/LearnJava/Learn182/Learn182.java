package NewLearn.Learn182;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Learn182 {
    public static void main(String[] args) {
        Comparator<Double> comparator1 = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {//从第二个参数开始与内部函数一致
                return o1.compareTo(o2);//函数式接口中第一个参数调用对象
                //返回值一致，可使用特殊方法引用
            }
        };
        System.out.println(comparator1.compare(3.1, 5.2));

        Comparator<Double> comparator2 = (o1, o2) -> o1.compareTo(o2);

        Comparator<Double> comparator3 = Double::compareTo;//特殊方法引用，(实例方法对应的)类名::实例方法名

        Supplier<Bird> supplier1 = new Supplier<Bird>() {
            @Override
            public Bird get() {
                return new Bird();//如果含参函数内外的参数必须一致才能简化
            }
        };

        Supplier<Bird> supplier2 = () -> new Bird();

        Supplier<Bird> supplier3 = Bird::new;//构造方法引用，类名::new

        Function<Integer, int[]> function1 = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];//化简必须有且只有一个参数用于设置数组长度并且返回类型与创建数组类型一致
            }
        };

        Function<Integer, int[]> function2 = length -> new int[length];

        Function<Integer, int[]> function3 = int[]::new;////数组引用，数组类型::new


    }
}

class Bird {
}
