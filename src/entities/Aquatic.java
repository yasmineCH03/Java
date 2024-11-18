package entities;


public sealed abstract class Aquatic extends Animal permits Dolphin, Penguin{
    String habitat;

    public Aquatic(String family,String name,int age,boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // Vérifie si l'objet est nul
        if (obj instanceof Aquatic aquatic) { // Vérifie si l'objet est une instance d'Aquatic
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat); // Compare l'âge, le nom et l'habitat
        }
        return false; // Retourne faux si ce n'est pas un Aquatic
    }

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

    public abstract void swim();
}