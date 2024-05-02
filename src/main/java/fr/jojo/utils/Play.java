package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import fr.jojo.classe.Hand;
import fr.jojo.classe.Player;

import java.util.ArrayList;
import java.util.List;

public class Play {
    private static final int NB_PLAYER = 4;
    private static final List<Player> players = new ArrayList<>();

    public static void distribute(CardGame cardGame){
        setPlayer();
        List<Card> cards = new ArrayList<>();

        for(Player player : players){
            int i = 0;
            while(i < 5){
                cards.add(cardGame.getDeck().removeFirst());
                i++;
            }
            player.setHand(new Hand(new ArrayList<>(cards)));
            cards.clear();
        }

        for(Player player : players){
            System.out.println(player.getHand().getCardsInHand().getFirst().getSymbol() + " " + player.getHand().getCardsInHand().getFirst().getColor());
        }
    }

    private static void setPlayer(){

        for(int i = 0; i < NB_PLAYER; i++){
            players.add(new Player());
        }
    }
}