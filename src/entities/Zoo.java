package entities;

public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    private int count = 0;
    final int nbrCages=25;

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty())
            System.out.println("entities.Zoo name can't be an empty string");
        else
            this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.setName(name);
        this.setCity(city);
    }

    // ... autres methods ...

    public boolean addAnimal(Animal animal) {
        if(isZooFull()){
            animals[count] = animal;
            count++;
            System.out.println("Animal ajouté avec success !");
            return true;
        }
        return false;
    }




    public void displayAnimals() {
        for (Animal i : animals) {
            if (i != null) {
                System.out.println(i.getName());
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int deleteIndex= searchAnimal(animal);
        animals[deleteIndex] = null;
        return true;
    }

    public boolean isZooFull(){
        if(count < nbrCages){
            System.out.println("Zoo is not Full");
            return false;
        }
        else
            System.out.println("Zoo Full");
        return true;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.count>=z2.count)
        {
            System.out.println(z1.getName()+" have more animals than "+z2.getName());
            return z1;
        }
        else {
            System.out.println(z2.getName()+" have more animals than "+z1.getName());
            return z2;
        }
    }

}