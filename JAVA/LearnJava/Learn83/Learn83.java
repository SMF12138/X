//不知道为什么SequencedCollection接口就是无法识别，因此设计到的部分暂时用注释代替(用系统自带cmd可以编译成功)
/**
 * package NewLearn.Learn83;
 * <p>
 * import java.util.ArrayList;
 * import java.util.Iterator;
 * import java.util.SequencedCollection;
 * <p>
 * <p>
 * public class Learn83 {
 * public static void main(String[] args) {
 * SequencedCollection sc = new ArrayList();//SequencedCollection有序集合
 * sc.add(1);
 * sc.add(2);
 * sc.add(3);
 * sc.add(4);
 * sc.add(5);
 * sc.addFirst(0);//在头和尾加入元素
 * sc.addLast(6);
 * Iterator it = sc.iterator();
 * while (it.hasNext()) {
 * System.out.println(it.next());
 * }
 * sc.removeFirst();//删除和获取头尾
 * sc.removeLast();
 * System.out.println(sc.getFirst());//获取头尾
 * System.out.println(sc.getLast());
 * sc.reversed();//反转
 * }
 * }
 */
