
public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(true);
        printer.getPrinterDetails();

        printer.printPage(1000);
        printer.printPage(80);
        printer.printPage(400);
        printer.printPage(10);
        printer.printPage(3);
        printer.printPage(5);

        printer.setTonerLevel(100);
        System.out.println("\nNew Toner Installed! Toner level: " + printer.getTonerLevel());
        System.out.println("Number of Pages in Printer: " + printer.getMaxPagePrints());

    }
}
