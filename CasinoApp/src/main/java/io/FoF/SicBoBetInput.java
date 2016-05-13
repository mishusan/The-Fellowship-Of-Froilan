package io.FoF;

/**
 * Created by minlee on 5/13/16.
 */
public class SicBoBetInput {

    Display display = new Display();
    Game game = new Game();

    public int[] collectPlayerBetsOnSingls(Player player){

        int[] singleBets = new int[6];
        int betSpecificChoice;
        int currentBetAmount;
        betSpecificChoice = display.getIntPrompt("Which single would you like to bet on? (1 - 6): ");
        currentBetAmount = display.getIntPrompt("How much do you want to bet?: ");
        if(game.checkAmountInPurse(player,currentBetAmount)){
            switch (betSpecificChoice){
                case 1:
                    singleBets[0] += currentBetAmount;
                    break;
                case 2:
                    singleBets[1] += currentBetAmount;
                    break;
                case 3:
                    singleBets[2] += currentBetAmount;
                    break;
                case 4:
                    singleBets[3] += currentBetAmount;
                    break;
                case 5:
                    singleBets[4] += currentBetAmount;
                    break;
                case 6:
                    singleBets[5] += currentBetAmount;
                    break;
                default:
                    display.showMessage("I'm sorry you did not pick a correct bet, no bets accepted");
                    break;
            }
            player.removeMoneyFromPurse(currentBetAmount);

        }
        else {
            display.showMessage("You do not have enough money, bet different amount or end betting");
        }
        return singleBets;
    }
}
