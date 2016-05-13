package io.FoF;

/**
 * Created by minlee on 5/13/16.
 */
public class SicBoBetInput {

    Display display = new Display();
    Game game = new Game();

    public int[] collectPlayerBetsOnSinglesOrDoubles(Player player, String singleOrDouble) {
        int[] bets = new int[6];
        int betSpecificChoice;
        int currentBetAmount;
        boolean madeCorrectBet = true;
        betSpecificChoice = display.getIntPrompt("Which " + singleOrDouble + " would you like to bet on? (1 - 6): ");
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        if (game.checkAmountInPurse(player, currentBetAmount)) {
            switch (betSpecificChoice) {
                case 1:
                    bets[0] += currentBetAmount;
                    break;
                case 2:
                    bets[1] += currentBetAmount;
                    break;
                case 3:
                    bets[2] += currentBetAmount;
                    break;
                case 4:
                    bets[3] += currentBetAmount;
                    break;
                case 5:
                    bets[4] += currentBetAmount;
                    break;
                case 6:
                    bets[5] += currentBetAmount;
                    break;
                default:
                    display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                    madeCorrectBet = false;
                    break;
            }
            if(madeCorrectBet){
                player.removeMoneyFromPurse(currentBetAmount);
            }
        } else {
            display.showMessage("You do not have enough money, bet different amount or end betting");
        }
        return bets;
    }

    public int[] collectPlayerBetsOnTriples(Player player) {
        int[] tripleBets = new int[6];
        int betSpecificChoice;
        int currentBetAmount;
        betSpecificChoice = display.getIntPrompt("Which triple would you like to bet on? (1 - 6) or 0 for any triple: ");
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        boolean madeCorrectBet = true;
        if (game.checkAmountInPurse(player, currentBetAmount)) {
            switch (betSpecificChoice) {
                case 0:
                    tripleBets[0] += currentBetAmount;
                    break;
                case 1:
                    tripleBets[1] += currentBetAmount;
                    break;
                case 2:
                    tripleBets[2] += currentBetAmount;
                    break;
                case 3:
                    tripleBets[3] += currentBetAmount;
                    break;
                case 4:
                    tripleBets[4] += currentBetAmount;
                    break;
                case 5:
                    tripleBets[5] += currentBetAmount;
                    break;
                case 6:
                    tripleBets[6] += currentBetAmount;
                    break;
                default:
                    display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                    madeCorrectBet = false;
                    break;
            }
            if(madeCorrectBet){
                player.removeMoneyFromPurse(currentBetAmount);
            }
        } else {
            display.showMessage("You do not have enough money, bet different amount or end betting");
        }
        return tripleBets;
    }

    public int[] collectPlayerBetsOnSum(Player player) {
        int[] sumBets = new int[14];
        int betSpecificChoice;
        int currentBetAmount;
        betSpecificChoice = display.getIntPrompt("Which Sum would you like to bet on? (4 - 17): ");
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        boolean madeCorrectBet = true;
        if (game.checkAmountInPurse(player, currentBetAmount)) {
            switch (betSpecificChoice) {
                case 4:
                    sumBets[0] += currentBetAmount;
                    break;
                case 5:
                    sumBets[1] += currentBetAmount;
                    break;
                case 6:
                    sumBets[2] += currentBetAmount;
                    break;
                case 7:
                    sumBets[3] += currentBetAmount;
                    break;
                case 8:
                    sumBets[4] += currentBetAmount;
                    break;
                case 9:
                    sumBets[5] += currentBetAmount;
                    break;
                case 10:
                    sumBets[6] += currentBetAmount;
                    break;
                case 11:
                    sumBets[7] += currentBetAmount;
                    break;
                case 12:
                    sumBets[8] += currentBetAmount;
                    break;
                case 13:
                    sumBets[9] += currentBetAmount;
                    break;
                case 14:
                    sumBets[10] += currentBetAmount;
                    break;
                case 15:
                    sumBets[11] += currentBetAmount;
                    break;
                case 16:
                    sumBets[12] += currentBetAmount;
                    break;
                case 17:
                    sumBets[13] += currentBetAmount;
                    break;
                default:
                    display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                    madeCorrectBet = false;
                    break;
            }
            if(madeCorrectBet){
                player.removeMoneyFromPurse(currentBetAmount);
            }        } else {
            display.showMessage("You do not have enough money, bet different amount or end betting");
        }
        return sumBets;

    }

    public int[] collectPlayerBetsOnSpecific2Die(Player player) {
        int[] twoDieBets = new int[6];
        int betSpecificChoice;
        int currentBetAmount;
        boolean madeCorrectBet = true;
        betSpecificChoice = display.getIntPrompt("Which Specific 2 die combination would you like to bet on?\n 1: 1 & 2\n" +
                " 2: 1 & 3\n" +
                " 3: 1 & 4\n" +
                " 4: 1 & 5\n" +
                " 5: 1 & 6\n" +
                " 6: 2 & 3\n" +
                " 7: 2 & 4\n" +
                " 8: 2 & 5\n" +
                " 9: 2 & 6\n" +
                "10: 3 & 4\n" +
                "11: 3 & 5\n" +
                "12: 3 & 6\n" +
                "13: 4 & 5\n" +
                "14: 4 & 6\n" +
                "15: 5 & 6\nEnter choice: ");
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        if (game.checkAmountInPurse(player, currentBetAmount)) {
            switch (betSpecificChoice) {
                case 1:
                    twoDieBets[0] += currentBetAmount;
                    break;
                case 2:
                    twoDieBets[1] += currentBetAmount;
                    break;
                case 3:
                    twoDieBets[2] += currentBetAmount;
                    break;
                case 4:
                    twoDieBets[3] += currentBetAmount;
                    break;
                case 5:
                    twoDieBets[4] += currentBetAmount;
                    break;
                case 6:
                    twoDieBets[5] += currentBetAmount;
                    break;
                case 7:
                    twoDieBets[6] += currentBetAmount;
                    break;
                case 8:
                    twoDieBets[7] += currentBetAmount;
                    break;
                case 9:
                    twoDieBets[8] += currentBetAmount;
                    break;
                case 10:
                    twoDieBets[9] += currentBetAmount;
                    break;
                case 11:
                    twoDieBets[10] += currentBetAmount;
                    break;
                case 12:
                    twoDieBets[11] += currentBetAmount;
                    break;
                case 13:
                    twoDieBets[12] += currentBetAmount;
                    break;
                case 14:
                    twoDieBets[13] += currentBetAmount;
                    break;
                case 15:
                    twoDieBets[14] += currentBetAmount;
                    break;
                default:
                    display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                    madeCorrectBet = false;
                    break;
            }
            if(madeCorrectBet){
                player.removeMoneyFromPurse(currentBetAmount);
            }
        } else {
            display.showMessage("You do not have enough money, bet again");
        }
        return twoDieBets;

    }

    public int collectPlayerBetsOnSmallorBig(Player player) {
        int bet = 0;
        int betSpecificChoice;
        int currentBetAmount;
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        if(game.checkAmountInPurse(player,currentBetAmount)){
            bet += currentBetAmount;
            player.removeMoneyFromPurse(currentBetAmount);
        }
        else {
            display.showMessage("You do not have enough money, bet again");
        }
        return bet;
    }

}
