package fr.jojo.classe;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cardsInHand;

    public Hand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
}
