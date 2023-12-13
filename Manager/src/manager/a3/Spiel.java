package manager.a3;

import java.util.Random;

public class Spiel {
	public Mannschaft heim;
	public Mannschaft gast;
	public int heimScore = 0;
	public int gastScore = 0;
	Random ran = new Random();

	public Spiel(Mannschaft heim, Mannschaft gast) {
		this.heim = heim;
		this.gast = gast;
	}
	
	public Boolean torchance(Spieler s, Torwart t, int aktuelleZeit, String m) {
		System.out.println("Minute: "+ aktuelleZeit + " -> "+ s.name + "("+ m +") vs. " + t.name);
//		System.err.println(ran.nextInt((s.torschuss + t.reaktion)) - s.torschuss);
		return (ran.nextInt((s.torschuss + t.reaktion)) - s.torschuss < 0);
	}

	public void starteSpiel() {
		int staerkeHeim = ermittleStaerke(heim);
		int staerkeGast = ermittleStaerke(gast);
		int aktuelleZeit = 0;

		do {
			aktuelleZeit += (int) (Math.random() * 15 + 1);
			if (ran.nextInt((staerkeGast + staerkeHeim)) - staerkeHeim < 0) {
				Spieler s = gast.spieler.get((int) (Math.random() * 10 + 1));
				Torwart t = (Torwart) heim.spieler.get(0);
				if (torchance(s, t, aktuelleZeit, gast.mannschaftsName)) {
					gastScore++;
					System.out.println( " TOR! ");
				}
			} else {
				Spieler s = heim.spieler.get((int) (Math.random() * 10 + 1));
				Torwart t = (Torwart) gast.spieler.get(0);
				if (torchance(s, t, aktuelleZeit, heim.mannschaftsName)) {
					heimScore++;
					System.out.print( " TOR! ");
				}
			}
		} while (aktuelleZeit < 90);
	}

	private int ermittleStaerke(Mannschaft m) {
		return (int) ((m.durchStaerke() * 0.8) + (m.durchMotivation() * 0.15) + (m.trainer.erfahrung * 0.05));
	}
}
