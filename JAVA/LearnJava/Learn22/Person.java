package NewLearn.Learn22;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private static int count;
    public Person(){
        count++;
    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
