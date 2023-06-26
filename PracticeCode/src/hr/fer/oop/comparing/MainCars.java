package hr.fer.oop.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Collections;

public class MainCars {
	public static void main(String[] args) {
		Comparator<Car> comp1 = new MultipleComparator<>((a,b) -> -Integer.compare(a.getSpeed(),b.getSpeed()));
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Audi", 1993, 140, 5000));
		cars.add(new Car("Mercedes", 2009, 190, 9000));
		cars.add(new Car("Audi", 1993, 180, 25000));
		cars.add(new Car("BMW", 1999, 190, 25000));
		cars.add(new Car("BMW", 2020, 220, 25000));
		cars.add(new Car("Ferrari", 2021, 240, 26000));
		
		Collections.sort(cars, comp1);
		cars.forEach((a) -> System.out.println(a));
		
		System.out.println();
		
		Collections.sort(cars);
		cars.forEach((a) -> System.out.println(a));
		
		System.out.println();
		
		Comparator<Car> comp = comp1.reversed().thenComparing(Comparator.naturalOrder());
		Collections.sort(cars, comp);
		cars.forEach((a) -> System.out.println(a));
	}
}
