package hr.fer.oop.zi19.zad1;

import java.util.ArrayList;
import java.util.List;

import hr.fer.oop.comparing.Car;

public class CarCatalog {

	public static List<Car> loadCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Mercedes", 10, 100, 10));
		cars.add(new Car("BMW", 20, 200, 20));
		cars.add(new Car("Audi", 30, 300, 30));
		cars.add(new Car("Skoda", 40, 400, 40));
		cars.add(new Car("McLaren", 50, 500, 50));
		cars.add(new Car("Lambo", 60, 600, 60));
		cars.add(new Car("Skoda", 70, 700, 70));
		cars.add(new Car("Skoda", 80, 800, 80));
		return cars;
	}
	
	

}
