package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView coffee_logo;

    @FXML
    private Label discount2Button;

    @FXML
    private Label discountButton;

    @FXML
    private Button employeesButton;

    @FXML
    private Button mainButton;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button payButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Label sum2Button;

    @FXML
    private Label sumButton;

    @FXML
    private Button warehouseButton;

    @FXML
    private TableView<Order> tableView;

    @FXML
    private TableColumn<Order, String> nameColumn;

    @FXML
    private TableColumn<Order, String> amountColumn;

    @FXML
    private TableColumn<Order, String> priceColumn;

    @FXML
    private TableColumn<Order, String> sumColumn;

    @FXML
    void initialize() {
        employeesButton.setOnAction(event -> {
            System.out.println("You pressed \"Сотрудники\" button");
            openNewWindow("employeesWindow.fxml");
        });

        mainButton.setOnAction(event -> {
            System.out.println("You pressed \"Главная\" button");
            openNewWindow("mainWindow2.fxml");
        });

        warehouseButton.setOnAction(event -> {
            System.out.println("You pressed \"Склад\" button");
            openNewWindow("warehouseWindow.fxml");
        });
        nameColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("name"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("amount"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("price"));
        sumColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("sum"));

        tableView.setItems(getOrder());
        tableView.setEditable(true);
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        amountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    public void openNewWindow(String window) {
        mainButton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            System.out.println("File not found1");
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public ObservableList<Order> getOrder() {
        ObservableList<Order> orders = FXCollections.observableArrayList();
        orders.add(new Order("123", "1234", "12345", "123456"));
        orders.add(new Order("123", "1234", "12345", "123456"));
        orders.add(new Order("123", "1234", "12345", "123456"));

        return orders;
    }

    public void changeNameCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setName(editedCell.getNewValue().toString());
    }

    public void changeAmountCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setAmount(editedCell.getNewValue().toString());
    }

    public void changePriceCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setAmount(editedCell.getNewValue().toString());
    }

    public void changeSumCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setAmount(editedCell.getNewValue().toString());
    }
}

