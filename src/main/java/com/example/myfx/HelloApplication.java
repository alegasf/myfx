package com.example.myfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(loader.load(), 700, 400);  //v:1280, v1: 720     //Создание окна
        stage.setTitle("Magic Coffee");                               //Установка title программы
        stage.getIcons().add(new Image("file:src\\main\\java\\com\\example\\myfx\\assets\\logo.png"));
        stage.setScene(scene);                                       //Окно ставится на "сцену" для дальнейшего взаимодействия
        stage.show();                                                // "сцена" отображается
    }

    public static void main(String[] args) {                         //отдается команда на запуск программы
        launch();
    }
}