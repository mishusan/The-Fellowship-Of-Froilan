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
    public void testToSeeIfCardSuitIsConstructedProperly(){
        Suit expectedValue = Suit.Clubs;
        Suit actualValue = card.getCardSuit();
        assertEquals("The card's suit should be Clubs", expectedValue, actualValue);
    }

    @Test
    public void testToSeeIfCardRankIsConstructedProperly (){
        int expectedValue = 5;
        int actualValue = card.getCardRank();
        assertEquals("The card's suit should be 5", expectedValue, actualValue);
    }

    @Test
    public void getCardSuitTest(){
        Suit expectedValue = Suit.Clubs;
        Suit actualValue = card.getCardSuit();
        assertEquals("The card's suit should be Clubs", expectedValue, actualValue);
    }
}
