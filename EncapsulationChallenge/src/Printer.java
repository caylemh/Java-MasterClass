public class Printer {
    private int tonerLevel;
    private int maxPagePrints;
    private boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter) {
        this.tonerLevel = 100;
        this.maxPagePrints = 1500;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getMaxPagePrints() {
        return maxPagePrints;
    }

    public void setMaxPagePrints(int maxPagePrints) {
        this.maxPagePrints = maxPagePrints;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    public void printPage(int pagesToPrint) {
        if(tonerLevel > 21 && tonerLevel <= 100 ) {
            maxPagePrints -= pagesToPrint;
            tonerLevel -= (int)(pagesToPrint/15);
            System.out.println("\n------------------------------" +
                                "\nPrinting " + pagesToPrint + " pages..." +
                                "\nToner Level: " + tonerLevel);
        } else if(tonerLevel > 0 && tonerLevel <=20) {
            System.out.println("\n------------------------------" +
                                "\nToner low! Please Replace Toner!");
            if(pagesToPrint > tonerLevel) {
                System.out.println("Unable to print. Number of pages exceeds toner level!");
            } else {
                tonerLevel -= pagesToPrint;
                System.out.println("Printing " + pagesToPrint + " pages..." +
                        "\nToner Level: " + tonerLevel);
            }
        } else {
            System.out.println("\n------------------------------" +
                                "\nReplace Toner!");
        }
    }

    public void getPrinterDetails() {
        System.out.println("Duplex Printer: " + isDuplexPrinter);
        System.out.println("Max print pages per toner: " + maxPagePrints);
        System.out.println("Toner Level: " + tonerLevel);
    }
}
