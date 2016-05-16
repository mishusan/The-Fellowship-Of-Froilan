package io.FoF;

import java.util.Random;

/**
 * Created by minlee on 5/11/16.
 */
public class Dice {

    private int diceValue;

    private String diceArt[] = {"-------\n" +
                                "|     |\n" +
                                "|  o  |\n" +
                                "|     |\n" +
                                "-------",
                                "-------\n" +
                                "|o    |\n" +
                                "|     |\n" +
                                "|    o|\n" +
                                "-------",
                                "-------\n" +
                                "|o    |\n" +
                                "|  o  |\n" +
                                "|    o|\n" +
                                "-------",
                                "-------\n" +
                                "|o   o|\n" +
                                "|     |\n" +
                                "|o   o|\n" +
                                "-------",
                                "-------\n" +
                                "|o   o|\n" +
                                "|  o  |\n" +
                                "|o   o|\n" +
                                "-------",
                                "-------\n" +
                                "|o   o|\n" +
                                "|o   o|\n" +
                                "|o   o|\n" +
                                "-------\n"};


    public Dice() {
        roll();
    }

    public int diceValue() {
        return diceValue;
    }

    public String getDiceFace(){
        return diceArt[diceValue()-1];

    }
    public void roll() {
        Random random = new Random();
        diceValue = random.nextInt(6) + 1;
    }

}
