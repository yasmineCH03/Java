public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int count = 0;
    final int nbrCages=25;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages]; // Correction ici
        this.name = name;
        this.city = city;

    }


    boolean addAnimal(Animal animal) {
        if(searchAnimal(animal)==-1 && count < nbrCages ){
            animals[count] = animal;
            count++;
            System.out.println("Animal ajouté avec succès !");
            return true;
        }
        return false;
    }




    void displayAnimals() {
        for (Animal i : animals) {
            if (i != null) {
                System.out.println(i.name);
            }
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i; // Retourne l'index si l'animal est trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé dans tout le tableau
    }

    boolean removeAnimal(Animal animal) {
        int deleteIndex= searchAnimal(animal);
        animals[deleteIndex] = null;
        return true;
    }
    boolean isZooFull(){
        if (count == nbrCages) {
            System.out.println("Zoo Full");
            return true;
        }
        return false;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.count>=z2.count) return z1;
        else return z2;
    }

}