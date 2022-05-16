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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    private TableColumn<Users, String> idColumn;

    @FXML
    private TextField firstname_field;

    @FXML
    private TextField lastname_field;

    @FXML
    private TextField type_field;

    @FXML
    private TextField id_field;

    ObservableList<Users> list;

    int index = -1;

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
//        assert historyButton != null : "fx:id=\"historyButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert mainButton != null : "fx:id=\"mainButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert statisticsButton != null : "fx:id=\"statisticsButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert supportButton != null : "fx:id=\"supportButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert warehouseButton != null : "fx:id=\"warehouseButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";

//        logo = new ImageView("..\\..\\..\\..\\java\\com\\example\\myfx\\assets\\logo.png");

        firstnameColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("firstname"));
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("lastname"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("type"));
        idColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("id"));

        list = mysqlconnect.getDataUsers();
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

//        editButton.setOnAction(event -> {
//            System.out.println("You pressed \"Изменить\" button");
//
//        });

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
            System.out.println("File not found Employees"); //вероятно ошибка из за названия loader'a, постестить
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
//        stage.initStyle(StageStyle.UNDECORATED);  Создает окно без возможно его закрытия и пр. манипуляций
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setTitle("Сотрудники");
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

//        openNewWindow("addedUser.fxml");
    }

    @FXML
    public void selected(MouseEvent event) {
        index = tableView.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        id_field.setText(idColumn.getCellData(index).toString());
        firstname_field.setText(firstnameColumn.getCellData(index).toString());
        lastname_field.setText(lastnameColumn.getCellData(index).toString());
        type_field.setText(typeColumn.getCellData(index).toString());
    }

    public void Edit() {
        try {
            connection = mysqlconnect.dbConnection2;

            String id_value = id_field.getText();
            String firstname_value = firstname_field.getText();
            String lastname_value = lastname_field.getText();
            String type_value = type_field.getText();

            String sql = "update users2 set idusers2= '" + id_value + "',firstname= '" + firstname_value +
                    "',lastname= '" + lastname_value + "',type= '" + type_value + "' where idusers2='" + id_value + "' ";
            ps = connection.prepareStatement(sql);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
