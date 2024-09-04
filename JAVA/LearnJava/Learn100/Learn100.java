package NewLearn.Learn100;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Learn100 {
    public static void main(String[] args) {
        //排序二叉树遍历，中序左根右，前序根左右，后序左右根
        //红黑树是自平衡的排序二叉树，根到叶子的最长路径不多与最短路径的两倍长认为树大致上平衡
        //根和叶子结点为黑，红色结点的子节点必须为黑色
        //从根节点到叶子结点的的每个路径黑结点数都必须相同
        //每次新节点插入时为红，根据约束条件进行树的颜色调整和旋转
        TreeMap<Integer, String> map1 = new TreeMap<>();//可排序不可重复，底层是红黑树，key不能为null，value可以
        map1.put(100, "A");
        map1.put(101, "B");
        map1.put(102, "C");
        map1.put(99, "D");
        map1.put(88, "E");
        System.out.println(map1);
        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Map<People, String> map2 = new TreeMap<>();//比较规则不会改变时用实现Comparable这种方式
        map2.put(new People("O", 20), "1");
        map2.put(new People("B", 12), "2");
        map2.put(new People("C", 14), "3");//这里判断相同走的compareTo方法，因此值没有覆盖
        map2.put(new People("C", 13), "4");
        map2.put(new People("E", 18), "5");
        System.out.println(map2);//自定义类型默认无法排序要实现Comparable接口否则使用红黑树集合会报错
        //当使用自定义比较器(comparator)或键实现了Comparable接口时，HashMap会优先使用比较器或compareTo方法来比较键的大小和确定存储位置，
        //而不是依赖于equals方法

        Map<User, String> map3 = new TreeMap<>(new UserComparator());//比较规则会发生变化时建议单独编写一个比较器，这样扩展能力更强，符合OCP原则
        //并且有比较器时优先走比较器
        map3.put(new User("O", 20), "1");
        map3.put(new User("B", 12), "2");
        map3.put(new User("C", 14), "3");
        map3.put(new User("C", 13), "4");
        map3.put(new User("E", 18), "5");
        System.out.println(map3);

        Map<User, String> map4 = new TreeMap<>(new Comparator<User>() {//或者使用匿名内部类的方法
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }
}
