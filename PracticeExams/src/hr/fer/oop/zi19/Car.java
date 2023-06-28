package hr.fer.oop.zi19;

public class Car {
	private String name;
	private CarType tpye;
	private int maxSpeed;
	private int power;
	private double consumption;
	private double price;

	public Car(String name, CarType tpye, int maxSpeed, int power, double consumption, double price) {
		super();
		this.name = name;
		this.tpye = tpye;
		this.maxSpeed = maxSpeed;
		this.power = power;
		this.consumption = consumption;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public CarType getTpye() {
		return tpye;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPower() {
		return power;
	}

	public double getConsumption() {
		return consumption;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", tpye=" + tpye + ", maxSpeed=" + maxSpeed + ", power=" + power + ", consumption="
				+ consumption + ", price=" + price + "]";
	}

	
	
}
