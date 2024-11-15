package NewLearn.Learn155;

public class Vip {
    public String name;
    private int id;
    private String membershipLevel;

    public Vip() {
    }

    public Vip(String name, int id, String membershipLevel) {
        this.name = name;
        this.id = id;
        this.membershipLevel = membershipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

}
