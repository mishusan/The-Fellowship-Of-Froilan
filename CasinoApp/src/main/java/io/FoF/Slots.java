package io.FoF;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by matthewb on 5/11/16.
 */

public class Slots extends Game{


    Boolean stopPlayingSlots;
    ArrayList<Tumbler> allTumblers;
    Double pot;
    Double winnings;
    Boolean betPlaced;
    int numOfPaylines;
    Tumbler tum1;
    Tumbler tum2;
    Tumbler tum3;

    public Slots(){

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




    public void startGame(Player player){
        allTumblers.add(tum1);
        allTumblers.add(tum2);
        allTumblers.add(tum3);
        while(!stopPlayingSlots){
            betPlaced = false;
            while(!betPlaced){
                //double currentBet = Display.getDoublePrompt();
                double currentBet = 10.0;
                if(checkAmountInPurse(player,currentBet)){
                    placeBet(player,currentBet);
                    removeMoneyFromPurse(player,currentBet);
                    betPlaced = true;
                }

                shuffle();
                sendDisplayResultsAll();
                checkToSeeIfPlayerWon();
                checkNumOfPaylines();
                addMoneytoPurse(player,winnings);
                //String choice = display.getStringPrompt();
                String choice = "no";
                stopPlayingSlots = stopGame(choice);
            }
        }
    }

    public Boolean stopGame(String choice){

        if(choice.equals("yes") || choice.equals("Yes") || choice.equals("y")){
            return true;
        }
        return false;
    }


    public void placeBet(Player player,double bet){
        pot += bet;
    }

    public void removeMoneyFromPurse(Player player,double bet){
        //player.removeMoney(bet);

    }

    public Boolean checkAmountInPurse(Player player, double bet){

        //if(bet > player.getPurse(player)){
        if(bet > 25.0){
            //Display.displayNotEnoughMoney();
            System.out.println("Not enough Moolah");
            //Display.displayPurse(player);
            System.out.println("$$");
            return false;
        }
        else{
            return true;
        }
    }

    public void shuffle(){

        Random randomFace = new Random();

        for(Tumbler tum: allTumblers){
            tum.tumbler1 = randomFace.nextInt(20);
            tum.tumbler2 = randomFace.nextInt(20);
            tum.tumbler3 = randomFace.nextInt(20);
            tum.tumbler4 = randomFace.nextInt(20);
            tum.tumbler5 = randomFace.nextInt(20);
        }
    }

    public void showFace(Tumbler tum,int tumbler){
        //Display.showMessage(tum.getFace(tumbler));
        System.out.println(tum.getFace(tumbler));
    }

    public void sendDisplayResultsAll(){
        for(Tumbler tum: allTumblers){
            showFace(tum,tum.tumbler1);
            showFace(tum,tum.tumbler2);
            showFace(tum,tum.tumbler3);
            showFace(tum,tum.tumbler4);
            showFace(tum,tum.tumbler5);
        }
    }

    public Boolean checkIfTumblerRowIsAllTheSame(Tumbler tum){
        if(tum.tumbler1 == tum.tumbler2 && tum.tumbler1 == tum.tumbler3 && tum.tumbler1 == tum.tumbler4 && tum.tumbler1 == tum.tumbler5){
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFour(Tumbler tum1,Tumbler tum2, Tumbler tum3){
        if(tum1.tumbler1 == tum2.tumbler2 && tum1.tumbler1 == tum3.tumbler3 && tum1.tumbler1 == tum2.tumbler4 && tum1.tumbler1 == tum1.tumbler5){
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFive(Tumbler tum1,Tumbler tum2, Tumbler tum3){
        if(tum3.tumbler1 == tum2.tumbler2 && tum3.tumbler1 == tum1.tumbler3 && tum3.tumbler1 == tum2.tumbler4 && tum3.tumbler1 == tum3.tumbler5){
            return true;
        }
        return false;
    }

    public void checkToSeeIfPlayerWon(){
        for(Tumbler tum : allTumblers){
            if(checkIfTumblerRowIsAllTheSame(tum)){
                numOfPaylines++;
            }
        }
        if(checkForPaylineFour(tum1,tum2,tum3)){
            numOfPaylines++;
        }
        if(checkForPaylineFive(tum1,tum2,tum3)){
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
            winnings = pot*2;
        }
        if (numOfPaylines == 3) {
            winnings = pot*3;
        }
        if (numOfPaylines == 4) {
            winnings = pot*4;
        }
        if (numOfPaylines == 5) {
            winnings = pot*10;
        }
    }

    public void addMoneytoPurse(Player player, double winnings){
        //player.addMoneyToPurse(winnings);
    }

}
