package manager.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager {
    public static void main(String[] args) throws Exception{
        System.out.println("##### Manager Spiel #####");

        //Team 1
        Trainer t1 = new Trainer("Kai", 36  , 100);
        Torwart tw = new Torwart("Kahn", 45, 80, 20, 89, 99);
        List<Spieler> kader = generiereSpieler(10);
        kader.add(tw);

        Mannschaft bay = new Mannschaft(kader, "Bayern", t1);
        // System.out.println(bay);

        //Team 2
        Trainer t2 = new Trainer("Hansi", 44, 80);
        Torwart tw2 = new Torwart("Peter", 13, 60, 30, 80, 79);
        List<Spieler> kader2 = generiereSpieler(10);
        kader2.add(tw2);

        Mannschaft hsv = new Mannschaft(kader2, "HSV", t2);
        // System.out.println(hsv);


        //Freundschaftsspiel
        Freundschaftsspiel fp = new Freundschaftsspiel(bay, hsv);
        fp.starteSpiel();


        //ende
        System.out.println("");
        System.out.println("##### Spiel Ende #####");
    }

    private static List<Spieler> generiereSpieler(int anzahl) {
        Random random = new Random();
        List<Spieler> kader = new ArrayList<>();
        for (int j = 0; j < anzahl; j++) {
            kader.add(new Spieler("Spieler"+j, random.nextInt(30), random.nextInt(50)+49, random.nextInt(50)+49, random.nextInt(50)+49));
        }
        return kader;
    }
}
