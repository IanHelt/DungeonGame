package io.ian;

import interfaces.MonsterActions;

import java.util.Random;

public class FlyingChimp extends Monster implements MonsterActions{

    Random rng = new Random();
    private String type = "Flying Chimp";

    public FlyingChimp() {
    }

    public int maul(String heroType) {
        System.out.println("this chimp ain't monkeying around");
        int dmgTaken;
        int dmgVariation = rng.nextInt((5)-3);
        dmgTaken = attack + dmgVariation;
        System.out.println("You took " + dmgTaken + " damage!");
        return dmgTaken;
    }

    public int turboMaul() {
        System.out.println("he'S GOT A GUN");
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
