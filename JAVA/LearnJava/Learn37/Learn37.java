package NewLearn.Learn37;
/**
 * 抽象类和接口的不同在于抽象类适用于公共代码的提取(类提取父类)
 * 而接口用于功能的拓展(一些类需要方法，一些类不需要)主要针对行为
 */
public class Learn37 {
    public static void main(String[] args) {
        Cook1 cook1 = new Cook1("大师");
        Cook2 cook2 = new Cook2("小师");
        Customer customer = new Customer();
        customer.order(cook1);
        customer.order(cook2);
        //设置接口后可以随意的换厨子
    }
}
