package com.aravergar.lungar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    @Autowired
    private ArticleRepository articleRepository;

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
