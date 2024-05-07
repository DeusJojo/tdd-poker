package fr.jojo.classe;

import java.util.Collections;
import java.util.List;

public class Hand {
    private String name;
    private List<Card> cardsInHand;

    public Hand(String name, List<Card> cardsInHand) {
        this.name = name;
        this.cardsInHand = cardsInHand;
        Collections.sort(cardsInHand);
    }

    public Hand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
        Collections.sort(cardsInHand);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
}
