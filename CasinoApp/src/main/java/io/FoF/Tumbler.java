package io.FoF;

/**
 * Created by matthewb on 5/11/16.
 */
public class Tumbler {

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

    public void setTumbler1(int tumbler1) {
        this.tumbler1 = tumbler1;
        if (tumbler1 > 8) {
            this.tumbler1 -= 8;
        }
    }

    public void setTumbler2(int tumbler2) {
        this.tumbler2 = tumbler2;
        if (tumbler2 > 8) {
            this.tumbler2 -= 8;
        }
    }

    public void setTumbler3(int tumbler3) {
        this.tumbler3 = tumbler3;
        if (tumbler3 > 8) {
            this.tumbler3 -= 8;
        }
    }

    public void setTumbler4(int tumbler4) {
        this.tumbler4 = tumbler4;
        if (tumbler4 > 8) {
            this.tumbler4 -= 8;
        }
    }

    public void setTumbler5(int tumbler5) {
        this.tumbler5 = tumbler5;
        if (tumbler5 > 8) {
            this.tumbler5 -= 8;
        }
    }

    public int getTumbler1() {
        return tumbler1;
    }

    public int getTumbler2() {
        return tumbler2;
    }

    public int getTumbler3() {
        return tumbler3;
    }

    public int getTumbler4() {
        return tumbler4;
    }

    public int getTumbler5() {
        return tumbler5;
    }

    public String getFace(int tumbler) {
        if (tumbler < 0) {
            tumbler += 8;
        }

        if (tumbler > 10) {
            tumbler -= 8;
        }
        if (String.valueOf(tumbler).length() > 1) {
            return Integer.toString(tumbler);
        } else {
            return " " + Integer.toString(tumbler);
        }

    }


}
