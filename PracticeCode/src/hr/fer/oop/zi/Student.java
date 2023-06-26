package hr.fer.oop.zi;

public class Student implements Comparable<Student>{
	final  String lastName;
	final  String firstName;
	final  String studentID;

	public Student(String lastName, String firstName, String studentID) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", studentID=" + studentID + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getStudentID() {
		return studentID;
	}

	@Override
	public int compareTo(Student o) {
		return this.studentID.compareTo(o.studentID);
	}

}
