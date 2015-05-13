package main.java.monster.armor;

import main.java.monster.enums.DamageType;

/**
 * Created by Aaron on 5/3/2015.
 */
public interface Armor {

    public DamageType getArmorType();

    public Integer getArmorValue();

    public String getArmorName();
}
