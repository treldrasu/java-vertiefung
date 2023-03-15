package Studen;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int v = o1.rollno - o2.rollno;
//		System.out.println("t:" + v);
		return v;
	}

}
