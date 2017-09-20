package io.ian;


import interfaces.HeroActions;

public class Hero implements HeroActions{

    protected int health = 20;
    protected int attack = 10;
    protected int accuracy = 10;
    protected int evasion = 10;

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int fight(String monsterType) {
        return 0;
    }

    public boolean flee(String monsterType) {
        return false;
    }

    public String getType() {
        return null;
    }
}
