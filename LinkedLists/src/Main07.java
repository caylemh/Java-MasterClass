import java.util.ArrayList;

public class Main07 {

    public static void main(String[] args) {
//         -- Explanation of LinkedList Concepts --
        Customer customer = new Customer("Caylem", 120.67);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(220.56);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " +intList.get(i));
        }

        intList.add(1,2);
        System.out.println();

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " +intList.get(i));
        }
    }
}
