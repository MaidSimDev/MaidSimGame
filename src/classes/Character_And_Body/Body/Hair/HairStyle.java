package classes.Character_And_Body.Body.Hair;

public enum HairStyle {

    STRAIGHT("Straight"),
    CURLED("Curled"),
    BRAIDED("Braided"),
    PONYTAIL("Ponytail"),
    PIGTAILS("Pigtails");

    private final String hairStyle;

    HairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }
}
