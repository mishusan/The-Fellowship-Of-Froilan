package io.FoF;

/**
 * Created by matthewb on 5/14/16.
 */
public class Slots3 extends Slots {

    public Slots3(){
        this.typeOfSlotsChosen = true;
    }

    /**
     * Handles formatting and displaying the tumbler faces
     */
    public void sendDisplayResultsAll() {

        Display.showMessage("_____________________________");
        for(Tumbler tum : allTumblers) {
            Display.showMessage(
                    "| " + tum.getFace(tum.getTumbler1()) + " | "
                            + tum.getFace(tum.getTumbler2()) + " | "
                            + tum.getFace(tum.getTumbler3()) + " |");
        }
        Display.showMessage("_____________________________");
    }

    /**
     * handles the logic for differnt win conditions
     * @param tum
     * @return Row win conditions
     */
    public Boolean checkIfTumblerRowIsAllTheSame(Tumbler tum) {
        if (tum.getTumbler1() == tum.getTumbler2() && tum.getTumbler1() == tum.getTumbler3()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return Payline 4 win conditions
     */
    public Boolean checkForPaylineFour(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum1.getTumbler1() == tum2.getTumbler2() && tum1.getTumbler1() == tum3.getTumbler3()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return Payline 5 win conditions
     */
    public Boolean checkForPaylineFive(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum3.getTumbler1() == tum2.getTumbler2() && tum3.getTumbler1() == tum1.getTumbler3()) {
            return true;
        }
        return false;
    }
}
