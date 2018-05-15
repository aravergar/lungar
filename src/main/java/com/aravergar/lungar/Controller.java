package com.aravergar.lungar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text text;
    private String ra = new String("\u027b"+"a");
    public void setText(String value){
        text.textProperty().set(value);
    }

    public void doSomething(ActionEvent actionEvent) {
        System.out.println("clicked");
        setText(ra);
    }
}
