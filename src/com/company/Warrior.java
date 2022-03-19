package com.company;

public class Warrior extends Hero {

    public Warrior(String superAbility) {
        super(superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior applied " + getSuperAbility() + " super ability");
    }
}
