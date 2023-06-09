package hr.fer.oop.zad4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grades2 {
	private Map<String, List<Integer>> studentsGrades;

	public Grades2() {
		studentsGrades = new HashMap<>();
	}

	public void add(String student, Integer grade) {
		List<Integer> values = studentsGrades.get(student);
		if (values == null) {
			values = new LinkedList<Integer>();
			studentsGrades.put(student, values);
		}
		values.add(grade);
	}

	public void avgGrades() {
		double avg = 0;
		for (String name : studentsGrades.keySet()) {
			double avgStud = 0;
			List<Integer> grades = studentsGrades.get(name);
			for (Integer grade : grades)
				avgStud += grade;
			avgStud /= grades.size();
			System.out.println(name + " : " + grades + " " + avgStud);
			avg += avgStud;
		}
		System.out.println("Average grade: " + avg/studentsGrades.size());
	}

	public static void main(String[] args) {
		Grades2 g = new Grades2();
		
		g.add("Marko", 5);
		g.add("Iva", 3);
		g.add("Ivana", 5);
		g.add("Matteo", 2);
		g.add("Mario", 1);
		
		g.add("Mario", 4);
		g.add("Mario", 4);
		
		g.avgGrades();
	}
}
