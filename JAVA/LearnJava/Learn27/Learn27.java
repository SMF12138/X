package NewLearn.Learn27;
//开闭原则:通过添加新代码修改原有代码，而多态符合了这个原则
public class Learn27 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Master master = new Master();
        master.feed(c);
        master.feed(d);
    }
}
