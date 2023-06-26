package hr.fer.oop.zi19.zad1;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;

import hr.fer.oop.comparing.Car;

public class Zad1 {
	public static void main(String[] args) {
		List<Car> list = CarCatalog.loadCars();
		
		list.stream().sorted((a, b) -> -Integer.compare(a.getCost(), b.getCost())).forEach(a->System.out.println(a));
		list.stream().filter(a -> a.getName().equals("Skoda")).mapToInt(a -> a.getCost()).average().ifPresent(a -> System.out.println(new DecimalFormat("#0.00").format(a)));
		Double l = list.stream().collect(Collectors.averagingDouble(a -> (a.getCost() + a.getYear())));
		System.out.println(l);
	}
}
