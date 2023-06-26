package hr.fer.oop.comparing;

import java.util.Objects;

public class Car implements Comparable<Car>{
	private String name;
	private int year;
	private int cost;
	private int speed;

	public Car(String name, int year, int cost, int speed) {
		super();
		this.name = name;
		this.year = year;
		this.cost = cost;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", cost=" + cost + ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name, speed, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return cost == other.cost && Objects.equals(name, other.name) && speed == other.speed && year == other.year;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getCost() {
		return cost;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public int compareTo(Car o) {
		int r = this.name.compareTo(o.name);
		if(r!=0) return r;
		r = Integer.compare(this.year, o.year);
		if(r!=0) return r;
		r = Integer.compare(this.speed, o.speed);
		return r;
	}

	
	
}
