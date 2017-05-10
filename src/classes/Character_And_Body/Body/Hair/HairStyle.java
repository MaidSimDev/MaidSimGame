package classes.Character_And_Body.Body.Hair;

public enum HairStyle {

    STRAIGHT("Straight"),
    CURLED("Curled"),
    BRAIDED("Braided"),
    PONYTAIL("Ponytail"),
    PIGTAILS("Pigtails");

    private final String name;

    HairStyle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }
}
