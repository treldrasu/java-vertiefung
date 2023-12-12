package manager.end;

import java.util.List;

import manager.a2.Spieler;
import manager.a2.Torwart;
import manager.a2.Trainer;

public class Team {
	String name;
	Trainer trainer;
	Torwart torwart;
	List<Spieler> kader;
	
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", trainer=" + trainer + ", torwart=" + torwart + ", kader=" + kader + "]";
	}

	public Team(String name, Trainer trainer, Torwart torwart, List<Spieler> kader) {
		this.name = name;
		this.trainer = trainer;
		this.torwart = torwart;
		this.kader = kader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Torwart getTorwart() {
		return torwart;
	}

	public void setTorwart(Torwart torwart) {
		this.torwart = torwart;
	}

	public List<Spieler> getKader() {
		return kader;
	}

	public void setKader(List<Spieler> kader) {
		this.kader = kader;
	}

	public int durchStr() {
		return 0;
	}
	
	public int durchMot() {
		return 0;
	}
}
