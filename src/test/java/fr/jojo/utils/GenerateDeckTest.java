package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import fr.jojo.classe.Color;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenerateDeckTest {

    Card carreau2 = new Card("2", 0, Color.CARREAU);
    Card trefle10 = new Card("10", 8, Color.TREFLE);
    Card piqueAs = new Card("A", 12, Color.PIQUE);
    Card coeurAs= new Card("A", 12, Color.COEUR);

    @Test
    void countDeckCards(){
        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);
        assertEquals(52, cardGame.getDeck().size());
    }

    @Test
    void checkDistinctCards(){
        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);

        Set<Card> uniqueCards = new HashSet<>(cardGame.getDeck());

        assertEquals(52, uniqueCards.size());
    }

    @Test
    void compare(){
        assertTrue(piqueAs.compareTo(carreau2) > 0);
        assertTrue(piqueAs.compareTo(trefle10) > 0);
        assertTrue(trefle10.compareTo(piqueAs) < 0);
        assertTrue(carreau2.compareTo(trefle10) < 0);
        assertEquals(0, piqueAs.compareTo(coeurAs));
    }

//    @Test
//    void checkCard(){
//        CardGame cardGame = new CardGame();
//        GenerateDeck.generateDeck(cardGame);
//        assertEquals(Carreau2, cardGame.getDeck().getFirst());
//    }
}