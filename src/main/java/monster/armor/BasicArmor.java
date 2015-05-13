package main.java.monster.armor;

import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 5/3/2015.
 */
public abstract class BasicArmor implements Armor {
    private DamageType armorType;
    private Integer armorValue;
    private String armorName;

    public BasicArmor(DamageType armorType, Integer armorValue, String armorName) {
        this.armorType = armorType;
        this.armorValue = armorValue;
        this.armorName = armorName;
    }

    public void setArmorType(DamageType armorType) {
        this.armorType = armorType;
    }

    public void setArmorValue(Integer armorValue) {
        this.armorValue = armorValue;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    @Override
    public DamageType getArmorType() {
        return armorType;
    }

    @Override
    public Integer getArmorValue() {
        return armorValue;
    }

    @Override
    public String getArmorName() {
        return armorName;
    }
}
