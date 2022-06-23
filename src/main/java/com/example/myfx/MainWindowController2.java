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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController2 {
    public int amount = 1;
    public int k = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button16;

    @FXML
    private ImageView coffee_logo;

    @FXML
    private Label finSumText_field;

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
    private Text name_textField1;

    @FXML
    private Text amount_textField1;

    @FXML
    private Text price_textField1;

    @FXML
    private Text name_textField2;

    @FXML
    private Text amount_textField2;

    @FXML
    private Text price_textField2;

    @FXML
    private Text name_textField3;

    @FXML
    private Text amount_textField3;

    @FXML
    private Text price_textField3;

    @FXML
    private Text name_textField4;

    @FXML
    private Text amount_textField4;

    @FXML
    private Text price_textField4;

    @FXML
    private Text name_textField5;

    @FXML
    private Text amount_textField5;

    @FXML
    private Text price_textField5;

    @FXML
    private Text name_textField6;

    @FXML
    private Text amount_textField6;

    @FXML
    private Text price_textField6;

    @FXML
    private Text name_textField7;

    @FXML
    private Text amount_textField7;

    @FXML
    private Text price_textField7;

    @FXML
    private Text name_textField8;

    @FXML
    private Text amount_textField8;

    @FXML
    private Text price_textField8;

    @FXML
    private Text name_textField9;

    @FXML
    private Text amount_textField9;

    @FXML
    private Text price_textField9;

    @FXML
    private Text name_textField10;

    @FXML
    private Text amount_textField10;

    @FXML
    private Text price_textField10;

    @FXML
    private Text name_textField11;

    @FXML
    private Text amount_textField11;

    @FXML
    private Text price_textField11;

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

        tableView.setItems(getOrder());
        tableView.setEditable(true);
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        amountColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        button1.setOnAction(event -> {
            System.out.println("You pressed \"Латте\" button");
            k++;
            String name = "Латте";
            amount = 1;
            int price = 500;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button2.setOnAction(event ->

        {
            System.out.println("You pressed \"Эспрессо\" button");
            k++;
            String name = "Эспрессо";
            amount = 1;
            int price = 520;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button3.setOnAction(event ->

        {
            System.out.println("You pressed \"Мокко\" button");
            k++;
            String name = "Мокко";
            amount = 1;
            int price = 530;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });

        button4.setOnAction(event ->

        {
            System.out.println("You pressed \"Капучино\" button");
            k++;
            String name = "Капучино";
            amount = 1;
            int price = 535;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button5.setOnAction(event ->

        {
            System.out.println("You pressed \"Американо\" button");
            k++;
            String name = "Американо";
            amount = 1;
            int price = 530;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button6.setOnAction(event ->

        {
            System.out.println("You pressed \"Лунго\" button");
            k++;
            String name = "Лунго";
            amount = 1;
            int price = 550;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });

        button7.setOnAction(event ->

        {
            System.out.println("You pressed \"Доппио\" button");
            k++;
            String name = "Доппио";
            amount = 1;
            int price = 500;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button8.setOnAction(event ->

        {
            System.out.println("You pressed \"Коррето\" button");
            k++;
            String name = "Коррето";
            amount = 1;
            int price = 565;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button9.setOnAction(event ->

        {
            System.out.println("You pressed \"Бичерин\" button");
            k++;
            String name = "Бичерин";
            amount = 1;
            int price = 600;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button10.setOnAction(event ->

        {
            System.out.println("You pressed \"Гляссе\" button");
            k++;
            String name = "Гляссе";
            amount = 1;
            int price = 550;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button11.setOnAction(event ->

        {
            System.out.println("You pressed \"Медовый раф\" button");
            k++;
            String name = "Медовый раф";
            amount = 1;
            int price = 720;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button12.setOnAction(event ->

        {
            System.out.println("You pressed \"Бревэ\" button");
            k++;
            String name = "Бревэ";
            amount = 1;
            int price = 645;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button13.setOnAction(event ->

        {
            System.out.println("You pressed \"Молоко\" button");
            k++;
            String name = "Молоко";
            amount = 1;
            int price = 100;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button14.setOnAction(event ->

        {
            System.out.println("You pressed \"Шоколад\" button");
            k++;
            String name = "Шоколад";
            amount = 1;
            int price = 100;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        button15.setOnAction(event ->

        {
            System.out.println("You pressed \"Корица\" button");
            k++;
            String name = "Корица";
            amount = 1;
            int price = 100;
            int discount = (price / 100) * 5;
            int sum = price - discount;

            if (k == 1) {
                name_textField1.setText(name);
                amount_textField1.setText(amount + " шт");
                price_textField1.setText(price + " тг");
            } else if (k == 2) {
                name_textField2.setText(name);
                amount_textField2.setText(amount + " шт");
                price_textField2.setText(price + " тг");
            } else if (k == 3) {
                name_textField3.setText(name);
                amount_textField3.setText(amount + " шт");
                price_textField3.setText(price + " тг");
            } else if (k == 4) {
                name_textField4.setText(name);
                amount_textField4.setText(amount + " шт");
                price_textField4.setText(price + " тг");
            } else if (k == 5) {
                name_textField5.setText(name);
                amount_textField5.setText(amount + " шт");
                price_textField5.setText(price + " тг");
            } else if (k == 6) {
                name_textField6.setText(name);
                amount_textField6.setText(amount + " шт");
                price_textField6.setText(price + " тг");
            } else if (k == 7) {
                name_textField7.setText(name);
                amount_textField7.setText(amount + " шт");
                price_textField7.setText(price + " тг");
            } else if (k == 8) {
                name_textField8.setText(name);
                amount_textField8.setText(amount + " шт");
                price_textField8.setText(price + " тг");
            } else if (k == 9) {
                name_textField9.setText(name);
                amount_textField9.setText(amount + " шт");
                price_textField9.setText(price + " тг");
            } else if (k == 10) {
                name_textField10.setText(name);
                amount_textField10.setText(amount + " шт");
                price_textField10.setText(price + " тг");
            } else if (k == 11) {
                name_textField11.setText(name);
                amount_textField11.setText(amount + " шт");
                price_textField11.setText(price + " тг");
            }
            finSumText_field.setText(String.valueOf(sum * k));
        });
        payButton.setOnAction(event ->

        {
            System.out.println("You pressed \"Pay\" button");

            name_textField1.setText("");
            amount_textField1.setText("");
            price_textField1.setText("");

            name_textField2.setText("");
            amount_textField2.setText("");
            price_textField2.setText("");

            name_textField3.setText("");
            amount_textField3.setText("");
            price_textField3.setText("");

            name_textField4.setText("");
            amount_textField4.setText("");
            price_textField4.setText("");

            name_textField5.setText("");
            amount_textField5.setText("");
            price_textField5.setText("");

            name_textField6.setText("");
            amount_textField6.setText("");
            price_textField6.setText("");

            name_textField7.setText("");
            amount_textField7.setText("");
            price_textField7.setText("");

            name_textField8.setText("");
            amount_textField8.setText("");
            price_textField8.setText("");

            name_textField9.setText("");
            amount_textField9.setText("");
            price_textField9.setText("");

            name_textField10.setText("");
            amount_textField10.setText("");
            price_textField10.setText("");

            name_textField11.setText("");
            amount_textField11.setText("");
            price_textField11.setText("");

            finSumText_field.setText("");

            k = 0;
            amount = 0;
        });
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
        orders.add(new Order("", "", ""));

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
}

