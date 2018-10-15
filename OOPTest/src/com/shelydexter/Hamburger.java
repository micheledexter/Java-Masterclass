package com.shelydexter;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private Addition firstAddition = null;
    private Addition secondAddition = null;
    private Addition thirdAddition = null;
    private Addition fourthAddition = null;

    public Hamburger() {
        this("Sesame", "Beef", 3.00);
    }

    public Hamburger(String breadRollType, String meat, double price) {
        this.name = getClass().getSimpleName();
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setFirstAddition()

    public double getAdditionTotal {

    }
}
