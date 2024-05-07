package fr.jojo.classe;

import java.util.Objects;

public class Player implements Comparable<Player>{
    private String name;
    private Hand hand;
    private Integer score;

    public Player(String name, Hand hand, Integer score) {
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        return score.compareTo(o.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(score, player.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hand, score);
    }
}
