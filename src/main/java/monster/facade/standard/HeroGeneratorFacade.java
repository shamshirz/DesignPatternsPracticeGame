package main.java.monster.facade.standard;

import main.java.monster.Util;
import main.java.monster.armor.Armor;
import main.java.monster.enums.ArmorType;
import main.java.monster.enums.WeaponType;
import main.java.monster.facade.HeroGenerator;
import main.java.monster.factory.ArmorFactory;
import main.java.monster.factory.NameFactory;
import main.java.monster.factory.WeaponFactory;
import main.java.monster.factory.standard.SingletonNameFactory;
import main.java.monster.factory.standard.StandardArmorFactory;
import main.java.monster.factory.standard.StandardWeaponFactory;
import main.java.monster.hero.Hero;
import main.java.monster.hero.standard.CustomHero;
import main.java.monster.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 5/11/2015.
 */
public class HeroGeneratorFacade implements HeroGenerator {

    private static NameFactory nameFactory = SingletonNameFactory.getInstance();

    private WeaponFactory axeFactory;
    private WeaponFactory swordFactory;
    private WeaponFactory staffFactory;
    private List<WeaponFactory> weaponFactoryList = new ArrayList<WeaponFactory>();

    private ArmorFactory heavyArmorFactory;
    private ArmorFactory lightArmorFactory;
    private ArmorFactory magicArmorFactory;
    private List<ArmorFactory> armorFactoryList = new ArrayList<ArmorFactory>();

    public HeroGeneratorFacade() {
        axeFactory = new StandardWeaponFactory(WeaponType.AXE, 3, 14);
        swordFactory = new StandardWeaponFactory(WeaponType.SWORD, 8, 11);
        staffFactory = new StandardWeaponFactory(WeaponType.STAFF, 7, 9);

        weaponFactoryList.add(axeFactory);
        weaponFactoryList.add(swordFactory);
        weaponFactoryList.add(staffFactory);

        heavyArmorFactory = new StandardArmorFactory(ArmorType.Heavy, 4, 7);
        lightArmorFactory = new StandardArmorFactory(ArmorType.LIGHT, 3, 5);
        magicArmorFactory = new StandardArmorFactory(ArmorType.MAGIC, 3, 7);

        armorFactoryList.add(heavyArmorFactory);
        armorFactoryList.add(lightArmorFactory);
        armorFactoryList.add(magicArmorFactory);
    }

    @Override
    public Hero generateRandom() {
        Weapon randomWeapon = getRandomWeapon();
        Armor randomArmor = getRandomArmor();
        return new CustomHero(nameFactory.getHeroName(), randomWeapon, randomArmor);
    }

    @Override
    public Hero generateMage() {
        Weapon staff = staffFactory.createWeapon();
        Armor armor = magicArmorFactory.createArmor();
        return createHero(staff, armor);
    }

    @Override
    public Hero generateWarrior() {
        Weapon sword = swordFactory.createWeapon();
        Armor heavyArmor = heavyArmorFactory.createArmor();
        return  createHero(sword, heavyArmor);
    }

    @Override
    public Hero generateBarbarian() {
        Weapon axe = axeFactory.createWeapon();
        Armor lightArmor = lightArmorFactory.createArmor();
        return  createHero(axe, lightArmor);
    }

    //________________________________________________________________PRIVATE STUFF______________________________________________________

    private Weapon getRandomWeapon() {
        return weaponFactoryList.get(Util.randInt(0, weaponFactoryList.size()-1)).createWeapon();
    }

    private Armor getRandomArmor() {
        return armorFactoryList.get(Util.randInt(0, armorFactoryList.size()-1)).createArmor();
    }

    private Hero createHero(Weapon weapon, Armor armor) {
        return new CustomHero(nameFactory.getHeroName(), weapon, armor);
    }
}
