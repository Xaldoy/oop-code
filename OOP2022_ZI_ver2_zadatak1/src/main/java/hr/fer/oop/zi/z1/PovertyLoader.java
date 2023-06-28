package hr.fer.oop.zi.z1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PovertyLoader {
	
	public static List<PovertyDatum> load(String path) throws NumberFormatException, IOException {
		
		List<PovertyDatum> dataset = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		String entry;
		while((entry = br.readLine()) != null) {
			String location = entry.split(",")[0];
			int year = Integer.valueOf(entry.split(",")[1]);
			double proportion = Double.valueOf(entry.split(",")[2]);
			
			dataset.add(new PovertyDatum(location,year,proportion));
		}
		br.close();
		return dataset;
	}
	
}
