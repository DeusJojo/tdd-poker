package fr.jojo.utils;

import fr.jojo.classe.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayTest extends Combination {

    List<Card> testRoyalFlush = new ArrayList<>(List.of(new Card("10", 8, Color.CARREAU),
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
    List<Card> testStraightFlush1 = new ArrayList<>(List.of(new Card("4", 2,Color.PIQUE),
            new Card("5", 3, Color.PIQUE),
            new Card("6", 4, Color.PIQUE),
            new Card("7", 5, Color.PIQUE),
            new Card("8", 6, Color.PIQUE))
    );
    List<Card> testStraightFlush2 = new ArrayList<>(List.of(new Card("7", 5,Color.COEUR),
            new Card("8", 6, Color.COEUR),
            new Card("9", 7, Color.COEUR),
            new Card("10", 8, Color.COEUR),
            new Card("J", 9, Color.COEUR))
    );
    List<Card> testStraightFlush3 = new ArrayList<>(List.of(new Card("5", 3,Color.TREFLE),
            new Card("6", 4, Color.TREFLE),
            new Card("7", 5, Color.TREFLE),
            new Card("8", 6, Color.TREFLE),
            new Card("9", 7, Color.TREFLE))
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
    List<Card> testOnePair = new ArrayList<>(List.of(new Card("Q", 10,Color.CARREAU),
            new Card("2", 0, Color.PIQUE),
            new Card("2", 0, Color.COEUR),
            new Card("6", 4, Color.TREFLE),
            new Card("A", 12, Color.CARREAU))
    );
    List<Card> testOnePair1 = new ArrayList<>(List.of(new Card("Q", 10,Color.COEUR),
            new Card("2", 0, Color.CARREAU),
            new Card("2", 0, Color.TREFLE),
            new Card("6", 4, Color.COEUR),
            new Card("A", 12, Color.PIQUE))
    );
    List<Card> testOnePair2 = new ArrayList<>(List.of(new Card("Q", 10,Color.TREFLE),
            new Card("J", 9, Color.PIQUE),
            new Card("5", 3, Color.COEUR),
            new Card("A", 12, Color.TREFLE),
            new Card("A", 12, Color.COEUR))
    );
    List<Card> testOnePair3 = new ArrayList<>(List.of(new Card("7", 5,Color.TREFLE),
            new Card("4", 2, Color.PIQUE),
            new Card("9", 7, Color.COEUR),
            new Card("9", 7, Color.TREFLE),
            new Card("8", 6, Color.COEUR))
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
    List<Card> testFlush1 = new ArrayList<>(List.of(new Card("10", 8,Color.COEUR),
            new Card("3", 1, Color.COEUR),
            new Card("6", 4, Color.COEUR),
            new Card("A", 12, Color.COEUR),
            new Card("9", 7, Color.COEUR))
    );
    List<Card> testFlush2 = new ArrayList<>(List.of(new Card("2", 0,Color.PIQUE),
            new Card("3", 1, Color.PIQUE),
            new Card("5", 3, Color.PIQUE),
            new Card("A", 12, Color.PIQUE),
            new Card("9", 7, Color.PIQUE))
    );
    List<Card> testFlush3 = new ArrayList<>(List.of(new Card("4", 2,Color.COEUR),
            new Card("7", 5, Color.COEUR),
            new Card("6", 4, Color.COEUR),
            new Card("K", 11, Color.COEUR),
            new Card("Q", 10, Color.COEUR))
    );
    Hand royalFlush = new Hand(testRoyalFlush);
    Hand straightFlush = new Hand(testStraightFlush);
    Hand straight = new Hand(testStraight);
    Hand fourOfAKind = new Hand(testFourOfAKind);
    Hand threeOfAKind = new Hand(testThreeOfAKind);
    Hand twoPairs = new Hand(testTwoPairs);
    Hand onePair = new Hand(testOnePair);
    Hand onePair1 = new Hand(testOnePair1);
    Hand onePair2 = new Hand(testOnePair2);
    Hand onePair3 = new Hand(testOnePair3);
    Hand fullHouse = new Hand(testFullHouse);
    Hand flush = new Hand(testFlush);
    Hand flush1 = new Hand(testFlush1);
    Hand flush2 = new Hand(testFlush2);
    Hand flush3 = new Hand(testFlush3);
    Hand straightFlush1 = new Hand(testStraightFlush1);
    Hand straightFlush2 = new Hand(testStraightFlush2);
    Hand straightFlush3 = new Hand(testStraightFlush3);

    List<Player> testPlayerSup = new ArrayList<>(List.of(new Player("1", onePair2),
            new Player("2", onePair3)));
    List<Player> testPlayersEqual = new ArrayList<>(List.of(new Player("1", onePair),
            new Player("2", onePair1)));
    List<Player> testPlayerInf = new ArrayList<>(List.of(new Player("1", onePair2),
            new Player("2", onePair3)));
    List<Player> testPlayerFlushEqual = new ArrayList<>(List.of(new Player("1", flush),
            new Player("2", flush1)));
    List<Player> testPlayerFlushSup = new ArrayList<>(List.of(new Player("1", flush2),
            new Player("2", flush3)));
    List<Player> testPlayerFlushInf = new ArrayList<>(List.of(new Player("1", flush2),
            new Player("2", flush3)));
    List<Player> testStraightFlushEqual = new ArrayList<>(List.of(new Player("1", straightFlush),
            new Player("2", straightFlush1)));
    List<Player> testStraightFlushSup = new ArrayList<>(List.of(new Player("1", straightFlush2),
            new Player("2", straightFlush3)));
    List<Player> testStraightFlushInf = new ArrayList<>(List.of(new Player("1", straightFlush2),
            new Player("2", straightFlush3)));
    List<Player> test = new ArrayList<>(List.of(new Player("1", straightFlush2),
            new Player("2", onePair3)));

    @Test
    void checkDeckCount(){
        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);

        Play.distribute(cardGame);

        assertEquals(42, cardGame.getDeck().size());
    }


    @Test
    void distribute() {
        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);

        List<Player> players = Play.distribute(cardGame);

        // Vérifie que la distribution a réussi en vérifiant que la liste de joueurs n'est pas vide
        assertFalse(players.isEmpty());

        // Vérifie si les mains des joueurs sont ordonnées
        for (Player player : players) {
            assertTrue(isHandOrdered(player.getHand().getCardsInHand()));
        }
    }

    @Test
    void testPlay(){
        Play.attributeScore(testPlayerSup);
        assertTrue(testPlayerSup.getFirst().compareTo(testPlayerSup.get(1)) > 0);

        Play.attributeScore(testPlayersEqual);
        assertEquals(0, testPlayersEqual.getFirst().compareTo(testPlayersEqual.get(1)));

        Play.attributeScore(testPlayerInf);
        assertTrue(testPlayerInf.get(1).compareTo(testPlayerInf.getFirst()) < 0);

        Play.attributeScore(testPlayerFlushEqual);
        assertEquals(0, testPlayerFlushEqual.getFirst().compareTo(testPlayerFlushEqual.get(1)));

        Play.attributeScore(testPlayerFlushSup);
        assertTrue(testPlayerFlushSup.getFirst().compareTo(testPlayerFlushSup.get(1)) > 0);

        Play.attributeScore(testPlayerFlushInf);
        assertTrue(testPlayerFlushInf.get(1).compareTo(testPlayerFlushInf.getFirst()) < 0);

        Play.attributeScore(testStraightFlushEqual);
        assertEquals(0, testStraightFlushEqual.getFirst().compareTo(testStraightFlushEqual.get(1)));

        Play.attributeScore(testStraightFlushSup);
        assertTrue(testPlayerFlushSup.getFirst().compareTo(testPlayerFlushSup.get(1)) > 0);

        Play.attributeScore(testStraightFlushInf);
        assertTrue(testStraightFlushInf.get(1).compareTo(testStraightFlushInf.getFirst()) < 0);

        Play.attributeScore(test);
        assertTrue(test.getFirst().compareTo(testStraightFlushInf.get(1)) > 0);
    }

    private boolean isHandOrdered(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).compareTo(hand.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}