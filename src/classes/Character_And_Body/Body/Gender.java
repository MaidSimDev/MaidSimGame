package classes.Character_And_Body.Body;

public enum Gender {
    MALE("Male", "Boy"),
    FEMALE("Female", "Girl"),
    FUTANARI("Futanari", "Futa");

    private final String name;
    private final String nickname;

    Gender(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
