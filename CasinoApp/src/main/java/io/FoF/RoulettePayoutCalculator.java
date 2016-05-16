package io.FoF;

/**
 * Created by minlee on 5/15/16.
 */
public class RoulettePayoutCalculator {
    /**
     * Returns the earnings on a specific roulette wheel number
     * @param bet
     * @return
     */
    public int calculateSpecificNumberWinnings(int bet) {
        int payoutRatio = 35;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on betting on the correct color
     * @param bet
     * @return
     */
    public int calculateColorWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on betting on high or low on the board
     * @param bet
     * @return
     */
    public int calculateHighLowWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on any even or odd winnings
     * @param bet
     * @return
     */
    public int calculateEvenOddWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on a row bet
     * @param bet
     * @return
     */
    public int calculateRowWinnings(int bet) {
        int payoutRatio = 2;
        bet += bet * payoutRatio;
        return bet;
    }

    /**
     * Returns the earnings on a column bet
     * @param bet
     * @return
     */
    public int calculateColumnWinnings(int bet) {
        int payoutRatio = 11;
        bet += bet * payoutRatio;
        return bet;
    }



}
