import java.util.Comparator;

public class gradeCret implements Comparator <Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getGrade() - o2.getGrade();
    }
}