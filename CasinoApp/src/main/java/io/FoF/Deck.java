package io.FoF;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Deck {

    private ArrayList<Card> deckOfCards = new ArrayList<Card>();

    /**
     * Creates a new instance of Deck which hold 52 Cards
     */
    public Deck() {
        int asciiCardCounter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                this.deckOfCards.add(new Card(Suit.values()[i], j, AsciiCards.asciiCards[asciiCardCounter++]));
            }
        }
    }

    /**
     * This method shuffles the order of the cards in the deck
     */
    public void shuffle() {
        Collections.shuffle(deckOfCards);
    }

    public Card dealNextCard() {
        Card nextCard = this.deckOfCards.get(0);
        this.deckOfCards.remove(0);
        return nextCard;
    }

    /**
     * This method return the String value of the card
     * @param valueToString
     * @return
     */
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
