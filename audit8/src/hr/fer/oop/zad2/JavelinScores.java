package hr.fer.oop.zad2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class JavelinScores {
	private List<Score> scores;

	public JavelinScores() {
		scores = new LinkedList<>();
	}

	public void add(String name, double score) {
		Score s = new Score(name, score);
		int i = 0;
		for (Score curr : scores) {
			if (score < curr.getScore())
				i++;
			else
				break;
		}
		scores.add(i, s);
	}

	public void printScores() {
		for (Score s : scores)
			System.out.println(s);
	}
	
	public void printBest() {
		var printed = new HashSet<String>(); 
		for (Score score : scores) {
			if (printed.add(score.getName()))
				System.out.println(score);
		}
	}
}
