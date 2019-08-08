package pl.n2god.mvc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class NotepadController implements Initializable {

    @FXML
    private TextArea originalTextArea;

    @FXML
    private TextArea reversedTextArea;

    @FXML
    private Button clearTextButton;

    @FXML
    void clearText(ActionEvent event) {
        originalTextArea.clear();
        reversedTextArea.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reversedTextArea
                        .setText(new StringBuilder(originalTextArea
                        .getText())
                        .reverse()
                        .toString()));

        reversedTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                originalTextArea
                        .setText(new StringBuilder(reversedTextArea
                        .getText())
                        .reverse()
                        .toString()));
    }
}
