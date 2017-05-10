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

    // Panes

    
    private Pane mainMenuPane = new Pane();
    
    private Pane gameHUD = new Pane();

    // Buttons

    private Button[] buttonArray = new Button[30];

    private Button buttonNewGame = new Button();

    // Labels


    // TextArea

    
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


    // Initialises a whole bunch of crap

    public void initialise() {

        // Setup GUI

        mainMenuPane.setPrefWidth(1280);
        mainMenuPane.setPrefHeight(720);
        mainMenuPane.getChildren().add(buttonNewGame);
        buttonNewGame.setPrefWidth(128);
        buttonNewGame.setPrefHeight(55);
        buttonNewGame.setLayoutX(640);
        buttonNewGame.setLayoutY((720-55)/2);
        buttonNewGame.setText("New Game");
        buttonNewGame.setFont(Font.font(15));
        gameHUD.setPrefWidth(1280);
        gameHUD.setPrefHeight(720);
        gameHUD.setVisible(false);
        gameHUD.getChildren().add(storyBox);
        gameHUD.getStyleClass().add("gameHUD");
        storyBox.setPrefWidth(980);
        storyBox.setPrefHeight(500);
        storyBox.setLayoutX(300);
        storyBox.setLayoutY(0);
        storyBox.setEditable(false);
        for (int i = 0; i < buttonArray.length; i++){
            buttonArray[i] = new Button();
            buttonArray[i].setText("");
            buttonArray[i].setPrefWidth(50);
            buttonArray[i].setPrefHeight(10);
            if (i==0){
                buttonArray[i].setLayoutX(305);
                buttonArray[i].setLayoutY(505);
            } else if (i%10 == 0) {
                buttonArray[i].setLayoutX(buttonArray[i-10].getLayoutX());
                buttonArray[i].setLayoutY(buttonArray[i-10].getLayoutY() + 25);
            } else {
                buttonArray[i].setLayoutX(buttonArray[i-1].getLayoutX() + 55);
                buttonArray[i].setLayoutY(buttonArray[i-1].getLayoutY());
            }
            gameHUD.getChildren().add(buttonArray[i]);
        }

        buttonNewGame.setOnAction(event -> {
            mainMenuPane.setVisible(false);
            gameHUD.setVisible(true);
            storyBox.appendText(greetings);
        });



    }

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

}
