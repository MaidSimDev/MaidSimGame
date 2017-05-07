package classes.character_and_body;

public enum Race {
    HUMAN("Human"),
    ELF("Elf"),
    NEKOMIMI("Nekomimi"),
    KITSUNEMIMI("Kitsunemimi"),
    GOOGIRL("Googirl"),
    DEMON("Demon");

    private final String raceName;
    Race(String raceName){
        this.raceName = raceName;
    }
}
