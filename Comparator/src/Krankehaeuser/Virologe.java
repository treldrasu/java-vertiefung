package Krankehaeuser;

public class Virologe implements Comparable<Virologe>{
	String name;
	String nachname;
	Integer erfahrung_in_jahren;
	
	public Virologe(String name, String nachname, int erfahrung_in_jahren) {
		this.name = name;
		this.nachname = nachname;
		this.erfahrung_in_jahren = erfahrung_in_jahren;
	}

	@Override
	public String toString() {
		return "\n  Virologe: [name=" + name + ", nachname=" + nachname + ", erfahrung_in_jahren=" + erfahrung_in_jahren
				+ "]";
	}

	@Override
	public int compareTo(Virologe o) {
		int erf = this.erfahrung_in_jahren - o.erfahrung_in_jahren;
		int nach = this.nachname.compareTo(o.nachname); 
		return erf != 0 ? erf : nach;
	}
	
	
}
