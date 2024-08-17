package NewLearn.Learn84;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pay() {
        System.out.println(name + "ÓÃ»§ÔÚÂò");
    }
}
