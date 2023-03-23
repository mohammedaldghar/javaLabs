package com.example.notpad;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class NotePadController {

    @FXML
    MenuItem exitBtn;
    @FXML
    TextArea textArea;
    public void newFile(){
        new Alert(Alert.AlertType.CONFIRMATION,"New file Created").show();
        textArea.setText("");
    }
    public void openFile(){
        new FileChooser().showOpenDialog(null);
       textArea.setText("");
    }
    public void saveFile(){
         new FileChooser().showOpenDialog(null);
    }
    public EventHandler<ActionEvent> exitFromfile(){
        return  event->{
            final Node source = (Node) event.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        };

    }
public void aboutMe(){
        new Alert(Alert.AlertType.CONFIRMATION,"This Demo Note pad made by Me: Mohammed Aldghar :)").show();
    }
}
