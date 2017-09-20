package io.ian;

import interfaces.HeroActions;

import java.util.Random;

public class Mage extends Hero implements HeroActions {

    Random rng = new Random();
    private String type = "Mage";

    public Mage() {
    }

    public int fight(String monsterType) {
        System.out.println("You conjure the sonic power of Pearl Jam at the " + monsterType);
        int dmgDone = 0;
        int hitCheck = rng.nextInt(15);
        int dmgVariation = rng.nextInt(10);
        if (monsterType.equals("Lich") || monsterType.equals("Flying Chimp")){
            dmgVariation = 10;
        }
        if (this.accuracy >= hitCheck) {
            dmgDone = this.attack + dmgVariation;
            System.out.println("Hit for " + dmgDone);
        } else {
            System.out.println("Miss!");
        }
        return dmgDone;
    }

    public boolean flee() {
        boolean fleeBool = false;
        int fleeCheck = rng.nextInt(20);
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
