
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        SocieteArrayList list = new SocieteArrayList();
        Employe e1=new Employe(1,"yasmine","chebbi","informatique",1);
        Employe e2=new Employe(2,"Eya","Mosbahi","RH",2);
        Employe e3=new Employe(3,"Amira","Jmaiel","informatique",1);
        list.ajouterEmployee(e1);
        list.ajouterEmployee(e2);
        list.ajouterEmployee(e3);
        list.displayEmployee();
        if (list.rechercherEmployee("yasmine"))
        {
            System.out.println("The employee is found");
        }
        if (list.rechercherEmployee(e2))
        {
            System.out.println("The employee is found by object");
        }
        list.trierEmployeParid();
        list.displayEmployee();
        list.trierEmployeParNomDepartementEtGrade();
        list.displayEmployee();

        list.supprimerEmployee(e3);
        list.displayEmployee();
    }
}