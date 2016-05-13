package io.FoF.SicBoPayoutCalculatorPackage;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnDiceValuesCalculator {

    public int calculateAnyTripleWinnings(int bet){
        int payoutRatio = 30;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateSpecificTripleWinnings(int bet){
        int payoutRatio = 180;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateSpecificDoubleWinnings(int bet){
        int payoutRatio = 11;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateAnySingleDieWinning(int bet, int numOfOccurrences){
        int payoutRatio = numOfOccurrences;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateAnySpecific2DiceRoll(int bet){
        int payoutRatio = 6;
        bet += bet * payoutRatio;
        return bet;
    }

}
