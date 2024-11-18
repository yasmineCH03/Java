import java.util.*;
public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> Employees = new ArrayList();

    @Override
    public void ajouterEmployee(Employe employee) {
        Employees.add(employee);
    }

    @Override
    public void supprimerEmployee(Employe employee) {
        Employees.remove(employee);
    }

    @Override
    public void displayEmployee() {
        System.out.println(Employees);
    }

    @Override
    public boolean rechercherEmployee(String nom) {

        final boolean[] found = {false};


        Employees.forEach(e -> {
            if (e.getNom().equals(nom)) {
                found[0] = true;
            }
        });

        return found[0];
    }

    @Override
    public boolean rechercherEmployee(Employe employee) {

        return Employees.contains(employee);
    }

    @Override
    public void trierEmployeParid() {
        Collections.sort(Employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        nomCret nc = new nomCret();
        departCret dc = new departCret();
        gradeCret gc = new gradeCret();
        Collections.sort(Employees,nc.thenComparing(dc).thenComparing(gc));
    }
}