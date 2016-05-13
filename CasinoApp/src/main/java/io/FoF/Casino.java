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

<<<<<<< HEAD
    public Casino(){
        this.game = 0;
        this.stillInCasino=true;
        this.playerArrayList=new ArrayList<Player>();
        this.playerID =0;
        this.memberOfCasino = false;
        this.numberOfMembers=0;
    }
    public void createPlayer(){
        Player player = new Player();
        player.setName(Display.getStringPrompt("What is your name?"));
        Display.welcome(player.getName());
        player.setAge(Display.getIntPrompt("What is your age?"));
        playerArrayList.add(player);
        numberOfMembers ++;
    }
    public Player selectPlayer(int playerId){
        return playerArrayList.get(playerId);
    }
    public void checkIfPlayerExists(){
        try {
            currentPlayer=selectPlayer(playerID);
        }catch (IndexOutOfBoundsException e){
            Display.showMessage("PlayerID not found!");
            memberOfCasino = false;
            return;
        }
        memberOfCasino = true;
    }
    public void askPlayerId(){
        playerID = Display.getIntPrompt("Please type in your Player ID");
    }
    public void tellPlayerId(){
        Display.showMessage("Your Player ID is "+ (numberOfMembers-1));
    }
    public void runCasino(){
        createPlayer();
        tellPlayerId();
        while(!memberOfCasino){
          askPlayerId();
            checkIfPlayerExists();
        }
        if (checkAge(currentPlayer)){
            while(stillInCasino) {
                currentPlayer.setPurse(Display.getDoublePrompt("How much money would you like to donate to the fellowship of Froilan?"));
=======
    public void createPlayer() {

        player.setName(display.getStringPrompt("What is your name?"));
        player.setAge(display.getIntPrompt("what is your age?"));
        player.setPurse(display.getDoublePrompt("How much money would you like to throw away?"));
    }

    public void runCasino() {
        createPlayer();
        if (checkAge(player)) {
            while (stillInCasino) {
>>>>>>> origin/blackjack
                gameSelectionOption();
                game = Display.getIntPrompt("What do you choose?");
                gameSelection(game);
            }
<<<<<<< HEAD
        }else{
            Display.showMessage("Goodbye!");
=======
        } else {
            display.showMessage("Goodbye!");
>>>>>>> origin/blackjack
        }
    }
<<<<<<< HEAD
    public boolean checkAge(Player player){
        if (player.getAge() < 21){
            Display.showMessage("Sorry! Too young to play. Norodeen will escort you out.");
            Display.showMessage("But don't forget to come back in "+(21-player.getAge())+" years!");
            return false;
        }else {
            Display.showMessage("Lets Play!");
            return true;
        }
    }
    public void gameSelectionOption(){
        Display.showMessage("Gameplay options: ");
        Display.showMessage("To play Black Jack: press 1");
        Display.showMessage("To play Sic Bo: press 2");
        Display.showMessage("To play Slots: press 3");
        Display.showMessage("To exit: press 4");
    }
    public void gameSelection(int game){
        switch (game){
            case 1: Blackjack blackJack = new Blackjack(currentPlayer);
               blackJack.startGame();
               break;
            case 2: SicBo sicBo = new SicBo();
                sicBo.startGame(currentPlayer);
                break;
            case 3: Slots slots =  new Slots();
                slots.startGame(currentPlayer);
                break;
            case 4: exitCasino();
                Display.showMessage("Goodbye!");
=======

    public boolean checkAge(Player player) {
        if (player.getAge() < 21) {
            display.showMessage("Too young to play, Norodeen will escort you out!");
            return false;
        } else {
            display.showMessage("Lets Play!");
            return true;
        }
    }

    public void gameSelectionOption() {
        display.showMessage("Gameplay options: ");
        display.showMessage("To play Black Jack: press 1");
        display.showMessage("To play Sic Bo: press 2");
        display.showMessage("To play Slots: press 3");
        display.showMessage("To exit: press 4");
    }

    public void gameSelection(int game) {
        switch (game) {
            case 1:
                Blackjack blackjack = new Blackjack(player);
               blackjack.startGame();
                break;
            case 2:
                SicBo sicBo = new SicBo();
                break;
            case 3:
                Slots slots = new Slots();
                break;
            case 4:
                exitCasino();
>>>>>>> origin/blackjack
                break;
            default:
                Display.showMessage("Sorry that is not an option.");
        }
    }
<<<<<<< HEAD
    public void exitCasino(){
=======


    public void exitCasino() {
>>>>>>> origin/blackjack
        stillInCasino = false;
    }
}


