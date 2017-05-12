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
import classes.Character_And_Body.Player;
import classes.Character_And_Body.Race;
import classes.etc.Strings;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static classes.etc.Strings.intro;
import static classes.etc.Strings.menu;

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
    private int penisSize;
    private HairColor hairColor;
    private HairLength hairLength;
    private HairStyle hairStyle;
    private Player player;

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
        stage.sizeToScene();
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
        menuBox.appendText(menu);

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
            storyBox.appendText(intro);
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
                storyBox.appendText(gender + " that's right!\n" + Strings.race);
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
                storyBox.appendText(race + ".\n");
                clearButtonText();
                newGameHairColor();
            });
        }
    }

    public void newGameHairColor() {
        for (HairColor hc : HairColor.values()) {
            buttonArray[hc.ordinal()].setText(hc.getName());
            buttonArray[hc.ordinal()].setDisable(false);
            final int x = hc.ordinal();
            buttonArray[hc.ordinal()].setOnAction(event -> {
                hairColor = HairColor.values()[x];
                storyBox.appendText(hairColor + ".\n");
                clearButtonText();
                if (gender.ordinal() != 0) {
                    newGameBreasts();
                } else {
                    newGamePenis();
                }
            });
        }
    }

    public void newGameBreasts() {
        for (BreastSize b : BreastSize.values()) {
            buttonArray[b.ordinal()].setText(b.getName());
            buttonArray[b.ordinal()].setDisable(false);
            final int x = b.ordinal();
            buttonArray[b.ordinal()].setOnAction(event -> {
                breastSize = BreastSize.values()[x];
                storyBox.appendText(breastSize + ".\n");
                clearButtonText();
                if (gender.ordinal() == 1) {
                    newGameHeight();
                } else {
                    newGamePenis();
                }
            });
        }
    }

    public void newGamePenis() {
        popUpWindow("How long is your dong? (in cm)", 1);
    }

    public void newGameHeight() {
        popUpWindow("How big are you? (in cm)", 2);
    }

    public void newGameWeight() {
        popUpWindow("How much do you weigh? (in kg)", 3);
    }

    public void newGameName() {
        popUpWindow("What's your name?", 4);
    }

    public void clearButtonText() {
        for (Button b : buttonArray) {
            b.setText("");
            b.setOnAction(doNothing);
            b.setDisable(true);
        }
    }

    public void popUpWindow(String stageTitle, int id) {
        Pane popUp = new Pane();
        Stage stage = new Stage();
        stage.setTitle(stageTitle);
        stage.setScene(new Scene(popUp, 500, 180));
        TextField tf = new TextField();
        tf.setPrefWidth(300);
        tf.setLayoutX(100);
        tf.setLayoutY(10);
        Button confirm = new Button("Confirm");
        confirm.setPrefSize(100, 50);
        confirm.setLayoutX(200);
        confirm.setLayoutY(125);
        popUp.getChildren().addAll(confirm, tf);
        stage.show();
        stage.setResizable(false);
        stage.sizeToScene();
        tf.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                confirm.fire();
            }
        });
        confirm.setOnAction(event -> {
            setVariable(tf, id);
            stage.close();
        });
    }

    public void setVariable(TextField tf, int id) {
        switch (id) {
            case 1:
                penisSize = tf.getText() == "" ? 0 : Integer.parseInt(tf.getText());
                storyBox.appendText(penisSize + ".\n");
                newGameHeight();
                break;
            case 2:
                height = tf.getText() == null ? 0 : Integer.parseInt(tf.getText());
                storyBox.appendText(height + ".\n");
                newGameWeight();
                break;
            case 3:
                weight = tf.getText() == null ? 0 : Float.parseFloat(tf.getText());
                storyBox.appendText(weight + ".\n");
                newGameName();
                break;
            case 4:
                name = tf.getText() == null ? "" : tf.getText();
                storyBox.appendText(name + ".\n");
                player = new Player(name, height, weight, race, gender.ordinal() == 0 ? BreastSize.NONE : breastSize, gender.ordinal() == 1 ? 0 : penisSize, hairColor, HairLength.SHOULDERLENGTH, HairStyle.STRAIGHT, gender);
                storyBox.appendText("\nCharacter profile: \nName: " + player.getName() + "\nGender: " + player.getGender() + "\nHeight: " + player.getHeight() + " cm\nWeight: " + player.getWeight() + " kg\nHaircolor: " + player.getHairColor());
                break;
        }

    }
}
