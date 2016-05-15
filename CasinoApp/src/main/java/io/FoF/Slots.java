package io.FoF;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by matthewb on 5/11/16.
 */

public class Slots extends Game {


    protected Boolean stopPlayingSlots;
    protected Boolean typeOfSlotsChosen;
    static ArrayList<Tumbler> allTumblers;
    protected Double pot;
    protected Double winnings;
    protected Boolean betPlaced;
    protected int numOfPaylines;
    protected Tumbler tum1;
    protected Tumbler tum2;
    protected Tumbler tum3;



    public Slots() {
        display.printSlotsPayline();
        this.stopPlayingSlots = false;
        this.typeOfSlotsChosen = false;
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


    public void playGame(Player player) {
        allTumblers.add(tum1);
        allTumblers.add(tum2);
        allTumblers.add(tum3);

        if(!typeOfSlotsChosen) {
            int whichSlots = Display.getIntPrompt("Choose 5 Tumblers or 3 Tumblers");
            typeOfSlotsChosen = true;
            if (whichSlots == 3) {
                Slots3 slots3 = new Slots3();
                slots3.playGame(player);

            }
        }

        while (!stopPlayingSlots) {
            resetPotandWins();
            Display.showMessage(player.getPurse());
            betPlaced = false;
            while (!betPlaced) {
                double currentBet = Display.getDoublePrompt("How much are you betting?");
                if (checkAmountInPurse(player, currentBet)) {
                    placeBet(player, currentBet);
                    removeMoneyFromPurse(player, currentBet);
                    betPlaced = true;

                } else {
                    Display.showMessage("You're broke Nurudeen is escorting you to the ATM");
                    stopPlayingSlots = true;
                    typeOfSlotsChosen = false;
                    break;
                }

                shuffle();
                sendDisplayResultsAll();
                checkToSeeIfPlayerWon();
                checkNumOfPaylines();
                if (numOfPaylines > 0) {
                    Display.showMessage("You won!! " + winnings);
                }
                addMoneytoPurse(player, winnings);
                String choice = Display.getStringPrompt("Are you done playing?");
                stopPlayingSlots = stopGame(choice);
            }
        }
    }

    public void resetPotandWins() {
        setPot(0.0);
        setNumOfPaylines(0);
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

        tum1.setTumbler1(randomFace.nextInt(10));
        tum1.setTumbler2(randomFace.nextInt(10));
        tum1.setTumbler3(randomFace.nextInt(15));
        tum1.setTumbler4(randomFace.nextInt(15));
        tum1.setTumbler5(randomFace.nextInt(10));

        tum2.setTumbler1(tum1.tumbler1 + 1);
        tum2.setTumbler2(tum1.tumbler2 + 1);
        tum2.setTumbler3(tum1.tumbler3 + 1);
        tum2.setTumbler4(tum1.tumbler4 + 1);
        tum2.setTumbler5(tum1.tumbler5 + 1);

        tum3.setTumbler1(tum1.tumbler1 + 2);
        tum3.setTumbler2(tum1.tumbler2 + 2);
        tum3.setTumbler3(tum1.tumbler3 + 2);
        tum3.setTumbler4(tum1.tumbler4 + 2);
        tum3.setTumbler5(tum1.tumbler5 + 2);

    }

    public void showFace(Tumbler tum, int tumbler) {
        Display.showMessage("| " + tum.getFace(tumbler) + " |");
    }

    public void sendDisplayResultsAll() {

        Display.showMessage("_____________________________");
        for (int rolls = 0; rolls < 3; rolls++) {
            Display.showMessage(
                    "| " + tum1.getFace(tum1.getTumbler1() + rolls) + " | "
                            + tum1.getFace(tum1.getTumbler2() + rolls) + " | "
                            + tum1.getFace(tum1.getTumbler3() + rolls) + " | "
                            + tum1.getFace(tum1.getTumbler4() + rolls) + " | "
                            + tum1.getFace(tum1.getTumbler5() + rolls) + " |");
        }
        Display.showMessage("_____________________________");

    }


    public Boolean checkIfTumblerRowIsAllTheSame(Tumbler tum) {
        if (tum.getTumbler1() == tum.getTumbler2() && tum.getTumbler1() == tum.getTumbler3() && tum.getTumbler1() == tum.getTumbler4()
                && tum.getTumbler1() == tum.getTumbler5()) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFour(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum1.getTumbler1() == tum2.getTumbler2() && tum1.getTumbler1() == tum3.getTumbler3() &&
                tum1.getTumbler1() == tum2.getTumbler4() && tum1.getTumbler1() == tum1.getTumbler5()) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFive(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum3.getTumbler1() == tum2.getTumbler2() && tum3.getTumbler1() == tum1.getTumbler3() &&
                tum3.getTumbler1() == tum2.getTumbler4() && tum3.getTumbler1() == tum3.getTumbler5()) {
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
            winnings = pot * 20;
        }
        if (numOfPaylines == 2) {
            winnings = pot * 40;
        }
        if (numOfPaylines == 3) {
            winnings = pot * 50;
        }
    }

    public void addMoneytoPurse(Player player, double winnings) {
        player.addMoneyToPurse(winnings);
    }

}
