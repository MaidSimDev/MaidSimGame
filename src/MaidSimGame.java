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
import classes.etc.Strings;
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

import static classes.etc.Strings.*;

public class MaidSimGame extends Application {

    public static final EventHandler<ActionEvent> doNothing = event -> {
    };

    // Panes

    private Pane mainMenuPane = new Pane();
    private Pane gameHUD = new Pane();

    // Buttons

    private Button[] buttonArray = new Button[30];
    private Button buttonNewGame = new Button();

    // TextArea

    private TextArea menuBox = new TextArea();
    private TextArea storyBox = new TextArea();

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

    public static void main(String[] args) {
        launch(args);
    }


    // Initialises a whole bunch of crap

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.getChildren().addAll(mainMenuPane, gameHUD);
        root.setPrefSize(1280, 720);
        root.getStyleClass().add("root");
        root.getStylesheets().add("FXML/MaidSim.css");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Maid Simulator");
        stage.show();
        stage.setResizable(false);
        initialise();
    }

    public void initialise() {

        // Setup GUI

        mainMenuPane.setPrefSize(1280, 720);
        mainMenuPane.setLayoutX(0);
        mainMenuPane.setLayoutY(0);
        mainMenuPane.getChildren().addAll(buttonNewGame, menuBox);

        buttonNewGame.setPrefSize(128, 55);
        buttonNewGame.setLayoutX(576);
        buttonNewGame.setLayoutY(333);
        buttonNewGame.setText("New Game");
        buttonNewGame.setFont(Font.font(15));

        menuBox.setPrefSize(680, 125);
        menuBox.setLayoutX(300);
        menuBox.setLayoutY(595);
        menuBox.setEditable(false);
        menuBox.setWrapText(true);
        menuBox.setWrapText(true);
        menuBox.appendText(intro);

        gameHUD.setPrefSize(1280, 720);
        gameHUD.setVisible(false);
        gameHUD.getChildren().add(storyBox);
        gameHUD.getStyleClass().add("gameHUD");

        storyBox.setPrefSize(1080, 595);
        storyBox.setLayoutX(200);
        storyBox.setLayoutY(0);
        storyBox.setEditable(false);
        storyBox.setWrapText(true);

        for (int i = 0; i < buttonArray.length; i++) {
            buttonArray[i] = new Button();
            buttonArray[i].setText("");
            buttonArray[i].setPrefSize(103, 35);
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
            storyBox.appendText("");
            clearButtonText();
            newGameGender();
        });
    }

    public void newGameGender() {
        for (Gender g : Gender.values()) {
            buttonArray[g.ordinal()].setText(g.getName());
            buttonArray[g.ordinal()].setDisable(false);
            final int x = g.ordinal();
            buttonArray[g.ordinal()].setOnAction(event -> {
                gender = Gender.values()[x];
                System.out.println(gender);
                storyBox.appendText("You're a " + gender + "\n");
                clearButtonText();
                newGameRace();
            });
        }
    }

    public void newGameRace() {
        for (Race r : Race.values()) {
            buttonArray[r.ordinal()].setText(r.getName());
            buttonArray[r.ordinal()].setDisable(false);
            final int x = r.ordinal();
            buttonArray[r.ordinal()].setOnAction(event -> {
                race = Race.values()[x];
                System.out.println(race);
                storyBox.appendText("You're a " + race + "\n");
                clearButtonText();
            });
        }
    }

    public void clearButtonText() {
        for (Button b : buttonArray) {
            b.setText("");
            b.setOnAction(doNothing);
            b.setDisable(true);
        }
    }
}
