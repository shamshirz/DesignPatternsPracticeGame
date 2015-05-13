package main.java.monster.factory.standard;

import main.java.monster.Util;
import main.java.monster.enums.WeaponType;
import main.java.monster.factory.NameFactory;
import main.java.monster.factory.WeaponFactory;
import main.java.monster.weapon.Weapon;
import main.java.monster.weapon.standard.Axe;
import main.java.monster.weapon.standard.Staff;
import main.java.monster.weapon.standard.Sword;

/**
 * Created by Aaron on 5/11/2015.
 */
public class StandardWeaponFactory implements WeaponFactory<Weapon> {
    private NameFactory nameGen = SingletonNameFactory.getInstance();
    private WeaponType wT;
    private Integer baseDamage;
    private Integer maxDamage;

    public StandardWeaponFactory(WeaponType weaponType, Integer damageLower, Integer damageUpper) {
        this.wT = weaponType;
        this.baseDamage = damageLower;
        this.maxDamage = damageUpper;
    }


    @Override
    public Weapon createWeapon() {
        switch (wT) {
            case SWORD:
                return new Sword(nameGen.getSwordName(), Util.randInt(baseDamage, maxDamage));
            case AXE:
                return new Axe(nameGen.getAxeName(), Util.randInt(baseDamage, maxDamage));
            case STAFF:
                return new Staff(nameGen.getStaffName(), Util.randInt(baseDamage, maxDamage));
            default:
                System.out.println("Whoops broke the Weapon Factory and defaulted somehow.");
                return new Sword(nameGen.getSwordName(), Util.randInt(baseDamage, maxDamage));
        }
    }
}
