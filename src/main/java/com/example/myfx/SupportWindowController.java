package com.example.myfx;

/**
 * @author Merkulov A
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SupportWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView logo;

    @FXML
    private Button employeesButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button mainButton;

    @FXML
    private Button statisticsButton;

    @FXML
    private Button supportButton;

    @FXML
    private Button warehouseButton;

    @FXML
    void initialize() {
//        logo = new ImageView("C:\\Users\\Alexey\\Desktop\\myfx\\src\\main\\java\\com\\example\\myfx\\assets\\logo.png"); //TODO: !@!
//        assert coffee_logo != null : "fx:id=\"coffee_logo\" was not injected: check your FXML file 'supportWindow.fxml'.";

//        assert employeesButton != null : "fx:id=\"employeesButton\" was not injected: check your FXML file 'supportWindow.fxml'.";

        employeesButton.setOnAction(event -> {
            System.out.println("You pressed \"Сотрудники\" button");
            openNewWindow("employeesWindow.fxml");
        });

//        assert historyButton != null : "fx:id=\"historyButton\" was not injected: check your FXML file 'supportWindow.fxml'.";
//        assert mainButton != null : "fx:id=\"mainButton\" was not injected: check your FXML file 'supportWindow.fxml'.";

        mainButton.setOnAction(event -> {
            System.out.println("You pressed \"Главная\" button");
            openNewWindow("mainWindow.fxml");
        });

//        assert statisticsButton != null : "fx:id=\"statisticsButton\" was not injected: check your FXML file 'supportWindow.fxml'.";
//        assert warehouseButton != null : "fx:id=\"warehouseButton\" was not injected: check your FXML file 'supportWindow.fxml'.";

        warehouseButton.setOnAction(event -> {
            System.out.println("You pressed \"Склад\" button");
            openNewWindow("warehouseWindow.fxml");
        });
    }
    public void openNewWindow(String window) {
        mainButton.getScene().getWindow();

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


