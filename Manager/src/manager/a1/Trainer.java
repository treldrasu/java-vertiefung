package manager.a1;

import manager.a1.Main.PlayerException;

public class Trainer extends Akteur {

	public int erfahrung;

	public Trainer(String name, int alter, int erfahrung) throws PlayerException{
		super(name, PlayerException.alterValide(alter));
		this.erfahrung = erfahrung;
	}
	
}
