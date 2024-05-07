package fr.jojo.utils;

import fr.jojo.classe.*;

import java.util.*;

public class Play extends Combination{
    private static final int NB_PLAYER = 2;
    private static final int NB_CARTE = 5;

    private static List<Hand> hands = new ArrayList<>();

    private static boolean equality = false;

    public static List<Player> ranked(List<Player> players){
        players.sort(Collections.reverseOrder());
        return players;
    }

    public static List<Player> attributeScore(List<Player> players){

        for(Player player : players){

            Hand hand = player.getHand();
            Hand handCopy = new Hand(new ArrayList<>(hand.getCardsInHand()));
            hands.add(handCopy);
            List<Card> cards = hand.getCardsInHand();
            int size = cards.size();
            Map<Integer, Integer> occurCard = Combination.occurencyCard(player.getHand());
            int score;

            if(player.getScore() != null){
                score = player.getScore();
            } else {
                score = 0;
            }

            List<Card> combinaisonDe = new ArrayList<>();

            if (size > 0) {
                if (Combination.isRoyalFlush(hand) && size == NB_CARTE && !equality) {
                    player.setScore(CombinationName.getValueByName("Royal flush"));
                    player.getHand().setName("ROYAL FLUSH");

                } else if (Combination.isStraightFlush(hand) && size == NB_CARTE && !equality) {
                    player.setScore(CombinationName.getValueByName("Straight flush"));
                    player.getHand().setName("STRAIGHT FLUSH");

                } else if (Combination.isFourOfAKind(hand) && !equality) {
                    for (Card card : player.getHand().getCardsInHand()) {
                        score = score + card.getValue();
                    }
                    player.setScore(score + CombinationName.getValueByName("4-of-a-kind"));
                    player.getHand().setName("FOUR A KIND");

                } else if (Combination.isFullHouse(hand) && size == NB_CARTE && !equality) {
                    for (Card card : player.getHand().getCardsInHand()) {
                        score = score + card.getValue();
                    }
                    player.setScore(score + CombinationName.getValueByName("Full house"));
                    player.getHand().setName("FULL HOUSE");

                } else if (Combination.isFlush(hand) && size == NB_CARTE && !equality) {
                    for (Card card : player.getHand().getCardsInHand()) {
                        score = score + card.getValue();
                    }
                    player.setScore(score + CombinationName.getValueByName("Flush"));
                    player.getHand().setName("FLUSH");
                    equality = false;

                } else if (Combination.isStraight(hand) && size == NB_CARTE && !equality) {
                    for (Card card : player.getHand().getCardsInHand()) {
                        score = score + card.getValue();
                    }
                    player.setScore(score + CombinationName.getValueByName("Straight"));
                    player.getHand().setName("STRAIGHT");
                    equality = false;

                } else if (Combination.isThreeOfAKind(hand)) {
                    for (Card card : cards) {
                        if (occurCard.get(card.getValue()) == 3) {
                            score = score + card.getValue();
                            player.getHand().getCardsInHand().remove(card);
                        }
                    }
                    player.setScore(score + CombinationName.getValueByName("3-of-a-kind"));
                    player.getHand().setName("THREE OF KIND");

                } else if (Combination.isTwoPair(hand)) {
                    for (Card card : cards) {
                        if (occurCard.get(card.getValue()) == 2) {
                            score = score + card.getValue();
                            player.getHand().getCardsInHand().remove(card);
                        }
                    }
                    player.setScore(score + CombinationName.getValueByName("Two pairs"));
                    player.getHand().setName("TWO PAIRS");

                } else if (Combination.isOnePair(hand)) {
                    for (Card card : player.getHand().getCardsInHand()) {
                        if (occurCard.get(card.getValue()) == 2) {
                            score = score + card.getValue();
                            combinaisonDe.add(card);
                        }
                    }
                    player.setScore(score + CombinationName.getValueByName("One pair"));
                    player.getHand().setName("ONE PAIR");
                    player.getHand().getCardsInHand().removeAll(combinaisonDe);
                } else {
                    Card highCard = Combination.highCard(hand);
                    score = score + highCard.getValue();
                    player.setScore(score);
                    player.getHand().setName("HIGH CARD");
                    player.getHand().getCardsInHand().remove(highCard);
                }
            }
        }

        verifyEquality(players);
        reGiveHand(players, hands);

        return ranked(players);
    }

    private static void reGiveHand(List<Player> players, List<Hand> hands){
        for (int i = 0; i < players.size(); i++){
            players.get(i).setHand(hands.get(i));
        }
    }

    private static void verifyEquality(List<Player> players){
        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size(); j++) {
                Player player1 = players.get(i);
                Player player2 = players.get(j);
                if (player1.equals(player2) && !player1.getHand().getCardsInHand().isEmpty()) {
                    equality = true;
                    attributeScore(players);
                }
            }
        }
    }

    public static List<Player> distribute(CardGame cardGame){
        List<Player> players = new ArrayList<>();

        setPlayer(players);

        List<Card> cards = new ArrayList<>();

        for(Player player : players){
            int i = 0;
            while(i < NB_CARTE){
                cards.add(cardGame.getDeck().removeFirst());
                i++;
            }
            player.setHand(new Hand(new ArrayList<>(cards)));
            cards.clear();
        }

        return attributeScore(players);
    }

    private static void setPlayer(List<Player> players){

        for(int i = 0; i < NB_PLAYER; i++){
            players.add(new Player(String.valueOf(i+1)));
        }
    }
}