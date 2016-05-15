package io.FoF;

/**
 * Created by minlee on 5/13/16.
 */
public class BetInput {

    public enum BetType{
        SINGLE, DOUBLE, TRIPLE, SUM, TWODIE, BIG, SMALL,ROULETTENUMBERS,ROULETTERANGE, ROULETTECOLUMN, ROULETTEROW
    }

    Display display = new Display();

    public String getBetQuestion(BetType betType){
        String betQuestion = "";
        switch (betType){
            case SINGLE:
                betQuestion = "Which single would you like to bet on? (1 - 6): ";
                break;
            case DOUBLE:
                betQuestion = "Which double would you like to bet on? (1 - 6): ";
                break;
            case TRIPLE:
                betQuestion = "Which triple would you like to bet on? (1 - 6) or 0 for any triple: ";
                break;
            case SUM:
                betQuestion = "Which Sum would you like to bet on? (4 - 17): ";
                break;
            case TWODIE:
                betQuestion = "Which Specific 2 die combination would you like to bet on?\n 1: 1 & 2\n" +
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
                        "15: 5 & 6\nEnter choice: ";
                break;
            case BIG:
                betQuestion = "Which single would you like to bet on? (1 - 6): ";
                break;
            case SMALL:
                betQuestion = "Which single would you like to bet on? (1 - 6): ";
                break;
            case ROULETTENUMBERS:
                betQuestion = "Which number would you like to bet on? (0 - 36): ";
                break;
            case ROULETTERANGE:
                betQuestion = "0: Red\n1: Black\n2: High (19 - 36)\n3: Low (1 to 18)" +
                        "\n4: Odd\n5: Even\nWhich range would you like to bet on?: ";
                break;
            case ROULETTECOLUMN:
                betQuestion = "1:  1 - 3\n2:  4 - 6\n3:  7 - 9\n4:  10 - 12\n5:  13 - 15\n6:  16 - 18\n7:  19 - 21\n8:  22 - 24" +
                        "\n9:  25 - 27\n10: 28 - 30\n11: 31 - 33\n12: 34 - 36\nWhich column would you like to bet on?: ";
                break;
            case ROULETTEROW:
                betQuestion = "1: Row starting with 1\n2: Row starting with 2\n3: Row starting with 3\nWhich row would you like to bet on?: ";
                break;
        }
        return betQuestion;
    }


    public int[] collectPlayerBetInputs(int[] bets, Player player, BetType betType, int differential) {
        int betSpecificChoice;
        int currentBetAmount;
        boolean madeCorrectBet = true;
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        if (checkAmountInPurse(player, currentBetAmount)) {
            betSpecificChoice = display.getIntPrompt(getBetQuestion(betType));
            if((betSpecificChoice >= differential) && (betSpecificChoice <= bets.length+differential-1)){
                bets[betSpecificChoice-differential] += currentBetAmount;
                player.removeMoneyFromPurse(currentBetAmount);
            }
            else{
                display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
            }
        }
        else {
            display.showMessage("You do not have enough money, bet different amount or end betting");
        }
        return bets;
    }

    public int collectPlayerBetInputs(Player player) {
        int bet = 0;
        double currentBetAmount;
        currentBetAmount = display.getDoublePrompt("How much do you want to bet?: ");
        if (checkAmountInPurse(player, currentBetAmount)) {
            bet += currentBetAmount;
            player.removeMoneyFromPurse(currentBetAmount);
        } else {
            display.showMessage("You do not have enough money, bet again");
        }
        return bet;
    }

    public Boolean checkAmountInPurse(Player player, double betAmount) {
        boolean checkEnoughMoney = false;
        if (betAmount <= player.getPurse()) {
            checkEnoughMoney = true;
        }
        return checkEnoughMoney;
    }
}
