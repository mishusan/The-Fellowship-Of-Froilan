package io.FoF;

import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnDiceValuesCalculator;
import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnSumsCalculator;
import io.FoF.SicBoResultsChecker.*;

import java.util.HashMap;

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

    public int returnPayoutForTriples(int[] diceValues, int[] tripleBets) {
        int payout = 0;
        if (sicBoCheckForDiceTriples.checkForAnyTriple(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnyTripleWinnings(tripleBets[0]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple1s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[1]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple2s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[2]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple3s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[3]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple4s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[4]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple5s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[5]);
        }
        if (sicBoCheckForDiceTriples.checkForAnyTriple6s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(tripleBets[6]);
        }
        return payout;
    }

    public int returnPayoutForDoubles(int[] diceValues, int[] doubleBet) {
        int payout = 0;
        if (sicBoCheckForDiceDoubles.checkForDouble1s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[0]);
        }
        if (sicBoCheckForDiceDoubles.checkForDouble2s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[1]);
        }
        if (sicBoCheckForDiceDoubles.checkForDouble3s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[2]);
        }
        if (sicBoCheckForDiceDoubles.checkForDouble4s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[3]);
        }
        if (sicBoCheckForDiceDoubles.checkForDouble5s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[4]);
        }
        if (sicBoCheckForDiceDoubles.checkForDouble6s(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(doubleBet[5]);
        }
        return payout;
    }

    public int returnPayoutForSingles(int[] diceValues, int[] singleBets) {
        int payout = 0;
        int numberOfSingleOccurence;
        if (sicBoCheckForDiceSingles.checkForSingle1s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple1s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble1s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[0], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingle2s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple2s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble2s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[1], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingle3s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple3s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble3s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[2], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingle4s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple4s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble4s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[3], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingle5s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple5s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble5s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[4], numberOfSingleOccurence);
        }
        if (sicBoCheckForDiceSingles.checkForSingle6s(diceValues)) {
            if (sicBoCheckForDiceTriples.checkForAnyTriple6s(diceValues)) {
                numberOfSingleOccurence = 3;
            } else if (sicBoCheckForDiceDoubles.checkForDouble6s(diceValues)) {
                numberOfSingleOccurence = 2;
            } else {
                numberOfSingleOccurence = 1;
            }
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(singleBets[5], numberOfSingleOccurence);
        }

        return payout;
    }

    public int returnPayoutForSums(int[] diceValues, int[] sumBets) {
        int payout = 0;
        if (sicBoCheckForSums.checkSumFor4(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf4and17Winnings(sumBets[0]);

        }
        if (sicBoCheckForSums.checkSumFor5(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf5and16Winnings(sumBets[1]);

        }
        if (sicBoCheckForSums.checkSumFor6(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf6and15Winnings(sumBets[2]);

        }
        if (sicBoCheckForSums.checkSumFor7(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf7and14Winnings(sumBets[3]);

        }
        if (sicBoCheckForSums.checkSumFor8(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf8and13Winnings(sumBets[4]);

        }
        if (sicBoCheckForSums.checkSumFor9(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[5]);

        }
        if (sicBoCheckForSums.checkSumFor10(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[6]);

        }
        if (sicBoCheckForSums.checkSumFor11(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[7]);

        }
        if (sicBoCheckForSums.checkSumFor12(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(sumBets[8]);

        }
        if (sicBoCheckForSums.checkSumFor13(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf8and13Winnings(sumBets[9]);

        }
        if (sicBoCheckForSums.checkSumFor14(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf7and14Winnings(sumBets[10]);

        }
        if (sicBoCheckForSums.checkSumFor15(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf6and15Winnings(sumBets[11]);

        }
        if (sicBoCheckForSums.checkSumFor16(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf5and16Winnings(sumBets[12]);

        }
        if (sicBoCheckForSums.checkSumFor17(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSumOf4and17Winnings(sumBets[13]);

        }
        return payout;
    }

    public int returnPayoutForSpecific2Die(int[] diceValues, int[] sumBets) {
        int payout = 0;
        if (sicBoCheckForSpecific2Die.checkForA1and2(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[0]);
        }
        if (sicBoCheckForSpecific2Die.checkForA1and3(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[1]);
        }
        if (sicBoCheckForSpecific2Die.checkForA1and4(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[2]);
        }
        if (sicBoCheckForSpecific2Die.checkForA1and5(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[3]);
        }
        if (sicBoCheckForSpecific2Die.checkForA1and6(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[4]);
        }
        if (sicBoCheckForSpecific2Die.checkForA2and3(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[5]);
        }
        if (sicBoCheckForSpecific2Die.checkForA2and4(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[6]);
        }
        if (sicBoCheckForSpecific2Die.checkForA2and5(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[7]);
        }
        if (sicBoCheckForSpecific2Die.checkForA2and6(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[8]);
        }
        if (sicBoCheckForSpecific2Die.checkForA3and4(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[9]);
        }
        if (sicBoCheckForSpecific2Die.checkForA3and5(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[10]);
        }
        if (sicBoCheckForSpecific2Die.checkForA3and6(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[11]);
        }
        if (sicBoCheckForSpecific2Die.checkForA4and5(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[12]);
        }
        if (sicBoCheckForSpecific2Die.checkForA4and6(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[13]);
        }
        if (sicBoCheckForSpecific2Die.checkForA5and6(diceValues)) {
            payout += sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(sumBets[14]);
        }
        return payout;
    }

    public int returnPayoutForSmallBet(int[] diceValues, int smallBet) {
        int payout = 0;
        if (sicBoCheckForSums.checkSumForSmall(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateSmallWinnings(smallBet);

        }
        return payout;
    }

    public int returnPayoutForBigBet(int[] diceValues, int bigBet) {
        int payout = 0;
        if (sicBoCheckForSums.checkSumForBig(diceValues)) {
            payout += sicBoPayoutOnSumsCalculator.calculateBigWinnings(bigBet);

        }
        return payout;
    }
}
