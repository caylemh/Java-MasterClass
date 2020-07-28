public class Main06 {
    public static void main(String[] args) {
        Bank bank = new Bank("Standard Bank");
        System.out.println("Welcome to " + bank.getName());

        bank.addBranch("Melville");
        bank.addCustomer("Melville", "Caylem",10.00);
        bank.addCustomer("Melville", "Mike",100.00);
        bank.addCustomer("Melville", "James",180.00);

        bank.addBranch("JHB");
        bank.addCustomer("JHB", "John",20.00);
        bank.addCustomer("JHB", "Louis",260.00);

        bank.addCustomerTransaction("Melville", "Caylem", 200.25);
        bank.addCustomerTransaction("Melville", "Caylem", 50.5);
        bank.addCustomerTransaction("Melville", "Caylem", 340.00);

        bank.addCustomerTransaction("Melville", "Mike", 100.0);
        bank.addCustomerTransaction("Melville", "James", 200.25);

        bank.listCustomers("Melville", false);
        bank.listCustomers("JHB", true);

        bank.addBranch("Roodepoort");

        if(!bank.addCustomer("Roodepoort","Brian", 30.00)) {
            System.out.println("\nError, Roodepoort branch does not exist!");
        }

        if(bank.addBranch("JHB")) {
            System.out.println("JHB Branch already exists!");
        }
    }
}
