package io.ian;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        Hero theRock = new Hero();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int encounterCheck = rng.nextInt(10);
             if (encounterCheck > 5) {
                System.out.println("Nobody here");
            } else {
                System.out.println("can you smell the meal Dwayne 'Cold Rock' Steve Johnson is preparing?");
                Monster monster = new Monster();
                 System.out.println("1 - Fight");
                 System.out.println("2 - Flee");

                String userChoice = scanner.nextLine();

                 if (userChoice.equals("1")){
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
                 } else if (userChoice.equals("2")) {
                     while (true){
                         if (theRock.getHealth() <= 0){
                             break;
                         }
                         Boolean fleeAttempt = theRock.flee();
                         if (fleeAttempt){
                             break;
                         } else {
                             int monsterCritical =  monster.turboMaul();
                             theRock.setHealth((theRock.getHealth() - monsterCritical));
                         }
                     }
                 } else if (!userChoice.equals("1") && !userChoice.equals("2")) {
                     System.out.println("Your indecision has cost you your advantage, the monster attacks!");
                     while (monster.getHealth() > 0) {
                         if (monster.getHealth() > 0) {
                             int monsterAttack = monster.maul();
                             theRock.setHealth((theRock.getHealth() - monsterAttack));
                         }
                         if (theRock.getHealth() <= 0){
                             break;
                         }
                         int heroAttack = theRock.fight();
                         monster.setHealth((monster.getHealth() - heroAttack));
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
