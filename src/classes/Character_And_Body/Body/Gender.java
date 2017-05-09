package classes.Character_And_Body.Body;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    FUTANARI("Futanari");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return this.gender;
    }
}
