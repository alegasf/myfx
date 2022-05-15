package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
//        mainButton.setOnAction(event -> System.out.println("You pressed \"Главная\" button"));
//        historyButton.setOnAction(event -> System.out.println("You pressed \"Историй\" button"));            TODO: History button
//        statisticsButton.setOnAction(event -> System.out.println("You pressed \"Статистика\" button"));      TODO: Statistics button
//        warehouseButton.setOnAction(event -> System.out.println("You pressed \"Склад\" button"));

        warehouseButton.setOnAction(event -> {
            System.out.println("You pressed \"Склад\" button");
            openNewWindow("warehouseWindow.fxml");
        });

//        employeesButton.setOnAction(event -> System.out.println("You pressed \"Сотрудники\" button"));

        employeesButton.setOnAction(event -> {
            System.out.println("You pressed \"Сотрудники\" button");
            openNewWindow("employeesWindow.fxml");
        });

//        supportButton.setOnAction(event -> System.out.println("You pressed \"Support\" button"));

        supportButton.setOnAction(event -> {
            System.out.println("You pressed \"Support\" button");
            openNewWindow("supportWindow.fxml");
        });
    }
    public void openNewWindow(String window) {
        mainButton.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setTitle("Magic Coffee");
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}


