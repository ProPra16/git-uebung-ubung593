package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {

    @FXML private Label timeLabel;

    @FXML
    protected void handleTimeButtonAction(ActionEvent event) {
        timeLabel.setText(LocalTime.now().toString());
    }
}
