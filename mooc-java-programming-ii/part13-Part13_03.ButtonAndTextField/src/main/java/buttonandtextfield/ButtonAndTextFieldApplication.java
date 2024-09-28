package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application {

    public void start(Stage stage) {
        Button button = new Button("test");
        TextField textField = new TextField();
        FlowPane layout = new FlowPane();

        layout.getChildren().add(button);
        layout.getChildren().add(textField);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
