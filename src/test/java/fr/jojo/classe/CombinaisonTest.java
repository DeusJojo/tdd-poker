package fr.jojo.classe;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinaisonTest extends Combination {

    List<Card> testRoyalFlush = new ArrayList<>(List.of(new Card("10", 8,Color.CARREAU),
            new Card("J", 9, Color.CARREAU),
            new Card("Q", 10, Color.CARREAU),
            new Card("K", 11, Color.CARREAU),
            new Card("A", 12, Color.CARREAU))
            );
    List<Card> testStraightFlush = new ArrayList<>(List.of(new Card("4", 2,Color.CARREAU),
            new Card("5", 3, Color.CARREAU),
            new Card("6", 4, Color.CARREAU),
            new Card("7", 5, Color.CARREAU),
            new Card("8", 6, Color.CARREAU))
    );
    List<Card> testStraight = new ArrayList<>(List.of(new Card("4", 2,Color.PIQUE),
            new Card("5", 3, Color.TREFLE),
            new Card("6", 4, Color.COEUR),
            new Card("7", 5, Color.CARREAU),
            new Card("8", 6, Color.CARREAU))
    );
    List<Card> testFourOfAKind = new ArrayList<>(List.of(new Card("5", 3,Color.CARREAU),
            new Card("5", 3, Color.PIQUE),
            new Card("5", 3, Color.COEUR),
            new Card("5", 3, Color.TREFLE),
            new Card("A", 12, Color.CARREAU))
            );
    List<Card> testThreeOfAKind = new ArrayList<>(List.of(new Card("10", 8,Color.CARREAU),
            new Card("5", 3, Color.PIQUE),
            new Card("A", 12, Color.COEUR),
            new Card("A", 12, Color.TREFLE),
            new Card("A", 12, Color.CARREAU))
    );
    List<Card> testTwoPairs = new ArrayList<>(List.of(new Card("10", 8,Color.CARREAU),
            new Card("2", 0, Color.PIQUE),
            new Card("2", 0, Color.COEUR),
            new Card("J", 9, Color.TREFLE),
            new Card("J", 9, Color.CARREAU))
    );
    List<Card> testOnePair = new ArrayList<>(List.of(new Card("10", 8,Color.CARREAU),
            new Card("2", 0, Color.PIQUE),
            new Card("2", 0, Color.COEUR),
            new Card("5", 3, Color.TREFLE),
            new Card("J", 9, Color.CARREAU))
    );
    List<Card> testFullHouse = new ArrayList<>(List.of(new Card("4", 2,Color.CARREAU),
            new Card("4", 2, Color.PIQUE),
            new Card("4", 2, Color.COEUR),
            new Card("7", 5, Color.TREFLE),
            new Card("7", 5, Color.CARREAU))
    );
    List<Card> testFlush = new ArrayList<>(List.of(new Card("10", 8,Color.PIQUE),
            new Card("3", 1, Color.PIQUE),
            new Card("6", 4, Color.PIQUE),
            new Card("A", 12, Color.PIQUE),
            new Card("9", 7, Color.PIQUE))
    );
    Hand royalFlush = new Hand(testRoyalFlush);
    Hand straightFlush = new Hand(testStraightFlush);
    Hand straight = new Hand(testStraight);
    Hand fourOfAKind = new Hand(testFourOfAKind);
    Hand threeOfAKind = new Hand(testThreeOfAKind);
    Hand twoPairs = new Hand(testTwoPairs);
    Hand onePair = new Hand(testOnePair);
    Hand fullHouse = new Hand(testFullHouse);
    Hand flush = new Hand(testFlush);


    @Test
    void testIsFlush() {
        assertTrue(Combination.isFlush(flush));
        assertFalse(Combination.isFlush(fourOfAKind));
    }

    @Test
    void testIsStraight(){
        assertTrue(Combination.isStraight(straight));
        assertFalse(Combination.isStraight(fourOfAKind));
    }

    @Test
    void testIsStraightFlush(){
        assertTrue(Combination.isStraightFlush(straightFlush));
        assertFalse(Combination.isStraightFlush(fourOfAKind));
    }

    @Test
    void testIsRoyalFlush(){
        assertTrue(Combination.isRoyalFlush(royalFlush));
        assertFalse(Combination.isRoyalFlush(fourOfAKind));
    }

    @Test
    void testIsFourOfAKind(){
        assertTrue(Combination.isFourOfAKind(fourOfAKind));
        assertFalse(Combination.isFourOfAKind(straightFlush));
    }

    @Test
    void testIsThreeOfAKind(){
        assertTrue(Combination.isThreeOfAKind(threeOfAKind));
        assertFalse(Combination.isThreeOfAKind(straightFlush));
    }

    @Test
    void testIsTwoPairs(){
        assertTrue(Combination.isTwoPair(twoPairs));
        assertFalse(Combination.isTwoPair(straightFlush));
    }
    @Test
    void testIsOnePair(){
        assertTrue(Combination.isOnePair(onePair));
        assertFalse(Combination.isOnePair(straightFlush));
    }

    @Test
    void testIsFullHouse(){
        assertTrue(Combination.isFullHouse(fullHouse));
        assertFalse(Combination.isFullHouse(fourOfAKind));
    }

}