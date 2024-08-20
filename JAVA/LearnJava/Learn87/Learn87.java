package NewLearn.Learn87;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Learn87 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(1);
        list1.add(1, 2);//List型特有方法，在指定下标添加元素
        list1.set(1, 12);//修改指定下标元素
        list1.remove(1);//删除指定下标元素
        System.out.println(list1.indexOf(1));//获取第一次出现元素的下标
        System.out.println(list1.lastIndexOf(1));//获取最后一次出现元素的下标
        List<Integer> list2 = list1.subList(1, 5);//截取[1,5)位置的集合
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));//对于List类型有独特的遍历方法，只适用于List集合
        }
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);//List.of为静态方法，获取一个不可修改的集合，修改会出现异常
        ListIterator<Integer> li = list2.listIterator();//List型专属迭代器
        System.out.println(li.hasPrevious());//判断是否有上一个元素
        while (li.hasNext()) {
            Integer next = li.next();
            li.set(9);//set方法不能单独使用，必须和next或previous方法联合使用，修改的是其返回元素而不是当前光标指向元素
            Integer a = 1;
            if (a.equals(next)) {//迭代器方法，对当前光标添加元素，并下移后续元素
                li.add(2);
                li.remove();//remove方法不能单独使用，必须和next或previous方法联合使用，删除的是其返回元素而不是当前光标指向元素
            }
            System.out.println(next);
        }
        System.out.println(li.hasPrevious());
        System.out.println(li.nextIndex());//获取光标当前下标
        System.out.println(li.previous());//获取上一个元素
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.nextIndex());
        System.out.println(li.previousIndex());//获取光标上一位下标
        System.out.println(list2);
    }
}
