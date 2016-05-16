package io.FoF;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by matthewb on 5/14/16.
 */
public class QuickWord extends Game implements Runnable {
    private Thread t;
    private String threadQuickWord;
    double pot;
    int correctGuesses;
    String[] strings;
    Date date;
    double bet;
    static int counter;
    BetInput betInput = new BetInput();

    public QuickWord() {
        threadQuickWord = "newQuickWordThread";
        pot = 0;
        correctGuesses = 0;
        strings = new String[21];
        strings[0] = "x";
        strings[1] = "y";
        strings[2] = "z";
        strings[3] = "x";
        strings[4] = "x";
        strings[5] = "z";
        strings[6] = "z";
        strings[7] = "y";
        strings[8] = "x";
        strings[8] = "q";
        strings[9] = "f";
        strings[10] = "e";
        strings[11] = "l";
        strings[12] = "l";
        strings[13] = "o";
        strings[14] = "w";
        strings[15] = "s";
        strings[16] = "h";
        strings[17] = "i";
        strings[18] = "p";
        strings[19] = "of";
        strings[20] = "Froilan";


    }

    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println(strings[i]);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadQuickWord);
            t.start();
        }
    }

    public void playGame(Player player) {
        bet = Display.getDoublePrompt("How much are you betting?");
        if (betInput.checkAmountInPurse(player, bet)) {
            MoneyFromPurse(player, bet);
            pot += bet;
        } else {
            Display.showMessage("You don't have that kind of cash pot setting to 0");
            pot = 0.0;
        }
        Display.showMessage("Enter the Letters as they Appear to Get Points");
        Display.showMessage("Get ready..... Go!");

        date = new Date();
        QuickWord R1 = new QuickWord();
        R1.start();
        multiThreadLetterDisplay(R1);

        Display.showMessage("You got " + correctGuesses + " correct");
        double winnings = pot * (correctGuesses / 3);
        Display.showMessage("Your won $" + winnings);
        MoneyToPurse(player, winnings);


    }

    public void multiThreadLetterDisplay(QuickWord quickWord) {
        for (int numGuess = 0; numGuess < 22; numGuess++) {
            Date newDate = new Date();
            Display.showMessage(20 - (newDate.getTime() - date.getTime()) / 1000 + "seconds left");
            if (newDate.getTime() > (date.getTime() + 20000)) {
                Display.showMessage("Times Up!");
                quickWord.t.interrupt();
                break;
            }
            String guess = Display.getStringPrompt("");
            try {
                if (guess.equals(strings[numGuess])) {
                    correctGuesses++;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                Display.showMessage("Out of attempts!");
                quickWord.t.interrupt();
                break;
            }

        }

    }
}


