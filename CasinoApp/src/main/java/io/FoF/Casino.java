package io.FoF;

import java.util.ArrayList;

public class Casino {

    public int game;
    public boolean stillInCasino;
    public ArrayList<Player> playerArrayList;
    public int playerID;
    public Player currentPlayer;
    boolean memberOfCasino;
    public int numberOfMembers;

    public Casino() {
        this.game = 0;
        this.stillInCasino = true;
        this.playerArrayList = new ArrayList<Player>();
        this.playerID = 0;
        this.memberOfCasino = false;
        this.numberOfMembers = 0;
    }

    public void createPlayer() {
        Player player = new Player();
        player.setName(Display.getStringPrompt("What is your name?"));
        Display.welcome(player.getName());
        player.setAge(Display.getIntPrompt("What is your age?"));
        player.setPurse(Display.getDoublePrompt("How much money would you like to donate to fellowship of Froilan"));
        playerArrayList.add(player);
        numberOfMembers++;
    }

    public Player selectPlayer(int playerId) {
        return playerArrayList.get(playerId);
    }

    public void checkIfPlayerExists() {
        try {
            currentPlayer = selectPlayer(playerID);
        } catch (IndexOutOfBoundsException e) {
            Display.showMessage("PlayerID not found!");
            memberOfCasino = false;
            return;
        }
        memberOfCasino = true;
    }

    public void askPlayerId() {
        playerID = Display.getIntPrompt("Please type in your Player ID");
    }

    public void tellPlayerId() {
        Display.showMessage("Your Player ID is " + (numberOfMembers - 1));
    }

    public void runCasino() {
        createPlayer();
        tellPlayerId();
        while (!memberOfCasino) {
            askPlayerId();
            checkIfPlayerExists();
        }
        if (checkAge(currentPlayer)) {
            while (stillInCasino) {
                gameSelectionOption();
                game = Display.getIntPrompt("What do you choose?");
                gameSelection(game);
            }
        }
        else{
            Display.showMessage("Goodbye!");
        }
    }

    public boolean checkAge(Player player) {
        if (player.getAge() < 21) {
            Display.showMessage("Sorry! Too young to play. Norodeen will escort you out.");
            Display.showMessage("But don't forget to come back in " + (21 - player.getAge()) + " years!");
            return false;
        } else {
            Display.showMessage("Lets Play!");
            return true;
        }
    }

    public void gameSelectionOption() {
        Display.showMessage("Gameplay options: ");
        Display.showMessage("To play Black Jack: press 1");
        Display.showMessage("To play Sic Bo: press 2");
        Display.showMessage("To play Slots: press 3");
        Display.showMessage("To exit: press 4");
    }


        public void gameSelection ( int game){
            switch (game) {
                case 1:
                    Blackjack blackjack = new Blackjack(currentPlayer);
                    blackjack.startGame();
                    break;
                case 2:
                    SicBo sicBo = new SicBo();
                    sicBo.startGame(currentPlayer);
                    break;
                case 3:
                    Slots slots = new Slots();
                    slots.startGame(currentPlayer);
                    break;
                case 4:
                    exitCasino();
                    break;

                // ------------ DELETE THIS LATER
                case 5:
                    Roulette roulette = new Roulette();
                    roulette.startGame(currentPlayer);
                    break;
                default:
                    Display.showMessage("Sorry that is not an option.");
            }
        }


        public void exitCasino () {
            stillInCasino = false;
        }
    }


