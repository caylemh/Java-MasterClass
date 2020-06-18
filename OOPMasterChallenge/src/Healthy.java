public class Healthy extends Burger {
    private boolean hasQuinoa;
    private boolean hasVeganMayo;

    public Healthy(String meatType, boolean hasLettuce, boolean hasCheese,
                   boolean hasTomato, boolean hasSecretSauce, boolean hasQuinoa, boolean hasVeganMayo) {

        super("Brown Rye Bread Roll", meatType, hasLettuce, hasCheese, hasTomato, hasSecretSauce);
        this.hasQuinoa = hasQuinoa;
        this.hasVeganMayo = hasVeganMayo;

    }

    @Override
    public double calculateFinalPrice() {
        System.out.print(getClass().getSimpleName() + " ");
        double total = super.calculateFinalPrice();

        if(hasQuinoa) {
            total += 15.00;
            System.out.println("Quinoa added at R15.00...");
        }
        if(hasVeganMayo) {
            total += 25.00;
            System.out.println("Vegan Mayo added at R25.00...");
        }
        return total;
    }
}
