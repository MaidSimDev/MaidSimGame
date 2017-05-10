package classes.Character_And_Body.Body;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    FUTANARI("Futanari");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }
}
