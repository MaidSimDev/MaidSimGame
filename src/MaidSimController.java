/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;

import classes.Character_And_Body.Body.Gender;
import classes.Character_And_Body.Body.Hair.HairColor;
import classes.Character_And_Body.Body.Hair.HairLength;
import classes.Character_And_Body.Body.Hair.HairStyle;
import classes.Character_And_Body.Body.Organs.BreastSize;
import classes.Character_And_Body.Body.Organs.Penis;
import classes.Character_And_Body.Race;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import static classes.etc.Strings.greetings;


public class MaidSimController implements Initializable {



    // AnchorPanes

    @FXML
    private AnchorPane mainFrame;

    // Panes

    @FXML
    private Pane mainMenuPane;


    @FXML
    private Pane newGamePane;


    @FXML
    private Pane gameHUD;


    @FXML
    private Pane newGameGenderPane;


    @FXML
    private Pane newGameRacePane;


    @FXML
    public Pane newGameHairColorPane;


    @FXML
    private Pane newGameBreastsPane;


    @FXML
    private Pane newGamePenisPane;

    // Buttons

    @FXML
    private Button buttonNewGame;


    @FXML
    private Button buttonGenderFemale;


    @FXML
    private Button buttonGenderFutanari;


    @FXML
    private Button buttonRaceHuman;


    @FXML
    private Button buttonRaceElf;


    @FXML
    private Button buttonRaceCatHuman;


    @FXML
    private Button buttonRaceFoxHuman;


    @FXML
    private Button buttonRaceDemon;


    @FXML
    public Button buttonHairColorBlack;


    @FXML
    public Button buttonHairColorRed;


    @FXML
    public Button buttonHairColorBlond;


    @FXML
    public Button buttonHairColorBrown;


    @FXML
    public Button buttonHairColorWhite;


    @FXML
    private Button buttonBreastsSmall;


    @FXML
    private Button buttonBreastsSmallish;


    @FXML
    private Button buttonBreastsMedium;


    @FXML
    private Button buttonBreastsBig;


    @FXML
    private Button buttonPenisSmall;


    @FXML
    private Button buttonPenisSmallish;


    @FXML
    private Button buttonPenisMedium;


    @FXML
    private Button buttonPenisBig;


    @FXML
    private Button buttonPenisHuge;


    @FXML
    private Button buttonBreastsHuge;

    // Labels


    // TextArea

    @FXML
    private TextArea storyBox;

    // Temporary variables to create a player

    private String name;
    private Gender gender;
    private int height;
    private float weight;
    private Race race;
    private BreastSize breastSize;
    private Penis penis;
    private HairColor hairColor;
    private HairLength hairLength;
    private HairStyle hairStyle;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initialise();
    }

    // Initialises a whole bunch of crap

    public void initialise() {

        // Initialise Pane Visibility

        gameHUD.setVisible(false);
        newGameGenderPane.setVisible(true);
        newGameRacePane.setVisible(false);
        newGameHairColorPane.setVisible(false);
        newGameBreastsPane.setVisible(false);
        newGamePenisPane.setVisible(false);

        // Set Button Text

        buttonGenderFemale.setText("Female");
        buttonGenderFutanari.setText("Futanari");

        buttonRaceHuman.setText("Human");
        buttonRaceElf.setText("Elf");
        buttonRaceCatHuman.setText("Catgirl");
        buttonRaceFoxHuman.setText("Foxgirl");
        buttonRaceDemon.setText("Succubus");

        buttonHairColorBlack.setText("Black");
        buttonHairColorRed.setText("Red");
        buttonHairColorBlond.setText("Blond");
        buttonHairColorBrown.setText("Brown");
        buttonHairColorWhite.setText("White");

        buttonBreastsSmall.setText("Small");
        buttonBreastsSmallish.setText("Smallish");
        buttonBreastsMedium.setText("Medium");
        buttonBreastsBig.setText("Big");
        buttonBreastsHuge.setText("Huge");

        buttonPenisSmall.setText("Small");
        buttonPenisSmallish.setText("Smallish");
        buttonPenisMedium.setText("Medium");
        buttonPenisBig.setText("Big");
        buttonPenisHuge.setText("Huge");

        // Link Buttons to methods

        buttonNewGame.setOnAction(event -> {
            mainMenuPane.setVisible(false);
            gameHUD.setVisible(true);
            storyBox.appendText(greetings);
        });

        buttonGenderFemale.setOnAction(event -> {
            newGameGenderPane.setVisible(false);
            newGameRacePane.setVisible(true);
            storyBox.appendText("ADD SOME TEXT AFTERWARDS");
            gender = Gender.FEMALE;
            storyBox.appendText(gender.toString());
        });

        buttonGenderFutanari.setOnAction(event -> {
            newGameGenderPane.setVisible(false);
            newGameRacePane.setVisible(true);
            storyBox.appendText("ADD SOME TEXT AFTERWARDS");
            gender = Gender.FUTANARI;
            storyBox.appendText(gender.toString());
        });
    }
}
