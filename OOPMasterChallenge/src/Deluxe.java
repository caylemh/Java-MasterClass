public class Deluxe extends Burger {
    private boolean hasChips;
    private boolean hasDrinks;

    public Deluxe(String rollType, String meatType) {
        super(rollType, meatType, false, false, false, false);
        this.hasChips = true;
        this.hasDrinks = true;
    }

    @Override
    public double calculateFinalPrice() {
        System.out.print(getClass().getSimpleName() + " ");
        double total = super.calculateFinalPrice();

        total = total + 50.00;
        System.out.println("Chips added at R20.00...\nDrinks added at R30.00...");
        return total;
    }
}
