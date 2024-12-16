package NewLearn.Learn186;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Learn186 {
    public static void main(String[] args) {
        StudentService.getStudents().stream().filter(new Predicate<Student>() {//filter属于中间操作，筛选元素
            @Override
            public boolean test(Student student) {
                return student.getAge() >= 2;//筛选年龄>=2的
            }
        }).forEach(new Consumer<Student>() {//终止操作
            @Override
            public void accept(Student student) {
                System.out.println(student);//遍历
            }
        });

        StudentService.getStudents().stream().filter(student -> student.getAge() >= 2).forEach(System.out::println);

        Stream<String> stream = Stream.of("abc", "bc", "c");
        stream.filter(s -> s.length() >= 2).forEach(System.out::println);//筛选>=2的字符串

    }
}
