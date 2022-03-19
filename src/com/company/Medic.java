package com.company;

public class Medic extends Hero {
    private float healPoints;

    public Medic(String superAbility) {
        super(superAbility);
    }

    public float getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(float healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        healPoints += healPoints/10;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied " + getSuperAbility() + " super ability");
    }

}

