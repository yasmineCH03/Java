import java.util.Comparator;

public class departCret implements Comparator <Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getDebartNom().compareTo(o2.getDebartNom());
    }
}