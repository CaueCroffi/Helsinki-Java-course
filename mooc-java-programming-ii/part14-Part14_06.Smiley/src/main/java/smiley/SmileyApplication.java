package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class SmileyApplication extends Application {

    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(800, 800);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        painter.setFill(Color.WHITE);
        painter.fillRect(0,0,800,800);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(200, 100, 100, 100);
        painter.fillRect(500, 100, 100, 100);
        painter.fillRect(200, 500, 400, 100);
        painter.fillRect(100, 400, 100, 100);
        painter.fillRect(600, 400, 100, 100);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
