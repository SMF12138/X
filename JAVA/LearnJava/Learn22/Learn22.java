package NewLearn.Learn22;

public class Learn22 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",20,true);
        Person p2 = new Person("李四",25,true);
        Person p3 = new Person();
        System.out.println("总人口:"+Person.getCount());
    }
}
