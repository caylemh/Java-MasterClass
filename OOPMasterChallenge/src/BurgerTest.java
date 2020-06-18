public class BurgerTest {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Wheat Roll","Beef");
        System.out.println("-- Total Price: R" + burger1.calculateFinalPrice() + " --\n");

        Burger burger2 = new Burger("Wheat Roll", "Beef", true,true);
        System.out.println("-- Total Price: R" + burger2.calculateFinalPrice() + " --\n");

        Burger burger3 = new Healthy("Black Bean",false,false,true,true,
                true,false);
        System.out.println("-- Total Price: R" + burger3.calculateFinalPrice() + " --\n");

        Burger burger4 = new Deluxe("Prego Roll", "Beef");
        System.out.println("-- Total Price: R" + burger4.calculateFinalPrice() + " --\n");

        Burger burger5 = new Burger("Prego Roll", "Beef",true,
                true,true,true);
        System.out.println("-- Total Price: R" + burger5.calculateFinalPrice() + " --\n");
    }
}
