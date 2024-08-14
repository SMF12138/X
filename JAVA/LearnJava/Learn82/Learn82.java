package NewLearn.Learn82;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Learn82 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();//这里也可以替换成LinkedList链表
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        Iterator iterator = collection.iterator();//获取迭代器iterator
        boolean has = iterator.hasNext();//判断当前光标位置是否有数据
        if (has) {
            Object next = iterator.next();//iterator.next()将当前元素赋给next，并指向下一元素(初始光标默认0号位)
            System.out.println(next);
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
