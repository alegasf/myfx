package com.example.myfx;

/**
 * @author Merkulov A
 */

import javafx.collections.FXCollections;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class WarehouseWindowController2 {

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
    private Button warehouseButton;

    @FXML
    void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("name"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("amount"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("price"));
        sumColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("sum"));

        tableView.setItems(getOrder());
        tableView.setEditable(true);
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        amountColumn.setCellFactory(TextFieldTableCell.forTableColumn());

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

    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        System.out.println("You pressed \"Test\" button");
        Parent tableViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("supportWindow(null).fxml")));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Magic Coffee");

        window.setScene(tableViewScene);
        window.show();
    }

    public ObservableList<Order> getOrder() {
        ObservableList<Order> orders = FXCollections.observableArrayList();
        orders.add(new Order("Name", "Surname", "some-long-test-mail@gmail.com", "87777777777"));
        orders.add(new Order("Большое имя", "Фамилия", "some-test2-mail@gmail.com", "87777777777"));
        orders.add(new Order("Очень большое имя", "Очень большая фамилия", "some-mail@gmail.com", "87777777777"));

        return orders;
    }

    public void changeFirstnameCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setName(editedCell.getNewValue().toString());
    }

    public void changeLastnameCellEvent(TableColumn.CellEditEvent editedCell) {
        Order orderSelected = tableView.getSelectionModel().getSelectedItem();
        orderSelected.setAmount(editedCell.getNewValue().toString());
    }
}