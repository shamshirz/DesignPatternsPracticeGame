package main.java.monster;

import main.java.monster.hero.Hero;

/**
 * Created by Aaron on 5/11/2015.
 */
public class Arena {
    private Hero hero1;
    private Hero hero2;

    public Arena(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void doTheThing() {
        entranceTheme();

        attack(hero1, hero2);
        attack(hero2, hero1);

        declareWinner();
    }


    private Integer getDamageDone(Hero attacker, Hero target) {
        Integer attemptedDamage = attacker.getWeapon().getWeaponDamage();

        if (attacker.getWeapon().getDamageType() == target.getArmor().getArmorType()) {
            attemptedDamage -= target.getArmor().getArmorValue();
        }

        return (attemptedDamage < 0) ? 0 : attemptedDamage;
    }

    private void attack(Hero attacker, Hero target) {
        Integer damageDone = getDamageDone(attacker, target);

        StringBuilder sB = new StringBuilder();
        sB.append(attacker.getName());
        sB.append(" attacks ");
        sB.append(target.getName());
        sB.append(" for ");
        sB.append(damageDone);
        sB.append(" ");
        sB.append(attacker.getWeapon().getDamageType().getValue());
        sB.append(" damage.\n");

        log(sB.toString());
    }

    private void declareWinner() {
        Integer hero1Damage = getDamageDone(hero1, hero2);
        Integer hero2Damage = getDamageDone(hero2, hero1);

        StringBuilder sB = new StringBuilder();
        sB.append("The winner is: ");

        Integer winner = hero1Damage.compareTo(hero2Damage);

        if (winner > 0) {
            sB.append(hero1.getName());
        } else if (winner < 0) {
            sB.append(hero2.getName());
        } else {
            sB.append("It's a fricken' tie!");
        }

        log(sB.toString());
    }

    private void entranceTheme() {
        StringBuilder sB = new StringBuilder();
        sB.append("________________________________________________________________________\n");
        sB.append("Two combatants enter the arena.\n");
        sB.append(hero1.getName());
        sB.append(" and ");
        sB.append(hero2.getName());
        sB.append("\n");
        log(sB.toString());
    }

    private void log(String message) {
        System.out.println(message);
    }
}
