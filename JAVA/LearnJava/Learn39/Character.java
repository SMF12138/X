package NewLearn.Learn39;

public interface Character {
    String getName();
    int getHealth();
    int getAttack();
    int getDefense();
    void attack(Character character);
    void defense(Character character);
}
