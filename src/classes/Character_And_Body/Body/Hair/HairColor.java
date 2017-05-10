package classes.Character_And_Body.Body.Hair;

public enum HairColor {

    BLACK("Black"),
    RED("Red"),
    BLOND("Blond"),
    BROWN("Brown"),
    GREY("Grey"),
    ASHEN("Ashen"),
    WHITE("White"),
    SILVER("Silver");

    private final String name;

    HairColor(String name) {
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
