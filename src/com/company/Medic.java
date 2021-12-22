package com.company;

public class Medic extends Hero{
    public Medic(int heroHealth, int heroDamage, String heroSuperAbility) {
        super(heroHealth, heroDamage, heroSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HILL!");
    }

}
