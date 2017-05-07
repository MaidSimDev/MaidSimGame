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
import javafx.scene.control.*;
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

    @FXML
    private Pane gameHUD;


    @FXML
    private Pane newGameGenderPane;


    @FXML
    private Pane newGameRacePane;


    @FXML
    private Pane newGameBreastsPane;


    @FXML
    private Pane newGamePenisPane;

    // Buttons

    @FXML
    private Button newGameBTN;

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


    @FXML
    private void newGame(ActionEvent event) {
        getMainMenuPane().setVisible(false);
        gameHUD.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initialise();
    }





    // Getters and Setters following here

    public void initialise() {

        // Initialise Pane Visibility

        this.getGameHUD().setVisible(false);
        this.getNewGameGenderPane().setVisible(true);
        this.getNewGameRacePane().setVisible(false);
        this.getNewGameBreastsPane().setVisible(false);
        this.getNewGamePenisPane().setVisible(false);

        // Set Button Text

        this.getButtonGenderFemale().setText("Female");
        this.getButtonGenderFutanari().setText("Futanari");
        this.getButtonRaceHuman().setText("Human");
        this.getButtonRaceElf().setText("Elf");
        this.getButtonRaceCatHuman().setText("Catgirl");
        this.getButtonRaceFoxHuman().setText("Foxgirl");
        this.getButtonRaceDemon().setText("Succubus");
        this.getButtonBreastsSmall().setText("Small");
        this.getButtonBreastsSmallish().setText("Smallish");
        this.getButtonBreastsMedium().setText("Medium");
        this.getButtonBreastsBig().setText("Big");
        this.getButtonBreastsHuge().setText("Huge");
        this.getButtonPenisSmall().setText("Small");
        this.getButtonPenisSmallish().setText("Smallish");
        this.getButtonPenisMedium().setText("Medium");
        this.getButtonBreastsBig().setText("Big");
        this.getButtonBreastsHuge().setText("Huge");
    }

    public AnchorPane getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(AnchorPane mainFrame) {
        this.mainFrame = mainFrame;
    }

    public Pane getMainMenuPane() {
        return mainMenuPane;
    }

    public void setMainMenuPane(Pane mainMenuPane) {
        this.mainMenuPane = mainMenuPane;
    }

    public Pane getNewGamePane() {
        return newGamePane;
    }

    public void setNewGamePane(Pane newGamePane) {
        this.newGamePane = newGamePane;
    }

    public Pane getGameHUD() {
        return gameHUD;
    }

    public void setGameHUD(Pane gameHUD) {
        this.gameHUD = gameHUD;
    }

    public Pane getNewGameGenderPane() {
        return newGameGenderPane;
    }

    public void setNewGameGenderPane(Pane newGameGenderPane) {
        this.newGameGenderPane = newGameGenderPane;
    }

    public Pane getNewGameRacePane() {
        return newGameRacePane;
    }

    public void setNewGameRacePane(Pane newGameRacePane) {
        this.newGameRacePane = newGameRacePane;
    }

    public Pane getNewGameBreastsPane() {
        return newGameBreastsPane;
    }

    public void setNewGameBreastsPane(Pane newGameBreastsPane) {
        this.newGameBreastsPane = newGameBreastsPane;
    }

    public Pane getNewGamePenisPane() {
        return newGamePenisPane;
    }

    public void setNewGamePenisPane(Pane newGamePenisPane) {
        this.newGamePenisPane = newGamePenisPane;
    }

    public Button getNewGameBTN() {
        return newGameBTN;
    }

    public void setNewGameBTN(Button newGameBTN) {
        this.newGameBTN = newGameBTN;
    }

    public Button getButtonGenderFemale() {
        return buttonGenderFemale;
    }

    public void setButtonGenderFemale(Button buttonGenderFemale) {
        this.buttonGenderFemale = buttonGenderFemale;
    }

    public Button getButtonGenderFutanari() {
        return buttonGenderFutanari;
    }

    public void setButtonGenderFutanari(Button buttonGenderFutanari) {
        this.buttonGenderFutanari = buttonGenderFutanari;
    }

    public Button getButtonRaceHuman() {
        return buttonRaceHuman;
    }

    public void setButtonRaceHuman(Button buttonRaceHuman) {
        this.buttonRaceHuman = buttonRaceHuman;
    }

    public Button getButtonRaceElf() {
        return buttonRaceElf;
    }

    public void setButtonRaceElf(Button buttonRaceElf) {
        this.buttonRaceElf = buttonRaceElf;
    }

    public Button getButtonRaceCatHuman() {
        return buttonRaceCatHuman;
    }

    public void setButtonRaceCatHuman(Button buttonRaceCatHuman) {
        this.buttonRaceCatHuman = buttonRaceCatHuman;
    }

    public Button getButtonRaceFoxHuman() {
        return buttonRaceFoxHuman;
    }

    public void setButtonRaceFoxHuman(Button buttonRaceFoxHuman) {
        this.buttonRaceFoxHuman = buttonRaceFoxHuman;
    }

    public Button getButtonRaceDemon() {
        return buttonRaceDemon;
    }

    public void setButtonRaceDemon(Button buttonRaceDemon) {
        this.buttonRaceDemon = buttonRaceDemon;
    }

    public Button getButtonBreastsSmall() {
        return buttonBreastsSmall;
    }

    public void setButtonBreastsSmall(Button buttonBreastsSmall) {
        this.buttonBreastsSmall = buttonBreastsSmall;
    }

    public Button getButtonBreastsSmallish() {
        return buttonBreastsSmallish;
    }

    public void setButtonBreastsSmallish(Button buttonBreastsSmallish) {
        this.buttonBreastsSmallish = buttonBreastsSmallish;
    }

    public Button getButtonBreastsMedium() {
        return buttonBreastsMedium;
    }

    public void setButtonBreastsMedium(Button buttonBreastsMedium) {
        this.buttonBreastsMedium = buttonBreastsMedium;
    }

    public Button getButtonBreastsBig() {
        return buttonBreastsBig;
    }

    public void setButtonBreastsBig(Button buttonBreastsBig) {
        this.buttonBreastsBig = buttonBreastsBig;
    }

    public Button getButtonPenisSmall() {
        return buttonPenisSmall;
    }

    public void setButtonPenisSmall(Button buttonPenisSmall) {
        this.buttonPenisSmall = buttonPenisSmall;
    }

    public Button getButtonPenisSmallish() {
        return buttonPenisSmallish;
    }

    public void setButtonPenisSmallish(Button buttonPenisSmallish) {
        this.buttonPenisSmallish = buttonPenisSmallish;
    }

    public Button getButtonPenisMedium() {
        return buttonPenisMedium;
    }

    public void setButtonPenisMedium(Button buttonPenisMedium) {
        this.buttonPenisMedium = buttonPenisMedium;
    }

    public Button getButtonPenisBig() {
        return buttonPenisBig;
    }

    public void setButtonPenisBig(Button buttonPenisBig) {
        this.buttonPenisBig = buttonPenisBig;
    }

    public Button getButtonPenisHuge() {
        return buttonPenisHuge;
    }

    public void setButtonPenisHuge(Button buttonPenisHuge) {
        this.buttonPenisHuge = buttonPenisHuge;
    }

    public Button getButtonBreastsHuge() {
        return buttonBreastsHuge;
    }

    public void setButtonBreastsHuge(Button buttonBreastsHuge) {
        this.buttonBreastsHuge = buttonBreastsHuge;
    }

    public TextArea getStoryBox() {
        return storyBox;
    }

    public void setStoryBox(TextArea storyBox) {
        this.storyBox = storyBox;
    }
}
