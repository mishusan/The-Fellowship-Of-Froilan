package io.FoF;


public class Display {

    public static void main(String[] args) {
        Deck decker = new Deck();

        System.out.println(decker.dealNextCard().toString());
    }
}
