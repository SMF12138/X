package NewLearn.Learn84;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Learn84 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//为兼容JDK版本，在加载时对泛型进行擦除，同时对实际类型进行强转，进行泛型的补偿
        User u1 = new User("张三");
        User u2 = new User("李四");
        User u3 = new User("王五");
        c.add(u1);
        c.add(u2);
        c.add(u3);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object next = it.next();//如果不用泛型机制返回的是Object无法调方法，只能通过向下转型
            User user = (User) next;
            user.pay();
        }

        Collection<User> collection = new ArrayList<>();//使用泛型，集合中只能传指定类型，Java7后加入钻石表达式，可以省略后面的泛型
        Iterator<User> iterator = collection.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();//使用泛型后直接返回指定类型
            user.pay();
        }
    }
}
