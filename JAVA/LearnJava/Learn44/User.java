package NewLearn.Learn44;

public class User implements Cloneable{
    private String name;
    private Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //这里重写为深克隆
        User copyUser = (User) super.clone();
        copyUser.setAddr((Address) getAddr().clone());
        return copyUser;
    }
}
