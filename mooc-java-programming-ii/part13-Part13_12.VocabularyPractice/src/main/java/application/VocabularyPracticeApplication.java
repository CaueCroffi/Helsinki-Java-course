package application;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;
    
    public void init() throws Exception {
        dictionary = new Dictionary();
    }
    
    public void start(Stage window) {
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);
        
        BorderPane mainLayout = new BorderPane();
        HBox menu = new HBox();
        
        Button practiceButton = new Button("Start Practice");
        Button inputButton = new Button("Add pairs");
        
        menu.getChildren().addAll(practiceButton, inputButton);
        mainLayout.setTop(menu);
        
        practiceButton.setOnAction((event) -> {
            mainLayout.setCenter(practiceView.getView());
        });
        inputButton.setOnAction((event) -> {
            mainLayout.setCenter(inputView.getView());
        });
        
        mainLayout.setCenter(inputView.getView());
        
        Scene startScreen = new Scene(mainLayout);
        window.setScene(startScreen);
        window.show();
        
    }
    
    public static void main(String[] args) {
        
        launch(VocabularyPracticeApplication.class);
    }
}
