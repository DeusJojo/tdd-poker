package fr.jojo.classe;

import java.util.*;

public class Combination {

    public static boolean isRoyalFlush(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        if(cards.getFirst().getValue() == 8){
            return isStraightFlush(hand);
        }
        return false;
    }

    public static boolean isFourOfAKind(Hand hand){
        for (int value : occurencyCard(hand).values()) {
            if (value == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStraightFlush(Hand hand){
        return isFlush(hand) && isStraight(hand);
    }

    public static boolean isFullHouse(Hand hand){
        boolean twoPairs = false;
        boolean threeOfAKind = false;
        for (int value : occurencyCard(hand).values()) {
            if (value == 2) {
                twoPairs = true;
            }
            if(value == 3){
                threeOfAKind = true;
            }
        }
        return twoPairs && threeOfAKind;
    }

    public static boolean isFlush(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        Color color = cards.getFirst().getColor();
        for (Card card : hand.getCardsInHand()){
            if(card.getColor() != color) return false;
        }
        return true;
    }

    public static boolean isStraight(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        for (int i = 0; i < cards.size()-1; i++) {
            if (cards.get(i).getValue() != cards.get(i + 1).getValue() - 1) return false;
        }
        return true;
    }

    public static boolean isThreeOfAKind(Hand hand){
        for (int value : occurencyCard(hand).values()) {
            if (value == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTwoPair(Hand hand){
        int pairCount = 0;
        for (int value : occurencyCard(hand).values()) {
            if (value == 2) {
                pairCount++;
            }
        }
        return pairCount == 2;
    }

    public static boolean isOnePair(Hand hand){
        for (int value : occurencyCard(hand).values()) {
            if (value == 2) {
                return true;
            }
        }
        return false;
    }

    public static Card highCard(Hand hand){
        List<Card> cards = new ArrayList<>(hand.getCardsInHand());
        cards.sort(Collections.reverseOrder());
        return cards.getFirst();
    }

    protected static Map<Integer, Integer> occurencyCard(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        HashMap<Integer, Integer> countCard = new HashMap<>();
        for (Card card : cards){
            int currentValue = card.getValue();
            if(countCard.containsKey(currentValue)){
                int count = countCard.get(currentValue);
                countCard.put(currentValue, count + 1);
            } else {
                countCard.put(currentValue, 1);
            }
        }
        return countCard;
    }
}
