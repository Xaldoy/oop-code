package hr.fer.oop.zad1;

public class Regional extends Airline{
	int numberOfPremiumMembers;
	int numberOfExternalSponsors;
	
	
	
	public Regional(String name, String[] fleet, int numberOfPremiumMembers, int numberOfExternalSponsors) {
		super(name, fleet);
		this.numberOfExternalSponsors = numberOfExternalSponsors;
		this.numberOfPremiumMembers = numberOfPremiumMembers;
	}

	public boolean availabilityOfPromotionalPrices() {
		if (numberOfPremiumMembers > 10 && numberOfExternalSponsors > 0) return true;
		return false;
	}
	
	public int getNumberOfPremiumMembers() {
		return numberOfPremiumMembers;
	}

	public void setNumberOfPremiumMembers(int numberOfPremiumMembers) {
		this.numberOfPremiumMembers = numberOfPremiumMembers;
	}

	public int getNumberOfExternalSponsors() {
		return numberOfExternalSponsors;
	}

	public void setNumberOfExternalSponsors(int numberOfExternalSponsors) {
		this.numberOfExternalSponsors = numberOfExternalSponsors;
	}

	public String covid19Info() {
		return "Contact the regional COVID info number.";
	}
	
}
