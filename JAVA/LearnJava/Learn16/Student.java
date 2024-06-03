package NewLearn.Learn16;
public class Student {
    {
        System.out.println("构造了一个代码块");
        //代码块会随着一个实例的创建被执行一次，如果所有构造方法在开始时有相同代码可以将公共代码放到代码块
    }
    private String name;
    private int age;
    private boolean sex;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(){

    }
    public Student(String name,int age,boolean sex,String address){

        this.name=name;
        this.age=age;
        this.sex=sex;
        this.address=address;
    }

    public static void print(Student x){
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.sex?"男":"女");
        System.out.println(x.address);
    }
}
