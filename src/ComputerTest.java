import java.util.*;

public class ComputerTest {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("ABC", 76, 12));
        computers.add(new Computer("DEF", 43, 88));
        computers.add(new Computer("GHI", 21, 62));
        computers.add(new Computer("JKL", 30, 128));

        System.out.println("Wybierz metode sortowania: 1(nazwa), 2(cpu), 3(ram)");
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        x = scanner.nextInt();


        if (x == 1) {
            nameComparator nameComparator = new nameComparator();
            Collections.sort(computers, nameComparator);
            System.out.println("Segregacja po nazwie:");
            System.out.println(computers);
        } else if (x == 2) {
            cpuComparator cpuComparator = new cpuComparator();
            Collections.sort(computers, cpuComparator);
            System.out.println("Segregacja po predkosci procesora: ");
            System.out.println(computers);
        } else if (x == 3) {
            ramComparator ramComparator = new ramComparator();
            Collections.sort(computers, ramComparator);
            System.out.println("Segregacja po ilosci pamieci ram: ");
            System.out.println(computers);
        } else
            System.out.println("Bledna liczba");

    }
}
