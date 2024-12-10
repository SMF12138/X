package NewLearn.Learn180;

import java.util.function.Supplier;

public class Learn180 {
    public static void main(String[] args) {
        //函数返回值类型和形参与内部调用方法的返回值和形参一样时可以用实例方法引用
        Teacher laoDu = new Teacher("LaoDu");
        Supplier<String> supplier1 = new Supplier() {//供给型接口可以Lambda，与此同时还有消费型，转换型等
            @Override
            public String get() {
                return laoDu.getName();
            }
        };

        Supplier<String> supplier2 = () -> laoDu.getName();//Lambda表达式

        Supplier<String> supplier3 = laoDu::getName;//方法引用，对象::方法名(System.out::println)
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
