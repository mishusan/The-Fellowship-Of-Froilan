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
    private boolean stillPlaying = true;
    SicBoBetPayout sicBoBetPayout = new SicBoBetPayout();
    SicBoBetInput sicBoBetInput = new SicBoBetInput();

    void startGame(Player player) {
        dicesValues = new int[3];
        while (stillPlaying) {
            placeBet(player);
            shuffle();
            display.showMessage("\n" + sendDisplayResults() + "\n");
            checkToSeeIfPlayerWon(player);
            display.showMessage("\nYou have " + player.getPurse() + " dollars left in your purse");

            if (display.getStringPrompt("Are you done playing?(yes or no): ").equals("yes")) {
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


        while (betTypeChoice != 0) {
            display.showMessage("\nThe current amount in your purse is: " + player.getPurse());
            betTypeChoice = display.getIntPrompt("\nBetting Options:\n0: Done Bets\n1: Singles\n2: Doubles\n3: Triples\n4: Sums\n5: Specific 2 Dice\n6: Bet Small\n7: Bet Big\nHow would you like to bet?: ");
            switch (betTypeChoice) {
                case 1:
                    singleBets = sicBoBetInput.collectPlayerBetsOnSinglesOrDoubles(player, "Single");
                    break;
                case 2:
                    doubleBets = sicBoBetInput.collectPlayerBetsOnSinglesOrDoubles(player, "Double");
                    break;
                case 3:
                    tripleBets = sicBoBetInput.collectPlayerBetsOnTriples(player);
                    break;
                case 4:
                    sumBets = sicBoBetInput.collectPlayerBetsOnSum(player);
                    break;
                case 5:
                    twoDieBets = sicBoBetInput.collectPlayerBetsOnSpecific2Die(player);
                    break;
                case 6:
                    smallBet = sicBoBetInput.collectPlayerBetsOnSmallorBig(player);
                    break;
                case 7:
                    bigBet = sicBoBetInput.collectPlayerBetsOnSmallorBig(player);
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
        display.showMessage("Your putting - " + (payoutTotal) + " back to your purse");
        player.addMoneyToPurse(payoutTotal);
    }
}
