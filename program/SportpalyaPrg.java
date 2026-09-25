package program;

import classes.AsztalteniszPalya;
import classes.FallabdaPalya;
import classes.Sportpalya;
import classes.Teniszpalya;

import java.util.ArrayList;
import java.util.Locale;

public class SportpalyaPrg {

    static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        ArrayList<Sportpalya> sportpalyak = new ArrayList<>();

        sportpalyak.add(new AsztalteniszPalya("A99", 4500, "10.0m x 8.2m", "kék"));
        sportpalyak.add(new AsztalteniszPalya("A35", 4500, "10.5m x 8.5m", "zöld"));
        sportpalyak.add(new AsztalteniszPalya("A1G", 3500, "8.0m x 7.5m", "kék"));
        sportpalyak.add(new AsztalteniszPalya("A44", 3500, "8.5m x 8.5m", "zöld"));
        sportpalyak.add(new AsztalteniszPalya("A07", 4500, "10.0m x 9.0m", "kék"));
        sportpalyak.add(new AsztalteniszPalya("A0K", 5000, "12.0m x 9.5m", "kék"));

        sportpalyak.add(new Teniszpalya("T01", 8000, "műanyag", false));
        sportpalyak.add(new Teniszpalya("T02", 9500, "műfű", true));

        sportpalyak.add(new FallabdaPalya("F60", 8000, 6.2));
        sportpalyak.add(new FallabdaPalya("F29", 8500, 8));

        System.out.println("Asztaltenisz-pályák: ");
        for(Sportpalya palya : sportpalyak){
            if (palya instanceof AsztalteniszPalya){
                System.out.println("*" + ((AsztalteniszPalya)palya).getParentInfo());
            }
        }

        System.out.println("Fallabda-pályák: ");
        for(Sportpalya palya : sportpalyak){
            if (palya instanceof FallabdaPalya){
                System.out.println("*" + palya.getInfo());
            }
        }

        System.out.println("Teniszpályák: ");
        for(Sportpalya palya : sportpalyak){
            if (palya instanceof Teniszpalya){
                System.out.println("*" + palya.getInfo());
            }
        }

        System.out.println("-------------------------------------");

        int pId = 1;
        for (Sportpalya palya : sportpalyak){
            if (palya instanceof AsztalteniszPalya){
                System.out.printf("P#%d: %s\n%s\n", pId, palya.getKod(), ((AsztalteniszPalya) palya).getInfo());
                pId++;
            }
        }

    }
}
