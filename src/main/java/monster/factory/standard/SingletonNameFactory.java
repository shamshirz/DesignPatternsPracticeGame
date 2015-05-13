package main.java.monster.factory.standard;

import main.java.monster.Util;
import main.java.monster.factory.NameFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 5/11/2015.
 */
public class SingletonNameFactory implements NameFactory {
    private static SingletonNameFactory uniqueInstance;

    private List<String> staffNameList = new ArrayList<String>();
    private List<String> axeNameList = new ArrayList<String>();
    private List<String> swordNameList = new ArrayList<String>();
    private List<String> haNameList = new ArrayList<String>();
    private List<String> laNameList = new ArrayList<String>();
    private List<String> maNameList = new ArrayList<String>();
    private List<String> nameList = new ArrayList<String>();

    private SingletonNameFactory() {
        staffNameList.add("Mage's Fury");
        staffNameList.add("Fire Dancer");
        staffNameList.add("Harpy's Rage");
        staffNameList.add("Arcana");
        staffNameList.add("Staff of the Master");
        staffNameList.add("Thunderbringer");
        staffNameList.add("Nature's Vine");
        staffNameList.add("Enchantress");
        staffNameList.add("Demon's Lament");
        staffNameList.add("Scourge");

        axeNameList.add("Great Axe");
        axeNameList.add("Halbert");
        axeNameList.add("Executioner's Axe");
        axeNameList.add("Hatchet");
        axeNameList.add("Devil's Axe");
        axeNameList.add("Berserker's Axe");
        axeNameList.add("Poleaxe");
        axeNameList.add("Lu Bu's Axe");
        axeNameList.add("Runed Cleaver");
        axeNameList.add("The Butcher");

        swordNameList.add("Avenger");
        swordNameList.add("DarkStar");
        swordNameList.add("Blackfyre");
        swordNameList.add("Hearteater");
        swordNameList.add("Heartsbane");
        swordNameList.add("Ice");
        swordNameList.add("Longclaw");
        swordNameList.add("Needle");
        swordNameList.add("Oathkeeper");
        swordNameList.add("Red Rain");

        haNameList.add("Jerkin");
        haNameList.add("Platemail");
        haNameList.add("Leather Cuirass");
        haNameList.add("Iron Plate");
        haNameList.add("Dwarven Armor");
        haNameList.add("Steel Bands");
        haNameList.add("Tribal Cloth");
        haNameList.add("Runed Plate");
        haNameList.add("Chainmail");
        haNameList.add("Roughspun");

        maNameList.add("Apprentice Robes");
        maNameList.add("Cleric Robes");
        maNameList.add("Dark Mage Robes");
        maNameList.add("Force Field");
        maNameList.add("Yoda's Robes");
        maNameList.add("Flame Resistant Jerkin");
        maNameList.add("Antifreeze");
        maNameList.add("Rubber Gloves");
        maNameList.add("Windbreaker");
        maNameList.add("Sun Glasses");

        nameList.add("Aaron");
        nameList.add("Sam");
        nameList.add("RJ");
        nameList.add("Tom");
        nameList.add("Pete");
        nameList.add("Mitesh");
        nameList.add("Kevin");
        nameList.add("Bridget");
        nameList.add("Zoe");
        nameList.add("Vee");
        nameList.add("Vicky");
        nameList.add("Jamie");
        nameList.add("Shervin");

        // TODO currently light armor list is just a copy - be creative
        laNameList = haNameList;
    }

    @Override
    public String getSwordName() {
        return swordNameList.get(Util.randInt(0, swordNameList.size()-1));
    }

    @Override
    public String getAxeName() {
        return axeNameList.get(Util.randInt(0, axeNameList.size()-1));
    }

    @Override
    public String getStaffName() {
        return staffNameList.get(Util.randInt(0, staffNameList.size()-1));
    }

    @Override
    public String getHeavyArmorName() {
        return haNameList.get(Util.randInt(0, haNameList.size() - 1));
    }

    @Override
    public String getLightArmorName() {
        return laNameList.get(Util.randInt(0, laNameList.size()-1));
    }

    @Override
    public String getMagicArmorName() {
        return maNameList.get(Util.randInt(0, maNameList.size()-1));
    }

    @Override
    public String getHeroName() {
        return nameList.get(Util.randInt(0, nameList.size()-1));
    }

    public static synchronized SingletonNameFactory getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new SingletonNameFactory();
        }

        return uniqueInstance;
    }

}
