package NewLearn.Learn97;

public class Learn97 {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("1", "zhangsan");
        map.put("2", "lisi");
        map.put("3", "wangwu");
        map.put("4", "zhaoliu");
        map.put("5", "zhaoliu");
        map.put("6", "zhaoliu");
        map.put("7", "zhaoliu");
        map.put("8", "zhaoliu");
        map.put("9", "zhaoliu");
        map.put(null, "qianqi");
        System.out.println(map);
        System.out.println(map.get(null));
        //如果要防止自定义类重复同样要在类中重写哈希函数和equals方法
        //HashMap在Java8之后第一次put初始化数组，构造方法默认null
        //如果结点数>=8，并且数组>=64，则单链表转化成红黑树，若删除红黑树上结点<=6，则再转化为单链表
    }
}
