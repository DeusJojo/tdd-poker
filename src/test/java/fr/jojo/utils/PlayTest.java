package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PlayTest extends Play {

    @Test
    void checkDeckCount(){
        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);

        Play.distribute(cardGame);

        assertEquals(32, cardGame.getDeck().size());
    }
}