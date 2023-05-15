package hr.fer.oop;

public class MyVehicle extends Vehicle implements DriveVehicle {
	private String model;
	private int totalKm;

	public MyVehicle(String name, VehicleType type, int fuelConsumption, int fuel) {
		super(type, fuelConsumption, fuel);
		this.model = name;
		this.totalKm = 0;
	}

	public void addFuel(int fuel) {
		int newfuel = getFuel() + fuel;
		if (newfuel <= 60)
			setFuel(newfuel);
		else
			setFuel(60);
	}

	public void drive(int km) {
		int fuelConsumption = getFuelConsumption();
		if (km < getFuel() / fuelConsumption) {
			totalKm += km;
			setFuel(getFuel() - km * getFuelConsumption());
		}
	}

	@Override
	public String toString() {
		return model + " of type " + getType() + " drove for " + Integer.toString(totalKm) + " km and has "
				+ Integer.toString(getFuel()) + " l of gas.";
	}
}
