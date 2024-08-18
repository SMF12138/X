package NewLearn.Learn85;

public class Learn85<T> {
    private T name;

    public Learn85(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Learn85<String> learn85 = new Learn85<>("zhangsan");//这里使用了自定义泛型
        System.out.println(learn85.getName());
        Vip<String, Integer> vip = new Vip<>("zhangsan", 18);
        System.out.println(vip.getName());
        System.out.println(vip.getAge());
        Vip.shopping("1");
    }
}
