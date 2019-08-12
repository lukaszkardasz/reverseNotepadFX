package pl.n2god.mvc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController {

    @FXML
    private TextArea originalTextArea;

    @FXML
    private TextArea reversedTextArea;

    public TextArea getOriginalTextArea() {
        return originalTextArea;
    }

    public TextArea getReversedTextArea() {
        return reversedTextArea;
    }
}
