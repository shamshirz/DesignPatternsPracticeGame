package main.java.monster.factory.standard;

import main.java.monster.Util;
import main.java.monster.armor.Armor;
import main.java.monster.armor.standard.MagicArmor;
import main.java.monster.armor.standard.PhysicalArmor;
import main.java.monster.enums.ArmorType;
import main.java.monster.enums.WeaponType;
import main.java.monster.factory.ArmorFactory;
import main.java.monster.factory.NameFactory;
import main.java.monster.weapon.standard.Axe;
import main.java.monster.weapon.standard.Staff;
import main.java.monster.weapon.standard.Sword;

/**
 * Created by Aaron on 5/11/2015.
 */
public class StandardArmorFactory implements ArmorFactory {

    private NameFactory nameGen = SingletonNameFactory.getInstance();
    private ArmorType aT;
    private Integer baseRating;
    private Integer maxRating;

    public StandardArmorFactory(ArmorType armorType, Integer lowerRating, Integer upperRating) {
        this.aT = armorType;
        this.baseRating = lowerRating;
        this.maxRating = upperRating;
    }

    @Override
    public Armor createArmor() {
        switch (aT) {
            case Heavy:
                return new PhysicalArmor(nameGen.getHeavyArmorName(), Util.randInt(baseRating, maxRating));
            case LIGHT:
                return new PhysicalArmor(nameGen.getLightArmorName(), Util.randInt(baseRating, maxRating));
            case MAGIC:
                return new MagicArmor(nameGen.getMagicArmorName(), Util.randInt(baseRating, maxRating));
            default:
                System.out.println("Whoops broke the Armor Factory and defaulted somehow.");
                return new PhysicalArmor(nameGen.getLightArmorName(), Util.randInt(baseRating, maxRating));
        }
    }
}
