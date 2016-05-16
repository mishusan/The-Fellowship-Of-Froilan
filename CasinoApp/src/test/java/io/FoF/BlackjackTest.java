package io.FoF;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlackjackTest {

    Player player;
    Blackjack blackjack;
    BlackjackPlayer blackjackPlayer, dealer;
    BlackJackChecker blackJackChecker;
    Deck deck;
    Card card;

    @Before
    public void setup() {
        player = new Player();
        player.setName("Mike");
        blackjack = new Blackjack();
        blackjackPlayer = new BlackjackPlayer(player);
        dealer = new BlackjackPlayer(player);
        blackJackChecker = new BlackJackChecker();
        deck = new Deck();
        card = new Card(Suit.Clubs, 5, "");
    }

    @Test
    public void getCardSuitTest() {
        card = new Card(Suit.Spades, 9, "");
        Suit expectedValue = Suit.Spades;
        Suit actualValue = card.getCardSuit();
        assertEquals("The card's suit should be Spades", expectedValue, actualValue);
    }

    @Test
    public void getCardRankTest() {
        card = new Card(Suit.Clubs, 9, "");
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

    @Test
    public void addCardToHandTest(){
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        String expectedValue = "Two of Hearts\n" + "  _________\n |2        |\n |♥        |\n |    ♥    |\n |         |\n |    ♥    |\n |        ♥|\n |        Z|\n  ~~~~~~~~~\n";
        String actualValue = blackjackPlayer.printHand(true);
        assertEquals("The card should be Two of Hearts", expectedValue, actualValue);
    }

    @Test
    public void getHandTotalValueTest(){
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        int expectedValue = 5;
        int actualValue = blackjackPlayer.getHandTotalValue();
        assertEquals("The hand's total value should be 5", expectedValue, actualValue);
    }

    @Test
    public void changeValueOfAceIfHandIsOver21Test(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 14, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 8, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 14, ""));
        int expectedValue = 20;
        int actualValue = blackjackPlayer.getHandTotalValue();
        assertEquals("The hand total should be 20", expectedValue, actualValue);
    }

    @Test
    public void checkIfHandIsBelow17Test(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 8, ""));
        assertTrue(blackJackChecker.checkIfHandIsBelow17(blackjackPlayer));
    }

    @Test
    public void checkIfPlayerWonTest(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 8, ""));
        assertTrue(blackJackChecker.checkIfPlayerWon(blackjackPlayer, dealer));
    }

    @Test
    public void checkPushTest(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Hearts, 5, ""));
        dealer.addCardToHand(new Card(Suit.Diamonds, 5, ""));
        dealer.addCardToHand(new Card(Suit.Spades, 5, ""));
        assertTrue(blackJackChecker.checkPush(blackjackPlayer, dealer));
    }

    @Test
    public void checkIfPlayerHasBlackjackTest(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 14, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Hearts, 10, ""));
        assertTrue(blackJackChecker.checkIfPlayerHasBlackjack(blackjackPlayer));
    }

    @Test
    public void checkIfHandEquals21Test(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Hearts, 10, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 6, ""));
        assertTrue(blackJackChecker.checkIfHandEquals21(blackjackPlayer));
    }

    @Test
    public void checkIfBustsTest(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Hearts, 10, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 6, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 9, ""));
        assertTrue(blackJackChecker.checkIfBusts(blackjackPlayer));
    }

    @Test
    public void isHandOver21Test(){
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 5, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Hearts, 10, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 6, ""));
        blackjackPlayer.addCardToHand(new Card(Suit.Clubs, 9, ""));
        assertTrue(blackJackChecker.isHandOver21(blackjackPlayer));
    }
}
