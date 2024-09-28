package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        HBox footnote = new HBox();
        footnote.getChildren().add(new Label("Letters: 0"));
        footnote.getChildren().add(new Label("Words: 0"));
        footnote.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(footnote);
        layout.setCenter(new TextArea());
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
}
