package pl.n2god.mvc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    public void initialize() {

        TextArea originalTextArea = contentPaneController.getOriginalTextArea();
        TextArea reversedTextArea = contentPaneController.getReversedTextArea();


        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reversedTextArea.setText(new StringBuilder(
                        originalTextArea.getText())
                        .reverse()
                        .toString()));

        reversedTextArea.addEventFilter(KeyEvent.KEY_RELEASED,keyEvent->
                originalTextArea
                        .setText(new StringBuilder(reversedTextArea
                                .getText())
                                .reverse()
                                .toString()));

        controlPaneController.getClearTextButton().setOnAction(x -> {
            originalTextArea.clear();
            reversedTextArea.clear();
        });
    }
}




