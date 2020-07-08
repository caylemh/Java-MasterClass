import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        if (groceryList.size() != 0) {
            System.out.println("\nYou have " + groceryList.size() + " items in your grocery list.");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i + 1 + ". " + groceryList.get(i));
            }
        } else System.out.println("No items in the list! Please add items!");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position>=0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("\n** Grocery item " + (position+1) + " has been modified. **");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position>=0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("\n** Grocery item " + (position+1) + " has been deleted. **");
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position>=0) {
            return true;
        }

        return false;
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
