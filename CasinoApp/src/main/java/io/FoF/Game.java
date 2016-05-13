package io.FoF;

/**
 * Created by minlee on 5/11/16.
 */
public class Game {

    protected double pot;
    protected Display display = new Display();
    protected boolean gameOver = false;

    void startGame(Player player) {
    }

    ;

    void placeBet() {
    }

    ;

    public Boolean checkAmountInPurse(Player player, double betAmount) {
        boolean checkEnoughMoney = false;
        if (betAmount <= player.getPurse()) {
            checkEnoughMoney = true;
        }
        return checkEnoughMoney;
    }

    void shuffle() {
    }

    ;

    String sendDisplayResults() {
        return "";
    }

    ;

    void checkToSeeIfPlayerWon() {
    }

    ;

    public void MoneyFromPurse(Player player, double pot) {
        player.removeMoneyFromPurse(pot);
        display.showMessage("Removed " + pot + " from current player's purse");
        //System.out.println("Removed "+pot+" from current player's purse");
    }

    public void MoneyToPurse(Player player, double pot) {
        player.addMoneyToPurse(pot);
        display.showMessage("Added " + pot + " from current player's purse");

        //System.out.println("Added "+pot+" to current player's purse");
    }

    void stopGame() {
    }

    ;

}
