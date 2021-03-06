package io.FoF;

/**
 * Created by minlee on 5/11/16.
 */
public abstract class Game {
    /**
     * Declares all things needed in all the game classes
     */
    protected int pot;
    protected Display display = new Display();
    protected boolean stillPlaying = true;
    protected BetInput betInput = new BetInput();
    protected Player player = new Player();

    /**
     * Manages the betting logic for players within game
     * @param player
     */
    void playGame(Player player) {
        this.player = player;
        while (stillPlaying) {
            placeBet();
            shuffle();
            display.showMessage("\n" + sendDisplayResults() + "\n");
            checkToSeeIfPlayerWon();
            display.showMessage("\nYou have " + player.getPurse() + " dollars left in your purse");

            if (display.getStringPrompt("Are you done playing?(yes or no): ").equals("yes")) {
                stillPlaying = false;
            }
        }
    }

    void placeBet(){}

    void shuffle(){}


    String sendDisplayResults(){return  "";}



    void checkToSeeIfPlayerWon(){}

    /**
     * These methods add and remove money from the purse
     * @param player
     * @param pot
     */

    public void MoneyFromPurse(Player player, double pot) {
        player.removeMoneyFromPurse(pot);
        display.showMessage("Removed " + pot + " from current player's purse");
    }

    public void MoneyToPurse(Player player, double pot) {
        player.addMoneyToPurse(pot);
        display.showMessage("Added " + pot + " from current player's purse");

    }

}
