package io.FoF.SicBoPayoutCalculatorPackage;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnSumsCalculator {

    /**
     * Returns the earnings on a big bet (11 - 17) dice sum
     * @param bigBet
     * @return
     */
    public int calculateBigWinnings(int bigBet) {
        int payoutRatio = 1;
        bigBet += bigBet * payoutRatio;
        return bigBet;
    }

    /**
     * Returns the earnings on a big bet (4 - 10) dice sum
     * @param smallBet
     * @return
     */
    public int calculateSmallWinnings(int smallBet) {
        int payoutRatio = 1;
        smallBet += smallBet * payoutRatio;
        return smallBet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 4 or 17
     * @param bet
     * @return
     */
    public int calculateSumOf4and17Winnings(int bet) {
        int payoutRatio = 60;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 5 or 16
     * @param bet
     * @return
     */
    public int calculateSumOf5and16Winnings(int bet) {
        int payoutRatio = 20;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 6 or 15
     * @param bet
     * @return
     */
    public int calculateSumOf6and15Winnings(int bet) {
        int payoutRatio = 18;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 7 or 14
     * @param bet
     * @return
     */
    public int calculateSumOf7and14Winnings(int bet) {
        int payoutRatio = 12;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 8 or 13
     * @param bet
     * @return
     */
    public int calculateSumOf8and13Winnings(int bet) {
        int payoutRatio = 8;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earings on a bet where the dice sum is either 9, 10, 11, or 12
     * @param bet
     * @return
     */
    public int calculateSumOf9and10and11and12Winnings(int bet) {
        int payoutRatio = 6;
        bet += bet * payoutRatio;
        return bet;
    }
}
