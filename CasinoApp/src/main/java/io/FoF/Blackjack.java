package io.FoF;

public class Blackjack extends Game {

    private BlackjackPlayer blackjackPlayer, dealer;
    BlackJackChecker blackJackChecker = new BlackJackChecker();
    boolean playerHasTurn;
    boolean dealerHasTurn;
    private Deck deck;
    private Player player;
    private boolean playerBlackJack = false;


    public void playGame(Player player) {
        this.player = player;

        while (stillPlaying){
            dealer = new BlackjackPlayer("Dealer");
            blackjackPlayer = new BlackjackPlayer(player);
            deck = new Deck();
            playerHasTurn = true;
            dealerHasTurn = true;
            placeBet(player);
            shuffle();
            dealCards();
            displayInitialHandsAfterFirstDeal();
            handlePlayersTurn(blackjackPlayer);
            handleDealersTurn(dealer);
            checkToSeeIfPlayerWon();
            Display.showMessage("DEALER: " + dealer.getHandTotalValue() + " : " +"PLAYER: " + blackjackPlayer.getHandTotalValue());
            Display.showMessage("Purse after game: " + player.getPurse());
            display.showMessage("\nYou have " + player.getPurse() + " dollars left in your purse");
            if (display.getStringPrompt("\nAre you done playing?(yes or no): ").equals("yes")) {
                stillPlaying = false;
            }
        }

    }

    public void placeBet(Player player) {
        pot = betInput.collectPlayerBetInputs(player);
    }

    public void shuffle() {
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

    public void handlePlayersTurn(BlackjackPlayer blackjackPlayer) {
        if(blackJackChecker.checkIfPlayerHasBlackjack(blackjackPlayer)){
            playerHasTurn = false;
        }
        while (playerHasTurn) {
            hitOrStayHandler(blackjackPlayer);
        }
    }

    public void handleDealersTurn(BlackjackPlayer dealer) {
        if(blackJackChecker.checkIfPlayerHasBlackjack(dealer)){
            Display.showMessage(dealer.printHand(true));
            playerBlackJack = true;
            dealerHasTurn = false;
        }
        while (dealerHasTurn) {
            if(blackJackChecker.checkIfBusts(dealer)){
                dealerHasTurn = false;
            }
            if(blackJackChecker.checkIfHandIsBelow17(dealer)){
                addCardToHand(dealer);
            }
            else{
                Display.showMessage("Dealer has above 16. Dealer stays");
                Display.showMessage(dealer.printHand(true));
                dealerHasTurn = false;
            }
            if(blackJackChecker.checkIfHandEquals21(dealer)){
                dealerHasTurn = false;
            }
        }
    }

    public void hitOrStayHandler(BlackjackPlayer blackjackPlayer) {
        String playerHitOrStay = Display.getStringPrompt(blackjackPlayer.getName() + " Hit or Stay: Enter H or S\n");
        switch (playerHitOrStay.toLowerCase()) {
            case "h":
                addCardToHand(blackjackPlayer);
                Display.showMessage(blackjackPlayer.printHand(true));
                if(blackJackChecker.checkIfHandEquals21(blackjackPlayer)){
                    playerHasTurn = false;
                }
                if(blackJackChecker.checkIfBusts(blackjackPlayer)){
                    playerHasTurn = false;
                    dealerHasTurn = false;
                }
                break;
            case "s":
                playerHasTurn = false;
                break;
            default:
                Display.showMessage("Error - You did not enter an H or an S: Please Enter an H for Hit or S for Stay");
                break;
        }
    }

    public void addCardToHand(BlackjackPlayer blackjackPlayer) {
        blackjackPlayer.addCardToHand(deck.dealNextCard());
        Display.showMessage(dealer.printHand(true));

        Display.showMessage("--New hand--: ");
    }

    public void checkToSeeIfPlayerWon(){
        if(!blackJackChecker.checkPush(blackjackPlayer, dealer)){
            if(blackJackChecker.checkIfPlayerWon(blackjackPlayer, dealer)){
                if(playerBlackJack){
                    player.addMoneyToPurse(pot * 2.5);
                }
                else{
                    player.addMoneyToPurse(pot * 2);
                }
            }
            else{
                display.showMessage("DEALER WINS!!!");
            }
        }
    }
}
