package io.FoF;

/*
* Created by Nurudeen Lawal
*/

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Display {


    /**
     * Return full greeting with logo
     */
    static void welcome(String name) {
        System.out.println("\nHello, " + name + " and WELCOME to the FoF casino.\nWe thank you for all your donations to the Fellowship.\n");
        showLogo();
        showSword();
    }
    static void showLogo(){
        System.out.println(" /$$$$$$$$        /$$ /$$                                   /$$       /$$                \n" +
                "| $$_____/       | $$| $$                                  | $$      |__/                \n" +
                "| $$     /$$$$$$ | $$| $$  /$$$$$$  /$$  /$$  /$$  /$$$$$$$| $$$$$$$  /$$  /$$$$$$       \n" +
                "| $$$$$ /$$__  $$| $$| $$ /$$__  $$| $$ | $$ | $$ /$$_____/| $$__  $$| $$ /$$__  $$      \n" +
                "| $$__/| $$$$$$$$| $$| $$| $$  \\ $$| $$ | $$ | $$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$      \n" +
                "| $$   | $$_____/| $$| $$| $$  | $$| $$ | $$ | $$ \\____  $$| $$  | $$| $$| $$  | $$      \n" +
                "| $$   |  $$$$$$$| $$| $$|  $$$$$$/|  $$$$$/$$$$/ /$$$$$$$/| $$  | $$| $$| $$$$$$$/      \n" +
                "|__/    \\_______/|__/|__/ \\______/  \\_____/\\___/ |_______/ |__/  |__/|__/| $$____/       \n" +
                "                                                                         | $$            \n" +
                "                                                                         | $$            \n" +
                "                                                                         |__/            \n" +
                "                                                /$$$$$$                                  \n" +
                "                                               /$$__  $$                                 \n" +
                "                                      /$$$$$$ | $$  \\__/                                 \n" +
                "                                     /$$__  $$| $$$$                                     \n" +
                "                                    | $$  \\ $$| $$_/                                     \n" +
                "                                    | $$  | $$| $$                                       \n" +
                "                                    |  $$$$$$/| $$                                       \n" +
                "                                     \\______/ |__/                                       \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                   /$$$$$$$$                  /$$ /$$                                    \n" +
                "                  | $$_____/                 |__/| $$                                    \n" +
                "                  | $$     /$$$$$$   /$$$$$$  /$$| $$  /$$$$$$  /$$$$$$$                 \n" +
                "                  | $$$$$ /$$__  $$ /$$__  $$| $$| $$ |____  $$| $$__  $$                \n" +
                "                  | $$__/| $$  \\__/| $$  \\ $$| $$| $$  /$$$$$$$| $$  \\ $$                \n" +
                "                  | $$   | $$      | $$  | $$| $$| $$ /$$__  $$| $$  | $$                \n" +
                "                  | $$   | $$      |  $$$$$$/| $$| $$|  $$$$$$$| $$  | $$                \n" +
                "                  |__/   |__/       \\______/ |__/|__/ \\_______/|__/  |__/           ");
    }
    static void showSword(){
        System.out.println("  *            /  /________________________________________________\n" +
                " (O)77777777777)  7                                                `~~--__\n" +
                "8OO>>>>>>>>>>>>] <===   CASINO                                          __-\n" +
                " (O)LLLLLLLLLLL)  L________________________________________________.--~~\n" +
                "  *            \\  \\\n" +
                "                \\__>\n" +
                "\n" +
                "\n");
    }


    /*Used to output any non variable Strings/Integers/Doubles*/
    static void showMessage(String message) {
        System.out.println(message);
    }

    static void showMessage(int message) {
        System.out.println(message);
    }

    static void showMessage(double message) {
        System.out.println(message);
    }

    /**
     * Prints the various betting tables for the games of chance
     */
    public void printSicBoTable(){
        System.out.println("\nPlease refer to the new window for betting instructions");
        JFrame frame = new JFrame();
        ImageIcon sicBoTable = new ImageIcon("src/SicBoTable.png");
        frame.add(new JLabel(sicBoTable));
        frame.pack();
        frame.setVisible(true);
    }

    public void printRouletteTable(){
        System.out.println("\nPlease refer to the new window for betting instructions");
        JFrame frame = new JFrame();
        ImageIcon rouletteTable = new ImageIcon("src/RouletteTable.jpg");
        frame.add(new JLabel(rouletteTable));
        frame.pack();
        frame.setVisible(true);
    }

    public void printSlotsPayline(){
        System.out.println("\nPlease refer to the new window for betting instructions");
        JFrame frame = new JFrame();
        ImageIcon slotsPayline = new ImageIcon("src/SlotsPayline.gif");
        frame.add(new JLabel(slotsPayline));
        frame.pack();
        frame.setVisible(true);
    }


    /*++++++++++++++++++++++++++++++++++++++++++++++++++INPUT FROM USER+++++++++++++++++++++++++++++++++++++++++++++++*/
    /*
    *This creates the scanner object and takes in the input of all  data types to be expected
    **/
    static Scanner input = new Scanner(System.in);

    static void printMessage(String msg) {
        System.out.print(msg);
    }

    static int getIntPrompt(String promptMsg) {
        int userInput = 0;
        while (true) {
            printMessage(promptMsg);
            try {
                userInput = input.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("I need an integer please");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Illegal Option");
            }
            if (input.hasNextLine()) {
                input.nextLine();
            }
        }
        return userInput;
    }

    static String getStringPrompt(String promptMsg) {
        printMessage(promptMsg);
        String userInput = "";
        while (true) {
            try {
                userInput = input.next();
                if (input.hasNextLine()) {
                    input.nextLine();
                }
                return userInput;

            } catch (IllegalArgumentException e) {
                System.out.println("I need an string please");
            }
        }
    }

    static double getDoublePrompt(String promptMsg) {
        printMessage(promptMsg);
        double userInput = 0.0;
        while (true) {
            try {
                userInput = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("I need an double please");
            }catch(IndexOutOfBoundsException e){
                System.out.println("That isn't one of the options");
            }
            if (input.hasNextLine()) {
                input.nextLine();
            }
        }
        return userInput;
    }

}