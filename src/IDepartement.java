import java.util.TreeSet;

public interface IDepartement <T>{
    public void ajouterDepartement(T departement);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherdepartement(T departement);
    public void supprimerDepartement(T departement);
    public void displayDepartement();
    public TreeSet<Departement> trierDepartementById();
}