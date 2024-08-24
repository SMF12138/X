package NewLearn.Learn91;

public class Learn91 {
    public static void main(String[] args) {
        MyLinked<String> myLinked = new MyLinked<>();
        myLinked.add("zhangsan");
        myLinked.add("lisi");
        myLinked.add("wangwu");
        myLinked.remove(2);
        myLinked.set(1, "baba");
        myLinked.add(1, "ÀîËÄ");
        for (int i = 0; i < myLinked.size(); i++) {
            System.out.println(myLinked.get(i));
        }
    }
}
