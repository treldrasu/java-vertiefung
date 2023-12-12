
public class Person {
	//Attribute
	private int alter;
	private String name;
	
	//Constructor
	public Person(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}

	//Getter
	public int getAlter() {
		return alter;
	}
	//Setter
	public void setAlter(int alter) {
		if(alter > 0){
			this.alter = alter;
		}else {
			System.err.println("Altedr kleiner 0");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [alter=" + alter + ", name=" + name + "]";
	}
}
