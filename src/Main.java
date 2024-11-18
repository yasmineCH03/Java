
import entities.Animal;
import entities.*;

public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Canidés", "Loup", 5, true);
        Aquatic aquaticAnimal = new Aquatic("Poissons", "Poisson-Clown", 2, false, "Récif de corail");
        Terrestrial terrestrialAnimal = new Terrestrial("Félins", "Tigre", 8, true, 4);
        Dolphin dolphin = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 25.5f);
        Penguin penguin = new Penguin("Oiseaux", "Pingouin", 3, false, "Antarctique", 100.0f);

        System.out.println(animal);
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
    }
}