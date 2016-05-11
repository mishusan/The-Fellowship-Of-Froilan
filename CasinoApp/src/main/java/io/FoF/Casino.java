package io.FoF;

/**
 * Created by matthewb on 5/11/16.
 */
public class Casino {
    public int game;
    Display display = new Display();
    Player player = new Player();
    boolean stillInCasino = true;

    public void createPlayer(){

        player.setName(display.getStringPrompt("What is your name?"));
        player.setAge(display.getIntPrompt("what is your age?"));
        player.setPurse(display.getDoublePrompt("How much money would you like to throw away?"));
    }

    public void runCasino(){
        createPlayer();
        if (checkAge(player)){
            while(stillInCasino) {
                gameSelectionOption();
                game = display.getIntPrompt();
                gameSelection(game);
            }
        }else{
           display.showMessage("Goodbye!");
        }
        display.showMessage("Thanks for playing!");
    }

    public boolean checkAge(Player player){
        if (player.getAge() < 21){
            display.showMessage("Too young to play, Norodeen will escort you out!");
            return false;
        }else {
            display.showMessage("Lets Play!");
            return true;
        }
    }
    public void gameSelectionOption(){
        display.showMessage("Gameplay options: ");
        display.showMessage("To play Black Jack: press 1");
        display.showMessage("To play Sic Bo: press 2");
        display.showMessage("To play Slots: press 3");
        display.showMessage("To exit: press 4");
    }

    public void gameSelection(int game){
        switch (game){
            case 1: BlackJack blackJack = new BlackJack();
                blackJack.startGame(player);
                break;
            case 2: SicBo sicBo = new SicBo();
                sicBo.startGame(player);
                break;
            case 3: Slots slots =  new Slots();
                slots.startGame(player);
                break;
            case 4: exitCasino();
                break;
            default:
                display.showMessage("Sorry that is not an option.");
        }
    }

    public void exitCasino(){
        stillInCasino = false;
    }
}


