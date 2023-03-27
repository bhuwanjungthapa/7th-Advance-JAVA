package com.example.demo2;

// Java Program to create an BorderPane
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class BorderPaneExample extends Application {
    // start method helps in launching the application
    public void start(Stage stage)
    {
        BorderPane bp = new BorderPane();
        bp.setTop(new TextField("A-Top"));
        bp.setBottom(new TextField("B-Bottom"));
        bp.setLeft(new TextField("C-Left"));
        bp.setRight(new TextField("D-Right"));
        bp.setCenter(new TextField("E-Center"));// Scene creation
        Scene scene = new Scene(bp);// Title set
        stage.setTitle("Example for BorderPane");
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
