package hr.fer.oop.zad4;

import java.util.HashMap;
import java.util.Map;

public class Grades1 {

	private Map<String, Integer> grades;

	public Grades1() {
		grades = new HashMap<>();
	}

	public void add(String student, Integer grade) {
		grades.put(student, grade);
	}

	public void avgGrades() {
		double sum = 0;
		for(Map.Entry<String, Integer> grade : grades.entrySet()) {
			sum+= grade.getValue();
		}
		System.out.println("Average grade: " + sum / grades.size());
	}
	
	public static void main(String[] args) {
		Grades1 g = new Grades1();
		
		g.add("Marko", 5);
		g.add("Iva", 3);
		g.add("Ivana", 5);
		g.add("Matteo", 2);
		g.add("Mario", 1);
		
		g.avgGrades();

	}
}
