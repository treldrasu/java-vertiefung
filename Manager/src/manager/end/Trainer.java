package manager.end;

import manager.a2.Akteur;
import manager.exceptions.PlayerException;

public class Trainer extends Akteur {

	public int erfahrung;

	public Trainer(String name, int alter, int erfahrung) throws PlayerException{
		super(name, PlayerException.alterValide(alter));
		this.erfahrung = erfahrung;
	}
	
}
