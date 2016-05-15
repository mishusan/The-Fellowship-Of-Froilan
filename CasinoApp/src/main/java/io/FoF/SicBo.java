package io.FoF;


/**
 * Created by minlee on 5/11/16.
 */
public class SicBo extends Game {

    private Dice dice1, dice2, dice3;

    private int[] tripleBets;
    private int[] doubleBets;
    private int[] singleBets;
    private int[] sumBets;
    private int[] twoDieBets;
    private int smallBet;
    private int bigBet;
    private int[] dicesValues;
    SicBoBetPayout sicBoBetPayout = new SicBoBetPayout();
    BetInput betInput = new BetInput();

    public void playGame(Player player) {
        display.printSicBoTable();
        dicesValues = new int[3];
        super.playGame(player);
    }

    public void placeBet(Player player) {


        int betTypeChoice = -1;

        tripleBets = new int[7];
        doubleBets = new int[6];
        singleBets = new int[6];
        sumBets = new int[14];
        twoDieBets = new int[15];


        while (betTypeChoice != 0) {
            display.showMessage("\nThe current amount in your purse is: " + player.getPurse());
            betTypeChoice = display.getIntPrompt("\nBetting Options:\n0: Done Bets\n1: Singles\n2: Doubles\n3: Triples\n4: Sums\n5: Specific 2 Dice\n6: Bet Small\n7: Bet Big\nHow would you like to bet?: ");
            switch (betTypeChoice) {
                case 1:
                    singleBets = betInput.collectPlayerBetInputs(singleBets, player, BetInput.BetType.SINGLE , 1);
                    break;
                case 2:
                    doubleBets = betInput.collectPlayerBetInputs(doubleBets, player, BetInput.BetType.DOUBLE , 1);
                    break;
                case 3:
                    tripleBets = betInput.collectPlayerBetInputs(tripleBets, player, BetInput.BetType.TRIPLE , 0);
                    break;
                case 4:
                    sumBets = betInput.collectPlayerBetInputs(sumBets, player, BetInput.BetType.SUM , 4);
                    break;
                case 5:
                    twoDieBets = betInput.collectPlayerBetInputs(twoDieBets, player, BetInput.BetType.TWODIE , 1);
                    break;
                case 6:
                    smallBet = betInput.collectPlayerBetInputs(player);
                    break;
                case 7:
                    bigBet = betInput.collectPlayerBetInputs(player);
                    break;
            }
        }



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
        return "Dice rolls are: " + dice1.diceValue() + "  " + dice2.diceValue() + "  " + dice3.diceValue();
    }

    public void checkToSeeIfPlayerWon(Player player) {
        int payoutTotal = 0;
        payoutTotal += sicBoBetPayout.returnPayoutForTriples(dicesValues, tripleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForDoubles(dicesValues, doubleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSingles(dicesValues, singleBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSums(dicesValues, sumBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSums(dicesValues, twoDieBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSpecific2Die(dicesValues, twoDieBets);
        payoutTotal += sicBoBetPayout.returnPayoutForSmallBet(dicesValues, smallBet);
        payoutTotal += sicBoBetPayout.returnPayoutForBigBet(dicesValues, bigBet);
        display.showMessage("Putting $" + (payoutTotal) + " back to your purse");
        player.addMoneyToPurse(payoutTotal);
    }
}
