package io.ian;

import interfaces.HeroActions;

import java.util.Random;

public class Rogue extends Hero implements HeroActions{

    Random rng = new Random();
    private String type = "Rogue";

    public Rogue() {
    }

    public int fight(String monsterType) {
        System.out.println("You attempt a quick stab on the " + monsterType);
        int dmgDone = 0;
        int hitCheck = rng.nextInt(15);
        int dmgVariation = rng.nextInt((10)-5);
        if (this.accuracy >= hitCheck) {
            dmgDone = this.attack + dmgVariation;
            System.out.println("Hit for " + dmgDone);
        } else {
            System.out.println("Miss!");
        }
        return dmgDone;
    }

    public boolean flee(String monsterType) {
        boolean fleeBool = false;
        int fleeCheck = rng.nextInt(14);
        if (monsterType.equals("Flying Chimp")){
            fleeCheck = rng.nextInt(20);
        }
        if (evasion >= fleeCheck){
            System.out.println("Evasion Successful!");
            fleeBool = true;
        } else {
            System.out.println("Evasion Failed!");
        }
        return fleeBool;
    }

    public String getType() {
        return this.type;
    }
}
