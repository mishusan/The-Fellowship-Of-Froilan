package io.FoF;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static javax.swing.UIManager.put;

public class Deck {

    public static final int NUM_OF_CARDS = 52;
    private ArrayList<Card> myCards = new ArrayList<Card>();

    public Deck(){

        for(int i = 0; i < 4; i++){

            for(int j = 2; j < 15; j++){
                this.myCards.add(new Card(Suit.values()[i], j));
            }
        }
        Collections.shuffle(this.myCards);
        Collections.shuffle(this.myCards);
    }

    public void printDeck(){

        for(int i = 0; i < this.myCards.size(); i++) {
            System.out.println(faceValueToString(this.myCards.get(i).getCardRank()) + " of " + this.myCards.get(i).getCardSuit() );
        }
    }

    public static String faceValueToString(int valueToString) {

        HashMap<Integer, String> faceValuesToString = new HashMap<Integer, String>();
        {
            {
                put(2, "Two");
                put(3, "Three");
                put(4, "Four");
                put(5, "Five");
                put(6, "Six");
                put(7, "Seven");
                put(8, "Eight");
                put(9, "Nine");
                put(10, "Ten");
                put(11, "Jack");
                put(12, "Queen");
                put(13, "King");
                put(14, "Ace");
            }
        }
        return faceValuesToString.get(valueToString);
    }

    public Card dealCard(){
        Card nextCard = this.myCards.get(0);
        this.myCards.remove(0);
        return nextCard;

    }
}
