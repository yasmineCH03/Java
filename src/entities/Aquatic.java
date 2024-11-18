package entities;


public sealed class Aquatic extends Animal permits Dolphin, Penguin{
    String habitat;

    public Aquatic(String family,String name,int age,boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Getters et Setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat='" + habitat + "'";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}