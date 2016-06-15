package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    @FXML Button alert;

     public void alert(){
         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setContentText("Too many Buttons");
         alert.show();
     }
}
