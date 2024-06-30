package NewLearn.Learn40;

public class User {
    private String name;
    int age;
    protected String email;
    //protected作用于不在同一个包但是User的子类可以访问，权限介于默认(只限包内)和public(所有类)
    public String addr;

}
