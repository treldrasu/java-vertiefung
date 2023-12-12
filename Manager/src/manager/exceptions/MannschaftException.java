package manager.exceptions;

import java.util.List;

import manager.a2.Spieler;

public class MannschaftException extends Exception {

	public MannschaftException(String e) {
		super(e);
	}

	public static List<Spieler> validateKaderSize(List<Spieler> spieler) throws MannschaftException {
		System.out.println(spieler.size());
		if (spieler.size() != 11)
			throw new MannschaftException("Kader Size falsch: " + spieler.size());
//		if(spieler enthält 1 > torwart)
//			throw new MannschaftException("Zuviele Torwärte: " + spieler.size());
		return spieler;
	}
}
