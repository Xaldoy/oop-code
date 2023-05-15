package hr.fer.oop.zad1;

public interface SpecialRequirements {
	public String covid19Info();

	public static boolean canIFlyCovid19(Status[] statusList, int fromCountryZone, int toCountryZone) {
		if (toCountryZone >= fromCountryZone) {
			return true;
		}
		if (fromCountryZone == 2 && toCountryZone == 1) {
			for (Status s : statusList) {
				if (s == Status.VACCINATED || s == Status.RECOVERED || s == Status.TESTED)
					return true;
			}
		}
		if (fromCountryZone == 3) {
			boolean testedOnce = false;
			for (Status s : statusList) {
				if (s == Status.TESTED)
					testedOnce = true;
				if (testedOnce && (s == Status.VACCINATED || s == Status.RECOVERED || s == Status.TESTED))
					return true;
			}
		}
		return false;
	}
}
