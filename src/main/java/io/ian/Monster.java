package io.ian;


import interfaces.MonsterActions;

public class Monster implements MonsterActions {

    protected int attack = 3;
    protected int health = 20;

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return null;
    }

    public int maul(String heroType) {
        return 0;
    }

    public int turboMaul() {
        return 0;
    }
}