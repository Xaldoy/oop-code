package hr.fer.oop.zi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

import hr.fer.oop.zi.MyNumber.IsDividedBy;

public class Klase {

	public static void main(String[] args) {
		MyNumber num = new MyNumber(123456879);
		int divider = 7;
		print(num, new IsDividedBy(divider) {

			@Override
			public boolean test(Integer t) {
				return super.test(t) && super.test(super.num / t.intValue());
			}
		});
		System.out.println();
		print(num, new IsDividedBy(divider));
		System.out.println();
		print(num, (Integer t) -> t != 3);
		System.out.println();
		System.out.println();


		
		

		List<Car> cars = new LinkedList<>();
		cars.add(new Car("Mercedes", 100));
		cars.add(new Car("BMW", 250));
		cars.add(new Car("Audi", 310));
		cars.add(new Car("Skoda", 360));
		cars.add(new Car("McLaren", 3000));
		cars.add(new Car("Lambo", 290));

		cars.add(new Car("Skoda", 360));
		cars.add(new Car("Skoda", 360));

		printCars(cars, car -> car.getPrice() < 250, car -> System.out.println("Cheap: " + car));

		theMostSimilarCar(cars, Klase::pricedistance, (a, b) -> System.out.println(a.toString() + b.toString()));
		
		Map<Car, Integer> newmap = new LinkedHashMap<>();
		Map<String, Integer> carmap = new LinkedHashMap<>();
		
		cars.forEach(car -> carmap.merge(car.getName(), 1, (oldv, newv) -> oldv + newv));
		System.out.println();
		carmap.forEach((a, b) -> System.out.println(a + " JEST " + b.toString()));
		

		newmap.clear();
		
		cars.forEach(car -> newmap.merge(car, 1, (oldv, newv) -> oldv + 1));
		System.out.println();
		newmap.forEach((a, b) -> System.out.println(a.getName() + " jeste pravo puta " + b.toString()));
		
		class Person {
			String name;
			int age;
			
			Person(String name, int age){
				this.name = name;
				this.age = age;
			}
			
			String getName() {
				return this.name;
			}
			
			@Override
			public boolean equals(Object o) {
				Person b = (Person) o;
				if(this.name.equals(b.name) && this.age == b.age) return true;
				return false;
			}
			
			@Override
		    public int hashCode() {
		        return Objects.hash(name, age);
		    }
		}

		HashMap<Person, Integer> PersonMap = new HashMap<>();
		
		PersonMap.put(new Person("Matej", 20), 1);
		PersonMap.put(new Person("Matej", 20), 4);
		
		PersonMap.forEach((a,b)-> System.out.println(a.getName()+ " : " + b));
		
		System.out.println(new Person("Dorijan",19).equals(new Person("Dorijan",19)));
		
		System.out.println();
		for (Map.Entry<Car, Integer> entry : newmap.entrySet()) {
			System.out.format("%s occured %d times. %n", entry.getKey(), entry.getValue());
		}
		



		
		
		Map<String, Integer> carTypesCount = new HashMap<>();
		//List<Car> cars = CarCatalog.loadCars();
		cars.forEach(new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				Integer newVal = carTypesCount.compute(t.getName(), new BiFunction<String, Integer, Integer>() {
					@Override
					public Integer apply(String key, Integer value) {
						return value == null ? 1 : value + 1;
					}
				});
			}
		});
		
		carTypesCount.forEach((a, b) -> System.out.println(a.toString() + " jest " + b.toString()));
		
		
		
		
	}

	private static int pricedistance(Car a, Car b) {
		return (int) (Math.abs(a.getPrice() - b.getPrice()));
	}

	public static void print(MyNumber number, Predicate<Integer> p) {

		int numero = 99;

		for (Integer dig : number) {
			if (p.test(dig))
				System.out.print(dig);

		}

		class CarPair {
			private Car car1;
			private Car car2;

			public CarPair(Car a, Car b) {
				this.car1 = a;
				this.car2 = b;
				int zz = numero;
			}
		}
	}

	private static void printCars(Iterable<Car> cars, Predicate<Car> predicate, Consumer<Car> action) {
		for (Car car : cars) {
			if (predicate.test(car)) {
				action.accept(car);
			}
		}
	}

	public static void theMostSimilarCar(Iterable<Car> cars, BiFunction<Car, Car, Integer> distanceFunction,
			BiConsumer<Car, Car> action) {
		int minz = 0;
		Car car1 = null;
		Car car2 = null;
		for (Car c1 : cars) {
			for (Car c2 : cars) {
				if (c1 != c2) {
					int z = distanceFunction.apply(c2, c1);
					if (minz == 0 || z < minz) {
						minz = z;
						car1 = c1;
						car2 = c2;
					}
				}
			}
		}
		action.accept(car1, car2);
	}
}
