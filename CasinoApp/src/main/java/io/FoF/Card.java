package io.FoF;


public class Card {

    private Suit cardSuit;
    private int cardRank;

    public Card(Suit suit, int rank) {
        this.cardSuit = suit;
        this.cardRank = rank;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public int getCardRank() {
        return cardRank;
    }
}
