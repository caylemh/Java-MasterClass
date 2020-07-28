import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(Branch checkedBranch: this.branches) {
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("\nCustomer details for branch: " + branch.getName() + "\n");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(Customer branchCustomer: branchCustomers) {
                System.out.println("\tCustomer: " + branchCustomer.getName() + "[" +
                        ((branchCustomers.indexOf(branchCustomer))+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int i=0; i<transactions.size(); i++) {
                        System.out.println("\t[" + (i+1) + "] Amount --> " + transactions.get(i));
                    }
                    System.out.print("\n");
                }
            }
            return true;
        } else {
            return false;
        }

    }


}
