package io.ian;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        Hero theRock = new Hero();

        for (int i = 1; i <= 10; i++) {
            int encounterCheck = rng.nextInt(10);
             if (encounterCheck > 5) {
                System.out.println("Nobody here");
            } else {
                System.out.println("can you smell the meal Dwayne 'Cold Rock' Steve Johnson is preparing?");
                Monster monster = new Monster();;
                //boolean fleeAttempt = false;
                while (monster.getHealth() > 0) {
                    if (theRock.getHealth() <= 0){
                        break;
                    }
                    int heroAttack = theRock.fight();
                    monster.setHealth((monster.getHealth() - heroAttack));
                    if (monster.getHealth() > 0) {
                        int monsterAttack = monster.maul();
                        theRock.setHealth((theRock.getHealth() - monsterAttack));
                    }
                }
            }
            if (theRock.getHealth() <= 0) {
                System.out.println("Pour one out for my fam, he lasted " + i + " turns.");
                break;
            }
            System.out.println("Level " + i + " complete!");
        }
    }
}
