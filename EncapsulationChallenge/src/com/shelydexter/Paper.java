package com.shelydexter;

public class Paper {

    public int sheets = 20;

    public Paper() {
        this(20);
    }

    public Paper(int sheets) {
        if (sheets > 0 && sheets <= 20) {
            this.sheets = sheets;
        } else {
            System.out.println("Paper: Invalid paper quantity, using default amount.");
        }
    }

    public void refill() {
        System.out.println("Paper: Refilling...");
        this.sheets = 20;
    }

    public void use(int quantity) {
        System.out.println("Paper: Print job requires " + quantity + " sheets of paper, " + getSheets() + " sheets remaining.");
        if (this.sheets - quantity < 0) {
            int over = Math.abs(this.sheets - quantity);
            refill();
            use(over);
        } else {
            this.sheets -= quantity;
        }
    }

    public int getSheets() {
        return this.sheets;
    }
}
