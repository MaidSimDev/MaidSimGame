/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class MaidSimController implements Initializable {

    // AnchorPanes

    @FXML
    private AnchorPane mainFrame;

    // Panes

    @FXML
    private Pane mainMenuPane;

    @FXML
    private Pane newGamePane;


    // Buttons

    @FXML
    private Button newGameBTN;

    // Labels

    @FXML
    private Label newGameTitleLabel;

    @FXML
    private Label charNameLabel;

    @FXML
    private Label charGenderLabel;

    @FXML
    private Label charRaceLabel;

    @FXML
    private Label charBoobsLabel;

    @FXML
    private Label charDickLabel;

    // Comboboxes

    @FXML
    private ComboBox charGenderCB;

    @FXML
    private ComboBox charRaceCB;

    @FXML
    private ComboBox charBoobsCB;

    @FXML
    private ComboBox charDickCB;

    // Textfields

    @FXML
    private TextField charNameTextfield;

    @FXML
    private void newGame(ActionEvent event) {
        mainMenuPane.setVisible(false);
        Initialiser.initialise(getCharGenderCB(), getCharRaceCB(), getCharBoobsCB(), getCharDickCB());
        newGamePane.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public Label getCharNameLabel() {
        return charNameLabel;
    }

    public void setCharNameLabel(Label charNameLabel) {
        this.charNameLabel = charNameLabel;
    }

    public Label getCharGenderLabel() {
        return charGenderLabel;
    }

    public void setCharGenderLabel(Label charGenderLabel) {
        this.charGenderLabel = charGenderLabel;
    }

    public Label getCharRaceLabel() {
        return charRaceLabel;
    }

    public void setCharRaceLabel(Label charRaceLabel) {
        this.charRaceLabel = charRaceLabel;
    }

    public Label getCharBoobsLabel() {
        return charBoobsLabel;
    }

    public void setCharBoobsLabel(Label charBoobsLabel) {
        this.charBoobsLabel = charBoobsLabel;
    }

    public Label getCharDickLabel() {
        return charDickLabel;
    }

    public void setCharDickLabel(Label charDickLabel) {
        this.charDickLabel = charDickLabel;
    }

    public ComboBox getCharGenderCB() {
        return charGenderCB;
    }

    public void setCharGenderCB(ComboBox charGenderCB) {
        this.charGenderCB = charGenderCB;
    }

    public ComboBox getCharRaceCB() {
        return charRaceCB;
    }

    public void setCharRaceCB(ComboBox charRaceCB) {
        this.charRaceCB = charRaceCB;
    }

    public ComboBox getCharBoobsCB() {
        return charBoobsCB;
    }

    public void setCharBoobsCB(ComboBox charBoobsCB) {
        this.charBoobsCB = charBoobsCB;
    }

    public ComboBox getCharDickCB() {
        return charDickCB;
    }

    public void setCharDickCB(ComboBox charDickCB) {
        this.charDickCB = charDickCB;
    }

    public TextField getCharNameTextfield() {
        return charNameTextfield;
    }

    public void setCharNameTextfield(TextField charNameTextfield) {
        this.charNameTextfield = charNameTextfield;
    }


}
