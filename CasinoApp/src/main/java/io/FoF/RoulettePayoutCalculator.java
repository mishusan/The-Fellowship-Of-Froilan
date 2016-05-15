package io.FoF;

/**
 * Created by minlee on 5/15/16.
 */
public class RoulettePayoutCalculator {

    public int calculateSpecificNumberWinnings(int bet) {
        int payoutRatio = 35;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateColorWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateHighLowWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateEvenOddWinnings(int bet) {
        int payoutRatio = 1;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateRowWinnings(int bet) {
        int payoutRatio = 2;
        bet += bet * payoutRatio;
        return bet;
    }
    public int calculateColumnWinnings(int bet) {
        int payoutRatio = 11;
        bet += bet * payoutRatio;
        return bet;
    }



}
