package hr.fer.oop;

public class Weather {
    private double temperature;
    private double pressure;
    private int humidity;
    private Wind wind;

    public Weather(double temperature, double pressure, int humidity, Wind wind) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.wind = wind;
    }
    public double getTemperature() { return temperature; }
    public double getPressure() { return pressure; }
    public int getHumidity() { return humidity; }
    public Wind getWind() { return wind; }
}
