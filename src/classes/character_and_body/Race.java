package classes.Character_And_Body;

public enum Race {
    HUMAN("Human"),
    ELF("Elf"),
    NEKOMIMI("Nekomimi"),
    KITSUNEMIMI("Kitsunemimi"),
    GOO("Goo"),
    DEMON("Demon");

    private final String name;

    Race(String name) {
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
