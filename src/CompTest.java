import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CompTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Computer>comps = new ArrayList<>();
        comps.add(new Computer("Turbo",2500,8));
        comps.add(new Computer("Zurbo",3500,6));
        comps.add(new Computer(null,4500,8));
        comps.add(null);
        comps.add(new Computer("Kurbo",3500,6));
        comps.add(new Computer("Durbo",3500,7));

        System.out.println("Po czym sortujemy? nazwa, cpu, ram");
        String choice = sc.nextLine();
        switch(choice){
            case "nazwa":
                Collections.sort(comps, new NameComparator());
                break;
            case"cpu":
                Collections.sort(comps,new TimingComparator());
                break;
            case "ram":
                Collections.sort(comps, new MemoryComparator());
                break;
            default:
                System.out.println("Wybrałeś nieprawidłową opcję");
        }
        for (Computer comp : comps) {
            System.out.println(comp);
            System.out.println("\n");

        }
    }
}
