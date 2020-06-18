public class Burger {
    private String rollType;
    private String meatType;
    private double basePrice;
    private boolean hasLettuce;
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasSecretSauce;

    public Burger(String rollType, String meatType){
        this.rollType = rollType;
        this.meatType = meatType;
        this.basePrice = 30.00;
    }

    public Burger(String rollType, String meatType, boolean hasLettuce) {
        this(rollType, meatType);
        this.basePrice = 30.00;
        this.hasLettuce = hasLettuce;
    }

    public Burger(String rollType, String meatType, boolean hasLettuce, boolean hasCheese) {
        this(rollType,meatType,hasLettuce);
        this.basePrice = 30.00;
        this.hasCheese = hasCheese;
    }

    public Burger(String rollType, String meatType, boolean hasLettuce, boolean hasCheese, boolean hasTomato) {
        this(rollType,meatType,hasLettuce,hasCheese);
        this.basePrice = 30.00;
        this.hasTomato = hasTomato;
    }

    public Burger(String rollType, String meatType, boolean hasLettuce, boolean hasCheese, boolean hasTomato, boolean hasSecretSauce) {
        this(rollType,meatType,hasLettuce,hasCheese,hasTomato);
        this.basePrice = 30.00;
        this.hasSecretSauce = hasSecretSauce;
    }

    public String getRollType() {
        return rollType;
    }


    public String getMeatType() {
        return meatType;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    public boolean hasTomato() {
        return hasTomato;
    }

    public boolean hasSecretSauce() {
        return hasSecretSauce;
    }

    public double calculateFinalPrice() {
        System.out.println("Burger with: " + getRollType() + " & " + getMeatType() + " Patty -");
        double total = 0;
        if(hasLettuce) {
            total += 5.00;
            System.out.println("Lettuce added at R5.00...");
        }
        if(hasCheese) {
            total += 8.00;
            System.out.println("Cheese added at R8.00...");
        }
        if(hasTomato) {
            total += 12.00;
            System.out.println("Tomato added at R12.00...");
        }
        if(hasSecretSauce) {
            total += 15.00;
            System.out.println("Secret Sauce added at R15.00...");
        }
        total += basePrice;
        return total;
    }
}
