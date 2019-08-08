/**
 * @project TextReverseNotepadFX
 * @author n2god on 08/08/2019
 */module TextReverseNotepadFX {
     requires javafx.graphics;
     requires javafx.controls;
     requires javafx.fxml;

     exports pl.n2god.mvc.main;
     opens pl.n2god.mvc.controller to javafx.fxml;
}