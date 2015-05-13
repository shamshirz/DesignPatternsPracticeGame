package main.java.monster.hero;

/**
 * Created by Aaron on 4/27/2015.
 */

import main.java.monster.armor.Armor;
import main.java.monster.armor.standard.PhysicalArmor;
import main.java.monster.weapon.Weapon;
import main.java.monster.weapon.standard.Axe;

public abstract class Hero {
    private String name;
    private Weapon weapon;
    private Armor armor;

    public Hero(String name, Weapon weapon, Armor armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


    public String getCombatString() {
        StringBuilder combatBuilder = new StringBuilder();
        combatBuilder.append(getName());
        combatBuilder.append(" uses ");
        combatBuilder.append(weapon.getWeaponName());
        combatBuilder.append(" to deal ");
        combatBuilder.append(weapon.getWeaponDamage());
        combatBuilder.append(" ");
        combatBuilder.append(weapon.getDamageType().getValue());
        combatBuilder.append(" damage. \n");

        return combatBuilder.toString();
    }
}
