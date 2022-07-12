package src.classwork.herogame;

public class Assassin extends Hero {
    public Assassin(int attackPoints, int defencePoints, int healthPoints) {
        super(attackPoints, defencePoints, healthPoints);
    }

    public int attack() {
        return attackPoints * 4;
    }
}
