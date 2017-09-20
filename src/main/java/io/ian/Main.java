package io.ian;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your hero:");
        System.out.println("1 - Fighter");
        System.out.println("2 - Mage");
        System.out.println("3 - Rogue");
        System.out.println("Other inputs default to Fighter");

        int heroSelector = scanner.nextInt();
        Hero theRock = getHero(heroSelector);
        String heroType = theRock.getType();

        for (int i = 1; i <= 10; i++) {
            int encounterCheck = rng.nextInt(10);
             if (encounterCheck > 6) {
                System.out.println("Nobody here");
            } else {
                 Monster monster = getMonster(rng.nextInt(3));
                 String monsterType = monster.getType();
                 Boolean fleeCheck = false;
                 System.out.println("You encounter a hostile " + monsterType + ", it has not noticed you yet");

                 while (true) {
                     if (theRock.getHealth() <= 0) {
                         break;
                     }
                     if (monster.getHealth() <= 0) {
                         System.out.println("You have slain the " + monsterType);
                         break;
                     }
                     if (fleeCheck){
                         break;
                     }
                     System.out.println("1 - Fight");
                     System.out.println("2 - Flee");
                     int userChoice = scanner.nextInt();
                     if (userChoice == 1) {
                             int heroAttack = theRock.fight(monsterType);
                             monster.setHealth((monster.getHealth() - heroAttack));
                             if (monster.getHealth() > 0) {
                                 int monsterAttack = monster.maul(heroType);
                                 theRock.setHealth((theRock.getHealth() - monsterAttack));
                             }
                     } else if (userChoice == 2) {
                             Boolean fleeAttempt = theRock.flee(monsterType);
                             if (fleeAttempt) {
                                 fleeCheck = true;
                             } else {
                                 int monsterCritical = monster.turboMaul();
                                 theRock.setHealth((theRock.getHealth() - monsterCritical));
                             }
                     } else {
                         System.out.println("Your indecision has cost you your advantage, the monster attacks!");
                         while (monster.getHealth() > 0) {
                             if (monster.getHealth() > 0) {
                                 int monsterAttack = monster.maul(heroType);
                                 theRock.setHealth((theRock.getHealth() - monsterAttack));
                             }
                             if (theRock.getHealth() <= 0) {
                                 break;
                             }
                             int heroAttack = theRock.fight(monsterType);
                             monster.setHealth((monster.getHealth() - heroAttack));
                         }
                     }
                 }
             }
            if (theRock.getHealth() <= 0) {
                System.out.println("Pour one out for my fam, he lasted " + i + " turns.");
                break;
            }
            System.out.println("Level " + i + " complete!");
            System.out.println(theRock.getHealth() + " HP left");
        }
    }
    public static Monster getMonster(int number) {
        Monster monster = new Monster();
        FlyingChimp chimp = new FlyingChimp();
        Ogre smashman = new Ogre();
        Lich spookman = new Lich();
        if (number == 0) {
            monster = chimp;
        } else if (number == 1) {
            monster = spookman;
        } else if (number == 2) {
            monster = smashman;
        }
        return monster;
    }

    public static Hero getHero(int number) {
        Hero hero = new Hero();
        Fighter fighter = new Fighter();
        Mage mage = new Mage();
        Rogue rogue = new Rogue();
        if (number == 1) {
           hero = fighter;
            System.out.println("Fighter chosen!");
        } else if (number == 2) {
            hero = mage;
            System.out.println("Mage chosen!");
        } else if (number == 3) {
            hero = rogue;
            System.out.println("Rogue chosen!");
        } else {
            hero = fighter;
        }
        return hero;
    }
}

