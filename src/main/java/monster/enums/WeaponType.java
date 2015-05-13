package main.java.monster.enums;

/**
 * Created by Aaron on 5/11/2015.
 */
public enum WeaponType {
    SWORD("Sword", .1, "Physical"),
    AXE("Axe", .3, "Physical"),
    STAFF("Staff", .2, "Magical");

    private final String name;
    private final double damageRange;
    private final String damageType;

    private WeaponType(String name, double damageRange, String damageType) {
        this.name = name;
        this.damageRange = damageRange;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public double getDamageRange() {
        return damageRange;
    }

    public String getDamageType() {
        return damageType;
    }
}
