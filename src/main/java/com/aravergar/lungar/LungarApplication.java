package com.aravergar.lungar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Objects;

@SpringBootApplication
public class LungarApplication extends Application{
    private ConfigurableApplicationContext springContext;
    private Parent root;

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(LungarApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(getClass().getClassLoader().getResource("sample.fxml")));
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
    }

	@Override
	public void start(Stage primaryStage) throws Exception{
		root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample.fxml")));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.show();
	}

	@Override
    public void stop() throws Exception {
        springContext.stop();
    }

	public static void main(String[] args) {
//		SpringApplication.run(LungarApplication.class, args);
		launch(args);
	}
}
