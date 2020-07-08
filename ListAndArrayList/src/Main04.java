import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.print("\nEnter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To copy an array to another array.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void printItems() {
            groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.print("\nPlease enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine().toLowerCase());
    }

    public static void modifyItem() {
        System.out.print("\nCurrent item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter the replacement item: ");
        String newItem = scanner.nextLine().toLowerCase();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("\nEnter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void findItem() {
        System.out.print("\nEnter item to search for: ");
        String searchItem = scanner.nextLine().toLowerCase();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your grocery list.");
        } else {
            System.out.println("Item not found in the list!");
        }
    }

    public static void processArrayList() {
        // Option 1 to copy an array
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

        // Option 2 to opy an array (at initialization)
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
        System.out.println(nextArray);

        // Option 3 to copy an array (converting to a regular array)
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        for(String item: myArray) {
            System.out.println(item);
        }
    }
}



