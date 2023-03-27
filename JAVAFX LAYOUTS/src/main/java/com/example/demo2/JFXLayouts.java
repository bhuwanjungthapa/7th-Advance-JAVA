package com.example.demo2;

// Java Program to create a VBox
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class JFXLayouts extends Application {
    // start method helps in launching the application
    public void start(Stage stage)
    {
// Title set
        stage.setTitle("Example for VBox");
// VBox creation
        VBox vb = new VBox(10);
// Label creation
        Label lb = new Label("this is VBox example");
// Add the created label to vbox
        vb.getChildren().add(lb);
// add the buttons to VBox
        vb.getChildren().add(new Button("Click A"));
        vb.getChildren().add(new Button("Click B"));
        vb.getChildren().add(new Button("Click C"));
// Scene creation
        Scene scene = new Scene(vb, 300, 300);
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
