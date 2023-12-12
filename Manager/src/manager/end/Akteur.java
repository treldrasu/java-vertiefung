package manager.end;


public abstract class Akteur {
	public int alter;
	public String name;

	public Akteur(String name, int alter) {
		this.alter = alter;
		this.name = name;
	}
}
