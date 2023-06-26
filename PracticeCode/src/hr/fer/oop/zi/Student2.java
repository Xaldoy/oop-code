package hr.fer.oop.zi;

import java.util.Comparator;

public class Student2 extends Student{

	public Student2(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
	}

	@Override
	public int compareTo(Student other) {
		return this.studentID.compareTo(other.studentID);
	}
	
	public static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getStudentID().compareTo(o2.getStudentID());
		}
		
	}
	
	
}
