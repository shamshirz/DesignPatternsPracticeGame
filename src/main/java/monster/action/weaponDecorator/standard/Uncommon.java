package main.java.monster.action.weaponDecorator.standard;

import main.java.monster.action.weaponDecorator.QualityDecorator;
import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 4/27/2015.
 */
public class Uncommon extends QualityDecorator {

    public Uncommon(Weapon weapon) {
        super("Uncommon", 2, weapon);
    }
}
