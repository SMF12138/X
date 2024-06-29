package NewLearn.Learn39;

public class Hero implements Character{
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Hero() {
    }

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getName()+"向"+character.getName()+"狗叫，攻击力"+this.getAttack());
        System.out.println(character.getName()+"进行了防御，防御力"+character.getDefense());
        character.defense(this);
    }

    @Override
    public void defense(Character character) {
        if (this.getHealth()<=0){
            return;
        }
        int damage = character.getAttack()-this.getDefense();
        System.out.println(getName()+"受到"+damage+"点伤害");
        this.setHealth(this.getHealth()-damage);
        if (this.getHealth()<=0){
            System.out.println(this.getName()+"挂了，游戏结束");
        }else if (damage<=0){
            System.out.println(this.getName()+"没有受到任何伤害");
        }else{
            System.out.println(this.getName()+"当前生命值"+this.getHealth());
            if (this.getHealth()<3){
                System.out.println(this.getName()+"愤怒了，攻击力翻倍");
                this.attack *= 2;
            }
        }
    }
}
