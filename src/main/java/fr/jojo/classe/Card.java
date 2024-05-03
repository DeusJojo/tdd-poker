package fr.jojo.classe;

import java.util.Objects;

public class Card implements Comparable<Card>{

    private String symbol;
    private Integer value;
    private Color color;

    public Card(String symbol, int value, Color color) {
        this.symbol = symbol;
        this.value = value;
        this.color = color;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(symbol, card.symbol) && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, color);
    }

    @Override
    public int compareTo(Card o) {
        return value.compareTo(o.value);
    }
}
