package fr.jojo.classe;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private List<Card> deck = new ArrayList<>();

    public CardGame(List<Card> deck) {
        this.deck = deck;
    }

    public CardGame() {}

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
