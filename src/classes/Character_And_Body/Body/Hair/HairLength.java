package classes.Character_And_Body.Body.Hair;

public enum HairLength {

    SHAVED("Shaved"),
    SHORT("Short"),
    SHOULDERLENGTH("Shoulder-length"),
    WAISTLENGTH("Waist-length"),
    HIPLENGTH("Hip-length"),
    KNEELENGHT("Knee-length");

    private final String name;

    HairLength(String name) {
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
