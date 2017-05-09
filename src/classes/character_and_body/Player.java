package classes.Character_And_Body;


import classes.Character_And_Body.Body.Hair.HairColor;
import classes.Character_And_Body.Body.Hair.HairLength;
import classes.Character_And_Body.Body.Hair.HairStyle;
import classes.Character_And_Body.Body.Organs.BreastSize;
import classes.Character_And_Body.Body.Organs.Breasts;
import classes.Character_And_Body.Body.Organs.Penis;

public class Player extends Character{

    public Player(String name, int height, float weight, Race race, BreastSize breastSize, Penis penis,
                  HairColor hairColor, HairLength hairLength, HairStyle hairStyle) {
        super(name, height, weight, race, breastSize, penis, hairColor, hairLength, hairStyle);
    }
}

