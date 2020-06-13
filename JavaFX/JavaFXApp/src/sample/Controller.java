package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridpane;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser();
//        chooser.setTitle("Save application file");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text","*.txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
//        DirectoryChooser chooser = new DirectoryChooser();
        List<File> file = chooser.showOpenMultipleDialog(gridpane.getScene().getWindow());
        if(file != null) {
            for(File item: file) {
                System.out.println(item.getPath());
            }
//            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled!");
        }
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleLinkClick() {
        System.out.println("The link was clicked");
    }
}
