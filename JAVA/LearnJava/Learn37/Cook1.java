package NewLearn.Learn37;

public class Cook1 implements FoodMenu{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cook1(String name) {
        this.name = name;
    }

    @Override
    public void TomotoEgg() {
        System.out.println(getName()+"做的TomotoEgg");
    }

    @Override
    public void FishMeat() {
        System.out.println(getName()+"做的FishMeat");
    }

    @Override
    public void OilNoodles() {
        System.out.println(getName()+"做的OilNoodles");
    }
}
