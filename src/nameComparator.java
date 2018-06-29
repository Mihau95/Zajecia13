import java.util.Comparator;

class nameComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer c1, Computer c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
