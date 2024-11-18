import entities.*;
import exceptions.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo("hammamet", "test", 3); // Initialize with 3 cages

        Animal animalDolphin1 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 25.5f);
        try {
            zoo.addAnimal(animalDolphin1);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Animal animalDolphin2 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 30.8f);
        try {
            zoo.addAnimal(animalDolphin2);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Animal animalDolphin3 = new Dolphin("Cétacés", "Dauphin", 9, true, "Océan", 30.8f);
        try {
            zoo.addAnimal(animalDolphin3);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Animal invalidAnimal = new Animal("Aquaatic", "Eya", -5, true);
        try {
            zoo.addAnimal(invalidAnimal);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Animal animalPenguin = new Penguin("Oiseaux", "Pingouin", 3, false, "Antarctique", 100.0f);
        try {
            zoo.addAnimal(animalPenguin);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        zoo.showAquaticAnimals();
        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxDepth + " mètres.");
        zoo.displayNumberOfAquaticsByType();
    }
}
