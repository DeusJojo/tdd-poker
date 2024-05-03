package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import fr.jojo.classe.Combination;
import fr.jojo.classe.Player;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayTest extends Combination {

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

    private boolean isHandOrdered(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).compareTo(hand.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}