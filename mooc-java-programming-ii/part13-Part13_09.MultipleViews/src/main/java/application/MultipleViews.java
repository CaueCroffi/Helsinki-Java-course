package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MultipleViews extends Application {

    public void start(Stage window) {
        BorderPane layoutOne = new BorderPane();
        layoutOne.setTop(new Label("First view!"));
        Button firstButton = new Button("To the second view!");
        layoutOne.setCenter(firstButton);

        VBox layoutTwo = new VBox();
        Button secondButton = new Button("To the third view!");
        layoutTwo.getChildren().add(secondButton);
        layoutTwo.getChildren().add(new Label("Second view!"));

        GridPane layoutThree = new GridPane();
        Button thirdButton = new Button("To the first view!");
        layoutThree.add(new Label("Third view!"), 0, 0);
        layoutThree.add(thirdButton, 1, 1);

        Scene first = new Scene(layoutOne);
        Scene second = new Scene(layoutTwo);
        Scene third = new Scene(layoutThree);

        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
