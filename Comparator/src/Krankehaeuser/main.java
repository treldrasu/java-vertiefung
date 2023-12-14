package Krankehaeuser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {

		//Virologen
		List<Virologe> vir = new ArrayList<>(Arrays.asList(
				 new Virologe("Peter", "Petersen", 10),
				 new Virologe("Dougy", "Hauser", 5)
				));
		
		List<Krankenhaus> k = new ArrayList<>(Arrays.asList(
					new Krankenhaus(222, 20, "BW", 5, Arrays.asList(
							 new Virologe("Peter", "Petersen", 10),
							 new Virologe("Peter", "Petersen", 2),
							 new Virologe("Peter", "Petersen", 20),
							 new Virologe("Peter", "Petersen", 8),
							 new Virologe("Peter", "Petersen", 7),
							 new Virologe("Dougy", "Hauser", 2)
							)),
					new Krankenhaus(222, 200, "RP", 100, new ArrayList<>(Arrays.asList(
							 new Virologe("Peter", "Petersen", 10),
							 new Virologe("Dougy", "Hauser", 5)
							))),
					new Krankenhaus(88, 40, "B", 15, new ArrayList<>(Arrays.asList(
							 new Virologe("Peter", "Petersen", 1),
							 new Virologe("Peter", "Petersen", 3),
							 new Virologe("Peter", "Petersen", 2),
							 new Virologe("Dougy", "Hauser", 2)
							)))
				));
		
		for (Krankenhaus krankenhaus : k) {
			System.out.println(krankenhaus);
		}
		Collections.sort(k, new SortKrankenhaeuser());
		System.out.println("1 Sorted:");
		for (Krankenhaus krankenhaus : k) {
			System.out.println(krankenhaus);
		}
		
		Collections.sort(k, new SortKrankenhaeuser2());
		System.out.println("2 Sorted:");
		for (Krankenhaus krankenhaus : k) {
			System.out.println(krankenhaus);
		}
		
		
		Collections.sort(k, new SortKrankenhaeuser3());
		System.out.println("3 Sorted:");
		for (Krankenhaus krankenhaus : k) {
			System.out.println(krankenhaus);
		}
		
		
		
	}

}
