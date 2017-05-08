package classes.Character_And_Body.Body.Hair;

public enum HairLength {

    SHAVED("Shaved"),
    SHORT("Short"),
    SHOULDERLENGTH("Shoulder-length"),
    WAISTLENGTH("Waist-length"),
    HIPLENGTH("Hip-length"),
    KNEELENGHT("Knee-length");

    private final String hairLength;

    HairLength(String hairLength) {
        this.hairLength = hairLength;
    }
}
