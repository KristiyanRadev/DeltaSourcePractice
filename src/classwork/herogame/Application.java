package src.classwork.herogame;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Assassin hero1 = new Assassin(70, 40, 450);
        Tank hero2 = new Tank(60, 40, 500);
        int counter = 0;
        while (hero1.gethealthPoints() > 0 && hero2.getattackPoints() > 0) {
            System.out.println(hero1);
            System.out.println(hero2);
            if(counter % 2 == 0) {
                StartBattle(hero1, hero2);
            } else {
                StartBattle(hero2, hero1);
            }
            counter++;
            Thread.sleep(2000);
        }


    }

    public static void StartBattle(Hero hero1, Hero hero2) {
        int attackdag = hero1.attack();
        int armourattack = hero2.defend(attackdag);
        int dagdone = attackdag - armourattack;
        hero1.updateHP(hero2.gethealthPoints()-dagdone);


    }

}

