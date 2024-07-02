package NewLearn.Learn42;

public class Learn42 {
    public static void main(String[] args) {
        Address address1 = new Address("北京","裤裆街");
        User user1 = new User("张文",address1);
        Address address2 = new Address("北京","裤裆街");
        User user2 = new User("张文",address2);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.equals(user2));
    }
}
