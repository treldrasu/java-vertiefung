package Krankehaeuser;

import java.util.Comparator;

public class SortKrankenhaeuser2 implements Comparator<Krankenhaus>{

	@Override
	public int compare(Krankenhaus o1, Krankenhaus o2) {
		//anz Betten
		int anzBetten = o1.betten - o2.betten;
		int frei = (o2.betten-o2.anz_inf_per) - (o1.betten-o1.anz_inf_per);
		
		if(anzBetten != 0) {
			return anzBetten;
		}else if(frei != 0) {
			return frei;
		}
		return 0;
	}

}
