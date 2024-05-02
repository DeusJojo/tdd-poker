package fr.jojo.classe;

import java.util.List;
import java.util.Objects;

public class Height implements Comparable<Height>{
    private static final String DEUX = "2";
    private static final String TROIS = "3";
    private static final String QUATRE = "4";
    private static final String CINQ = "5";
    private static final String SIX = "6";
    private static final String SEPT = "7";
    private static final String HUIT = "8";
    private static final String NEUF = "9";
    private static final String DIX = "10";
    private static final String VALET = "J";
    private static final String DAME = "Q";
    private static final String ROI = "K";
    private static final String AS = "A";

    private static final List<String> HEIGHTS = List.of(DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS);

    private Integer value;
    private String height;

    public Height(String height1) {
        value = HEIGHTS.indexOf(height1);
        if(value == -1) throw new PokerHandException("Hauteur incorrecte");
        height = HEIGHTS.get(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Height height1 = (Height) o;
        return Objects.equals(value, height1.value) && Objects.equals(height, height1.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, height);
    }

    @Override
    public int compareTo(Height o) {
        return value.compareTo(o.value);
    }
}
