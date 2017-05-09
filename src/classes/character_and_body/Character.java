package classes.Character_And_Body;

import classes.Character_And_Body.Body.Gender;
import classes.Character_And_Body.Body.Hair.HairColor;
import classes.Character_And_Body.Body.Hair.HairLength;
import classes.Character_And_Body.Body.Hair.HairStyle;
import classes.Character_And_Body.Body.Organs.BreastSize;
import classes.Character_And_Body.Body.Organs.Breasts;
import classes.Character_And_Body.Body.Organs.Penis;

public class Character {

    private String name;
    private Gender gender;
    private int height;
    private float weight;
    private int arousal;
    private int maxArousal;
    private int stamina;
    private int maxStamina;
    private Race race;
    private Breasts breasts;
    private Penis penis;
    private HairColor hairColor;
    private HairLength hairLength;
    private HairStyle hairStyle;

    public Character(String name, int height, float weight, Race race, BreastSize breastSize, Penis penis,
                     HairColor hairColor, HairLength hairLength, HairStyle hairStyle, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.arousal = 0;
        this.maxArousal = 100;
        this.stamina = 100;
        this.maxStamina = 100;
        this.race = race;
        this.breasts = breasts;
        this.penis = penis;
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.hairStyle = hairStyle;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getArousal() {
        return arousal;
    }

    public void setArousal(int arousal) {
        this.arousal = arousal;
    }

    public int getMaxArousal() {
        return maxArousal;
    }

    public void setMaxArousal(int maxArousal) {
        this.maxArousal = maxArousal;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Breasts getBreasts() {
        return breasts;
    }

    public void setBreasts(Breasts breasts) {
        this.breasts = breasts;
    }

    public Penis getPenis() {
        return penis;
    }

    public void setPenis(Penis penis) {
        this.penis = penis;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public HairLength getHairLength() {
        return hairLength;
    }

    public void setHairLength(HairLength hairLength) {
        this.hairLength = hairLength;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(HairStyle hairStyle) {
        this.hairStyle = hairStyle;
    }
}
