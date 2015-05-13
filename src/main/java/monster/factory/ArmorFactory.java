package main.java.monster.factory;

import main.java.monster.Util;
import main.java.monster.armor.Armor;
import main.java.monster.armor.standard.MagicArmor;
import main.java.monster.armor.standard.PhysicalArmor;
import main.java.monster.singleton.SingletonNameFactory;

/**
 * Created by Aaron on 5/13/2015.
 */
public class ArmorFactory {
    private SingletonNameFactory nameGen = SingletonNameFactory.getInstance();
    private int productionTotal;

    public ArmorFactory() {
        productionTotal = 0;
    }

    public Armor createHeavyArmor(int baseDamage) {
        productionTotal++;
        return new PhysicalArmor(nameGen.getHeavyArmorName(), baseDamage);
    }

    public Armor createLightArmor(int baseDamage) {
        productionTotal++;
        return new PhysicalArmor(nameGen.getLightArmorName(), baseDamage);
    }

    public Armor createMagicArmor(int baseDamage) {
        productionTotal++;
        return new MagicArmor(nameGen.getMagicArmorName(), baseDamage);
    }

    public Armor getRandomArmor() {
        productionTotal++;
        Integer damage = Util.randInt(1, 10);

        switch(productionTotal%3) {
            case 0:
                return createHeavyArmor(damage);
            case 1:
                return createLightArmor(damage);
            case 2:
                return createMagicArmor(damage);
            default:
                System.out.println("ArmorFactory fucked the switch statement! yikes.");
                return createHeavyArmor(damage);
        }
    }
}
