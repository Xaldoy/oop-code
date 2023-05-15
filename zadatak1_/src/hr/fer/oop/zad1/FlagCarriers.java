package hr.fer.oop.zad1;

public class FlagCarriers extends Airline{
	int averageFleetOccupancy;
	
	public FlagCarriers(String name, String[] fleet, int averageFleetOccupancy) {
		super(name, fleet);
		this.averageFleetOccupancy = averageFleetOccupancy;
	}

	public boolean availabilityOfPromotionalPrices() {
		if (averageFleetOccupancy < 50) return true;
		return false;
	}
	
	public String covid19Info() {
		return "Passengers are required to bring and wear medical face protective masks.";
	}

	public int getAverageFleetOccupancy() {
		return averageFleetOccupancy;
	}

	public void setAverageFleetOccupancy(int averageFleetOccupancy) {
		this.averageFleetOccupancy = averageFleetOccupancy;
	}	
}
