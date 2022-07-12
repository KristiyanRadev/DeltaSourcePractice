package src.classwork.herogame;

public class myHero extends Hero {
    public myHero(int attackPoints, int defencePoints, int healthPoints) {
        super(attackPoints, defencePoints, healthPoints);
    }

    public int attack() {
        return attackPoints * 15;

    }
    public int defend(int attack){
        return  (int) (defencePoints + attack /1);
    }
}