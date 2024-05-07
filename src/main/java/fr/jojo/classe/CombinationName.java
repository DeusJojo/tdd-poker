package fr.jojo.classe;

import java.util.HashMap;
import java.util.Map;

public enum CombinationName {
    ROYAL_FLUSH(1000, "Royal flush"),
    STRAIGHT_FLUSH(500, "Straight Royal"),
    FOUR_A_KIND(400, "4-of-a-kind"),
    FULL_HOUSE(300, "Full House"),
    FLUSH(250, "Flush"),
    STRAIGHT(200, "Straight"),
    THREE_OF_KIND(150, "3-of-a-kind"),
    TWO_PAIRS(100, "Two pairs"),
    ONE_PAIR(50, "One pair"),
    HIGHT_CARD(0, "High cards");

    private int value;
    private String name;
    private static final Map<String, Integer> nameToValue = new HashMap<>();

    static {
        for (CombinationName combination : CombinationName.values()) {
            nameToValue.put(combination.name, combination.value);
        }
    }

    private CombinationName(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static int getValueByName(String name) {
        return nameToValue.getOrDefault(name, 0);
    }
}
