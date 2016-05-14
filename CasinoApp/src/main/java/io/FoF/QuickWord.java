package io.FoF;

/**
 * Created by matthewb on 5/14/16.
 */
public class QuickWord extends Game{


    public void startGame(Player player) {
        double pot =0;
        int correctGuesses = 0;
        String[] strings = new String[9];
        strings[0] = "X";
        strings[1] = "Y";
        strings[2] = "Z";
        strings[3] = "X";
        strings[4] = "X";
        strings[5] = "Z";
        strings[6] = "Z";
        strings[7] = "Y";
        strings[8] = "X";
        double bet = Display.getDoublePrompt("How much are you betting?");
        MoneyFromPurse(player,bet);
        pot += bet;
        Display.showMessage("Enter the Letters as they Appear to Get Points");
        Display.showMessage("Get ready..... Go!");
        Display.pausedShowMessage(strings);
        String guess1 = Display.getStringPrompt("");
        String guess2 = Display.getStringPrompt("");
        String guess3 = Display.getStringPrompt("");
        String guess4 = Display.getStringPrompt("");
        String guess5 = Display.getStringPrompt("");
        String guess6 = Display.getStringPrompt("");
        String guess7 = Display.getStringPrompt("");
        String guess8 = Display.getStringPrompt("");
        String guess9 = Display.getStringPrompt("");


        if(guess1.equals(strings[0])){
            correctGuesses++;
        }
        if(guess2.equals(strings[1])){
            correctGuesses++;
        }
        if(guess3.equals(strings[2])){
            correctGuesses++;
        }
        if(guess4.equals(strings[3])){
            correctGuesses++;
        }
        if(guess5.equals(strings[4])){
            correctGuesses++;
        }
        if(guess6.equals(strings[5])){
            correctGuesses++;
        }
        if(guess7.equals(strings[6])){
            correctGuesses++;
        }
        if(guess8.equals(strings[7])){
            correctGuesses++;
        }
        if(guess9.equals(strings[8])){
            correctGuesses++;
        }

        Display.showMessage("You got " + correctGuesses + " correct");
        double winnings = pot*(correctGuesses/3);
        Display.showMessage("Your won $" + winnings);
        MoneyToPurse(player,winnings);

    }
}
