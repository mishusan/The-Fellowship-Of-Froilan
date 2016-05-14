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

    public Casino(){
        this.game = 0;
        this.stillInCasino = true;
        this.playerArrayList = new ArrayList<Player>();
        this.playerID = 0;
        this.memberOfCasino = false;
        this.numberOfMembers = 0;
    }

    public void createPlayer(){
        Player player = new Player();
        player.setName(Display.getStringPrompt("What is your name?"));
        Display.welcome(player.getName());
        player.setAge(Display.getIntPrompt("What is your age?"));
        checkAgeOfPlayer(player);
        playerArrayList.add(player);
        numberOfMembers++;
    }
    public Player selectPlayer(int playerId) {
        return playerArrayList.get(playerId);
    }
    public void checkIfPlayerExistsInArray() {
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
    public void runCasino(){
        createPlayer();
        tellPlayerId();
        while (!memberOfCasino) {
            askPlayerId();
            checkIfPlayerExistsInArray();
        }
        currentPlayer.setPurse(Display.getDoublePrompt("How much would you like to donate to the Fellowship of Froilan?"));
        while (stillInCasino) {
                gameSelectionOption();
                game = Display.getIntPrompt("What do you choose?");
                playerSelectsGame(game);
            }
        }
    public void checkAgeOfPlayer(Player player) {
        if (player.getAge() < 21) {
            Display.showMessage("Sorry! Too young to play. Norodeen will escort you out.");
            Display.showMessage("But don't forget to come back in " + (21 - player.getAge()) + " years!");
            exitCasino();
        } else {
            Display.showMessage("Lets Play!");
        }
    }
    public void gameSelectionOption() {
        Display.showMessage("Gameplay options: ");
        Display.showMessage("To play Black Jack: press 1");
        Display.showMessage("To play Sic Bo: press 2");
        Display.showMessage("To play Slots: press 3");
        Display.showMessage("To play Quick Words: press 4");
        Display.showMessage("To exit: press 5");
    }
    public void playerSelectsGame( int game){
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
                case 4:
                    QuickWord quickWord = new QuickWord();
                    quickWord.startGame(currentPlayer);
                    break;
                case 5:
                    exitCasino();
                    break;
                default:
                    Display.showMessage("Sorry that is not an option.");
            }
    }
    public void exitCasino () {
            stillInCasino = false;
            Display.showMessage("Goodbye!");
            System.exit(0);
        }
    }


