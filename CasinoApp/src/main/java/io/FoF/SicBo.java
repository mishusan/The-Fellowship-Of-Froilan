package io.FoF;


import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnDiceValuesCalculator;
import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnSumsCalculator;
import io.FoF.SicBoResultsChecker.*;

/**
 * Created by matthewb on 5/11/16.
 */
public class SicBo extends Game{

    private Dice dice1, dice2, dice3;

    private int[] tripleBets;
    private int[] doubleBets;
    private int[] singleBets;
    private int[] sumBets;
    private int[] twoDieBets;
    private int smallBet;
    private int bigBet;
    private int[] dicesValues;
    private boolean stillPlaying = true;
    SicBoBetPayout sicBoBetPayout = new SicBoBetPayout();

    void startGame(Player player) {
        dicesValues = new int[3];
        while (stillPlaying) {
            placeBet(player);
            shuffle();
            display.showMessage("\n"+sendDisplayResults()+"\n");
            checkToSeeIfPlayerWon(player);
            display.showMessage("\nYou have "+player.getPurse()+" dollars left in your purse");

            if(display.getStringPrompt("Are you done playing?(yes or no): ").equals("yes")){
                stillPlaying = false;
            }

        }

    }

    public void placeBet(Player player) {
        boolean doneBetting = false;

        int betTypeChoice = -1;
        int betSpecificChoice = 0;
        double currentBetAmount = 0;
        double totalBetPerRound = 0;

        tripleBets = new int[7];
        doubleBets = new int[6];
        singleBets = new int[6];
        sumBets = new int[14];
        twoDieBets = new int[15];


        while(betTypeChoice!=0){
            betTypeChoice = display.getIntPrompt("\nBetting Options:\n0: Done Bets\n1: Singles\n2: Doubles\n3: Triples\n4: Sums\n5: Specific 2 Dice\n6: Bet Small\n7: Bet Big\nHow would you like to bet?: ");
            switch (betTypeChoice){
                case 1:
                    betSpecificChoice = display.getIntPrompt("Which single would you like to bet on? (1 - 6): ");
                    currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                singleBets[0] += currentBetAmount;
                                break;
                            case 2:
                                singleBets[1] += currentBetAmount;
                                break;
                            case 3:
                                singleBets[2] += currentBetAmount;
                                break;
                            case 4:
                                singleBets[3] += currentBetAmount;
                                break;
                            case 5:
                                singleBets[4] += currentBetAmount;
                                break;
                            case 6:
                                singleBets[5] += currentBetAmount;
                                break;
                            default:
                                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                                break;
                        }
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
                case 2:
                    betSpecificChoice = display.getIntPrompt("Which double would you like to bet on? (1 - 6): ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                doubleBets[0] += currentBetAmount;
                                break;
                            case 2:
                                doubleBets[1] += currentBetAmount;
                                break;
                            case 3:
                                doubleBets[2] += currentBetAmount;
                                break;
                            case 4:
                                doubleBets[3] += currentBetAmount;
                                break;
                            case 5:
                                doubleBets[4] += currentBetAmount;
                                break;
                            case 6:
                                doubleBets[5] += currentBetAmount;
                                break;
                            default:
                                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                                break;
                        }
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
                case 3:
                    betSpecificChoice = display.getIntPrompt("Which triple would you like to bet on? (1 - 6) or 0 for any triple: ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 0:
                                tripleBets[0] += currentBetAmount;
                                break;
                            case 1:
                                tripleBets[1] += currentBetAmount;
                                break;
                            case 2:
                                tripleBets[2] += currentBetAmount;
                                break;
                            case 3:
                                tripleBets[3] += currentBetAmount;
                                break;
                            case 4:
                                tripleBets[4] += currentBetAmount;
                                break;
                            case 5:
                                tripleBets[5] += currentBetAmount;
                                break;
                            case 6:
                                tripleBets[6] += currentBetAmount;
                                break;
                            default:
                                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                                break;
                        }
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
                case 4:
                    betSpecificChoice = display.getIntPrompt("Which Sum would you like to bet on? (4 - 17): ");
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 4:
                                sumBets[0] += currentBetAmount;
                                break;
                            case 5:
                                sumBets[1] += currentBetAmount;
                                break;
                            case 6:
                                sumBets[2] += currentBetAmount;
                                break;
                            case 7:
                                sumBets[3] += currentBetAmount;
                                break;
                            case 8:
                                sumBets[4] += currentBetAmount;
                                break;
                            case 9:
                                sumBets[5] += currentBetAmount;
                                break;
                            case 10:
                                sumBets[6] += currentBetAmount;
                                break;
                            case 11:
                                sumBets[7] += currentBetAmount;
                                break;
                            case 12:
                                sumBets[8] += currentBetAmount;
                                break;
                            case 13:
                                sumBets[9] += currentBetAmount;
                                break;
                            case 14:
                                sumBets[10] += currentBetAmount;
                                break;
                            case 15:
                                sumBets[11] += currentBetAmount;
                                break;
                            case 16:
                                sumBets[12] += currentBetAmount;
                                break;
                            case 17:
                                sumBets[13] += currentBetAmount;
                                break;
                            default:
                                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                                break;
                        }
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
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
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        switch (betSpecificChoice){
                            case 1:
                                twoDieBets[0] += currentBetAmount;
                                break;
                            case 2:
                                twoDieBets[1] += currentBetAmount;
                                break;
                            case 3:
                                twoDieBets[2] += currentBetAmount;
                                break;
                            case 4:
                                twoDieBets[3] += currentBetAmount;
                                break;
                            case 5:
                                twoDieBets[4] += currentBetAmount;
                                break;
                            case 6:
                                twoDieBets[5] += currentBetAmount;
                                break;
                            case 7:
                                twoDieBets[6] += currentBetAmount;
                                break;
                            case 8:
                                twoDieBets[7] += currentBetAmount;
                                break;
                            case 9:
                                twoDieBets[8] += currentBetAmount;
                                break;
                            case 10:
                                twoDieBets[9] += currentBetAmount;
                                break;
                            case 11:
                                twoDieBets[10] += currentBetAmount;
                                break;
                            case 12:
                                twoDieBets[11] += currentBetAmount;
                                break;
                            case 13:
                                twoDieBets[12] += currentBetAmount;
                                break;
                            case 14:
                                twoDieBets[13] += currentBetAmount;
                                break;
                            case 15:
                                twoDieBets[14] += currentBetAmount;
                                break;
                            default:
                                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                                break;
                        }
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
                case 6:
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        smallBet += currentBetAmount;
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
                case 7:
                    currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
                    if(checkAmountInPurse(player,currentBetAmount+totalBetPerRound)){
                        totalBetPerRound+=currentBetAmount;
                        bigBet += currentBetAmount;
                    }
                    else {
                        display.showMessage("You do not have enough money, bet again");
                    }
                    break;
            }
        }
        System.out.println(totalBetPerRound);
        player.removeMoneyFromPurse(totalBetPerRound);



    }


    void shuffle() {
        dice1 = new Dice();
        dice2 = new Dice();
        dice3 = new Dice();
        dicesValues[0] = dice1.diceValue();
        dicesValues[1] = dice2.diceValue();
        dicesValues[2] = dice3.diceValue();
    }

    public String sendDisplayResults() {
        return "Dice rolls are: "+dice1.diceValue()+"  "+dice2.diceValue()+"  "+dice3.diceValue();
    }

    public void checkToSeeIfPlayerWon(Player player) {
        int payoutTotal = 0;
        payoutTotal += sicBoBetPayout.returnPayoutForTriples(dicesValues,tripleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForDoubles(dicesValues,doubleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSingles(dicesValues,singleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSums(dicesValues,sumBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSums(dicesValues,twoDieBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSpecific2Die(dicesValues,twoDieBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSmallBet(dicesValues,smallBet);
        payoutTotal += sicBoBetPayout.returnPayoutForBigBet(dicesValues,bigBet);
        display.showMessage("Your winnings this round are: "+(payoutTotal));
        player.addMoneyToPurse(payoutTotal);






    }


    public void stopGame(){
    }
}
