package fr.jojo.classe;

import java.util.List;

public class Color {
    private static final String CARREAU = "Carreau";
    private static final String COEUR = "Coeur";
    private static final String PIQUE = "Pique";
    private static final String TREFLE = "Trèfle";
    private static final List<String> COLORS = List.of(CARREAU, COEUR, PIQUE, TREFLE);

    private String color;

    public Color(String color1) {
        int i = COLORS.indexOf(color1);
        color = COLORS.get(i);
    }
}
