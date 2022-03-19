package com.company;

public class Magic extends Hero {

    public Magic(String superAbility) {
        super(superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic applied " + getSuperAbility() + " super ability");
    }
}
