import javafx.scene.control.ComboBox;

public class Initialiser {
    
    /**
     *
     */
    
    public static void initialise(ComboBox charGenderCB, ComboBox charRaceCB, ComboBox charBoobsCB, ComboBox charDickCB) {
        charGenderCB.getItems().addAll("Female", "Futanari", "Male");
        charRaceCB.getItems().addAll("Human", "Elf", "Cathuman", "Foxhuman", "Goo", "Demon");
        charBoobsCB.getItems().addAll("None", "Small", "Smallish", "Medium", "Big", "Huge");
        charDickCB.getItems().addAll("None", "Small", "Smallish", "Medium", "Big", "Huge");
    }
    
}
