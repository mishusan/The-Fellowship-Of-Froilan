package io.FoF;

public class Casino {

    public int game;
    public boolean stillInCasino;
    public Player player;

    public Casino(){
        game = 0;
        stillInCasino = true;
    }

    /**
     * Creates new player with attributes
     */
    public void createPlayer(){
        player = new Player();
        player.setName(Display.getStringPrompt("What is your name?: "));
        Display.welcome(player.getName());
        player.setAge(Display.getIntPrompt("What is your age?: "));
        checkAgeOfPlayer(player);
        player.setPurse(Display.getDoublePrompt("How much would you like to donate to the Fellowship of Froilan?: "));
    }

    public void runCasino(){
        createPlayer();
        while (stillInCasino) {
                gameSelectionOption();
                game = Display.getIntPrompt("What do you choose?: ");
                playerSelectsGame(game);
            }
        }

    public void checkAgeOfPlayer(Player player) {
        if (player.getAge() < 21) {
            Display.showMessage("Sorry! Too young to play. Nurudeen will escort you out.");
            Display.showMessage("But don't forget to come back in " + (21 - player.getAge()) + " years!");
            exitCasino();
        } else {
            Display.showMessage("\nLets Play!");
        }
    }

    public void gameSelectionOption() {
        Display.showMessage("\nChoose a Casino Game!: ");
        Display.showMessage("1: To play Black Jack");
        Display.showMessage("2: To play Sic Bo");
        Display.showMessage("3: To play Slots");
        Display.showMessage("4: To play Quick Words");
        Display.showMessage("5: To play Roulette");
        Display.showMessage("6: To exit");
    }

    public void playerSelectsGame( int game){
            switch (game) {
                case 1:
                    Blackjack blackjack = new Blackjack();
                    blackjack.playGame(player);
                    break;
                case 2:
                    SicBo sicBo = new SicBo();
                    sicBo.playGame(player);
                    break;
                case 3:
                    Slots slots = new Slots();
                    slots.playGame(player);
                    break;
                case 4:
                    QuickWord quickWord = new QuickWord();
                    quickWord.playGame(player);
                    break;
                case 5:
                    Roulette roulette = new Roulette();
                    roulette.playGame(player);
                    break;
                case 6:
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


