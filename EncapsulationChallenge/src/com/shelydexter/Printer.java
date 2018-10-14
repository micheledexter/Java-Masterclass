package com.shelydexter;

public class Printer {

    private boolean isDuplex;
    private int pagesPrinted = 0;
    private Toner toner;
    private Paper paper;

    public Printer(boolean isDuplex) {
        this(isDuplex, 0, new Toner(), new Paper());
    }

    public Printer(boolean isDuplex, int pagesPrinted, Toner toner, Paper paper) {
        this.isDuplex = isDuplex;
        if (pagesPrinted >= 0) {
            this.pagesPrinted = pagesPrinted;
        } else {
            System.out.println("Printer: Invalid number of pages printed, setting default.");
        }
        this.toner = toner;
        this.paper = paper;
    }

    public void print(int pages) {
        if (isDuplex) {
            paper.use((pages / 2) + (pages % 2));
        } else {
            paper.use(pages);
        }
        toner.use(pages);
        this.pagesPrinted += pages;
    }

    public void showStatus() {
        System.out.println("Status: Printer is" + (isDuplex ? " " : " not ") + "a duplex");
        System.out.println("Status: Printed a total of " + this.pagesPrinted + " pages");
        System.out.println("Status: Toner level is at " + toner.getLevel() + "%");
        System.out.println("Status: " + paper.getSheets() + " sheets of paper remaining");
    }
}
