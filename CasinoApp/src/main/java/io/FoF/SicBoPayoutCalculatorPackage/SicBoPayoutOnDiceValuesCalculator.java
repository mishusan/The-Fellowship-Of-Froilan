package io.FoF.SicBoPayoutCalculatorPackage;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnDiceValuesCalculator {

    /**
     * Returns the earnings on any triple dice rolls
     * @param bet
     * @return
     */
    public int calculateAnyTripleWinnings(int bet) {
        int payoutRatio = 30;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on a specific triple dice roll
     * @param bet
     * @return
     */
    public int calculateSpecificTripleWinnings(int bet) {
        int payoutRatio = 180;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on a specific double dice roll
     * @param bet
     * @return
     */
    public int calculateSpecificDoubleWinnings(int bet) {
        int payoutRatio = 11;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Retuns the earnings on a single die winning multiple of number of occurrences
     * @param bet
     * @param numOfOccurrences
     * @return
     */
    public int calculateAnySingleDieWinning(int bet, int numOfOccurrences) {
        int payoutRatio = numOfOccurrences;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Retursn the earnings on a specific pair of two die
     * @param bet
     * @return
     */
    public int calculateAnySpecific2DiceRoll(int bet) {
        int payoutRatio = 6;
        bet += bet * payoutRatio;
        return bet;
    }

}
