package main.java.monster.action.weaponDecorator.standard;

import main.java.monster.action.weaponDecorator.QualityDecorator;
import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 4/27/2015.
 */
public class Epic extends QualityDecorator {

    public Epic(Weapon weapon) {
        super("Epic", 10, weapon);
    }
}
