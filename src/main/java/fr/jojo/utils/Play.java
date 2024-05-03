package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import fr.jojo.classe.Hand;
import fr.jojo.classe.Player;

import java.util.ArrayList;
import java.util.List;

public class Play {
    private static final int NB_PLAYER = 2;
    private static final int NB_CARTE = 5;

    public static List<Player> distribute(CardGame cardGame){
        List<Player> players = new ArrayList<>();

        setPlayer(players);

        List<Card> cards = new ArrayList<>();

        for(Player player : players){
            int i = 0;
            while(i < NB_CARTE){
                cards.add(cardGame.getDeck().removeFirst());
                i++;
            }
            player.setHand(new Hand(new ArrayList<>(cards)));
            cards.clear();
        }

        return players;
    }

    private static void setPlayer(List<Player> players){

        for(int i = 0; i < NB_PLAYER; i++){
            players.add(new Player(String.valueOf(i+1)));
        }
    }
}