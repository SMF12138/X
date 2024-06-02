package NewLearn.Learn15;
//insert+alt一键生成get,set
public class Vip {
    public String name;
    public int age;
    public boolean gender;

    public boolean isGender() {//boolean型get这里是is+名
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

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
}
