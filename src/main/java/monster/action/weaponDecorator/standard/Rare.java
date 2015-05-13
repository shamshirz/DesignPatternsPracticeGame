package main.java.monster.action.weaponDecorator.standard;

import main.java.monster.action.weaponDecorator.QualityDecorator;
import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 4/27/2015.
 */
public class Rare extends QualityDecorator {

    public Rare(Weapon weapon) {
        super("Rare", 5, weapon);
    }
}
