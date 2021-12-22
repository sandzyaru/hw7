package com.company;

public abstract class Hero implements HavingSuperAbility {
private int heroHealth;
 private int heroDamage;
 private String heroSuperAbility;

    @Override
    public void applySuperAbility(String superAbilityType) {

    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroSuperAbility() {
        return heroSuperAbility;
    }

    public void setHeroSuperAbility(String heroSuperAbility) {
        this.heroSuperAbility = heroSuperAbility;
    }
    public Hero (int heroHealth , int heroDamage , String heroSuperAbility) {
      this.heroHealth=heroHealth;
      this.heroDamage=heroDamage;
      this.heroSuperAbility=heroSuperAbility;
    }

    public abstract void applySuperAbility();
}
