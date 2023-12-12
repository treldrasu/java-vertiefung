package manager.a2;

public class Spieler extends Akteur{

	public int staerke;
	public int torschuss;
	public int motivation;
	private int geschosseneTore;

	public Spieler(String name, int alter, int staerke, int torschuss, int motivation){
		super(name, alter);
		this.staerke = staerke;
		this.torschuss = torschuss;
		this.motivation = motivation;
		this.geschosseneTore = 0;
	}

	@Override
	public String toString() {
		return "Spieler \n[name="+super.name+"\ngeschosseneTore=" + geschosseneTore + "]";
	}

	/**
	 * @return the geschosseneTore
	 */
	public int getGeschosseneTore() {
		return geschosseneTore;
	}

	/**
	 * @param geschosseneTore the geschosseneTore to set
	 */
	public void setGeschosseneTore(int geschosseneTore) {
		this.geschosseneTore = geschosseneTore;
	}

}
