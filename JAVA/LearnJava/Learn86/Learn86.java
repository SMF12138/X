package NewLearn.Learn86;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Learn86 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("zhangsan");
        names.add("lisi");
        names.add("zhuwu");
        names.add("zhaoliu");
        names.add("wangqi");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if ("lisi".equals(name)) {
                iterator.remove();//使用集合自带的names.remove(name);会出现并发修改异常ConcurrentModificationException
                //删除方法不一致，编译器默认为并发执行，会产生异常，因此必须用迭代器iterator.remove();
                //fail-fast机制在集合增删改时设置modCount属性并+1，而在获取迭代器对象时modCount属性赋值给expectedModCount属性
                //而进行next()函数时会判断modCount属性和expectedModCount属性是否相等，如果调用集合的remove方法会使属性不相等产生异常
                //而用迭代器remove方法时两个属性都+1则不会产生异常
            }
            System.out.println(name);
        }
    }
}
