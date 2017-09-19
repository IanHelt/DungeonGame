package io.ian;

import java.util.Random;

public class Monster {

    Random rng = new Random();
    private int attack = 3;
    private int health = 20;

    public Monster() {
    }

    public int maul() {
        int dmgTaken;
        int dmgVariation = rng.nextInt((5)-3);
        dmgTaken = attack + dmgVariation;
        System.out.println("You took " + dmgTaken + " damage!");
        return dmgTaken;
    }

    public int turboMaul() {
        int bigDmgTaken;
        int dmgVariation = rng.nextInt((3)-2);
        bigDmgTaken = (attack + dmgVariation) + 5;
        System.out.println("You took " + bigDmgTaken + " damage!");
        return bigDmgTaken;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}