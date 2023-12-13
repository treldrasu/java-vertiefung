package manager.a3;

import java.util.List;

public class Mannschaft extends Kader{
	public Trainer trainer;
	public String mannschaftsName;
	
	public Mannschaft(List<Spieler> spieler, String mannschaftsName, Trainer trainer) throws Exception{
		super(spieler);
		this.mannschaftsName = mannschaftsName;
		this.trainer = trainer;
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret = ret.concat("-- " + mannschaftsName+ " ---\n");
		ret = ret.concat("Trainer : " + trainer.name + "\n");
		ret = ret.concat("-----------------\n");
		for(Spieler spieler : super.spieler) {
			if(spieler instanceof Torwart) {
				ret = ret.concat("Tor : "+ spieler.name +" "+ spieler.staerke +
								 " "+ spieler.motivation + "\n");
			}else {
				ret = ret.concat("Feld: "+ spieler.name +" "+ spieler.staerke +" "+ spieler.motivation +" "+spieler.torschuss+ "\n");
			}
		}
		
		return ret;
	}
}
