package io.FoF;

/**
 * Created by matthewb on 5/14/16.
 */
public class Slots3 extends Slots {

    public Slots3(){
        this.typeOfSlotsChosen = true;
    }

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


    public Boolean checkIfTumblerRowIsAllTheSame(Tumbler tum) {
        if (tum.getTumbler1() == tum.getTumbler2() && tum.getTumbler1() == tum.getTumbler3()) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFour(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum1.getTumbler1() == tum2.getTumbler2() && tum1.getTumbler1() == tum3.getTumbler3()) {
            return true;
        }
        return false;
    }

    public Boolean checkForPaylineFive(Tumbler tum1, Tumbler tum2, Tumbler tum3) {
        if (tum3.getTumbler1() == tum2.getTumbler2() && tum3.getTumbler1() == tum1.getTumbler3()) {
            return true;
        }
        return false;
    }
}
