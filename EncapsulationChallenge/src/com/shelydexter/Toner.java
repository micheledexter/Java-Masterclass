package com.shelydexter;

public class Toner {

    private int level = 100;

    public Toner() {
        this(100);
    }

    public Toner(int level) {
        if (level > 0 && level <= 100) {
            this.level = level;
        } else {
            System.out.println("Toner: Invalid toner level, replacing with full toner.");
        }
    }

    public void refill() {
        System.out.println("Toner: Refilling...");
        this.level = 100;
    }

    public void use(int amount) {
        System.out.println("Toner: Print job requires " + amount + "% of the toner, " + getLevel() + "% remaining.");
        if (this.level - amount < 0) {
            int over = Math.abs(this.level - amount);
            refill();
            use(over);
        } else {
            this.level -= amount;
        }
    }

    public int getLevel() {
        return this.level;
    }
}
