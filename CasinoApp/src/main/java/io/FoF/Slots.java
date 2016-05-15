package io.FoF;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by matthewb on 5/11/16.
 */

public class Slots extends Game {


    private Boolean stopPlayingSlots;
    ArrayList<Tumbler> allTumblers;
    private Double pot;
    private Double winnings;
    private Boolean betPlaced;
    private int numOfPaylines;
    private Tumbler tum1;
    private Tumbler tum2;
    private Tumbler tum3;



    public Slots() {

        this.stopPlayingSlots = false;
        this.allTumblers = new ArrayList<Tumbler>();
        this.pot = 0.0;
        this.winnings = 0.0;
        this.betPlaced = false;
        this.numOfPaylines = 0;
        this.tum1 = new Tumbler();
        this.tum2 = new Tumbler();
        this.tum3 = new Tumbler();

    }

    public Boolean getStopPlayingSlots() {
        return stopPlayingSlots;
    }

    public ArrayList<Tumbler> getAllTumblers() {
        return allTumblers;
    }

    public Double getPot() {
        return pot;
    }

    public Double getWinnings() {
        return winnings;
    }

    public Boolean getBetPlaced() {
        return betPlaced;
    }

    public int getNumOfPaylines() {
        return numOfPaylines;
    }

    public void setStopPlayingSlots(Boolean stopPlayingSlots) {
        this.stopPlayingSlots = stopPlayingSlots;
    }

    public void setAllTumblers(ArrayList<Tumbler> allTumblers) {
        this.allTumblers = allTumblers;
    }

    public void setPot(Double pot) {
        this.pot = pot;
    }

    public void setWinnings(Double winnings) {
        this.winnings = winnings;
    }

    public void setBetPlaced(Boolean betPlaced) {
        this.betPlaced = betPlaced;
    }

    public void setNumOfPaylines(int numOfPaylines) {
        this.numOfPaylines = numOfPaylines;
    }


    public void startGame(Player player) {
        allTumblers.add(tum1);
        allTumblers.add(tum2);
        allTumblers.add(tum3);
        while (!stopPlayingSlots) {
            Display.showMessage(player.getPurse());
            betPlaced = false;
            while (!betPlaced) {
                double currentBet = Display.getDoublePrompt("How much you betting?");
                if (checkAmountInPurse(player, currentBet)) {
                    placeBet(player, currentBet);
                    removeMoneyFromPurse(player, currentBet);
                    betPlaced = true;

                } else {
                    Display.showMessage("You're broke Nurudeen is escorting you to the ATM");
                    stopPlayingSlots = true;
                    break;
                }

                shuffle();
                sendDisplayResultsAll();
                checkToSeeIfPlayerWon();
                checkNumOfPaylines();
                addMoneytoPurse(player, winnings);
                String choice = Display.getStringPrompt("Are you done playing?");
                stopPlayingSlots = stopGame(choice);
            }
        }
    }

    public Boolean stopGame(String choice) {

        if (choice.equals("yes") || choice.equals("Yes") || choice.equals("y")) {
            return true;
        }
        return false;
    }


    public void placeBet(Player player, double bet) {
        pot += bet;
    }

    public void removeMoneyFromPurse(Player player, double bet) {
        player.removeMoneyFromPurse(bet);
    }

    public Boolean checkAmountInPurse(Player player, double bet) {
        if (bet > player.getPurse()) {
            Display.showMessage("Not enought Moolah $$" + player.getPurse());
            return false;
        } else {
            return true;
        }
    }

    public void shuffle() {
        Random randomFace = new Random();

        tum1.tumbler1 = randomFace.nextInt(8);
        tum1.tumbler2 = randomFace.nextInt(8);
        tum1.tumbler3 = randomFace.nextInt(8);
        tum1.tumbler4 = randomFace.nextInt(8);
        tum1.tumbler5 = randomFace.nextInt(8);

        tum2.tumbler1 = tum1.tumbler1 + 1;
        tum2.tumbler2 = tum1.tumbler2 + 1;
        tum2.tumbler3 = tum1.tumbler3 + 1;
        tum2.tumbler4 = tum1.tumbler4 + 1;
        tum2.tumbler5 = tum1.tumbler5 + 1;

        tum3.tumbler1 = tum1.tumbler1 + 2;
        tum3.tumbler2 = tum1.tumbler2 + 2;
        tum3.tumbler3 = tum1.tumbler3 + 2;
        tum3.tumbler4 = tum1.tumbler4 + 2;
        tum3.tumbler5 = tum1.tumbler5 + 2;

    }

    public void showFace(Tumbler tum, int tumbler) {
        Display.showMessage("| " + tum.getFace(tumbler) + " |");
    }

    public void sendDisplayResultsAll() {
        for (int roll = 10; roll > 0; roll--) {
            Display.showMessage(
                    "| " + tum1.getFace(tum1.tumbler1 - roll) + " | "
                            + tum1.getFace(tum1.tumbler2 - roll) + " | "
                            + tum1.getFace(tum1.tumbler3 - roll) + " | "
                            + tum1.getFace(tum1.tumbler4 - roll) + " | "
                            + tum1.getFace(tum1.tumbler5 - roll) + " |");
        }

        Display.showMessage("_____________________________");
        for (int rolls = 0; rolls < 3; rolls++) {
            Display.showMessage(
                    "| " + tum1.getFace(tum1.tumbler1 + rolls) + " | "
                            + tum1.getFace(tum1.tumbler2 + rolls) + " | "
                            + tum1.getFace(tum1.tumbler3 + rolls) + " | "
                            + tum1.getFace(tum1.tumbler4 + rolls) + " | "
                            + tum1.getFace(tum1.tumbler5 + rolls) + " |");
        }
        Display.showMessage("_____________________________");

    }


    public Boolean checkIfTumblerRowIsAllTheSame(Tumbler tum) {
        if (tum.tumbler1 == tum.tumbler2 && tum.tumbler1 == tum.tumbler3 && tum.tumbler1 == tum.tumbler4 && tum.tumbler1 == tum.tumbler5) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFour(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum1.tumbler1 == tum2.tumbler2 && tum1.tumbler1 == tum3.tumbler3 && tum1.tumbler1 == tum2.tumbler4 && tum1.tumbler1 == tum1.tumbler5) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFive(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum3.tumbler1 == tum2.tumbler2 && tum3.tumbler1 == tum1.tumbler3 && tum3.tumbler1 == tum2.tumbler4 && tum3.tumbler1 == tum3.tumbler5) {
            return true;
        }
        return false;
    }

    public void checkToSeeIfPlayerWon() {
        for (Tumbler tum : allTumblers) {
            if (checkIfTumblerRowIsAllTheSame(tum)) {
                numOfPaylines++;
            }
        }
        if (checkForPaylineFour(tum1, tum2, tum3)) {
            numOfPaylines++;
        }
        if (checkForPaylineFive(tum1, tum2, tum3)) {
            numOfPaylines++;
        }
    }

    public void checkNumOfPaylines() {
        if (numOfPaylines == 0) {
            winnings = 0.0;
        }
        if (numOfPaylines == 1) {
            winnings = pot;
        }
        if (numOfPaylines == 2) {
            winnings = pot * 2;
        }
        if (numOfPaylines == 3) {
            winnings = pot * 3;
        }
        if (numOfPaylines == 4) {
            winnings = pot * 4;
        }
        if (numOfPaylines == 5) {
            winnings = pot * 10;
        }
    }

    public void addMoneytoPurse(Player player, double winnings) {
        player.addMoneyToPurse(winnings);
    }

}
