package Studen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Student> stu = new ArrayList<>();
		stu.add(new Student(131, "aba", "nyc"));
		stu.add(new Student(111, "bbb", "london"));
		stu.add(new Student(141, "aaa", "nyc"));
		stu.add(new Student(131, "aca", "nyc"));
		

		// System.out.println("Unsorted:");
		stu.forEach((s)-> System.out.println(s));
		// for (Student student : stu) {
		// 	System.out.println(student);
		// }
		
		// System.out.println("----------------");
		// //Sortierung!
		// System.out.println("Sort by rollNo");
		// Collections.sort(stu, new SortByRollNo());
		// for (Student student : stu) {
		// 	System.out.println(student);
		// }
		
		// System.out.println("----------------");
		// //Sort nach name
		// Collections.sort(stu, new SortByName());
		// System.out.println("Sorted by name:");
		// for (Student student : stu) {
		// 	System.out.println(student);
		// }
		
	}

}
