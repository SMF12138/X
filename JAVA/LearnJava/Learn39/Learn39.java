package NewLearn.Learn39;

public class Learn39 {
    public static void main(String[] args) {
        Hero hero = new Hero("π∑",10,5,4);
        Monsterlmpl monster = new Monsterlmpl("’≈À∆»ª",20,3,3,150);
        while(true) {
            hero.attack(monster);
            if (monster.getHealth()<=0)
                return;
            monster.attack(hero);
            if(hero.getHealth()<=0) {
                return;
            }
        }
    }
}
