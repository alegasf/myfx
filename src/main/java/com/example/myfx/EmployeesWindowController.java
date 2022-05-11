package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class EmployeesWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private Button employeesButton;

    @FXML
    private Button historyButton;

    @FXML
    private ImageView logo;

    @FXML
    private Button mainButton;

    @FXML
    private Button statisticsButton;

    @FXML
    private Button supportButton;

    @FXML
    private Button tButton;

    @FXML
    private Button warehouseButton;

    @FXML
    private TableView<Users> tableView;

    @FXML
    private TableColumn<Users, String> firstnameColumn;

    @FXML
    private TableColumn<Users, String> lastnameColumn;

    @FXML
    private TableColumn<Users, String> typeColumn;

    @FXML
    private TableColumn<Users, Integer> idColumn;

    @FXML
    private TextField firstname_field;

    @FXML
    private TextField lastname_field;

    @FXML
    private TextField type_field;

    @FXML
    private TextField id_field;

    @FXML
    void initialize() {
//        assert employeesButton != null : "fx:id=\"employeesButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert historyButton != null : "fx:id=\"historyButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert mainButton != null : "fx:id=\"mainButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert statisticsButton != null : "fx:id=\"statisticsButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert supportButton != null : "fx:id=\"supportButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert warehouseButton != null : "fx:id=\"warehouseButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";

//        logo = new ImageView("..\\..\\..\\..\\java\\com\\example\\myfx\\assets\\logo.png");

        addButton.setOnAction(event -> {
            System.out.println("You pressed \"Добавить\" button");
            addUser();

        });

        editButton.setOnAction(event -> {
            System.out.println("You pressed \"Изменить\" button");

        });

        deleteButton.setOnAction(event -> {
            System.out.println("You pressed \"Удалить\" button");

        });

        warehouseButton.setOnAction(event -> {
            System.out.println("You pressed \"Склад\" button");
            openNewWindow("warehouseWindow.fxml");
        });


        mainButton.setOnAction(event -> {
            System.out.println("You pressed \"Главная\" button");
            openNewWindow("mainWindow.fxml");
        });

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
            System.out.println("File not found"); //вероятно ошибка из за названия loader'a, постестить
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setTitle("Magic Coffee");
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        System.out.println("You pressed \"Test\" button");
        Parent tableViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("supportWindow(null).fxml")));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Magic Coffee");

        window.setScene(tableViewScene);
        window.show();
    }
    private void addUser() {
        mysqlconnect mysqlconnect = new mysqlconnect();

        String firstname = firstname_field.getText();
        String lastname = lastname_field.getText();
        String type = type_field.getText();
        String id = id_field.getText();

        Users users2 = new Users(firstname, lastname, type, id);

        mysqlconnect.addUser(users2);
    }
}
