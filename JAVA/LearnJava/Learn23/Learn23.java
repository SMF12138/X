package NewLearn.Learn23;

public class Learn23 {
    public static void main(String[] args) {
        Course course = new Course("java","Du");
        Student zhangsan = new Student("уехЩ","001");
        zhangsan.selection(course);
        zhangsan.display();
        zhangsan.cancal();
    }
}
