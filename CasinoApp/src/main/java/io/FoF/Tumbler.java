package io.FoF;

/**
 * Created by matthewb on 5/11/16.
 */


public class Tumbler {
    /**
     * initialize tumbler values
     */
    int tumbler1;
    int tumbler2;
    int tumbler3;
    int tumbler4;
    int tumbler5;

    public Tumbler() {
        tumbler1 = 0;
        tumbler2 = 0;
        tumbler3 = 0;
        tumbler4 = 0;
        tumbler5 = 0;
    }

    /**
     * setters for tumblers
     * @param tumbler1
     */
    public void setTumbler1(int tumbler1) {
        this.tumbler1 = tumbler1 %4;

    }

    public void setTumbler2(int tumbler2) {
        this.tumbler2 = tumbler2 %4;

    }

    public void setTumbler3(int tumbler3) {
        this.tumbler3 = tumbler3 %4;
    }

    public void setTumbler4(int tumbler4) {
        this.tumbler4 = tumbler4 %4;

    }

    public void setTumbler5(int tumbler5) {
        this.tumbler5 = tumbler5 %4;

    }

    /**
     *
     * @return tumbler values
     */
    public int getTumbler1() {
        return this.tumbler1;
    }

    public int getTumbler2() {
        return this.tumbler2;
    }

    public int getTumbler3() {
        return this.tumbler3;
    }

    public int getTumbler4() {
        return this.tumbler4;
    }

    public int getTumbler5() {
        return this.tumbler5;
    }

    public String getFace(int tumbler) {
        if (tumbler < 0) {
            tumbler = Math.abs((tumbler%4));
        }

        if (tumbler > 3) {
            tumbler = tumbler%4;
        }
        if (String.valueOf(tumbler).length() > 1) {
            return Integer.toString(tumbler);
        } else {
            return " " + Integer.toString(tumbler);
        }

    }


}
