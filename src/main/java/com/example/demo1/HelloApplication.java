package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml")); //loads fxml file
        Scene scene = new Scene(fxmlLoader.load()); //the scene
        stage.setTitle("Tic Tac Toe"); //title of the application
        stage.setScene(scene); //assign the scene to the stage
        stage.show(); //displaying the application
    }

    public static void main(String[] args) {
        launch();
    }
}