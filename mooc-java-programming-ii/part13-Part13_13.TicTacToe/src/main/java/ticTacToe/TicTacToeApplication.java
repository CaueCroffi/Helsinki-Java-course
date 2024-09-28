package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Arrays;

public class TicTacToeApplication extends Application {

    private boolean currentTurn;
    private boolean finished;
    private Label turn;
    private Button[][] buttons;

    public TicTacToeApplication() {
        this.currentTurn = true;
        this.finished = false;
        this.turn = new Label("Turn: " + (currentTurn ? "X" : "O"));
        this.buttons = new Button[3][3];
    }

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();
        layout.setPrefSize(310, 350);
        turn.setFont(new Font(30.0));

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Button button = new Button();

                button.setFont(new Font("Monospaced", 40));
                button.setPrefSize(90, 90);

                button.setOnAction((event) -> {
                    if (button.getText().equals("")) {
                        button.setText(currentTurn ? "X" : "O");
                        changeTurn();
                        gameWon();
                    }
                });

                buttons[x][y] = button;
                grid.add(button, x, y);
            }
        }

        layout.setTop(turn);
        layout.setCenter(grid);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    private void changeTurn() {
        currentTurn = !currentTurn;
        this.turn.setText("Turn: " + (currentTurn ? "X" : "O"));
    }

    private boolean gameWon() {
        // test rows
        for (int x = 0; x < 3; x++) {
            if (!buttons[x][0].getText().isEmpty()
                    && Arrays.stream(buttons[x]).allMatch(buttons[x][0].getText()::equals)) {

                this.turn.setText("The end!");
                return true;
            }

            if (!buttons[x][0].getText().isEmpty()
                    && buttons[x][0].getText().equals(buttons[x][1].getText())
                    && buttons[x][0].getText().equals(buttons[x][2].getText())) {

                this.turn.setText("The end!");
                return true;
            }
        }
        if (!buttons[0][0].getText().isEmpty()
                && buttons[1][1].getText().equals(buttons[0][0].getText())
                && buttons[2][2].getText().equals(buttons[0][0].getText())) {

            this.turn.setText("The end!");
            return true;
        }
        if (!buttons[2][0].getText().isEmpty()
                && buttons[1][1].getText().equals(buttons[2][0].getText())
                && buttons[0][2].getText().equals(buttons[2][0].getText())) {

            this.turn.setText("The end!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
