package NewLearn.Learn90;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Learn90 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();//调用无参构造时默认初始化容量0，第一次调用add方法时容量变成10
        list1.add("1");//如果十个元素已满，则将数组扩大到1.5倍
        System.out.println(list1);
        list1.set(0, "lisi");
        System.out.println(list1);
        list1.add(0, "zhuwu");//底层是通过拷贝使元素后移
        System.out.println(list1);
        list1.remove(1);//底层是通过拷贝使元素前移
        System.out.println(list1);

        List<String> list2 = new Vector<>();//Vector底层是线程安全的数组，被synchronized修饰，线程排队执行，但效率低现在很少使用
        list2.add("1");//初始容量10
        System.out.println(list2);//如果十个元素已满，则将数组扩大到2倍

        LinkedList<String> list3 = new LinkedList<>();//双向链表，链表与数组相反，增删效率高但查询元素效率低
        list3.add("1");//调用无参构造时默认初始化容量0，第一次调用add方法时容量变成10
        System.out.println(list3);
        list3.add(0, "zhuwu");
        System.out.println(list3);
        System.out.println(list3.set(0, "shaozhu"));//返回值为被更改的值
        System.out.println(list3.remove(0));//返回值为被删除的值
        System.out.println(list3.get(0));
    }
}
