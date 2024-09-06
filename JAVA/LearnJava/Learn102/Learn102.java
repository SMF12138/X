package NewLearn.Learn102;

import java.util.HashSet;

public class Learn102 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student student = new Student("zhangsan", 25);
        set.add(student);//对象加入集合中是引用，只有基本数据类型加入的是值
        student.setName("lisi");
        System.out.println(set);//因此一旦对象改名，集合中打印出的结果也改变，但元素的哈希值不变
        set.remove(student);//此时要删除的元素哈希值与刚才已经不同，于是删除失败
        set.add(new Student("lisi", 25));//此时要存入的元素哈希值也不同，于是添加成功
        System.out.println(set);
        set.add(new Student("zhangsan", 25));//此时要存入的元素哈希值也相同，但key不同，所以也添加成功
        System.out.println(set);
    }
}
