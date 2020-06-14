package sample;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {
    @FXML
    private MenuItem addNewItem;
    @FXML
    private MenuItem editItem;
    @FXML
    private MenuItem delItem;

    @FXML
    public void handleAddContact() {
        System.out.println("Add Item Clicked!");
    }

    @FXML
    public void handleEditContact() {
        System.out.println("Edit Item Clicked!");
    }

    @FXML
    public void handleDeleteContact() {
        System.out.println("Delete Item Clicked!");
    }
}
