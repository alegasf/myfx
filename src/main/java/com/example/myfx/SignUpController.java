package com.example.myfx;

/**
 * @author Merkulov A
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpNameField;

    @FXML
    private PasswordField signUpPasswordField;

    @FXML
    private Button signUp_SignUpButton;

    @FXML
    void initialize() {
        System.out.println("Initialize SignUpWindow");

        signUp_SignUpButton.setOnAction(event -> {

            signUpNewUser();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String name = signUpNameField.getText();
        String password = signUpPasswordField.getText();

        User user = new User(name, password);

        dbHandler.userSignUp(user);
    }

}
