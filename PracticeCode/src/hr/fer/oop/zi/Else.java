package hr.fer.oop.zi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Else {
	public static void main(String[] args) {
		StudentFactory<Student> factory = Student::new;
		List<Student> startswithA = new ArrayList<>();
		fillStudentsCollection(startswithA, factory, a -> a.getLastName().startsWith("A"));
		Common.printCollection(startswithA);
		//TreeSet<Student2> students2 = new TreeSet<>(new Student2.StudentComparator());
		TreeSet<Student> students3 = new TreeSet<Student>(startswithA);
		Common.printCollection(students3);
	}

	public static <S extends Student> void fillStudentsCollection(Collection<S> col, StudentFactory<S> factory,
			Predicate<S> condition) {
		List<S> students = new ArrayList<>();
		students.add(factory.create("Black", "Joe", "1234567890"));
		students.add(factory.create("Abram", "Mean", "235532535"));
		students.add(factory.create("Anto", "Savic", "123641664"));
		students.add(factory.create("Jack", "Jones", "14361374743"));
		students.add(factory.create("Matej", "Jurisic", "14743737"));
		for(S student: students) {
			if (condition.test(student))
				col.add(student);
		}
	}
}
