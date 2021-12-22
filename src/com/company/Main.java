package com.company;

public class Main {
    public static String hp = "HP: ";
    public static String damage = "Damage: ";
    public static String abilityHero = "Ability: ";
    //

    public static void main(String[] args) {
        Magic magic = new Magic(1000, 50, "Spells");

        Medic medic = new Medic(1500, 0, "Hilling");

        Warrior warrior = new Warrior(2000, 80, "Super Damege");

        System.out.println(hp + magic.getHeroHealth() + "\n" + damage + magic.getHeroDamage() + "\n" + abilityHero + magic.getHeroSuperAbility()+"\n");

        System.out.println(hp + medic.getHeroHealth() + "\n" + damage + medic.getHeroDamage() + "\n" + abilityHero + medic.getHeroSuperAbility());

        System.out.println(hp + warrior.getHeroHealth() + "\n" + damage + warrior.getHeroDamage() + "\n" + abilityHero + warrior.getHeroSuperAbility());

        System.out.println("---------------------------------------");
        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            /*abilityHeroes(heroes[i]);*/
            heroes[i].applySuperAbility("1");

        }
    }

  /*  public static void abilityHeroes(Hero hero) {
        hero.applySuperAbility();

    }*/

}
