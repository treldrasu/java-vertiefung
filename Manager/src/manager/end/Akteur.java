package manager.end;

import manager.exceptions.PlayerException;

public abstract class Akteur {
	public int alter;
	public String name;

	public Akteur(String name, int alter){
		this.alter = PlayerException.alterValide(alter);
		this.name = name;
	}
}
