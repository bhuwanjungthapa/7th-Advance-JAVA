package com.example.demo2;

// Java Program to create a flowpane
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class FlowPaneExample extends Application {
    // start method helps in launching the application
    public void start(Stage stage)
    {
//create buttons
        Button b1 = new Button("Button A");
        Button b2 = new Button("Button B");
        Button b3 = new Button("Button C");
        Button b4 = new Button("Button D");
//Flow Pane creation
        FlowPane fp = new FlowPane();
//Set horizontal gap
        fp.setHgap(25);
//Set margin
        fp.setMargin(b1, new Insets(20, 0, 20, 20));
        ObservableList list = fp.getChildren();
//Add nodes to the flow pane
        list.addAll(b1, b2, b3, b4);
// Scene creation
        Scene scene = new Scene(fp);
// Title set
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
