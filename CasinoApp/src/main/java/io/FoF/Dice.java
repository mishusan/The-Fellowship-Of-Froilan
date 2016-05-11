package io.FoF;

import java.util.Random;

/**
 * Created by minlee on 5/11/16.
 */
public class Dice {

    private int diceValue;

    private String diceASCII;

    public Dice(){
        roll();
    }

    public int diceValue(){
        return diceValue;
    }

    public void roll(){
        Random random = new Random();
        diceValue = random.nextInt(6)+1;
    }

}
