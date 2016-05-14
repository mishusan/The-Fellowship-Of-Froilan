package io.FoF;

/**
 * Created by matthewb on 5/14/16.
 */
public class QuickWord extends Game{


    public void startGame(Player player) {
        String[] strings = new String[3];
        strings[0] = "X";
        strings[1] = "Y";
        strings[2] = "Z";
        Display.pausedShowMessage(strings);
    }
}
