/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.Character_And_Body.Body.Gender;
import classes.Character_And_Body.Body.Hair.HairColor;
import classes.Character_And_Body.Body.Hair.HairLength;
import classes.Character_And_Body.Body.Hair.HairStyle;
import classes.Character_And_Body.Body.Organs.BreastSize;
import classes.Character_And_Body.Body.Organs.Penis;
import classes.Character_And_Body.Race;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static classes.etc.Strings.greetings;

public class MaidSimGame extends Application {

    public static final EventHandler<ActionEvent> doNothing = event -> {
    };
    private Pane mainMenuPane = new Pane();
    // Panes
    private Pane gameHUD = new Pane();
    private Button[] buttonArray = new Button[30];
    // Buttons
    private Button buttonNewGame = new Button();

    // Labels
    private TextArea storyBox = new TextArea();
    // TextArea
    private String name;
    // Temporary variables to create a player
    private Gender gender;
    private int height;
    private float weight;
    private Race race;
    private BreastSize breastSize;
    private Penis penis;
    private HairColor hairColor;
    private HairLength hairLength;

    //
    private HairStyle hairStyle;

    /*    public void derp(){
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
        }*/
    public static void main(String[] args) {
        launch(args);
    }


    // Initialises a whole bunch of crap

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.getChildren().addAll(mainMenuPane, gameHUD);
        root.setMinWidth(1280);
        root.setMinHeight(720);
        root.setPrefHeight(720);
        root.setPrefWidth(1280);
        root.getStyleClass().add("root");
        root.getStylesheets().add("FXML/MaidSim.css");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Maid Simulator");
        stage.show();
        initialise();
    }

    public void initialise() {

        // Setup GUI

        mainMenuPane.setPrefWidth(1280);
        mainMenuPane.setPrefHeight(720);
        mainMenuPane.getChildren().add(buttonNewGame);

        buttonNewGame.setPrefWidth(128);
        buttonNewGame.setPrefHeight(55);
        buttonNewGame.setLayoutX(640);
        buttonNewGame.setLayoutY((720 - 55) / 2);
        buttonNewGame.setText("New Game");
        buttonNewGame.setFont(Font.font(15));

        gameHUD.setPrefWidth(1280);
        gameHUD.setPrefHeight(720);
        gameHUD.setVisible(false);
        gameHUD.getChildren().add(storyBox);
        gameHUD.getStyleClass().add("gameHUD");

        storyBox.setPrefWidth(1080); // 1080 = 10x + 50 <==> 103 = x
        storyBox.setPrefHeight(595); // 120 = 3x + 15 <==> 35 = x
        storyBox.setLayoutX(200);
        storyBox.setLayoutY(0);
        storyBox.setEditable(false);

        for (int i = 0; i < buttonArray.length; i++) {
            buttonArray[i] = new Button();
            buttonArray[i].setText("");
            buttonArray[i].setPrefWidth(103);
            buttonArray[i].setPrefHeight(35);
            if (i == 0) {
                buttonArray[i].setLayoutX(storyBox.getLayoutX());
                buttonArray[i].setLayoutY(storyBox.getLayoutY() + storyBox.getPrefHeight() + 5);
            } else if (i % 10 == 0) {
                buttonArray[i].setLayoutX(buttonArray[i - 10].getLayoutX());
                buttonArray[i].setLayoutY(buttonArray[i - 10].getLayoutY() + buttonArray[i].getPrefHeight() + 5);
            } else {
                buttonArray[i].setLayoutX(buttonArray[i - 1].getLayoutX() + buttonArray[i].getPrefWidth() + 5);
                buttonArray[i].setLayoutY(buttonArray[i - 1].getLayoutY());
            }
            gameHUD.getChildren().add(buttonArray[i]);
        }

        buttonNewGame.setOnAction(event -> {
            mainMenuPane.setVisible(false);
            gameHUD.setVisible(true);
            newGameGender();
            storyBox.appendText(greetings);
        });
    }

    public void newGameGender() {
        int i;
        for (i = 0; i < Gender.values().length; i++) {
            buttonArray[i].setText(Gender.values()[i].getName());
            final int x = i;
            buttonArray[i].setOnAction(event -> {
                gender = Gender.values()[x];
                System.out.println(gender);
                storyBox.appendText("You're a " + gender + "\n");
                clearButtonText();
                newGameRace();
            });
        }
    }

    public void newGameRace() {
        int i;
        for (i = 0; i < Race.values().length; i++) {
            buttonArray[i].setText(Race.values()[i].getName());
            final int x = i;
            buttonArray[i].setOnAction(event -> {
                race = Race.values()[x];
                System.out.println(race);
                storyBox.appendText("You're a " + race + "\n");
                clearButtonText();
            });
            i++;
        }
    }

    public void clearButtonText() {
        for (Button b : buttonArray) {
            b.setText("");
            b.setOnAction(doNothing);
        }
    }
}
