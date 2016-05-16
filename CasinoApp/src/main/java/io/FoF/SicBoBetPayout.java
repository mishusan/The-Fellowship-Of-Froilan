package io.FoF;

import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnDiceValuesCalculator;
import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnSumsCalculator;
import io.FoF.SicBoResultsChecker.*;

/**
 * Created by minlee on 5/11/16.
 */
public class SicBoBetPayout {

    SicBoCheckForDiceTriples sicBoCheckForDiceTriples = new SicBoCheckForDiceTriples();
    SicBoCheckForDiceDoubles sicBoCheckForDiceDoubles = new SicBoCheckForDiceDoubles();
    SicBoCheckForDiceSingles sicBoCheckForDiceSingles = new SicBoCheckForDiceSingles();
    SicBoCheckForSpecific2Die sicBoCheckForSpecific2Die = new SicBoCheckForSpecific2Die();
    SicBoCheckForSums sicBoCheckForSums = new SicBoCheckForSums();

    SicBoPayoutOnDiceValuesCalculator sicBoPayoutOnDiceValuesCalculator = new SicBoPayoutOnDiceValuesCalculator();
    SicBoPayoutOnSumsCalculator sicBoPayoutOnSumsCalculator = new SicBoPayoutOnSumsCalculator();

    /**
     * Returns the earnings on all triple bets
     * @param diceValues
     * @param tripleBets
     * @return
     */
    public int returnPayoutForTriples(int[] diceValues, int[] tripleBets) {
        int payout = 0;
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnyTripleWinnings(tripleBets[0]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 1)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[1]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 2)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[2]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 3)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[3]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 4)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[4]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[5]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues, 6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[6]);
        }
        return payout;
    }

    /**
     * Returns the earnings on all double bets
     * @param diceValues
     * @param doubleBet
     * @return
     */
    public int returnPayoutForDoubles(int[] diceValues, int[] doubleBet) {
        int payout = 0;
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,1)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[0]);
        }
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,2)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[1]);
        }
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,3)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[2]);
        }
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,4)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[3]);
        }
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[4]);
        }
        if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[5]);
        }
        return payout;
    }

    /**
     * Returns the earnings on all single bets
     * @param diceValues
     * @param singleBets
     * @return
     */
    public int returnPayoutForSingles(int[] diceValues, int[] singleBets) {
        int payout = 0;
        int numberOfSingleOccurence;
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,1)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,1)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,1)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[0], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,2)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,2)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,2)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[1], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,3)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,3)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,3)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[2], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,4)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,4)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,4)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[3], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,5)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,5)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,5)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[4], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingles(diceValues,6)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues,6)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDoubles(diceValues,6)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[5], numberOfSingleOccurence);
        }

        return payout;
    }

    /**
     * Returns the earnings on all sum bets
     * @param diceValues
     * @param sumBets
     * @return
     */
    public int returnPayoutForSums(int[] diceValues, int[] sumBets) {
        int payout = 0;
        if (sicBoCheckForSums.checkSum(diceValues,4)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf4and17Winnings(sumBets[0]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,5)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf5and16Winnings(sumBets[1]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,6)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf6and15Winnings(sumBets[2]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,7)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf7and14Winnings(sumBets[3]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,8)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf8and13Winnings(sumBets[4]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,9)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[5]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,10)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[6]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,11)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[7]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,12)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[8]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,13)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf8and13Winnings(sumBets[9]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,14)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf7and14Winnings(sumBets[10]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,15)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf6and15Winnings(sumBets[11]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,16)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf5and16Winnings(sumBets[12]);
        }
        if (sicBoCheckForSums.checkSum(diceValues,17)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf4and17Winnings(sumBets[13]);
        }
        return payout;
    }

    /**
     * Returns the earnings on all specific 2 die bets
     * @param diceValues
     * @param sumBets
     * @return
     */

    public int returnPayoutForSpecific2Die(int[] diceValues, int[] sumBets) {
        int payout = 0;
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,1,2)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[0]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,1,3)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[1]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,1,4)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[2]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,1,5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[3]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,1,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[4]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,2,3)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[5]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,2,4)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[6]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,2,5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[7]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,2,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[8]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,3,4)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[9]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,3,5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[10]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,3,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[11]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,4,5)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[12]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,4,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[13]);
        }
        if (sicBoCheckForSpecific2Die.check2Die(diceValues,5,6)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[14]);
        }
        return payout;
    }

    /**
     * Returns the earnings for a small bet (4 -10)
     * @param diceValues
     * @param smallBet
     * @return
     */
    public int returnPayoutForSmallBet(int[] diceValues, int smallBet) {
        int payout = 0;
        if (sicBoCheckForSums.checkSumForSmall(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSmallWinnings(smallBet);

        }
        return payout;
    }
    /**
     * Returns the earnings for a small bet (11 -17)
     * @param diceValues
     * @param bigBet
     * @return
     */
    public int returnPayoutForBigBet(int[] diceValues, int bigBet) {
        int payout = 0;
        if (sicBoCheckForSums.checkSumForBig(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateBigWinnings(bigBet);

        }
        return payout;
    }
}
