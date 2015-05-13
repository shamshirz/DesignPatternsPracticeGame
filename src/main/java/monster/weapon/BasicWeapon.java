package main.java.monster.weapon;

import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 4/27/2015.
 */
public abstract class BasicWeapon implements Weapon {
    private DamageType damageType;
    private Integer weaponValue;
    private String weaponName;

    public BasicWeapon(DamageType damageType, Integer weaponValue, String weaponName) {
        this.damageType = damageType;
        this.weaponValue = weaponValue;
        this.weaponName = weaponName;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public void setWeaponValue(Integer weaponValue) {
        this.weaponValue = weaponValue;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public Integer getWeaponDamage() {
        return weaponValue;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    @Override
    public DamageType getDamageType() {
        return damageType;
    }

}
