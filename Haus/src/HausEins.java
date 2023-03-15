
public class HausEins {
	public static int breite = 5;
	public static int hoehe = breite/2+1;

	public static void main(String[] args) {
		baueHaus();
	}

	private static void baueHaus() {
		baueDach();
		baueDecke();
		baueWaende();
		baueFundament();
	}


	private static void baueDach() {
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				if(j == (breite/2) && i == 0) {
					System.out.print("x");
				}else if(j == (breite/2)+i) {
					System.out.print("x");
				}else if(j == (breite/2)-i) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void baueWaende() {
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				if(j == 0) {
					System.out.print("x");
				}else if(j == breite-1) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void baueFundament() {
		baueDecke();
	}
	private static void baueDecke() {
		for (int i = 0; i < breite; i++) {
			System.out.print("#");
		}
		System.out.println();
	}

}
