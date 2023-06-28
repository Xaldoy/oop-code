package hr.fer.oop.zi19;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 * List<Car> list = loadCars();
		 * list.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).forEach(
		 * System.out::println);
		 * 
		 * double avg = list.stream().filter(a -> a.getTpye() ==
		 * CarType.AUDI).mapToDouble(Car::getPrice).average().getAsDouble();
		 * System.out.println(avg);
		 */
		
		Path path = Paths.get(".");
		System.out.println("File types in: " + path.toAbsolutePath().toString());;
		MyFileVisitor fv = new MyFileVisitor();
		Files.walkFileTree(path, fv);
		Map<String, Integer> data = new HashMap<>();
		data = fv.getData();
		data.keySet().stream().forEach(a -> System.out.println(a.toString() + " " + fv.getData().get(a)));
		System.out.println(fv.getData());	
		
	}
	
	public static List<Car> loadCars(){
		LinkedList<Car> cars = new LinkedList<>();
		cars.add(new Car("R6",CarType.AUDI, 250, 150, 9, 20000));
		cars.add(new Car("M5",CarType.BMW, 280, 180, 11, 25000));
		cars.add(new Car("S-Class",CarType.MERCEDES, 320, 190, 12, 30000));
		cars.add(new Car("M7",CarType.BMW, 250, 200, 13, 33000));
		cars.add(new Car("A4",CarType.AUDI, 250, 150, 8, 12000));
		cars.add(new Car("Fabia",CarType.SKODA, 150, 70, 5, 3000));
		cars.add(new Car("Superb",CarType.SKODA, 180, 150, 9, 9000));
		cars.add(new Car("Gallardo",CarType.LAMBO, 300, 200, 15, 50000));
		cars.add(new Car("A8",CarType.AUDI, 250, 240, 13, 40000));
		return cars;
	}
}
