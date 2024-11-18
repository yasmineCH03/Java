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
}