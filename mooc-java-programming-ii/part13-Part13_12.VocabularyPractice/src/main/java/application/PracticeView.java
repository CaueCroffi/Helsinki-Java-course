/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Pichau
 */
public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        TextField wordField = new TextField();
        Label feedback = new Label("");

        Button verifyButton = new Button("Check translation");

        layout.add(wordInstruction, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(feedback, 1, 0);
        layout.add(verifyButton, 2, 0);

        verifyButton.setOnAction((event) -> {
            String translation = wordField.getText();
            if (dictionary.get(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation fo the word '" + word + "' is '" + dictionary.get(word) + "'.");
                return;
            }
            this.word = this.dictionary.getRandomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'");
            wordField.clear();
        });

        return layout;
    }

}
