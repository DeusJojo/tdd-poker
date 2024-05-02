package fr.jojo.classe;

public class Player {
    private Hand hand;

    public Player(Hand hand) {
        this.hand = hand;
    }

    public Player() {}

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
