package NewLearn.Learn88;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {//自定义比较器

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();//升序
    }
}
