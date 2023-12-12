package manager.a2;

public class Torwart extends Spieler {

	public int reaktion;
	
	public Torwart(String name, int alter, int staerke, int torschuss, int motivation, int reaktion){
		super(name, alter, staerke, torschuss, motivation);
		this.reaktion = reaktion;
	}

	public Boolean haeltSchuss() {
		return false;
	}
	
}
