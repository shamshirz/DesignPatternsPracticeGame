package main.java.monster.armorDecorator;

import main.java.monster.armor.Armor;
import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 5/3/2015.
 */
public class ArmorDecorator implements Armor {
    private Armor armor;
    private Integer armorValue;
    private String quality;

    public ArmorDecorator(Armor armor, Integer armorValue, String quality) {
        this.armor = armor;
        this.armorValue = armorValue;
       this.quality = quality;
    }

    @Override
    public DamageType getArmorType() {
        return armor.getArmorType();
    }

    @Override
    public Integer getArmorValue() {
        return armorValue + armor.getArmorValue();
    }

    @Override
    public String getArmorName() {
        return quality + armor.getArmorName();
    }
}
