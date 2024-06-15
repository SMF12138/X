package NewLearn.Learn27;

import NewLearn.Learn26.Cat;

public class Master {
    public void feed(Pet p){
        //这里应用多态，Pet作为抽象类，降低耦合度(Master与Cat，Dog没有直接联系)，可扩展性高
        p.eat();
    }
}
