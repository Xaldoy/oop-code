package hr.fer.oop;

public class WeatherTodayImpl extends Weather implements WeatherToday {
	private int day;
	private int month;
	private int year;
	private String sunrise;
	private String sunset;

	public WeatherTodayImpl(double temperature, double pressure, int humidity, Wind wind, int year, int month, int day,
			String sunrise, String sunset) {
		super(temperature, pressure, humidity, wind);
		this.day = day;
		this.month = month;
		this.year = year;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	public static double getTempInCelsius(double fahrenheit) {
		return Math.round((fahrenheit - 32) * (5. / 9.));
	}

	public String daylight() {
		int sunsetminutes = Integer.parseInt(sunset.substring(3, 5)) + Integer.parseInt(sunset.substring(0,2)) * 60;
		int daylightminutes = sunsetminutes - (Integer.parseInt(sunrise.substring(3, 5)) + Integer.parseInt(sunrise.substring(0,2)) * 60);
		String hourS = (daylightminutes / 60 < 10) ? ("0" + Integer.toString(daylightminutes / 60)) : Integer.toString(daylightminutes / 60);
		String minuteS = (daylightminutes % 60 < 10) ? ("0" + Integer.toString(daylightminutes % 60))
				: Integer.toString(daylightminutes % 60);
		return hourS + ":" + minuteS;
	};

	public String dateFormat() {
		String monthS = (month < 10) ? ("0" + Integer.toString(month)) : Integer.toString(month);
		String dayS = (day < 10) ? ("0" + Integer.toString(day)) : Integer.toString(day);
		return year + "-" + monthS + "-" + dayS;
	};

	public String makeWindDescription(Wind wind) {
		if (wind == Wind.NE)
			return "bura";
		if (wind == Wind.SE)
			return "jugo";
		return wind.toString();
	};

	@Override
	public String toString() {
		return "WeatherToday [day=" + dateFormat() + ", temperature="
				+ Double.toString(getTempInCelsius(getTemperature())) + "°C, humidity=" + Integer.toString(getHumidity()) + "%, pressure="
				+ Double.toString(getPressure()) + "hPa, daylightHours=" + daylight() + ", wind=" + makeWindDescription(getWind()) + "]";
	}
}
