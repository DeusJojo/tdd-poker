package fr.jojo.classe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combination {

    public static Boolean isRoyalFlush(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        if(cards.getFirst().getValue() == 8){
            return isStraightFlush(hand);
        }
        return false;
    }

    public static Map<Integer, Integer> isFourOfAKind(Hand hand){
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

    public static Boolean isStraightFlush(Hand hand){
        return isFlush(hand) && isStraight(hand);
    }

    public static Boolean isFullHouse(Hand hand){

        return false;
    }

    public static Boolean isFlush(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        Color color = cards.getFirst().getColor();
        for (Card card : hand.getCardsInHand()){
            if(card.getColor() != color) return false;
        }
        return true;
    }

    public static Boolean isStraight(Hand hand){
        List<Card> cards = hand.getCardsInHand();
        for (int i = 0; i < cards.size()-1; i++) {
            if (cards.get(i).getValue() != cards.get(i + 1).getValue() - 1) return false;
        }
        return true;
    }

    public static Map<Integer, Integer> isThreeOfAKind(Hand hand){
    }

    public static Boolean isTwoPair(){
        return false;
    }

    public static Boolean isOnePair(){
        return false;
    }

    public static Boolean isHighCard(){
        return false;
    }

    public Map<Integer, Integer> occurencyCard(Hand hand){
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
