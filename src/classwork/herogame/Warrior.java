package src.classwork.herogame;

public class Warrior extends Hero{
    public Warrior(int attackPoints, int defencePoints, int healthPoints){

        super(attackPoints,defencePoints,healthPoints);
    }
    public int attack() {
        return attackPoints * 2;
    }
}
