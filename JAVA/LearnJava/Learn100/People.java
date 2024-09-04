package NewLearn.Learn100;

public class People implements Comparable<People> {
    private final String name;
    private final int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if (name.equals(o.name)) {
            return age - o.age;//按名字排序，相同按年龄排序
        }
        return name.compareTo(o.name);
    }
}
