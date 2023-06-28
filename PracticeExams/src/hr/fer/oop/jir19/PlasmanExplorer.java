package hr.fer.oop.jir19;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlasmanExplorer {
	List<Plasman> listaPlasmana = new ArrayList<Plasman>();

	public void loadPlasmani(String filepath) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (FileReader fr = new FileReader(filepath)) {
			int character;
			while ((character = fr.read()) != -1) {
				if (character != '\n') {
					sb.append((char)character);
				} else {
					String[] entry = sb.toString().split(";");
					int year = Integer.valueOf(entry[0]);
					int broj = Integer.valueOf(entry[1]);
					String vozac = entry[2];
					int plasman = Integer.valueOf(entry[3].strip());
					listaPlasmana.add(new Plasman(year, broj, vozac, plasman));
					sb.setLength(0);
				}
			}
		}

	}

	public void printPobjednike() {
		// TO DO: napišite kod koji ispisuje uzlazno sortiranu listu svih pobjednika
		// nakon
		// 2000. koristeći Stream API

		listaPlasmana.stream().filter(a -> a.getGodina() > 2000).filter(a -> a.getPlasman() == 1).sorted(Comparator.comparing(Plasman::getVozac))
				.forEach(System.out::println);
	}
}
