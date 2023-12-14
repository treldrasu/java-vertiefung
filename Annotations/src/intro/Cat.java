package intro;


@VeryImpawtant(times = 10, format = "### €")
public class Cat {
	@ImportantString 
	private final String name;
	
	@ImportantString
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void meow() {
		System.out.println("Meow");
	}
	
	private void heyThisIsPrivate() {
		System.out.println("Wie kannst du mich nur aufrufen!");
	}
	
	public static void publicAndStatic() {
		System.out.println("Ich bin Public und static");
	}
	
	private static void geheim() {
		System.out.println("Ich sollte geheim sein!");
	}
	
}
