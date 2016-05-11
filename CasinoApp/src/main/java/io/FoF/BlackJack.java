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

        cardsAreDealtMessage();
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
                        yourNewHandAfterHitMessage();
                        player.printHand(true);
                        if (player.getHandSum() == 21) {
                            playersTurn = false;
                        }
                        if (player.getHandSum() > 21) {
                            bustMessage();
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
                        errorPlayerDidNotEnterHitOrStayMessage();
                        break;
                }
            }

            if (dealersTurn) {
                if (dealer.getHandSum() < 17) {
                    dealer.addCardToHand(deck.dealNextCard());
                }
                if (dealer.getHandSum() > 21) {
                    System.out.println("BUST");
                    System.out.println(player.getName() + " have WON!, dealer busts");
                    gameOn = false;
                    dealersTurn = false;
                }
                if (dealer.getHandSum() > 16 && dealer.getHandSum() < 21) {
                    dealerHasAbove17Message();
                    dealersTurn = false;
                }
            }

            if (dealer.getHandSum() > player.getHandSum()) {
                dealerWinsMessage();
                dealer.printHand(true);
                gameOn = false;

            }
            if (dealer.getHandSum() < player.getHandSum()) {
                playerWinsMessage();
                dealer.printHand(true);
                gameOn = false;

            }
            if (dealer.getHandSum() == player.getHandSum()) {
                itIsAPushMessage();
                gameOn = false;
            }
        }
    }

    public String cardsAreDealtMessage(){
        return "Cards are dealt";
    }

    public String dealerHasAbove17Message(){
        return "Dealer has above 17";
    }

    public String dealerWinsMessage(){
        return "Dealer Wins";
    }

    public String playerWinsMessage(){
        return "YOU WIN!!";
    }

    public String itIsAPushMessage(){
        return "Tie...It is a push";
    }

    public String errorPlayerDidNotEnterHitOrStayMessage(){
        return "Error - You did not enter an H or an S: Please Enter an H for Hit or S for Stay";
    }

    public String bustMessage(){
        return "BUST";
    }

    public String yourNewHandAfterHitMessage(){
        return "Your new hand: ";
    }
}
