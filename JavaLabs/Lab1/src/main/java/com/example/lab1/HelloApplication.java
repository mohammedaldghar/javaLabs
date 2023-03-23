package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Text t =new Text("Hello World");
        Rectangle r=new Rectangle(400,400,400,400);
        StackPane stk=new StackPane();
        stk.getChildren().addAll(r,t);
        Reflection ref=new Reflection();
        ref.setFraction(1.5);
        t.setEffect(ref);
    r.setId("contain");
t.setId("txt");
        Scene scene = new Scene(stk, 320, 240);
        scene.getStylesheets().clear();
        scene.getStylesheets().addAll(this.getClass().getResource("/External.css").toString());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}