package io.FoF;


public class Player {
    private String name;
    private double purse;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurse() {
        return this.purse;
    }

    public void setPurse(double purse) {
        this.purse = purse;
    }

    public void removeMoneyFromPurse(double dollar) {
        setPurse(purse - dollar);
    }
    public void addMoneyToPurse(double dollar) {
        setPurse(purse + dollar);
    }

}

