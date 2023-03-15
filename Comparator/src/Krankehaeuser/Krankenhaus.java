package Krankehaeuser;

import java.util.List;

public class Krankenhaus {
	
	int betten;
	int aerzte;
	int pflege_personal;
	String bundesland_kuerzel;
	int anz_inf_per;
	List<Virologe> virologen;
	
	public Krankenhaus(int betten, int pflege_personal, String bundesland_kuerzel, int anz_inf_per,
			List<Virologe> virologen) {
		this.betten = betten;
		this.aerzte = virologen.size();
		this.pflege_personal = pflege_personal;
		this.bundesland_kuerzel = bundesland_kuerzel;
		this.anz_inf_per = anz_inf_per;
		this.virologen = virologen;
	}

	@Override
	public String toString() {
		return "Krankenhaus [\n betten=" + betten + ", \n aerzte=" + aerzte + ", \n pflege_personal=" + pflege_personal
				+ ",  \n bundesland_kuerzel=" + bundesland_kuerzel + ", \n anz_inf_per=" + anz_inf_per + ", \n virologen:"
				+ virologen + "\n]";
	}
}
