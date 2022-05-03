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

public class WarehouseWindowController {

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> firstnameColumn;

    @FXML
    private TableColumn<Person, String> lastnameColumn;

    @FXML
    private TableColumn<Person, String> emailColumn;

    @FXML
    private TableColumn<Person, String> phoneNumColumn;

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
        firstnameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstname"));
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastname"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        phoneNumColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("phoneNum"));

        tableView.setItems(getPeople());
        tableView.setEditable(true);
        firstnameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        lastnameColumn.setCellFactory(TextFieldTableCell.forTableColumn());

//        assert employeesButton != null : "fx:id=\"employeesButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";

        employeesButton.setOnAction(event -> {
            System.out.println("You pressed \"Сотрудники\" button");
            openNewWindow("employeesWindow.fxml");
        });

//        assert historyButton != null : "fx:id=\"historyButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert mainButton != null : "fx:id=\"mainButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";

        mainButton.setOnAction(event -> {
            System.out.println("You pressed \"Главная\" button");
            openNewWindow("mainWindow.fxml");
        });

//        assert statisticsButton != null : "fx:id=\"statisticsButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";
//        assert supportButton != null : "fx:id=\"supportButton\" was not injected: check your FXML file 'employeesWindow.fxml'.";

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

    public ObservableList<Person> getPeople() {
        ObservableList<Person> people = FXCollections.observableArrayList();
        people.add(new Person("Name", "Surname", "some-long-test-mail@gmail.com", "87777777777"));
        people.add(new Person("Большое имя", "Фамилия", "some-test2-mail@gmail.com", "87777777777"));
        people.add(new Person("Очень большое имя", "Очень большая фамилия", "some-mail@gmail.com", "87777777777"));

        return people;
    }

    public void changeFirstnameCellEvent(TableColumn.CellEditEvent editedCell) {
        Person personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setFirstname(editedCell.getNewValue().toString());
    }

    public void changeLastnameCellEvent(TableColumn.CellEditEvent editedCell) {
        Person personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setLastname(editedCell.getNewValue().toString());
    }
}
