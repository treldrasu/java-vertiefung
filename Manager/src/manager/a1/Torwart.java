package manager.a1;

import manager.a1.Main.PlayerException;

public class Torwart extends Spieler {

	public int reaktion;
	
	public Torwart(String name, int alter, int staerke, int torschuss, int motivation, int reaktion) throws PlayerException {
		super(name, alter, staerke, torschuss, motivation);
		this.reaktion = reaktion;
	}

	public Boolean haeltSchuss() {
		return false;
	}
	
}
