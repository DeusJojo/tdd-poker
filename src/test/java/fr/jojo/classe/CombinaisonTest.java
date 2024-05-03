package fr.jojo.classe;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinaisonTest extends Combination {

    List<Card> testQuinteFlushStraight = new ArrayList<>(List.of(new Card("2", 8,Color.CARREAU),
            new Card("J", 9, Color.CARREAU),
            new Card("Q", 10, Color.CARREAU),
            new Card("K", 11, Color.CARREAU),
            new Card("A", 12, Color.CARREAU))
            );

    List<Card> testForAKind = new ArrayList<>(List.of(new Card("5", 3,Color.CARREAU),
            new Card("5", 3, Color.PIQUE),
            new Card("5", 3, Color.COEUR),
            new Card("5", 3, Color.TREFLE),
            new Card("A", 12, Color.CARREAU))
            );
    Hand quinteFlushStraight = new Hand(testQuinteFlushStraight);
    Hand fourAKind = new Hand(testForAKind);


    @Test
    void testIsFlush() {
        assertEquals(true, Combination.isFlush(quinteFlushStraight));
    }

    @Test
    void testIsStraight(){
        assertEquals(true, Combination.isStraight(quinteFlushStraight));
    }

    @Test
    void testIsStraightFlush(){
        assertEquals(true, Combination.isStraightFlush(quinteFlushStraight));
    }

    @Test
    void testIsRoyalFlush(){
        assertEquals(true, Combination.isRoyalFlush(quinteFlushStraight));
    }

    @Test
    void testIsFourOfAKind(){
        assertEquals("{3=4, 12=1}", Combination.isFourOfAKind(fourAKind).toString());
    }

}