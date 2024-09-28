package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int i = 0; i < 4; i++) {
            int yCoordinate = 0;
            while (yCoordinate < height / 2) {
                int xCoordinate = 0;
                while (xCoordinate < width / 2) {

                    Color color = imageReader.getColor(xCoordinate * 2, yCoordinate * 2);
                    double red = 1.0 - color.getRed();
                    double green = 1.0 - color.getGreen();
                    double blue = 1.0 - color.getBlue();
                    double opacity = color.getOpacity();

                    Color newColor = new Color(red, green, blue, opacity);

                    int xAxis = xCoordinate;
                    int yAxis = yCoordinate;

                    if (i > 1) {
                        xAxis += width / 2;
                    }
                    if (i == 1 || i == 3) {
                        yAxis += height / 2;
                    }

                    imageWriter.setColor(xAxis, yAxis, newColor);

                    xCoordinate++;
                }

                yCoordinate++;
            }
        }
        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().addAll(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
