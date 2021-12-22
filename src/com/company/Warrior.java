package com.company;

public class Warrior extends Hero{
    public Warrior(int heroHealth, int heroDamage, String heroSuperAbility) {
        super(heroHealth, heroDamage, heroSuperAbility);
    }

    @Override
    /*public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }*/
    public void applySuperAbility (String superAbilityType) {
        setHeroSuperAbility("Warrior применил суперспособность CRITICAL DAMAGE");
        System.out.println(getHeroSuperAbility());
    }

}
