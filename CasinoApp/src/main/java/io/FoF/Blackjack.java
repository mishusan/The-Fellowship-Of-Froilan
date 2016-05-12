package io.FoF;


import java.util.Scanner;

public class Blackjack extends CardGame {

    //Player player = new Player();
    Display display = new Display();

    public void startGame(Player player) {

        //Gey Player name form display Vvvvvv
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer("Player");
        BlackjackPlayer dealer = new BlackjackPlayer("Dealer");

        display.showMessage("How much would you like to bet on this hand? ");
        blackjackPlayer.amountPlayerBet = display.getDoublePrompt("wut");


        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());

        display.showMessage("Cards are dealt");
        //Display print Hand
        blackjackPlayer.printHand(true);
        dealer.printHand(false);

        boolean playersTurn = true;
        boolean dealersTurn = true;

        boolean gameOn = true;
        while (gameOn) {

            Scanner in = new Scanner(System.in);
            if (playersTurn) {
                //Display.showMessage
                System.out.println(blackjackPlayer.getName() + " Hit or Stay: Enter H or S");
                char playerHitOrStay = in.next().toLowerCase().charAt(0);

                switch (playerHitOrStay) {
                    case 'h':
                        blackjackPlayer.addCardToHand(deck.dealNextCard());
                        Display.showMessage("Your new hand: ");
                        //Display print Hand
                        blackjackPlayer.printHand(true);
                        if (blackjackPlayer.getHandTotalValue() == 21) {
                            playersTurn = false;
                        }
                        if (blackjackPlayer.getHandTotalValue() > 21) {
                            Display.showMessage("BUST");
                            System.out.println(dealer.getName() + " has WON!, you bust");
                            dealersTurn = false;
                            playersTurn = false;
                            gameOn = false;
                        }
                        break;
                    case 's':
                        System.out.println(blackjackPlayer.getName() + " stays.");
                        playersTurn = false;
                        break;
                    default:
                        Display.showMessage("Error - You did not enter an H or an S: Please Enter an H for Hit or S for Stay");
                        break;
                }
            }

            if (dealersTurn) {
                if (dealer.getHandTotalValue() < 17) {
                    dealer.addCardToHand(deck.dealNextCard());
                }
                if (dealer.getHandTotalValue() > 21) {
                    System.out.println("BUST");
                    System.out.println(blackjackPlayer.getName() + " have WON!, dealer busts");
                    gameOn = false;
                    dealersTurn = false;
                }
                if (dealer.getHandTotalValue() > 16 && dealer.getHandTotalValue() < 21) {
                    Display.showMessage("Dealer has above 16");
                    dealersTurn = false;
                }
            }
//ADD IN ADD MONEY TO PLAYER PURSE IF WON AND TAKE AMOUNT BET OUT OF PLAYER PURSE IF LOSES
            if (dealer.getHandTotalValue() > blackjackPlayer.getHandTotalValue()) {
                Display.showMessage("Dealer Wins");
                dealer.printHand(true);
                blackjackPlayer.removeMoneyFromPurse(blackjackPlayer.amountPlayerBet);/////////
                gameOn = false;

            }
            if (dealer.getHandTotalValue() < blackjackPlayer.getHandTotalValue()) {
                Display.showMessage("YOU WIN!!");
                dealer.printHand(true);
                player.addMoneyToPurse(blackjackPlayer.amountPlayerBet + blackjackPlayer.amountPlayerBet);////////
                gameOn = false;

            }
            if (dealer.getHandTotalValue() == blackjackPlayer.getHandTotalValue()) {
                Display.showMessage("Tie...It is a push");
                gameOn = false;
            }
        }
    }
}
