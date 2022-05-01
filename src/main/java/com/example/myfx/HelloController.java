package com.example.myfx;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.myfx.animations.ButtonOnClick;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button startSignInButton;

    @FXML
    private Button startSignUpButton;

    @FXML
    void initialize() {

        startSignInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if (!loginText.equals("") && !loginPassword.equals("")) {
                loginUser(loginText, loginPassword);
            } else {
                System.out.println("Login or Pass is empty.");
            }
        });

        startSignUpButton.setOnAction(event -> {
            openNewWindow("signUpWindow.fxml");
        });
    }

    private void loginUser(String loginText, String loginPassword) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setName(loginText);
        user.setPassword(loginPassword);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        try {
            while (result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            System.out.println("SQL result exception");
        }

        if (counter >= 1) {
            System.out.println("Log In successfully");
            openNewWindow("mainWindow.fxml");
        } else {
            System.out.println("Log In failure");
            ButtonOnClick loginUserAnimation = new ButtonOnClick(login_field);
            ButtonOnClick passwordUserAnimation = new ButtonOnClick(password_field);
            loginUserAnimation.playAnimation();
            passwordUserAnimation.playAnimation();
        }

        //TODO: user login method
    }
    public void openNewWindow(String window) {
        startSignUpButton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setTitle("Magic Coffee");
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
