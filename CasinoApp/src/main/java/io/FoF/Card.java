package io.FoF;


public class Card {

    private Suit cardSuit;
    private int cardRank;
    private String asciiCard;

    /**
     * Creates a new instance of card, there are 52 cards to a deck
     * @param suit
     * @param rank
     * @param asciiCard
     */
    public Card(Suit suit, int rank, String asciiCard) {
        this.cardSuit = suit;
        this.cardRank = rank;
        this.asciiCard = asciiCard;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public int getCardRank() {
        return cardRank;
    }

    public String getAsciiCard(){
        return asciiCard;
    }

}
