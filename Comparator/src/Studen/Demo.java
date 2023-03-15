package Studen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		stu.add(new Student(131, "aba", "nyc"));
		stu.add(new Student(111, "bbb", "london"));
		stu.add(new Student(131, "aaa", "nyc"));
		stu.add(new Student(131, "aca", "nyc"));
		stu.add(new Student(121, "ccc", "jaipur"));
		
		System.out.println("Unsorterd:");
		for (Student student : stu) {
			System.out.println(student);
		}
		
		System.out.println("----------------");
		//Sortierung!
		Collections.sort(stu);
		for (Student student : stu) {
			System.out.println(student);
		}
		
		System.out.println("----------------");
		//Sort nach name
		Collections.sort(stu, new SortByName());
		System.out.println("Sorterd by name:");
		for (Student student : stu) {
			System.out.println(student);
		}
		
	}

}
