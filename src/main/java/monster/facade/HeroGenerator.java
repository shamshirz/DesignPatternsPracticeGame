package main.java.monster.facade;

import main.java.monster.hero.Hero;

/**
 * Created by Aaron on 5/11/2015.
 */
public interface HeroGenerator {

    public Hero generateRandom();

    public Hero generateMage();

    public Hero generateWarrior();

    public Hero generateBarbarian();
}
