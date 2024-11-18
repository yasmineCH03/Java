

import entities.Animal;
import entities.*;
import entities.Zoo;

public class Main{
    public static void main(String[] args) {
        /*Animal animal = new Animal("Canidés", "Loup", 5, true);
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
        penguin.swim();*/

        Zoo zoo = new Zoo("hammamet","test");

        Animal animalDolphin1 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 25.5f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin1);  // Upcasting Dolphin -> Aquatic

        Animal animalDolphin2 = new Dolphin("Cétacés", "Dauphin", 6, true, "Océan", 30.8f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin2);

        Animal animalDolphin3 = new Dolphin("Cétacés", "Dauphin", 9, true, "Océan", 30.8f);
        zoo.addAquaticAnimal((Aquatic) animalDolphin3);

        Animal animalPenguin = new Penguin("Oiseaux", "Pingouin", 3, false, "Antarctique", 100.0f);
        zoo.addAquaticAnimal((Aquatic) animalPenguin);

        Animal secondPenguin = new Penguin("Oiseaux", "Pingouin", 4, false, "Antarctique", 200.0f);
        zoo.addAquaticAnimal((Aquatic) secondPenguin);

        zoo.showAquaticAnimals();

        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxDepth + " mètres.");

        zoo.displayNumberOfAquaticsByType();

        System.out.println(animalDolphin1.equals(animalDolphin2));
        System.out.println(animalDolphin1.equals(animalDolphin3));
    }

}