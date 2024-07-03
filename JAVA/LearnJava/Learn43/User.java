package NewLearn.Learn43;

public class User implements Cloneable{//这里必须要有标志接口(给虚拟机看)
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {//重写时建议放宽权限便于使用
        return super.clone();
    }
}
