package main.java.monster.weapon.standard;

import main.java.monster.enums.DamageType;
import main.java.monster.weapon.BasicWeapon;

/**
 * Created by Aaron on 4/27/2015.
 */
public class Axe extends BasicWeapon {

    public Axe() {
        super(DamageType.PHYSICAL, 5, "Basic Axe");
    }

    public Axe(String name, Integer damage) {
        super(DamageType.PHYSICAL, damage, name);
    }

}
