package main.java.monster;

import main.java.monster.facade.HeroGenerator;
import main.java.monster.facade.standard.HeroGeneratorFacade;
import main.java.monster.hero.Hero;

/**
 * Created by Aaron on 4/20/2015.
 */
public class main {
    private String version = "1.2";

    public main() {

        printVersion();
        doStuff();

        Integer test = 4;
        Integer test2 = test%2;
    }

    public void doStuff() {

        HeroGenerator heroGen = new HeroGeneratorFacade(3, 8);
        Hero barbarian = heroGen.generateBarbarian();
        Hero mage = heroGen.generateMage();
        Hero warrior = heroGen.generateWarrior();
        Hero random1 = heroGen.generateRandom();
        Hero random2 = heroGen.generateRandom();

        printStats(barbarian);

        printStats(mage);

        printStats(warrior);

        printStats(random1);

        printStats(random2);

        Arena zhuLi = new Arena(barbarian, warrior);
        zhuLi.doTheThing();

        zhuLi = new Arena(random1, random2);
        zhuLi.doTheThing();

    }

    private void printVersion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Welcome to Aaron's Combat Practice App. \n");
        sb.append("This is version "+ version+". \n");
        sb.append("Begin simulation now...");
        sb.append("\n______________________________________________________________________________________________");

        System.out.println(sb.toString());
    }

    private void printStats(Hero hero) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hero: ");
        sb.append(hero.getName());
        sb.append("\n");

        sb.append("Weapon: ");
        sb.append(hero.getWeapon().getWeaponName());
        sb.append("\n");

        sb.append(hero.getWeapon().getDamageType().getValue());
        sb.append(" Damage: ");
        sb.append(hero.getWeapon().getWeaponDamage());
        sb.append("\n");

        sb.append("Armor: ");
        sb.append(hero.getArmor().getArmorName());
        sb.append("\n");

        sb.append("Arnor Type: ");
        sb.append(hero.getArmor().getArmorType().getValue());
        sb.append(" Rating: ");
        sb.append(hero.getArmor().getArmorValue());
        sb.append("\n");

        System.out.println(sb.toString());
    }

    public void fight(Hero firstHero, Hero secondHero) {

        System.out.println(getStats(firstHero, secondHero));

        System.out.println(attackString(firstHero, secondHero));

        System.out.println(attackString(secondHero, firstHero));

    }

    private String attackString(Hero attacker, Hero target) {
        StringBuilder sB = new StringBuilder();
        sB.append(attacker.getName());
        sB.append(" attacks ");
        sB.append(target.getName());
        sB.append(" with ");
        sB.append(attacker.getWeapon().getWeaponName());
        sB.append(" for ");
        sB.append(getDamageDone(attacker, target));
        sB.append(" damage.");

        return sB.toString();
    }

    private String getStats(Hero firstHero, Hero secondHero) {
        StringBuilder sB = new StringBuilder();
        sB.append(firstHero.getName());
        sB.append(" : ");
        sB.append(secondHero.getName());
        sB.append("\n");

        sB.append(firstHero.getWeapon().getWeaponName());
        sB.append(" : ");
        sB.append(secondHero.getWeapon().getWeaponName());
        sB.append("\n");

        sB.append(firstHero.getWeapon().getWeaponDamage());
        sB.append(" : ");
        sB.append(secondHero.getWeapon().getWeaponDamage());
        sB.append("\n");

        sB.append(firstHero.getWeapon().getDamageType().getValue());
        sB.append(" : ");
        sB.append(secondHero.getWeapon().getDamageType().getValue());
        sB.append("\n");

        sB.append(firstHero.getArmor().getArmorName());
        sB.append(" : ");
        sB.append(secondHero.getArmor().getArmorName());
        sB.append("\n");

        sB.append(firstHero.getArmor().getArmorType());
        sB.append(" : ");
        sB.append(secondHero.getArmor().getArmorType());
        sB.append("\n");

        sB.append(firstHero.getArmor().getArmorValue());
        sB.append(" : ");
        sB.append(secondHero.getArmor().getArmorValue());
        sB.append("\n");

        return sB.toString();
    }

    private Integer getDamageDone(Hero attacker, Hero target) {
        Integer attemptedDamage = attacker.getWeapon().getWeaponDamage();

        if (attacker.getWeapon().getDamageType() == target.getArmor().getArmorType()) {
            attemptedDamage -= target.getArmor().getArmorValue();
        }

        return (attemptedDamage < 0) ? 0 : attemptedDamage;
    }

    public static void main(String[] args) {
        main guy = new main();
    }

}
