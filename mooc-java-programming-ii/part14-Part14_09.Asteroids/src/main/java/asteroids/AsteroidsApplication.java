package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    public static int WIDTH = 600;
    public static int HEIGHT = 400;

    public void start(Stage stage) {
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        AtomicInteger points = new AtomicInteger();
        Text text = new Text(10, 20, "Points: " + points);

        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Ship ship = new Ship(WIDTH / 2, HEIGHT / 2);

        ArrayList<Projectile> projectiles = new ArrayList<>();
        ArrayList<Asteroid> asteroids = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            asteroids.add(new Asteroid(rnd.nextInt(100), rnd.nextInt(100)));
        }

        pane.getChildren().add(text);
        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        asteroids.forEach(asteroid -> asteroid.accelerate());

        Scene scene = new Scene(pane);

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (pressedKeys.getOrDefault(KeyCode.LEFT, Boolean.FALSE)) {
                    ship.turnLeft();
                }
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, Boolean.FALSE)) {
                    ship.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.UP, Boolean.FALSE)) {
                    ship.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.SPACE, Boolean.FALSE) && projectiles.size() < 1) {
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());

                    projectile.setSpeed(3);
                    projectile.accelerate();

                    projectiles.add(projectile);

                    pane.getChildren().add(projectile.getCharacter());

                }
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());

                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        stop();
                    }
                });
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (asteroid.collide(projectile)) {

                            asteroids.remove(asteroid);
                            pane.getChildren().remove(asteroid.getCharacter());

                            projectiles.remove(projectile);
                            pane.getChildren().remove(projectile.getCharacter());

                            text.setText("Points: " + points.addAndGet(1000));
                        }
                    });
                });
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
            }
        }.start();

        //stopped at multiple asteroids
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

}
