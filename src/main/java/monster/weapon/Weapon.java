package main.java.monster.weapon;

import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 4/27/2015.
 */
public interface Weapon {

    public Integer getWeaponDamage();

    public String getWeaponName();

    public DamageType getDamageType();

}
