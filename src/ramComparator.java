import java.util.Comparator;

public class ramComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer c1, Computer c2) {
        if(c1.getRam()>c2.getRam())
            return 1;
        else if(c1.getRam() == c2.getRam())
            return 0;
        else
            return -1;
    }
}
