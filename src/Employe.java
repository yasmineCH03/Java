public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String debartNom;
    private int grade;

    public Employe(int id, String nom, String prenom, String debartNom, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.debartNom = debartNom;
        this.grade = grade;
    }

    public Employe() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.debartNom = "";
        this.grade = 0;
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
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDebartNom() {
        return debartNom;
    }
    public void setDebartNom(String debartNom) {
        this.debartNom = debartNom;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()) {
            return false;
        }
        Employe emp = (Employe) obj;
        return emp.id == this.id && this.nom.equals(emp.nom);
    }

    @Override
    public String toString() {
        return "employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", debartNom='" + debartNom + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }
}