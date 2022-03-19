package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(String superAbility) {
        this.superAbility = superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public abstract void applySuperAbility();
}


