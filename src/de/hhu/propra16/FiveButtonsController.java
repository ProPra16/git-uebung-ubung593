package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {

    @FXML private Label fileLabel;

    @FXML private AnchorPane ap;

    @FXML
    public void handleFileButton(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("txt"));
        File f = fc.showOpenDialog(ap.getScene().getWindow());

        fileLabel.setText(f.getName());
    }

}
