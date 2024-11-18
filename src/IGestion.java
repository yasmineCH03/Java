public interface IGestion <T>{
    public void ajouterEmployee(T employee);
    public void supprimerEmployee(T employee);
    public void displayEmployee();
    public boolean rechercherEmployee(String nom);
    public boolean rechercherEmployee(T employee);
    public void trierEmployeParid();//comparable
    public void trierEmployeParNomDepartementEtGrade(); //comparator
}