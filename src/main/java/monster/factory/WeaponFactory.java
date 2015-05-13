package main.java.monster.factory;

import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 4/30/2015.
 */
public interface WeaponFactory<T extends Weapon> {

    public T createWeapon();
}
