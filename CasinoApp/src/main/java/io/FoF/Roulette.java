package io.FoF;

/**
 * Created by minlee on 5/14/16.
 */
public class Roulette extends Game{

    private RouletteWheel rouletteWheel;

    private int[] numberBets;
    private int[] rangeBets;
    private int[] columnBets;
    private int[] rowBets;

    SicBoBetPayout sicBoBetPayout = new SicBoBetPayout();
    RoulettePayoutCalculator roulettePayoutCalculator = new RoulettePayoutCalculator();
    BetInput betInput = new BetInput();

    public void playGame(Player player) {
        display.printRouletteTable();
        rouletteWheel = new RouletteWheel();
        super.playGame(player);
    }

    public void placeBet(Player player) {

        boolean doneBetting = false;
        int betTypeChoice = -1;

        numberBets = new int[37];
        rangeBets = new int[6];
        columnBets = new int[12];
        rowBets = new int[3];

        while (betTypeChoice != 0) {
            display.showMessage("\nThe current amount in your purse is: " + player.getPurse());
            betTypeChoice = display.getIntPrompt("\nBetting Options:\n0: Done Bets\n1: Numbers 0 - 36\n2: Bet Particular Range\n" +
                    "3: Columns\n4: Rows\nHow would you like to bet?: ");
            switch (betTypeChoice) {
                case 1:
                    numberBets = betInput.collectPlayerBetInputs(numberBets, player, BetInput.BetType.ROULETTENUMBERS , 0);

                    for(int i = 0; i < numberBets.length; i++){
                        System.out.println(numberBets[i]);
                    }
                    break;
                case 2:
                    rangeBets = betInput.collectPlayerBetInputs(rangeBets, player, BetInput.BetType.ROULETTERANGE , 0);
                    for(int i = 0; i < rangeBets.length; i++){
                        System.out.println(rangeBets[i]);
                    }
                    break;
                case 3:
                    columnBets = betInput.collectPlayerBetInputs(columnBets, player, BetInput.BetType.ROULETTECOLUMN , 1);
                    for(int i = 0; i < columnBets.length; i++){
                        System.out.println(columnBets[i]);
                    }
                    break;
                case 4:
                    rowBets = betInput.collectPlayerBetInputs(rowBets, player, BetInput.BetType.ROULETTEROW , 1);
                    for(int i = 0; i < rowBets.length; i++){
                        System.out.println(rowBets[i]);
                    }
                    break;
            }
        }

    }

    void shuffle() {
        rouletteWheel = new RouletteWheel();

    }

    public String sendDisplayResults() {
        return "Roulette comes out to "+rouletteWheel.rouletteValue()+" "+rouletteWheel.rouletteColor();
    }

    public void checkToSeeIfPlayerWon(Player player) {
        int payoutTotal = 0;
        for(int i = 0; i < numberBets.length; i++){
            if(rouletteWheel.rouletteValue() == numberBets[i]){
                payoutTotal += roulettePayoutCalculator.calculateSpecificNumberWinnings(numberBets[i]);
            }
        }
        if(rouletteWheel.rouletteColor() == RouletteWheel.RouletteColor.RED){
            payoutTotal += roulettePayoutCalculator.calculateColorWinnings(rangeBets[0]);
        }
        if(rouletteWheel.rouletteColor() == RouletteWheel.RouletteColor.BLACK){
            payoutTotal += roulettePayoutCalculator.calculateColorWinnings(rangeBets[1]);
        }
        if(rouletteWheel.rouletteColor() == RouletteWheel.RouletteColor.BLACK){
            payoutTotal += roulettePayoutCalculator.calculateColorWinnings(rangeBets[1]);
        }
        if((rouletteWheel.rouletteValue() > 18) && (rouletteWheel.rouletteValue() < 37)){
            payoutTotal += roulettePayoutCalculator.calculateHighLowWinnings(rangeBets[2]);
        }
        if((rouletteWheel.rouletteValue() > 1) && (rouletteWheel.rouletteValue() < 19)){
            payoutTotal += roulettePayoutCalculator.calculateHighLowWinnings(rangeBets[3]);
        }
        if((rouletteWheel.rouletteValue() % 2 == 1) && (rouletteWheel.rouletteValue() != 0)){
            payoutTotal += roulettePayoutCalculator.calculateEvenOddWinnings(rangeBets[4]);
        }
        if((rouletteWheel.rouletteValue() % 2 == 0) && (rouletteWheel.rouletteValue() != 0)){
            payoutTotal += roulettePayoutCalculator.calculateEvenOddWinnings(rangeBets[5]);
        }
        if((rouletteWheel.rouletteValue() >= 1) && (rouletteWheel.rouletteValue() <= 3)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[0]);
        }
        if((rouletteWheel.rouletteValue() >= 4) && (rouletteWheel.rouletteValue() <= 6)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[1]);
        }
        if((rouletteWheel.rouletteValue() >= 7) && (rouletteWheel.rouletteValue() <= 9)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[2]);
        }
        if((rouletteWheel.rouletteValue() >= 10) && (rouletteWheel.rouletteValue() <= 12)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[3]);
        }
        if((rouletteWheel.rouletteValue() >= 13) && (rouletteWheel.rouletteValue() <= 15)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[4]);
        }
        if((rouletteWheel.rouletteValue() >= 16) && (rouletteWheel.rouletteValue() <= 18)) {
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[5]);
        }
        if((rouletteWheel.rouletteValue() >= 19) && (rouletteWheel.rouletteValue() <= 21)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[6]);
        }
        if((rouletteWheel.rouletteValue() >= 22) && (rouletteWheel.rouletteValue() <= 24)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[7]);
        }
        if((rouletteWheel.rouletteValue() >= 25) && (rouletteWheel.rouletteValue() <= 27)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[8]);
        }
        if((rouletteWheel.rouletteValue() >= 28) && (rouletteWheel.rouletteValue() <= 30)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[9]);
        }
        if((rouletteWheel.rouletteValue() >= 31) && (rouletteWheel.rouletteValue() <= 33)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[10]);
        }
        if((rouletteWheel.rouletteValue() >= 34) && (rouletteWheel.rouletteValue() <= 36)){
            payoutTotal += roulettePayoutCalculator.calculateColumnWinnings(columnBets[11]);
        }
        if(rouletteWheel.rouletteValue() % 3 == 1){
            payoutTotal += roulettePayoutCalculator.calculateRowWinnings(rowBets[0]);
        }
        if(rouletteWheel.rouletteValue() % 3 == 2){
            payoutTotal += roulettePayoutCalculator.calculateRowWinnings(rowBets[1]);
        }
        if(rouletteWheel.rouletteValue() % 3 == 0){
            payoutTotal += roulettePayoutCalculator.calculateRowWinnings(rowBets[2]);
        }
        display.showMessage("Putting $" + (payoutTotal) + " back to your purse");
        player.addMoneyToPurse(payoutTotal);
    }
}


