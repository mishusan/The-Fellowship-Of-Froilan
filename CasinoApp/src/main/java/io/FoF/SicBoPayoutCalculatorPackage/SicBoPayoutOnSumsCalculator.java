package io.FoF.SicBoPayoutCalculatorPackage;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnSumsCalculator {

    public int calculateBigWinnings(int bigBet) {
        int payoutRatio = 1;
        bigBet += bigBet * payoutRatio;
        return bigBet;
    }

    public int calculateSmallWinnings(int smallBet) {
        int payoutRatio = 1;
        smallBet += smallBet * payoutRatio;
        return smallBet;
    }

    public int calculateSumOf4and17Winnings(int bet) {
        int payoutRatio = 60;
        bet += bet * payoutRatio;
        return bet;
    }

    public int calculateSumOf5and16Winnings(int bet) {
        int payoutRatio = 20;
        bet += bet * payoutRatio;
        return bet;
    }

    public int calculateSumOf6and15Winnings(int bet) {
        int payoutRatio = 18;
        bet += bet * payoutRatio;
        return bet;
    }

    public int calculateSumOf7and14Winnings(int bet) {
        int payoutRatio = 12;
        bet += bet * payoutRatio;
        return bet;
    }

    public int calculateSumOf8and13Winnings(int bet) {
        int payoutRatio = 8;
        bet += bet * payoutRatio;
        return bet;
    }

    public int calculateSumOf9and10and11and12Winnings(int bet) {
        int payoutRatio = 6;
        bet += bet * payoutRatio;
        return bet;
    }
}
