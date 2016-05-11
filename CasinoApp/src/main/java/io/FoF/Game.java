package io.FoF;

/**
 * Created by minlee on 5/11/16.
 */
public abstract class Game {

    protected double pot;
    protected Display display = new Display();
    protected boolean gameOver = false;

    abstract void startGame(Player player);

    abstract void placeBet();

    public boolean checkAmountInPurse(double betAmount){
        boolean checkEnoughMoney = false;
        if(betAmount <= currentPlayer.getPurse()){
            checkEnoughMoney = true;
        }
        return checkEnoughMoney;
    }

    abstract void shuffle();

    abstract int sendDisplayResults();

    abstract void checkToSeeIfPlayerWon();

    public void removeMoneyFromPurse(double pot){
        currentPlayer.removeMoneyFromPurse(pot);
        System.out.println("Removed "+pot+" from current player's purse");
    }

    public void addMoneyToPurse(){
        currentPlayer.addMoneyToPurse(double pot);
        System.out.println("Added "+pot+" to current player's purse");
    }

    abstract void stopGame();

}
