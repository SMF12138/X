package NewLearn.Learn98;

import java.util.*;

public class Learn98 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();//LinkedHashMap底层为双链表，元素可以顺序插入(插入和取出顺序一致)
        map.put(100, "1");
        map.put(101, "2");
        map.put(5, "3");
        map.put(300, "4");
        map.put(188, "5");
        map.put(166, "6");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //使用LinkedHashMap会有额外开销，只有特殊情况下使用

        //Hashtable结构是线程安全的哈希集合，用法与HashMap基本一致，但key，value不能为null，初始化容量11，扩容2倍，加载因子75%，遍历时有独特迭代器
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "A");
        hashtable.put(2, "B");
        hashtable.put(3, "C");
        hashtable.put(4, "D");
        Enumeration<Integer> keys = hashtable.keys();//hashtable的迭代器获取所有key
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        Enumeration<String> values = hashtable.elements();//hashtable的迭代器获取所有value
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
    }
}
