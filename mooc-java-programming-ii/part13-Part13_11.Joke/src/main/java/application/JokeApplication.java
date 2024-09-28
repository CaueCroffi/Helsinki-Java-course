package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class JokeApplication extends Application {

    public void start(Stage window) {
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");

        HBox menu = new HBox();
        menu.getChildren().addAll(firstButton, secondButton, thirdButton);

        BorderPane layout = new BorderPane();
        Label label = new Label("What do you call a bear with no teeth?");
        layout.setTop(menu);
        layout.setCenter(label);

        
        firstButton.setOnAction((event) -> {
            label.setText("What do you call a bear with no teeth?");
        });
        secondButton.setOnAction((event) -> {
            label.setText("A gummy bear.");
        });
        thirdButton.setOnAction((event) -> {
            label.setText("no idea");
        });
        
        Scene startScreen = new Scene(layout);

        window.setScene(startScreen);
        window.show();
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
