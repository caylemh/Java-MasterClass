import java.util.Scanner;

public class Main05 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("083 234 5567");
    public static void main(String[] args) {
        boolean quit= false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new Contact name: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Enter phone number: ");
        String phoneNum = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNum);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact added: name = " + name + ", phone = " + phoneNum);
        } else {
            System.out.println("Cannot add, " + name + " already on file!");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine().toLowerCase();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Enter new Contact name: ");
        String newName = scanner.nextLine().toLowerCase();
        System.out.println("Enter new Contact phone number: ");
        String newNum = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNum);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Contact successfully updated!");
        } else {
            System.out.println("Error updating record!");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine().toLowerCase();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error deleting contact!");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine().toLowerCase();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNum());
    }

    private static void startPhone() { System.out.println("Starting phone..."); }

    private static void printActions() {
        System.out.println("Available actions:\npress");
        System.out.println("\t0 - To Shutdown\n" +
                "\t1 - To print Contacts\n" +
                "\t2 - Add a new Contact\n" +
                "\t3 - Update an existing Contact\n" +
                "\t4 - Remove a Contact\n" +
                "\t5 - Query if an existing Contact exists\n" +
                "\t6 - Print the list of available actions");
        System.out.println("Choose you action: ");
    }
}
