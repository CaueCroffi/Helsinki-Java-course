package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {

    public void start(Stage window) {
        Label textComponent = new Label("Text element");
        Button buttonComponent = new Button("This is a button");
        FlowPane flowPlane = new FlowPane();

        flowPlane.getChildren().add(textComponent);
        flowPlane.getChildren().add(buttonComponent);

        Scene view = new Scene(flowPlane);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
