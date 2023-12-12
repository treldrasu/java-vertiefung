package manager.end;

import java.util.ArrayList;
import java.util.List;

import manager.a2.Spieler;
import manager.exceptions.MannschaftException;


public class Kader {
	public List<Spieler> spieler = new ArrayList<Spieler>();
	
	public Kader(List<Spieler> spieler) throws MannschaftException{
			this.spieler = MannschaftException.validateKaderSize(spieler);
	}
	
	
	public int durchMotivation() {
		int motivation= 0;
		for (Spieler spieler : spieler) {
			motivation += spieler.motivation;
		}
		return motivation / spieler.size();
	}
	
	public int durchStaerke() {
		int starke = 0;
		for (Spieler spieler : spieler) {
			starke += spieler.staerke;
		}
		return starke / spieler.size();
	}

}
