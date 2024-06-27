package NewLearn.Learn37;

public class Cook2 implements FoodMenu{
    private String name;
    public Cook2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
