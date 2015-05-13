package main.java.monster.facade.standard;

import main.java.monster.Util;
import main.java.monster.armor.Armor;
import main.java.monster.facade.HeroGenerator;
import main.java.monster.factory.ArmorFactory;
import main.java.monster.factory.WeaponFactory;
import main.java.monster.hero.Hero;
import main.java.monster.hero.standard.CustomHero;
import main.java.monster.singleton.SingletonNameFactory;
import main.java.monster.weapon.Weapon;

/**
 * Created by Aaron on 5/11/2015.
 */
public class HeroGeneratorFacade implements HeroGenerator {

    private static SingletonNameFactory nameFactory = SingletonNameFactory.getInstance();

    private WeaponFactory weaponFactory;
    private ArmorFactory armorFactory;

    private Integer lower;
    private Integer upper;

    private int productionTotal;

    public HeroGeneratorFacade(Integer lowerBound, Integer upperbound) {
        this.lower = lowerBound;
        this.upper = upperbound;

        productionTotal = 0;

        weaponFactory = new WeaponFactory();
        armorFactory = new ArmorFactory();

    }

    @Override
    public Hero generateRandom() {
        productionTotal++;
        Weapon randomWeapon = weaponFactory.getRandomWeapon();
        Armor randomArmor = armorFactory.getRandomArmor();
        return new CustomHero(nameFactory.getHeroName(), randomWeapon, randomArmor);
    }

    @Override
    public Hero generateMage() {
        productionTotal++;
        Weapon staff = weaponFactory.getStaff(getInt());
        Armor armor = armorFactory.createMagicArmor(getInt());
        return createHero(staff, armor);
    }

    @Override
    public Hero generateWarrior() {
        productionTotal++;
        Weapon sword = weaponFactory.getSword(getInt());
        Armor heavyArmor = armorFactory.createHeavyArmor(getInt());
        return  createHero(sword, heavyArmor);
    }

    @Override
    public Hero generateBarbarian() {
        productionTotal++;
        Weapon axe = weaponFactory.getAxe(getInt());
        Armor lightArmor = armorFactory.createLightArmor(getInt());
        return  createHero(axe, lightArmor);
    }

    //________________________________________________________________PRIVATE STUFF______________________________________________________

    private Hero createHero(Weapon weapon, Armor armor) {
        return new CustomHero(nameFactory.getHeroName(), weapon, armor);
    }

    private Integer getInt() {
        return Util.randInt(lower, upper);
    }
}
