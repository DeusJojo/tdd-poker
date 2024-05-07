package fr.jojo;

import fr.jojo.classe.CardGame;
import fr.jojo.classe.Player;
import fr.jojo.utils.GenerateDeck;
import fr.jojo.utils.Play;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args){
//        LOGGER.trace("msg de trace");
//        LOGGER.debug("msg de debogage");
//        LOGGER.info("msg de d'information");
//        LOGGER.warn("msg de d'avertissement");
//        LOGGER.error("msg de d'erreur");
//        LOGGER.fatal("msg de d'erreur fatale");

        CardGame cardGame = new CardGame();
        GenerateDeck.generateDeck(cardGame);

        List<Player> players = Play.distribute(cardGame);

        for(Player player : players){
            System.out.println(player.getName() + " " + player.getScore() + " " + player.getHand().getName());
        }
    }
}
