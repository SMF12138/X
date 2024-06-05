package NewLearn.Learn18;

public class Chinese {
    static String country = "中国";
    String IdCard;
    //当属性是类级别的，并且这个属性的值是一样的，建议定义成静态变量，在内存中只有一份节省空间(堆中)
    //静态变量在类加载时初始化
    String name;
    
    public Chinese() {

    }

    public Chinese(String idCard, String name) {
        this.IdCard = idCard;
        this.name = name;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("身份证号:" + this.IdCard + "  姓名:" + this.name + "  国籍:" + country);
    }

    public static void test() {
        System.out.println("静态方法");
        //由于静态方法与对象无关，所以不能在方法中用this或调用实例方法
    }
}
