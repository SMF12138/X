package NewLearn.Learn81;

import java.util.ArrayList;
import java.util.Collection;

public class Learn81 {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(1);//自动装箱
        collection1.add("2");
        System.out.println(collection1.size());
        Collection collection2 = new ArrayList();
        collection2.add(3);
        collection2.add("22");
        collection2.addAll(collection1);//添加多个
        System.out.println(collection2.size());
        System.out.println(collection2.contains(1));
        collection2.remove(1);
        collection2.clear();
        System.out.println(collection2.isEmpty());
        Object[] array = collection2.toArray();//转数组
    }
}
