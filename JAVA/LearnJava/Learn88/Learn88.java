package NewLearn.Learn88;

import java.util.ArrayList;
import java.util.Arrays;

public class Learn88 {
    public static void main(String[] args) {
        //排序的两种手段
        User user1 = new User("A", 15);
        User user2 = new User("B", 18);
        User user3 = new User("C", 20);
        User user4 = new User("D", 22);
        User user5 = new User("E", 25);
        User[] users = {user1, user2, user3, user4, user5};
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("A", 18));
        people.add(new Person("B", 20));
        people.add(new Person("C", 22));
        people.add(new Person("D", 25));
        people.add(new Person("E", 28));
        people.sort(new PersonComparator());//将自定义的比较器传入
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
