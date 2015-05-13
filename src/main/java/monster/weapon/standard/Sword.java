package main.java.monster.weapon.standard;

import main.java.monster.enums.DamageType;
import main.java.monster.weapon.BasicWeapon;

/**
 * Created by Aaron on 4/27/2015.
 */
public class Sword extends BasicWeapon {

    public Sword() {
        super(DamageType.PHYSICAL, 5, "Basic Sword");
    }

    public Sword(String name, Integer damage) {
        super(DamageType.PHYSICAL, damage, name);
    }
}
