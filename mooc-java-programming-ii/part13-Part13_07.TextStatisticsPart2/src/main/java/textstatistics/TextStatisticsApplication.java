package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        HBox footnote = new HBox();

        Label letters = new Label("Letters: 0");
        Label totalWords = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");
        footnote.getChildren().add(letters);
        footnote.getChildren().add(totalWords);
        footnote.getChildren().add(longestWord);

        layout.setBottom(footnote);
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + characters);
            totalWords.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);

            // set values of text elements
        });

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
