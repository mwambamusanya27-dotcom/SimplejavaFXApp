package com.example.hellofx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HellojavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Welcome to javaFX!");
        Scene scene = new Scene(label, 300, 100);
        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}