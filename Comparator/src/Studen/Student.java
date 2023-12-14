package Studen;

public class Student {
	int rollno;
	String vorname;
	String nachname;
	
	public Student(int rollno, String vorname, String nachname) {
		this.rollno = rollno;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	@Override
	public String toString() {
		return this.rollno +" "+ this.vorname +" "+ this.nachname;
	}

// 	@Override
// 	public int compareTo(Student o) {
// //		if(this.rollno < o.rollno) {
// //			return -1;
// //		}else if(this.rollno > o.rollno) {
// //			return 1;
// //		}
// //		return 0;
		
// 		return this.rollno - o.rollno;
// 	}

		
}
