package io.FoF;

import java.util.HashMap;

/**
 * Created by matthewb on 5/11/16.
 */
public class SicBo extends Game{

    private Dice dice1, dice2, dice3;
    private double[] allBets;

    void startGame(Player player) {
        allBets = new double[50];
        placeBet(player);

        shuffle();
    }

    public void placeBet(Player player) {
        boolean doneBetting = false;

        int betTypeChoice = -1;
        int betSpecificChoice = 0;
        double currentBetAmount = 0;
        double totalBetPerRound = 0;


        while(betTypeChoice!=0){
            display.sendMessage("How would you like to bet?\n0: No Bets\n1: Singles\n2: Doubles\n3: Triples\n4: Sums\n5: Specific 2 Dice\n6: Bet Small\n7: Bet Big");
            betTypeChoice = display.getIntPrompt();
            switch (betTypeChoice){
                case 1:
                    betSpecificChoice = display.getIntPrompt("Which single would you like to bet on? (1 - 6): ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                allBets[0] += currentBetAmount;
                                break;
                            case 2:
                                allBets[1] += currentBetAmount;
                                break;
                            case 3:
                                allBets[2] += currentBetAmount;
                                break;
                            case 4:
                                allBets[3] += currentBetAmount;
                                break;
                            case 5:
                                allBets[4] += currentBetAmount;
                                break;
                            case 6:
                                allBets[5] += currentBetAmount;
                                break;
                        }
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }

                    break;
                case 2:
                    betSpecificChoice = display.getIntPrompt("Which double would you like to bet on? (1 - 6): ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                allBets[6] += currentBetAmount;
                                break;
                            case 2:
                                allBets[7] += currentBetAmount;
                                break;
                            case 3:
                                allBets[8] += currentBetAmount;
                                break;
                            case 4:
                                allBets[9] += currentBetAmount;
                                break;
                            case 5:
                                allBets[10] += currentBetAmount;
                                break;
                            case 6:
                                allBets[11] += currentBetAmount;
                                break;
                        }
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
                case 3:
                    betSpecificChoice = display.getIntPrompt("Which triple would you like to bet on? (1 - 6) or 0 for any triple: ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 0:
                                allBets[12] += currentBetAmount;
                                break;
                            case 1:
                                allBets[13] += currentBetAmount;
                                break;
                            case 2:
                                allBets[14] += currentBetAmount;
                                break;
                            case 3:
                                allBets[15] += currentBetAmount;
                                break;
                            case 4:
                                allBets[16] += currentBetAmount;
                                break;
                            case 5:
                                allBets[17] += currentBetAmount;
                                break;
                            case 6:
                                allBets[18] += currentBetAmount;
                                break;
                        }
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
                case 4:
                    betSpecificChoice = display.getIntPrompt("Which Sum would you like to bet on? (4 - 17): ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 4:
                                allBets[19] += currentBetAmount;
                                break;
                            case 5:
                                allBets[20] += currentBetAmount;
                                break;
                            case 6:
                                allBets[21] += currentBetAmount;
                                break;
                            case 7:
                                allBets[22] += currentBetAmount;
                                break;
                            case 8:
                                allBets[23] += currentBetAmount;
                                break;
                            case 9:
                                allBets[24] += currentBetAmount;
                                break;
                            case 10:
                                allBets[25] += currentBetAmount;
                                break;
                            case 11:
                                allBets[26] += currentBetAmount;
                                break;
                            case 12:
                                allBets[27] += currentBetAmount;
                                break;
                            case 13:
                                allBets[28] += currentBetAmount;
                                break;
                            case 14:
                                allBets[29] += currentBetAmount;
                                break;
                            case 15:
                                allBets[30] += currentBetAmount;
                                break;
                            case 16:
                                allBets[31] += currentBetAmount;
                                break;
                            case 17:
                                allBets[32] += currentBetAmount;
                                break;
                        }
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
                case 5:
                    betSpecificChoice = display.getIntPrompt("Which Specific 2 die combination would you like to bet on?\n 1: 1 & 2\n" +
                            " 2: 1 & 3\n" +
                            " 3: 1 & 4\n" +
                            " 4: 1 & 5\n" +
                            " 5: 1 & 6\n" +
                            " 6: 2 & 3\n" +
                            " 7: 2 & 4\n" +
                            " 8: 2 & 5\n" +
                            " 9: 2 & 6\n" +
                            "10: 3 & 4\n" +
                            "11: 3 & 5\n" +
                            "12: 3 & 6\n" +
                            "13: 4 & 5\n" +
                            "14: 4 & 6\n" +
                            "15: 5 & 6");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                allBets[33] += currentBetAmount;
                                break;
                            case 2:
                                allBets[34] += currentBetAmount;
                                break;
                            case 3:
                                allBets[35] += currentBetAmount;
                                break;
                            case 4:
                                allBets[36] += currentBetAmount;
                                break;
                            case 5:
                                allBets[37] += currentBetAmount;
                                break;
                            case 6:
                                allBets[38] += currentBetAmount;
                                break;
                            case 7:
                                allBets[39] += currentBetAmount;
                                break;
                            case 8:
                                allBets[40] += currentBetAmount;
                                break;
                            case 9:
                                allBets[41] += currentBetAmount;
                                break;
                            case 10:
                                allBets[42] += currentBetAmount;
                                break;
                            case 11:
                                allBets[43] += currentBetAmount;
                                break;
                            case 12:
                                allBets[44] += currentBetAmount;
                                break;
                            case 13:
                                allBets[45] += currentBetAmount;
                                break;
                            case 14:
                                allBets[46] += currentBetAmount;
                                break;
                            case 15:
                                allBets[47] += currentBetAmount;
                                break;
                        }
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
                case 6:
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        allBets[48] += currentBetAmount;
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
                case 7:
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        allBets[49] += currentBetAmount;
                    }
                    else {
                        display.sendMessage("You do not have enough money, bet again");
                    }
                    break;
            }
        }

        removeMoneyFromPurse(totalBetPerRound);


    }


    void shuffle() {
        dice1 = new Dice();
        dice2 = new Dice();
        dice3 = new Dice();
    }

    public int sendDisplayResults() {
        return 0;
    }

    public void checkToSeeIfPlayerWon() {
        int diceSum = dice1.diceValue()+dice2.diceValue()+dice3.diceValue();
        boolean triple = false;
        double payOut = 0;
        //Check for any 3 of a kind Pays Pays 1 to 30
        if((dice1.diceValue() == dice2.diceValue())&&(dice2.diceValue() == dice3.diceValue())){
            payOut += allBets[12] * 30;
            triple = true;
        }
        //Check for any specific 3 of a kind Pays 1 to 180
        if((dice1.diceValue() == 1)&&(dice2.diceValue() == 1)&&(dice3.diceValue() == 1)){
            payOut += allBets[13] * 180;
            triple = true;

        }
        if((dice1.diceValue() == 2)&&(dice2.diceValue() == 2)&&(dice3.diceValue() == 2)){
            payOut += allBets[14] * 180;
            triple = true;

        }
        if((dice1.diceValue() == 3)&&(dice2.diceValue() == 3)&&(dice3.diceValue() == 3)){
            payOut += allBets[15] * 180;
            triple = true;

        }
        if((dice1.diceValue() == 4)&&(dice2.diceValue() == 4)&&(dice3.diceValue() == 4)){
            payOut += allBets[16] * 180;
            triple = true;

        }
        if((dice1.diceValue() == 5)&&(dice2.diceValue() == 5)&&(dice3.diceValue() == 5)){
            payOut += allBets[17] * 180;
            triple = true;

        }
        if((dice1.diceValue() == 6)&&(dice2.diceValue() == 6)&&(dice3.diceValue() == 6)){
            payOut += allBets[18] * 180;
            triple = true;

        }

        //Check for any specific 3 of a kind Pays 1 to 180
        if((dice1.diceValue() == dice2.diceValue())&&(dice2.diceValue() == dice3.diceValue())){
            payOut += allBets[6] * 30;
            triple = true;

        }

        //Check for any 2 of a kind Pays Pays 1 to 11
        if((dice1.diceValue() == dice2.diceValue())||(dice2.diceValue() == dice3.diceValue())||(dice1.diceValue() == dice3.diceValue())){

        }








        //Check for any of 1 number on any dice Pays 1 to 1 for 1 die, 1 to 2 for 2 dice, 1 to 3 for 3 dice

        //Check for small (ranges 4 - 10, but loses if any triple appears) Pays 1 to 1

        //Check for big (ranges 11 - 17, but loses if any triple appears) Pays 1 to 1

        /*Check for sum of all 3 dice
            If sum is (4 or 17) Pays 1 to 60
            If sum is (5 or 16) Pays 1 to 20
            If sum is (6 or 15) Pays 1 to 18
            If sum is (7 or 14) Pays 1 to 12
            If sum is (8 or 13) Pays 1 to 8
            If sum is (9 or 12) Pays 1 to 6
            If sum is (10 or 11) Pays 1 to 6
         */
        if((diceSum == 4)||(diceSum == 17)){
            payOut += allBets[19] * 60;
            payOut += allBets[32] * 60;
        }
        if((diceSum == 5)||(diceSum == 16)){
            payOut += allBets[20] * 20;
            payOut += allBets[31] * 20;
        }
        if((diceSum == 6)||(diceSum == 15)){
            payOut += allBets[21] * 18;
            payOut += allBets[30] * 18;
        }
        if((diceSum == 7)||(diceSum == 14)){
            payOut += allBets[22] * 12;
            payOut += allBets[29] * 12;
        }
        if((diceSum == 8)||(diceSum == 13)){
            payOut += allBets[23] * 8;
            payOut += allBets[28] * 8;
        }
        if((diceSum == 9)||(diceSum == 10)||(diceSum == 11)||(diceSum == 12)){
            payOut += allBets[24] * 6;
            payOut += allBets[25] * 6;
            payOut += allBets[26] * 6;
            payOut += allBets[27] * 6;

        }
        /*Bet on a different combinations of 2 dice, all Pays 1 to 6

            1 and 2

            1 and 3

            1 and 4

            1 and 5

            1 and 6

            2 and 3

            2 and 4

            2 and 5

            2 and 6

            3 and 4

            3 and 5

            3 and 6

            4 and 5

            4 and 6

            5 and 6
*/

    }


    public void stopGame(){
    }
}
