package com.aravergar.lungar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class Controller {
    @Autowired
    private ArticleRepository articleRepository;

    private String wRoot = new String("\u00e6");
    private Mono<String> wSuffix = Mono.empty();

    @FXML
    private Text text;
    @FXML
    private TextField textField;
//    private String ra = new String("\u027b"+"a");

    public void setText(String value){
        text.textProperty().set(value);
    }

    public void doSomething(ActionEvent actionEvent) {
        System.out.println("clicked");
        wSuffix.subscribe();
//        wSuffix. textField.getText();
    }
}
