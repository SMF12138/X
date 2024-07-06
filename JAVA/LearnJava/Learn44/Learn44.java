package NewLearn.Learn44;

public class Learn44 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address("北京","裤裆街");
        User user1 = new User("张文",address1);
        User copyUser1 = (User) user1.clone();
        System.out.println(user1);
        System.out.println(copyUser1);
        copyUser1.getAddr().setCity("海淀");
        System.out.println(user1);
        System.out.println(copyUser1);
        //浅克隆只克隆了User类型的对象，而克隆后的User对象仍共用一个Address对象，变动Address属性导致两者都变了
        //要达到深克隆，即克隆一个对象所有节点(类)都克隆一份需要重写方法
    }
}
