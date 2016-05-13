package io.FoF;

public class Blackjack extends CardGame {

    BlackjackPlayer blackjackPlayer;

    public Blackjack(Player player) {

        blackjackPlayer = new BlackjackPlayer(player);
    }

    BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
    boolean playerHasTurn = true;
    boolean dealerHasTurn = true;

    public void startGame() {
        //System.out.println("Purse before game: " + blackjackPlayer.getPurse());
        getBetPlayerWantsToPlace();
        shuffleCardsTwice();
        dealCards();
        displayInitialHandsAfterFirstDeal();
        handlePlayersTurn();
        handleDealersTurn();
        checkWhoWonTheHand();
        //System.out.println("Purse after game: " + blackjackPlayer.getPurse());
    }

    public void getBetPlayerWantsToPlace() {
        blackjackPlayer.amountPlayerBet = Display.getDoublePrompt("\nHow much would you like to bet on this hand? ");
    }

    public void shuffleCardsTwice() {
        deck.shuffle();
        deck.shuffle();
    }

    public void dealCards() {
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        dealer.addCardToHand(deck.dealNextCard());
        Display.showMessage("\n**Cards are dealt**\n");
    }

    public void displayInitialHandsAfterFirstDeal() {
        Display.showMessage(blackjackPlayer.printHand(true));
        Display.showMessage(dealer.printHand(false));
    }

    public void handlePlayersTurn() {
        while (playerHasTurn) {
            hitOrStayHandler(askPlayerIfTheyWantToHitOrStay());
        }
    }

    public void handleDealersTurn() {
        while (dealerHasTurn) {
            followBlackjackRulesForDealer();
        }
    }

    public void checkWhoWonTheHand() {
        checkIfDealerWon();
        checkIfPlayerWon();
        checkIfItIsATie();
    }

    public String askPlayerIfTheyWantToHitOrStay() {
        return Display.getStringPrompt(blackjackPlayer.getName() + " Hit or Stay: Enter H or S\n");
    }

    public void hitOrStayHandler(String playerHitOrStay) {
        switch (playerHitOrStay) {
            case "h":
                addCardToPlayersHand();
                Display.showMessage(blackjackPlayer.printHand(true));
                checkIfPlayerHandEquals21EndingTheirTurn();
                checkIfPlayerBustsEndingTheirTurn();
                break;
            case "s":
                playerChoosesToStayEndingTheirTurn();
                break;
            default:
                Display.showMessage("Error - You did not enter an H or an S: Please Enter an H for Hit or S for Stay");
                break;
        }
    }

    public void addCardToPlayersHand(){
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        Display.showMessage("--Your new hand--: ");
    }

    public void followBlackjackRulesForDealer() {
        checkIfDealersHandIsBelow17AndMustHit();
        checkIfDealerBusts();
        checkIfDealersHandIsAbove16ButLessThan21AndHasToStay();
    }

    public void checkIfDealersHandIsBelow17AndMustHit() {
        if (dealer.getHandTotalValue() < 17)
            Display.showMessage("Dealer Hits: \n" + dealer.printHand(true));
            dealer.addCardToHand(deck.dealNextCard());
    }

    public void checkIfDealerBusts() {
        if (isDealerHandOver21()) {
            Display.showMessage("BUST\n" + blackjackPlayer.getName() + " has WON!, dealer busts\n" + dealer.printHand(true));
            dealerHasTurn = false;
        }
    }

    public void checkIfDealersHandIsAbove16ButLessThan21AndHasToStay() {
        if (dealer.getHandTotalValue() > 16 && (!isDealerHandOver21())) {
            Display.showMessage("Dealer has above 16. Dealer stays");
            dealerHasTurn = false;
        }
    }

    public void checkIfDealerWon() {
        if ((dealer.getHandTotalValue() > blackjackPlayer.getHandTotalValue()) && (!isDealerHandOver21())) {
            Display.showMessage("Dealer Wins\n");
            Display.showMessage(dealer.printHand(true));
            blackjackPlayer.removeMoneyFromPurse(blackjackPlayer.amountPlayerBet);
        }
    }

    public void checkIfPlayerWon() {
        if ((dealer.getHandTotalValue() < blackjackPlayer.getHandTotalValue()) && (!isPlayerHandOver21())) {
            Display.showMessage("YOU WIN!!\n");
            Display.showMessage(dealer.printHand(true));
            blackjackPlayer.addMoneyToPurse(blackjackPlayer.amountPlayerBet * 2);
        }
    }

    public void checkIfItIsATie() {
        if (dealer.getHandTotalValue() == blackjackPlayer.getHandTotalValue())
            Display.showMessage("Tie...It is a push\n");
    }

    public void checkIfPlayerHandEquals21EndingTheirTurn() {
        if (blackjackPlayer.getHandTotalValue() == 21)
            playerHasTurn = false;
    }

    public void checkIfPlayerBustsEndingTheirTurn(){
        if (isPlayerHandOver21()) {
            showPlayerBustsMessage();
            endBlackjackGame();
        }
    }

    public void showPlayerBustsMessage(){
        Display.showMessage("BUST");
        Display.showMessage(dealer.getName() + " has WON!, you bust");
    }


    public boolean isDealerHandOver21() {
        if (dealer.getHandTotalValue() > 21)
            return true;
        else
            return false;
    }

    public boolean isPlayerHandOver21() {
        if (blackjackPlayer.getHandTotalValue() > 21)
            return true;
        else
            return false;
    }

    public void playerChoosesToStayEndingTheirTurn(){
        Display.showMessage(blackjackPlayer.getName() + " stays.\n");
        playerHasTurn = false;
    }

    public void endBlackjackGame(){
        dealerHasTurn = false;
        playerHasTurn = false;
    }
}
