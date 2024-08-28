package NewLearn.Learn95;

import java.util.*;

public class Learn95 {
    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(120, "zhangsan");
        maps.put(110, "lisi");
        maps.put(119, "wangwu");
        HashMap<Integer, String> newMaps = new HashMap<>();
        newMaps.put(111, "zhaoliu");
        newMaps.remove(111);//通过key删除整个键值对
        System.out.println(maps.containsValue("lisi"));//判断是否包含value，底层调用equal方法
        System.out.println(maps.containsKey(1));//判断是否包含key，底层调用equal方法
        newMaps.putAll(maps);
        System.out.println("键值对个数:" + newMaps.size());
        System.out.println("根据key获取value" + maps.get(110));//不存在返回null
        maps.clear();//清空
        System.out.println(maps.isEmpty());//判断是否为空

        Collection<String> values = newMaps.values();//获取所有value
        for (String value : values) {
            System.out.println(value);
        }

        Map<Integer, String> map = Map.of(1, "zhangsan", 2, "lisi", 3, "zhuwu", 4, "zhaoliu");
        System.out.println(map.size());//静态方法建立Map集合
        Set<Integer> keys = map.keySet();//遍历时先通过Set获取所有key再通过迭代器进行遍历(虽然集合无序但遍历顺序却固定)
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value + ":" + map.get(value));
        }

        //推荐的遍历方法
        Set<Map.Entry<Integer, String>> entries = map.entrySet();//将Map型转换为存有Entry(键值对)类型的Set集合
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
