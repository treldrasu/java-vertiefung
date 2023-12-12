package manager.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import manager.a1.*;
import manager.a2.Mannschaft;
import manager.a2.Spiel;
import manager.a2.Spieler;
import manager.a2.Torwart;
import manager.a2.Trainer;
import manager.exceptions.MannschaftException;
import manager.exceptions.PlayerException;

public class Main {
		static Random ran = new Random();
	public static void main(String[] args){

		generiereSpiel();
	}

	private static void generiereSpiel() {
		
		Trainer trainer; 
		try {
			trainer = new Trainer("Hans", 0, 88);
		}catch (PlayerException e) {
			System.out.println("Alter war falsch, standard gesetzt");
			trainer = new Trainer("Trainer BOT", 50, 88);
		}

		Torwart torwart = new Torwart("Torwart", 0, 80, 10, 75, 80);
		List<Spieler> spieler = new ArrayList<Spieler>();
		spieler.add(torwart);
		for (int i = 1; i <= 10; i++) {
			spieler.add(new Spieler("Spieler" + i, (ran.nextInt(30)+16), (ran.nextInt(29) + 70), (ran.nextInt(29) + 70),
					(ran.nextInt(29) + 70)));
		}
		
		Trainer trainer2 = new Trainer("Peter", 67, 90);
		Torwart tor = new Torwart("Kahn", 38, 80, 25, 80, 99);
		List<Spieler> spieler2 = new ArrayList<Spieler>();
		spieler2.add(tor);
		for (int i = 1; i <= 10; i++) {
			spieler2.add(new Spieler("Spieler" + i, 18, (ran.nextInt(29) + 70), (ran.nextInt(29) + 70),
					(ran.nextInt(29) + 70)));
		}

		try {
			Mannschaft mannschaft = new Mannschaft(spieler, "FC Ungl�ck", trainer);
			Mannschaft mannschaft2 = new Mannschaft(spieler2, "Bayern", trainer2);

			System.out.println(mannschaft.toString());
			System.out.println("####################");
			System.out.println(mannschaft2.toString());

			Spiel spiel = new Spiel(mannschaft, mannschaft2);

			spiel.starteSpiel();
			System.out.println(spiel.heim.mannschaftsName + "> " + spiel.heimScore + ":" + spiel.gastScore + " <"
					+ spiel.gast.mannschaftsName);
			
		} catch (Exception e) {
			if(e instanceof MannschaftException)
				System.err.println("Fehler mannschaft: " + e.toString());
		}
		System.out.println("after Catch");
	}
}
