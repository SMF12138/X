package NewLearn.Learn103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Learn103 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(40);
        list1.add(8);
        list1.add(16);
        Collections.sort(list1);//集合静态方法排序
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("A", 1));
        list2.add(new Student("C", 22));
        list2.add(new Student("G", 6));
        list2.add(new Student("B", 7));
        list2.add(new Student("N", 9));
        Collections.sort(list2);//自定义排序只要实现Comparable接口
        System.out.println(list2);
        Collections.sort(list2, new Comparator<Student>() {//或者通过比较器的方法
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Collections.shuffle(list1);
        System.out.println(list1);//打乱顺序
        Collections.reverse(list1);//反转元素
        System.out.println(list1);
        Collections.fill(list1, null);//替换元素
        System.out.println(list1);
    }
}
