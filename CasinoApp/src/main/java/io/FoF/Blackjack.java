package io.FoF;

public class Blackjack extends CardGame{

    BlackjackPlayer blackjackPlayer;

    public Blackjack(Player player){
        blackjackPlayer = new BlackjackPlayer(player);
    }

    BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
    boolean playerHasTurn = true;
    boolean dealerHasTurn = true;

    public void startGame() {
        getBetPlayerWantsToPlace();
        shuffleCardsTwice();
        dealCards();
        displayInitialHandsAfterFirstDeal();
        blackjackGameHandler();
    }

    public void blackjackGameHandler() {
        if (playerHasTurn) {
            hitOrStayHandler(askPlayerIfTheyWantToHitOrStay(blackjackPlayer));
        }
        if (dealerHasTurn) {
            checkIfDealersHandIsBelow17AndMustHit();
            checkIfDealersHandIsOver21(blackjackPlayer);
            checkIfDealersHandIsAbove17ButLessThan21AndHasToStay();
        }
        checkIfDealerWon(blackjackPlayer);
        checkIfPlayerWon(blackjackPlayer);
        checkIfItIsATie(blackjackPlayer);
    }

    public String askPlayerIfTheyWantToHitOrStay(Player player) {
        return Display.getStringPrompt(player.getName() + " Hit or Stay: Enter H or S");
    }

    public void hitOrStayHandler(String playerHitOrStay) {
        switch (playerHitOrStay) {
            case "h":
                blackjackPlayer.addCardToHand(deck.dealNextCard());
                Display.showMessage("Your new hand: ");

                Display.showMessage(blackjackPlayer.printHand(true));
                if (blackjackPlayer.getHandTotalValue() == 21) {
                    playerHasTurn = false;
                }
                if (blackjackPlayer.getHandTotalValue() > 21) {
                    Display.showMessage("BUST");
                    Display.showMessage(dealer.getName() + " has WON!, you bust");
                    dealerHasTurn = false;
                    playerHasTurn = false;
                }
                break;
            case "s":
                Display.showMessage(blackjackPlayer.getName() + " stays.");
                playerHasTurn = false;
                break;
            default:
                Display.showMessage("Error - You did not enter an H or an S: Please Enter an H for Hit or S for Stay");
                break;
        }
    }

    public void shuffleCardsTwice(){
        deck.shuffle();
        deck.shuffle();
    }

    public void dealCards() {
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        Display.showMessage("Cards are dealt");
    }

    public void displayInitialHandsAfterFirstDeal() {
        Display.showMessage(blackjackPlayer.printHand(true));
        Display.showMessage(dealer.printHand(false));
    }

    public void getBetPlayerWantsToPlace() {
        blackjackPlayer.amountPlayerBet = Display.getDoublePrompt("How much would you like to bet on this hand? ");
    }

    public void checkIfDealersHandIsBelow17AndMustHit() {
        if (dealer.getHandTotalValue() < 17)
            dealer.addCardToHand(deck.dealNextCard());
    }

    public void checkIfDealersHandIsOver21(BlackjackPlayer player) {
        if (dealer.getHandTotalValue() > 21) {
            Display.showMessage("BUST");
            Display.showMessage(player.getName() + " have WON!, dealer busts");
            dealerHasTurn = false;
        }
    }

    public void checkIfDealersHandIsAbove17ButLessThan21AndHasToStay() {
        if (dealer.getHandTotalValue() > 16 && dealer.getHandTotalValue() < 21) {
            Display.showMessage("Dealer has above 16");
            dealerHasTurn = false;
        }
    }

    public void checkIfDealerWon(BlackjackPlayer player) {
        if (dealer.getHandTotalValue() > player.getHandTotalValue()) {
            Display.showMessage("Dealer Wins");
            Display.showMessage(dealer.printHand(true));
            player.removeMoneyFromPurse(player.amountPlayerBet);
        }
    }

    public void checkIfPlayerWon(BlackjackPlayer player) {
        if (dealer.getHandTotalValue() < player.getHandTotalValue()) {
            Display.showMessage("YOU WIN!!");
            dealer.printHand(true);
            player.addMoneyToPurse(player.amountPlayerBet * 2);
        }
    }

    public void checkIfItIsATie(BlackjackPlayer player) {
        if (dealer.getHandTotalValue() == player.getHandTotalValue())
            Display.showMessage("Tie...It is a push");
    }
}
