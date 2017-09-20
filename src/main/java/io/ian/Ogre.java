package io.ian;

import interfaces.MonsterActions;

import java.util.Random;

public class Ogre extends Monster implements MonsterActions{

    Random rng = new Random();
    private String type = "Ogre";

    public Ogre() {
    }

    public int maul(String heroType) {
        System.out.println("get out of his swamp, fam");
        int dmgTaken;
        int dmgVariation = rng.nextInt(4);
        if (heroType.equals("Mage")) {
            dmgVariation = 6;
        }
        dmgTaken = (attack + dmgVariation);
        System.out.println("You took " + dmgTaken + " damage!");
        return dmgTaken;
    }

    public int turboMaul() {
        System.out.println("LAYERS, onioNS HAVE LAYERS");
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
