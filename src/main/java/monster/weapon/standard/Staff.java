package main.java.monster.weapon.standard;

import main.java.monster.armor.BasicArmor;
import main.java.monster.enums.DamageType;
import main.java.monster.weapon.BasicWeapon;

/**
 * Created by Aaron on 5/3/2015.
 */
public class Staff extends BasicWeapon {

    public Staff() {
        super(DamageType.MAGIC, 5, "Basic Staff");
    }

    public Staff(String name, Integer damage) {
        super(DamageType.MAGIC, damage, name);
    }
}
