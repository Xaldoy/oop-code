package hr.fer.oop.lastreams;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private String lastName;
	private String firstName;
	private String StudentID;
	private int points;

	public Student(String lastName, String firstName, String studentID, int points) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		StudentID = studentID;
		this.points = points;
	}

	static final Comparator<Student> BY_FIRST_NAME = (a, b) -> a.firstName.compareTo(b.firstName);
	static final Comparator<Student> BY_STUDENT_ID = (a, b) -> a.StudentID.compareTo(b.StudentID);
	static final Comparator<Student> BY_POINTS = (a, b) -> Integer.compare(a.points, b.points);

	@Override
	public int compareTo(Student o) {
		return this.StudentID.compareTo(o.StudentID);
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", StudentID=" + StudentID + ", points="
				+ points + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(StudentID, firstName, lastName, points);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(StudentID, other.StudentID) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && points == other.points;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getStudentID() {
		return StudentID;
	}

	public int getPoints() {
		return points;
	}

	private static Comparator<Object> hrcomparator = Collator.getInstance(Locale.forLanguageTag("hr"));
	static final Comparator<Student> BY_LAST_NAME = (a, b) -> hrcomparator.compare(a.lastName, b.lastName);
	
}
