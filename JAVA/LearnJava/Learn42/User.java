package NewLearn.Learn42;

public class User {
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
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return  true;
        /**
         * 上面两个判断存疑
         */
        if (obj instanceof User){
            User user = (User) obj;
            return name.equals(user.name) && addr.equals(user.addr);
            //注意name是String类型，在String中，显然已经重写equals方法，比较字符串相不相等
        }
        return false;
    }
}
