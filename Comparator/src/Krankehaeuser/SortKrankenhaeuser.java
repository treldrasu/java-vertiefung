package Krankehaeuser;

import java.util.Comparator;

public class SortKrankenhaeuser implements Comparator<Krankenhaus>{

	@Override
	public int compare(Krankenhaus o1, Krankenhaus o2) {
		//nach BW
		return o1.bundesland_kuerzel.compareTo(o2.bundesland_kuerzel);
	}

}
