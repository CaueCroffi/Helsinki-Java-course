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
public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Word");
        TextField wordField = new TextField();
        Label translationInstruction = new Label("Translations");
        TextField translationField = new TextField();

        Button addButton = new Button("Add the word pair");

        layout.add(wordInstruction, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translationInstruction, 1, 0);
        layout.add(translationField, 1, 1);
        layout.add(addButton, 2, 0);

        addButton.setOnAction((event) -> {
            dictionary.add(wordField.getText(), translationField.getText());
            wordField.clear();
            translationField.clear();
        });

        return layout;

    }
    
}
