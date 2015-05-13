package main.java.monster.enums;

/**
 * Created by Aaron on 5/11/2015.
 */
public enum WeaponType {
    SWORD("Sword"),
    AXE("Axe"),
    STAFF("Staff");

    private final String value;

    private WeaponType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
