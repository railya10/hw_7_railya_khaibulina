package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic("HealPoint");
        medic.setHealPoints(15);
        HavingSuperAbility[] heroes = {new Magic("magical"), new Medic("medical"), new Warrior("critical")};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            medic.increaseExperience();
            System.out.println(medic.getHealPoints());

        }
    }
}
