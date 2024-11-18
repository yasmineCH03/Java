import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement <Departement>{

    Set<Departement> setDepart = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        setDepart.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : setDepart) {
            if (departement.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherdepartement(Departement departement) {
        return setDepart.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        setDepart.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(setDepart);
    }
    Comparator<Departement> comparator = (o1, o2) -> o1.getNom().compareTo(o2.getNom());
    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(setDepart);
    }
}