package NewLearn.Learn96;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Learn96 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();//底层容量会变成64(2的次幂)，为了提高哈希计算效率并且减少哈希冲突
        //只有容量是2的次幂才能够-1按位与运算得到和取模相同的效果，而按位与的效率是最快的，并且防止按位与操作后结果固定为偶数
        //每次扩容扩大二倍，但扩容成本高，应尽量减少扩容次数，默认添加元素达到容量的75%进行扩容
        //1000元素应给2048个容量避免扩容
        map1.put("1", "zhangsan");
        map1.put("2", "lisi");
        map1.put("3", "zhuwu");
        map1.put("4", "wangliu");
        map1.put("5", "baba");
        map1.put("5", "wsnd");//哈希集合中重复的key会使value覆盖
        map1.put(null, "wsnd");//key值可以是null，但只能有一个，默认存0号数组
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        HashMap<User, String> map2 = new HashMap<>();
        map2.put(new User("A", 20), "zhangsan");
        map2.put(new User("B", 21), "lisi");
        map2.put(new User("C", 22), "zhuwu");
        map2.put(new User("D", 23), "wangliu");
        map2.put(new User("E", 24), "baba");//key相同，但如果重写equals，内存地址不一样默认为不同
        map2.put(new User("E", 24), "wsnd");//本例重写了User中的equals，但没有哈希冲突equals不调用
        //哈希表数组长度永远是2的次幂，通过key调用哈希函数生成哈希值，哈希值对数组长度取模存入指定数组
        //出现哈希碰撞时，key对链表所有结点key进行equals，若出现true则覆盖，否则尾差法插入(JDK8前头插法)
        //因此由于哈希函数在equals之前调用，所以要想防止自定义类型对象重复要同时重写哈希函数
        Set<User> users = map2.keySet();
        for (User user : users) {
            String value = map2.get(user);
            System.out.println(user + ":" + value);
        }
    }
}