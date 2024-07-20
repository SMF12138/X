package NewLearn.Learn57;

public class Person implements Comparable{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
    @Override//自定义类型如果要做比较，必须实现Comparable接口，并且对方法进行重写，编写比较规则
    public int compareTo(Object o) {
        Person person = (Person) o;
        return age - person.age;//由小到大排
        /**
         * 如果是字符串可直接return name.compareTo(person.name)
         * 这是因为底层代码中String类已经使用了Comparable接口并且实现了compareTo方法
         */
    }
}
