package entities;
import exceptions.ZooFullException;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals;
    Aquatic[] aquaticAnimals = new Aquatic[10];
    int nbrAquaticAnimals = 0;

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void addAnimal(Animal animal) throws ZooFullException, Exception {
        if (searchAnimal(animal) != -1) {
            throw new Exception("L'animal " + animal.getName() + " existe déjà dans le zoo.");
        }
        if (isZooFull()) {
            throw new ZooFullException("Impossible d'ajouter l'animal. Le zoo est plein.");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    /*public void addAnimal(Animal animal) throws Exception {
        if (searchAnimal(animal) != -1) {
            throw new Exception("L'animal " + animal.getName() + " existe déjà dans le zoo.");
        }
        if (isZooFull()) {
            throw new Exception("Impossible d'ajouter l'animal. Le zoo est plein.");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }*/

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void showAquaticAnimals() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println(aquatic.getName() + " ajouté au zoo.");
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux aquatiques.");
        }
    }

    public Zoo (String name, String city, int i)
    {
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;
    }
    public void displayZoo() {
        System.out.println("Animaux dans le zoo " + name + " :");
        for (int i = 0; i < nbrAnimals; i++) {
            Animal animal = animals[i];
            System.out.println("Famille: " + animal.family + ", Nom: " + animal.name +
                    ", Âge: " + animal.age + ", Mammifère: " + animal.isMammal);
        }
    }


    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int deletedIndex = searchAnimal(animal);
        animals[deletedIndex] = null;
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;

    }

    @Override
    public String toString() {
        return "name : " + name + " city : " + city + "nbrCages : " + nbrCages + "animals numbers  : " + nbrAnimals;

    }
    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            System.out.println("Le zoo avec le plus d'animaux est : " + z1.name);
            return z1;
        } else if (z1.nbrAnimals < z2.nbrAnimals) {
            System.out.println("Le zoo avec le plus d'animaux est : " + z2.name);
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux : " + z1.nbrAnimals);
            return null;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne doit pas être vide");
        }
    }
}