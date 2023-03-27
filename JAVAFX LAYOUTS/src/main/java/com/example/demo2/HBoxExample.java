package com.example.demo2;


// Java Program to create an HBox
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class HBoxExample extends Application {
    // start method helps in launching the application
    public void start(Stage stage)
    {
// Title set
        stage.setTitle("Example for HBox");
// HBox creation
        HBox hb = new HBox(10);
// Label creation
        Label lb = new Label("this is HBox example");
// Add the created label to Hbox
        hb.getChildren().add(lb);
// add the buttons to Hbox
        hb.getChildren().add(new Button("Click A"));
        hb.getChildren().add(new Button("Click B"));
        hb.getChildren().add(new Button("Click C"));// Scene creation
        Scene scene = new Scene(hb, 300, 300);
// Scene setting
        stage.setScene(scene);
        stage.show();
    }
    // Main Method
    public static void main(String args[])
    {
//method to launch the JavaFX application
        launch(args);
    }
}
