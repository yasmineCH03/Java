package entities;

public abstract class Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pattes='" + nbrLegs + "'";
    }

    // Implementing the entities.Omnivore interface methods
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat " + meat + ".");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " is eating plants.");
        } else {
            System.out.println(name + " cannot eat " + plant + ".");
        }
    }

    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " is eating both meat and plants.");
        } else {
            System.out.println(name + " needs both types of food to eat properly.");
        }
    }
}
