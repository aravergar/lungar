package com.aravergar.lungar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.awt.event.ActionListener;

@Component
public class Controller {

    private String wRoot = new String("\u00e6");
//    private String wSuffix;

    @FXML
    private Text text ;
    @FXML
    private TextField textField;
//    @FXML
//    private Button button;
//    private String ra = new String("\u027b"+"a");
    @FXML
    public void initialize(){
        setText(wRoot);
        System.out.println("after text: " + text.getText() + ", wRoot: " + wRoot);
    }
    public void setText(String value){
        text.textProperty().set(value);
    }
    public void suffix(String value){
        setText(wRoot+value);
    }
    public void updateSuffix(ActionEvent actionEvent) {
        System.out.println("suffix updated: "+textField.getText());
//        wSuffix. textField.getText();
        suffix(textField.getText());
        System.out.println("text: " + text.getText());
    }
}
