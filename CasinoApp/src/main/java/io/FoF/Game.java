package io.FoF;

/**
 * Created by minlee on 5/11/16.
 */
public abstract class Game {

    protected int pot;
    protected Display display = new Display();
    protected boolean stillPlaying = true;
    protected BetInput betInput = new BetInput();
    protected Player player = new Player();

    void playGame(Player player) {
        this.player = player;
        while (stillPlaying) {
            placeBet(player);
            shuffle();
            display.showMessage("\n" + sendDisplayResults() + "\n");
            checkToSeeIfPlayerWon(player);
            display.showMessage("\nYou have " + player.getPurse() + " dollars left in your purse");

            if (display.getStringPrompt("Are you done playing?(yes or no): ").equals("yes")) {
                stillPlaying = false;
            }
        }
    }

    abstract void placeBet(Player player);

    abstract void shuffle();


    abstract String sendDisplayResults();



    abstract void checkToSeeIfPlayerWon(Player player);



    public void MoneyFromPurse(Player player, double pot) {
        player.removeMoneyFromPurse(pot);
        display.showMessage("Removed " + pot + " from current player's purse");
    }

    public void MoneyToPurse(Player player, double pot) {
        player.addMoneyToPurse(pot);
        display.showMessage("Added " + pot + " from current player's purse");

    }

}
