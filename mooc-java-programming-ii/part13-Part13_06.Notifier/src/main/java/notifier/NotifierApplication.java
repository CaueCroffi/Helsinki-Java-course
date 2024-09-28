package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    public void start(Stage stage) {
        VBox layout = new VBox();
        TextField topField = new TextField();
        Button button = new Button("Update");
        Label bottomField = new Label();
        
        button.setOnAction((event) -> bottomField.setText(topField.getText()));
        
        layout.getChildren().addAll(topField, button, bottomField);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
}
