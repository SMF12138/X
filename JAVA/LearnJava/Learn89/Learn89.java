package NewLearn.Learn89;

import java.util.ArrayList;
import java.util.Comparator;

public class Learn89 {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("A", 18));
        people.add(new Person("B", 20));
        people.add(new Person("C", 22));
        people.add(new Person("D", 25));
        people.add(new Person("E", 28));
        people.sort(new Comparator<Person>() {//灰色部分可省略
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });//通过匿名内部类方式定义比较器
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
