package main.java.monster.enums;

/**
 * Created by Aaron on 5/11/2015.
 */
public enum ArmorType {
    Heavy("Heavy"),
    LIGHT("Light"),
    MAGIC("Magic");

    private final String value;

    private ArmorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
