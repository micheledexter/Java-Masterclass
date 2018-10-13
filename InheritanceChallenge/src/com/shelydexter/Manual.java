package com.shelydexter;

public class Manual extends Car {

    private int gear;

    public Manual() {
        this(1);
    }

    public Manual(int gear) {
        this(0, "Manual", gear);
    }

    public Manual(int speed, String steering, int gear) {
        super(speed, steering);
        this.gear = gear;
        System.out.println("Manual created with speed " + speed + ", " + steering + " steering and is in gear " + gear);
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Manual put into gear " + gear);
    }

    public void shiftUp(int shift) {
        if (this.gear + shift <= 6) {
            this.gear += shift;
            System.out.println("Shifted up " + shift + " gears to " + this.gear);
        } else {
            System.out.println("Cannot shift up " + shift + "gears, exceeds 6");
        }
    }

    public void shiftDown(int shift) {
        if (this.gear - shift >= 1) {
            this.gear -= shift;
            System.out.println("Shifted down " + shift + " gears to " + this.gear);
        } else {
            System.out.println("Cannot shift down " + shift + "gears, no gear 0");
        }
    }

    @Override
    public String getStatus() {
        return "Manual is going " + getSpeed() + " distance per time, has " + getSteering() + " steering and is in gear " + getGear();
    }
}
