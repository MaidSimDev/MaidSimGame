package classes.Character_And_Body;


import classes.Character_And_Body.Body.Gender;
import classes.Character_And_Body.Body.Hair.HairColor;
import classes.Character_And_Body.Body.Hair.HairLength;
import classes.Character_And_Body.Body.Hair.HairStyle;
import classes.Character_And_Body.Body.Organs.BreastSize;
import classes.Character_And_Body.Body.Organs.Breasts;
import classes.Character_And_Body.Body.Organs.Penis;

public class Player extends Character{

    private int arousal;
    private int maxArousal;
    private int stamina;
    private int maxStamina;

    public Player(String name, int height, float weight, Race race, BreastSize breastSize, int penisLength,
                  HairColor hairColor, HairLength hairLength, HairStyle hairStyle, Gender gender) {

        super(name, height, weight, race, breastSize, penisLength, hairColor, hairLength, hairStyle, gender);
        this.arousal = 0;
        this.maxArousal = 100;
        this.stamina = 100;
        this.maxStamina = 100;
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

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }
}

