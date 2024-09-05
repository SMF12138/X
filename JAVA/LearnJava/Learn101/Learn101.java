package NewLearn.Learn101;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Learn101 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(101);
        set1.add(106);
        set1.add(108);
        set1.add(109);
        System.out.println(set1);//无序不可重复，用法与HashMap一致(没有value)

        Set<Integer> set2 = new LinkedHashSet<>();//有序不可重复
        set2.add(100);
        set2.add(101);
        set2.add(106);
        set2.add(108);
        set2.add(109);
        System.out.println(set2);
        //上述类型集合存放自定义类型时仍需重写哈希和equals函数避免存放相同元素

        Set<Integer> set3 = new TreeSet<>();//可排序不可重复
        set3.add(118);
        set3.add(101);
        set3.add(106);
        set3.add(108);
        set3.add(109);
        System.out.println(set3);
        //所有Set型集合实际都是没有value的Map
    }
}
