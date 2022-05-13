package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddedUser {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane addedUserWindow;

    @FXML
    private Button okButton;

    @FXML
    void initialize() {

    }

    @FXML
    public void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

}

