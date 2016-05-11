package io.FoF;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Deck {

    private ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public Deck() {

        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                this.deckOfCards.add(new Card(Suit.values()[i], j));
            }
        }
    }

    public Card dealNextCard() {
        Card nextCard = this.deckOfCards.get(0);
        this.deckOfCards.remove(0);
        return nextCard;
    }

    public static String faceValueToString(int valueToString) {

        HashMap<Integer, String> faceValuesToString = new HashMap<Integer, String>() {
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
        };
        return faceValuesToString.get(valueToString);
    }
}
