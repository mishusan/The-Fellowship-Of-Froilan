package io.FoF;


import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack extends CardGame{

    public void startGame() {

        //Gey Player name form dispaly Vvvvvv
        BlackjackPlayer player = new BlackjackPlayer("Player");
        BlackjackPlayer dealer = new BlackjackPlayer("Dealer");



        player.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        player.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());

        Display.showMessage("Cards are dealt");
        //Display print Hand
        player.printHand(true);
        dealer.printHand(false);

        boolean playersTurn = true;
        boolean dealersTurn = true;

        boolean gameOn = true;
        while (gameOn) {

            Scanner in = new Scanner(System.in);
            if (playersTurn) {
                //Display.showMessage
                System.out.println(player.getName() + " Hit or Stay: Enter H or S");
                char playerHitOrStay = in.next().toLowerCase().charAt(0);

                switch (playerHitOrStay) {
                    case 'h':
                        player.addCardToHand(deck.dealNextCard());
                        Display.showMessage("Your new hand: ");
                        //Display print Hand
                        player.printHand(true);
                        if (player.getHandTotalValue() == 21) {
                            playersTurn = false;
                        }
                        if (player.getHandTotalValue() > 21) {
                            Display.showMessage("BUST");
                            System.out.println(dealer.getName() + " has WON!, you bust");
                            dealersTurn = false;
                            playersTurn = false;
                            gameOn = false;
                        }
                        break;
                    case 's':
                        System.out.println(player.getName() + " stays.");
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
                    System.out.println(player.getName() + " have WON!, dealer busts");
                    gameOn = false;
                    dealersTurn = false;
                }
                if (dealer.getHandTotalValue() > 16 && dealer.getHandTotalValue() < 21) {
                    Display.showMessage("Dealer has above 17");
                    dealersTurn = false;
                }
            }
//ADD IN ADD MONEY TO PLAYER PURSE IF WON AND TAKE AMOUNT BET OUT OF PLAYER PURSE IF LOSES
            if (dealer.getHandTotalValue() > player.getHandTotalValue()) {
                Display.showMessage("Dealer Wins");
                dealer.printHand(true);
                gameOn = false;

            }
            if (dealer.getHandTotalValue() < player.getHandTotalValue()) {
                Display.showMessage("YOU WIN!!");
                dealer.printHand(true);
                gameOn = false;

            }
            if (dealer.getHandTotalValue() == player.getHandTotalValue()) {
                Display.showMessage("Tie...It is a push");
                gameOn = false;
            }
        }
    }
}
