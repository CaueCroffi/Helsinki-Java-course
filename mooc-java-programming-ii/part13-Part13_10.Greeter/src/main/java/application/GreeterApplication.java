package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) {

        VBox startScreen = new VBox();
        Label label = new Label("Enter your name and start.");
        startScreen.getChildren().add(label);
        TextField textArea = new TextField();
        startScreen.getChildren().add(textArea);
        Button startButton = new Button("Start");
        startScreen.getChildren().add(startButton);

        VBox welcomeScreen = new VBox();
        Label welcomeLabel = new Label();
        welcomeScreen.getChildren().add(welcomeLabel);

        Scene firstScene = new Scene(startScreen);
        Scene secondScene = new Scene(welcomeScreen);

        startButton.setOnAction((event) -> {
            welcomeLabel.setText("Welcome " + textArea.getText() + "!");
            window.setScene(secondScene);
        });

        window.setScene(firstScene);
        window.show();

    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
