import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nom;
    private int nbEmployees;

    public Departement(int id, String nom, int nbEmployees) {
        this.id = id;
        this.nom = nom;
        this.nbEmployees = nbEmployees;
    }
    public Departement() {
        this.id = 0;
        this.nom = "";
        this.nbEmployees = 0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbEmployees() {
        return nbEmployees;
    }
    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbEmployees == that.nbEmployees && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nbEmployees);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployees=" + nbEmployees +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id - o.id;
    }
}