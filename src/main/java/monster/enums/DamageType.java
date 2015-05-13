package main.java.monster.enums;

/**
 * Created by Aaron on 5/3/2015.
 */
public enum DamageType {
    PHYSICAL("Physical"),
    MAGIC("Magic");

    private final String value;

    private DamageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
