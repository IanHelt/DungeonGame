package io.ian;

import interfaces.MonsterActions;

import java.util.Random;

public class Lich extends Monster implements MonsterActions{

    Random rng = new Random();
    private String type = "Lich";

    public Lich() {
    }

    public int maul(String heroType) {
        System.out.println("wow, that's spooky");
        int dmgTaken;
        int dmgVariation = rng.nextInt((5)-3);
        dmgTaken = attack + dmgVariation;
        System.out.println("You took " + dmgTaken + " damage!");
        return dmgTaken;
    }

    public int turboMaul() {
        System.out.println("wow, that's T U R B O S P O O K Y");
        int bigDmgTaken;
        int dmgVariation = rng.nextInt(9);
        bigDmgTaken = (attack + dmgVariation);
        System.out.println("You took " + bigDmgTaken + " damage!");
        return bigDmgTaken;
    }

    public String getType() {
        return this.type;
    }

}
