package com.company;

public class Magic extends Hero{
    public Magic(int heroHealth, int heroDamage, String heroSuperAbility) {
        super(heroHealth, heroDamage, heroSuperAbility);
    }

    @Override
  /*  public void   applySuperAbility() {
        System.out.println("Magic применил суперспособность FIRE BALL!");*/
    public void applySuperAbility (String superAbilityType) {
        setHeroSuperAbility("Magic применил суперспособность FIRE BALL!");
        System.out.println(getHeroSuperAbility());
    }

}
