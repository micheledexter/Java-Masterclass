package com.shelydexter;

public class Addition {

    private int quantity;
    private String name;
    private double price = 0.50;

    public Addition() {
        this(1);
    }

    public Addition(int quantity) {
        this.quantity = quantity;
        this.name = getClass().getSimpleName();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getTotal() {
        return (double) quantity * price;
    }

    public double getPrice() {
        return price;
    }
}

class Nothing extends Addition {

    public Nothing() {
        super(0);
    }
}

class Lettuce extends Addition {

    public Lettuce() {
        super();
    }

    public Lettuce(int quantity) {
        super(quantity);
    }
}

class Tomato extends Addition {

    public Tomato() {
        super();
    }

    public Tomato(int quantity) {
        super(quantity);
    }
}

class Pickle extends Addition {

    public Pickle() {
        super();
    }

    public Pickle(int quantity) {
        super(quantity);
    }
}