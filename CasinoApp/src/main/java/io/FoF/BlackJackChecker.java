package io.FoF;

/**
 * Created by minlee on 5/15/16.
 */
public class BlackJackChecker {


    public boolean checkIfHandIsBelow17(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() < 17) {
            return true;
        }
        return false;
    }


    public boolean checkIfPlayerWon(BlackjackPlayer blackjackPlayer, BlackjackPlayer dealer) {
        if (((dealer.getHandTotalValue() < blackjackPlayer.getHandTotalValue()) && (blackjackPlayer.getHandTotalValue() <= 21)) ||
                (dealer.getHandTotalValue() > 21) && (blackjackPlayer.getHandTotalValue() <= 21)) {
            Display.showMessage("THE PLAYER WINS!!\n");
            Display.showMessage(dealer.printHand(true));
            return true;
        }
        return false;
    }

    public boolean checkPush(BlackjackPlayer blackjackPlayer, BlackjackPlayer dealer) {
        if (dealer.getHandTotalValue() == blackjackPlayer.getHandTotalValue()){
            Display.showMessage("Tie...It is a push\n");
            return true;
        }
        return false;
    }

    public boolean checkIfPlayerHasBlackjack(BlackjackPlayer blackjackPlayer){
        boolean playerBlackJack = false;
        if (blackjackPlayer.getHandTotalValue() == 21) {
            Display.showMessage(blackjackPlayer.getName() +" has BlackJack**");
            playerBlackJack = true;
        }
        return playerBlackJack;
    }

    public boolean checkIfHandEquals21(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() == 21) {
            Display.showMessage(blackjackPlayer.getName()+" has 21**");
            return true;
        }
        return false;
    }

    public boolean checkIfBusts(BlackjackPlayer blackjackPlayer) {
        if (isHandOver21(blackjackPlayer)) {
            Display.showMessage(blackjackPlayer.getName()+" Busts!!");
            return true;
        }
        return false;
    }
    public boolean isHandOver21(BlackjackPlayer blackjackPlayer) {
        if (blackjackPlayer.getHandTotalValue() > 21)
            return true;
        else
            return false;
    }

}
