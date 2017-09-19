package io.ian;

import java.util.Random;

public class Hero {

    Random rng = new Random();

    private int health = 20;
    private int attack = 10;
    private int accuracy = 10;
    private int evasion = 10;

    public Hero() {

    }

    public int fight() {
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

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
