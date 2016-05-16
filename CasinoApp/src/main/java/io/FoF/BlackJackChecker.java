package io.FoF;

/**
 * Created by minlee on 5/15/16.
 */
public class BlackJackChecker {

    /**
     * Checks  a blackjack players hand and return true if less than 17
     * @param blackjackPlayer
     * @return
     */
    public boolean checkIfHandIsBelow17(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() < 17) {
            return true;
        }
        return false;
    }

    /**
     * Checks to see if the player has won, and returns true if so
     * @param blackjackPlayer
     * @param dealer
     * @return
     */
    public boolean checkIfPlayerWon(BlackjackPlayer blackjackPlayer, BlackjackPlayer dealer) {
        if (((dealer.getHandTotalValue() < blackjackPlayer.getHandTotalValue()) && (blackjackPlayer.getHandTotalValue() <= 21)) ||
                (dealer.getHandTotalValue() > 21) && (blackjackPlayer.getHandTotalValue() <= 21)) {
            Display.showMessage("THE PLAYER WINS!!\n");
            Display.showMessage(dealer.printHand(true));
            return true;
        }
        return false;
    }

    /**
     * Checks if the player and dealer push, returns true if so
     * @param blackjackPlayer
     * @param dealer
     * @return
     */
    public boolean checkPush(BlackjackPlayer blackjackPlayer, BlackjackPlayer dealer) {
        if (dealer.getHandTotalValue() == blackjackPlayer.getHandTotalValue()){
            Display.showMessage("Tie...It is a push\n");
            return true;
        }
        return false;
    }

    /**
     * Checks if the player has a blackjack, returns true if so
     * @param blackjackPlayer
     * @return
     */
    public boolean checkIfPlayerHasBlackjack(BlackjackPlayer blackjackPlayer){
        boolean playerBlackJack = false;
        if (blackjackPlayer.getHandTotalValue() == 21) {
            Display.showMessage(blackjackPlayer.getName() +" has BlackJack**");
            playerBlackJack = true;
        }
        return playerBlackJack;
    }

    /**
     * Checks if the player's hand equals 21, returns true if so
     * @param blackjackPlayer
     * @return
     */
    public boolean checkIfHandEquals21(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() == 21) {
            Display.showMessage(blackjackPlayer.getName()+" has 21**");
            return true;
        }
        return false;
    }

    /**
     * Checks if the player's hand busts, returns true if so
     * @param blackjackPlayer
     * @return
     */
    public boolean checkIfBusts(BlackjackPlayer blackjackPlayer) {
        if (isHandOver21(blackjackPlayer)) {
            Display.showMessage(blackjackPlayer.getName()+" Busts!!");
            return true;
        }
        return false;
    }

    /**
     * Checks if the player's hand is over 21, returns true if so
     * @param blackjackPlayer
     * @return
     */
    public boolean isHandOver21(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() > 21)
            return true;
        else
            return false;
    }

}
