package fr.jojo.utils;

import fr.jojo.classe.Card;
import fr.jojo.classe.CardGame;
import fr.jojo.classe.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateDeck {
    private static final String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                                                    "J", "Q", "K", "A"};
    private static final List<Card> cards = new ArrayList<>();

    public static void generateDeck(CardGame cardGame){

        int i = 0;

        for(String cardValue : cardValues){
            for(Color cardColor : Color.values()){
                cards.add(new Card(cardValue, i , cardColor));
            }
            i++;
        }

        shuffle();
        
        cardGame.setDeck(cards);
    }

    private static void shuffle(){
        Collections.shuffle(GenerateDeck.cards);
    }
}
