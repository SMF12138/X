package NewLearn.Learn170;

@Table("t_user1")//参数为表名
public class User1 {
    @Column(name = "uid")

    private String userid;
    @Column(name = "uname")
    private String username;
    @Column(name = "pwd")

    private String password;
    @Column(name = "age", type = "int")
    private int age;
    private String email;
}
