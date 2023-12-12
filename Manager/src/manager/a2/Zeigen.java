package manager.a2;

import java.util.ArrayList;

public class Zeigen {
    public static void main(String[] args) {
        
        Trainer t = new Trainer("Peter", 55, 88);
        Torwart tw = new Torwart("Kahn", 45, 90, 10, 99, 89);
        ArrayList<Spieler> kader = new ArrayList<>();
        kader.add(tw);
        for (int i = 0; i < 10; i++) {
            kader.add(new Spieler("Spieler"+i, 23, (int)Math.random()*100, (int)Math.random()*100, (int)Math.random()*100));
        }

        Team bayern = new Team("Bayern", t, tw, kader);

        System.out.println(bayern); 

    }
}
