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

    public QuickWord() {
        threadQuickWord = "newQuickWordThread";
        this.pot = 0;
        this.correctGuesses = 0;
        this.strings = new String[21];
        this.strings[0] = "x";
        this.strings[1] = "y";
        this.strings[2] = "z";
        this.strings[3] = "x";
        this.strings[4] = "x";
        this.strings[5] = "z";
        this.strings[6] = "z";
        this.strings[7] = "y";
        this.strings[8] = "x";
        this.strings[8] = "q";
        this.strings[9] = "f";
        this.strings[10] = "e";
        this.strings[11] = "l";
        this.strings[12] = "l";
        this.strings[13] = "o";
        this.strings[14] = "w";
        this.strings[15] = "s";
        this.strings[16] = "h";
        this.strings[17] = "i";
        this.strings[18] = "p";
        this.strings[19] = "of";
        this.strings[20] = "Froilan";


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

    public void startGame(Player player) {
        bet = Display.getDoublePrompt("How much are you betting?");
        if (checkAmountInPurse(player, bet)) {
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


