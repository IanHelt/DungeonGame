package io.ian;

import interfaces.MonsterActions;

import java.util.Random;

public class FlyingChimp extends Monster implements MonsterActions{

    Random rng = new Random();
    private String type = "Flying Chimp";

    public FlyingChimp() {
    }

    public int maul(String heroType) {
        System.out.println("This chimp ain't monkeying around");
        int dmgTaken;
        int dmgVariation = rng.nextInt(5);
        dmgTaken = (attack + dmgVariation);
        System.out.println("You took " + dmgTaken + " damage!");
        return dmgTaken;
    }

    public int turboMaul() {
        System.out.println("wOW that Chimp is mad");
        int bigDmgTaken;
        int dmgVariation = rng.nextInt(10);
        bigDmgTaken = (attack + dmgVariation);
        System.out.println("You took " + bigDmgTaken + " damage!");
        return bigDmgTaken;
    }

    public String getType() {
        return this.type;
    }
}
