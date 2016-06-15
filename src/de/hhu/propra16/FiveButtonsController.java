package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    @FXML
    Button background;
    @FXML
    GridPane mainPane;

    @FXML
    public void changeBackground(){
        mainPane.setStyle("-fx-background: #0000FF");
    }
}
