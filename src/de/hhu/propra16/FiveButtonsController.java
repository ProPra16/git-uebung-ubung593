package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {

    @FXML private GridPane pane;

    @FXML private Label fileLabel;

    @FXML
    public void handleFileButton(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Textfiles", "*.txt"));
        File f = fc.showOpenDialog(pane.getScene().getWindow());

        if(f != null) {
            fileLabel.setText(f.getName());
        }
    }

}
