package NewLearn.Learn85;

import java.util.ArrayList;

public class Vip<NameType, AgeType> {
    private NameType name;
    private AgeType age;

    public Vip(NameType name, AgeType age) {
        this.name = name;
        this.age = age;
    }

    public NameType getName() {
        return name;
    }

    public void setName(NameType name) {
        this.name = name;
    }

    public AgeType getAge() {
        return age;
    }

    public void setAge(AgeType age) {
        this.age = age;
    }

    public static <T> void shopping(T type) {
        System.out.println("静态方法中定义泛型" + type);
    }

    public static void shopping(ArrayList<?> type) {
        System.out.println("无限定通配符，可以引用任意数据类型" + type);
    }

    /**
     *     public static void shopping(ArrayList<? extends Number> type){
     *         System.out.println("上限通配符，必须是指定类型或子类型" + type);
     *     }
     *
     *     public static void shopping(ArrayList<? super Number> type){
     *         System.out.println("下限通配符，必须是指定类型或父类型" + type);
     *     }
     */
}