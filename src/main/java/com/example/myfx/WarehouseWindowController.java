package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

public class WarehouseWindowController {

    @FXML
    private TableView<Warehouse> tableView;

    @FXML
    private TableColumn<Warehouse, String> nameColumn;

    @FXML
    private TableColumn<Warehouse, String> amountColumn;

    @FXML
    private TableColumn<Warehouse, String> typeColumn;

    @FXML
    private TableColumn<Warehouse, String> costColumn;

    @FXML
    private TextField name_field;

    @FXML
    private TextField amount_field;

    @FXML
    private TextField type_field;

    @FXML
    private TextField cost_field;

    @FXML
    public ImageView mainImageView;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    ObservableList<Warehouse> list;

    int index = -1;

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Warehouse, String>("name"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<Warehouse, String>("amount"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<Warehouse, String>("type"));
        costColumn.setCellValueFactory(new PropertyValueFactory<Warehouse, String>("cost"));

        list = mysqlconnect2.getDataWarehouse();
        tableView.setItems(list);

        addButton.setOnAction(event -> {
            System.out.println("You pressed \"Добавить\" button");

//            int i = 0;
            try {
                addUser();
            } catch (Exception e) {
//                i = 1;
//            }
//            if (i == 1) {
                System.out.println("Неправильный ввод данных");
//            } else {
//                openNewWindow("addedUser.fxml");
            }
        });


//        tableView.setItems(getPeople());
//        tableView.setEditable(true);
//        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        amountColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        employeesButton.setOnAction(event -> {
            System.out.println("You pressed \"Сотрудники\" button");
            openNewWindow("employeesWindow.fxml");
        });

        mainButton.setOnAction(event -> {
            System.out.println("You pressed \"Главная\" button");
            openNewWindow("mainWindow.fxml");
        });

        supportButton.setOnAction(event -> {
            System.out.println("You pressed \"Support\" button");
            openNewWindow("supportWindow.fxml");
        });

//        logo = new ImageView("..\\..\\..\\..\\java\\com\\example\\myfx\\assets\\logo.png");
    }

    public void openNewWindow(String window) {
        mainButton.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            System.out.println("File not found1"); //вероятно ошибка из за названия loader'a, постестить
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setTitle("Склад");
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
        mysqlconnect2 mysqlconnect2 = new mysqlconnect2();

        String name = name_field.getText();
        String amount = amount_field.getText();
        String type = type_field.getText();
        String cost = cost_field.getText();

        Warehouse warehouse = new Warehouse(name, amount, type, cost);

        mysqlconnect2.addUser(warehouse);

        openNewWindow("addedUser.fxml");
    }
}
