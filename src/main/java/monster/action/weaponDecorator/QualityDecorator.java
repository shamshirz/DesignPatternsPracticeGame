package main.java.monster.action.weaponDecorator;

import main.java.monster.enums.DamageType;
import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 4/27/2015.
 *
 * This is an example of the decorator Pattern.
 *
 * This class implements Weapon just like a real Weapon would,
 * but it mearly adds a layer on top of that weapon, we keep
 * the reference and then call the original weapons methods
 * and just append to them.
 */
public class QualityDecorator implements Weapon {
    private String quality;
    private Integer damageBonus;
    private Weapon weapon;

    public QualityDecorator(String quality, Integer damageBonus, Weapon weapon) {
        this.weapon = weapon;
        this.quality = quality;
        this.damageBonus = damageBonus;
    }

    @Override
    public Integer getWeaponDamage() {
        return damageBonus + weapon.getWeaponDamage();
    }

    @Override
    public String getWeaponName() {
        return quality +" "+ weapon.getWeaponName();
    }

    @Override
    public DamageType getDamageType() {
        return weapon.getDamageType();
    }
}
