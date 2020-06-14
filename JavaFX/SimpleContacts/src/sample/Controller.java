package sample;

import javafx.application.Platform;
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
    private MenuItem exitProg;

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

    @FXML
    public void handleExit() {
        System.out.println("Exiting Program!");
        Platform.exit();
    }
}
