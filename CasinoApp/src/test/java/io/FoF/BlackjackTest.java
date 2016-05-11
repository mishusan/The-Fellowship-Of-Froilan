package io.FoF;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlackjackTest {

    Blackjack blackjack;
    BlackjackPlayer blackjackPlayer;
    Deck deck;
    Card card;

    @Before
    public void setup() {
        blackjack = new Blackjack();
        blackjackPlayer = new BlackjackPlayer("TestPlayer");
        deck = new Deck();
        card = new Card(Suit.Clubs, 5);
    }

    @Test
    public void getCardSuitTest() {
        card = new Card(Suit.Spades, 9);
        Suit expectedValue = Suit.Spades;
        Suit actualValue = card.getCardSuit();
        assertEquals("The card's suit should be Spades", expectedValue, actualValue);
    }

    @Test
    public void getCardRankTest() {
        card = new Card(Suit.Clubs, 9);
        int expectedValue = 9;
        int actualValue = card.getCardRank();
        assertEquals("The card's rank should be 9", expectedValue, actualValue);
    }

    @Test
    public void faceValueToStringTest(){
        String expectedValue = "Two";
        String actualValue = deck.faceValueToString(2);
        assertEquals("The value should be 'Two'", expectedValue, actualValue);
    }

    @Test
    public void dealNextCardInDeckTest() {
        Card nextCard = deck.dealNextCard();
        String expectedValue = "Two of Hearts";
        String actualValue = deck.faceValueToString(nextCard.getCardRank()) + " of " + nextCard.getCardSuit();
        assertEquals("The expected card is Two of Hearts", expectedValue, actualValue);
    }




}
