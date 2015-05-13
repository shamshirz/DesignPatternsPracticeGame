package main.java.monster.armor.standard;

import main.java.monster.armor.BasicArmor;
import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 5/3/2015.
 */
public class PhysicalArmor extends BasicArmor {

    public PhysicalArmor(String armorName, Integer armorValue) {
        super(DamageType.PHYSICAL, armorValue, armorName);
    }

}
