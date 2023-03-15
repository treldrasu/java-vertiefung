package Krankehaeuser;

import java.util.Collections;
import java.util.Comparator;

public class SortKrankenhaeuser3 implements Comparator<Krankenhaus>{

	@Override
	public int compare(Krankenhaus o1, Krankenhaus o2) {
		Collections.sort(o1.virologen);
		Collections.sort(o2.virologen);
		
		return o1.aerzte - o2.aerzte;
	}

}
