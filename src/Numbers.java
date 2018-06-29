import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Numbers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RandomNumbers");
        Scanner scanner = new Scanner(file);

        int [] tab = new int[30];

        for (int x=0; x<30; x++){
            tab[x] = scanner.nextInt();
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        System.out.println(tab[0]);
        System.out.println(tab[tab.length-1]);
        System.out.println(Arrays.binarySearch(tab,15));
    }
}
