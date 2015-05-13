package main.java.monster.factory;

import main.java.monster.Util;
import main.java.monster.singleton.SingletonNameFactory;
import main.java.monster.weapon.Weapon;
import main.java.monster.weapon.standard.Axe;
import main.java.monster.weapon.standard.Staff;
import main.java.monster.weapon.standard.Sword;

/**
 * Created by Aaron on 5/12/2015.
 */
public class WeaponFactory {
    private SingletonNameFactory nameGen = SingletonNameFactory.getInstance();
    private int productionTotal;

    public WeaponFactory() {
        productionTotal = 0;
    }

    public Weapon getSword(int baseDamage) {
        productionTotal++;
        return new Sword(nameGen.getSwordName(), baseDamage);
    }

    public Weapon getAxe(int baseDamage) {
        productionTotal++;
        return new Axe(nameGen.getAxeName(), baseDamage);
    }

    public Weapon getStaff(int baseDamage) {
        productionTotal++;
        return new Staff(nameGen.getStaffName(), baseDamage);
    }

    public Weapon getRandomWeapon() {
        productionTotal++;
        Integer damage = Util.randInt(1, 10);

        switch(productionTotal%3) {
            case 0:
                return getSword(damage);
            case 1:
                return getStaff(damage);
            case 2:
                return getAxe(damage);
            default:
                System.out.println("WeaponFactory fucked the switch statement! yikes.");
                return getSword(damage);
        }

    }


    // Eventually create a builder method inner class that can create custom weapons
}
