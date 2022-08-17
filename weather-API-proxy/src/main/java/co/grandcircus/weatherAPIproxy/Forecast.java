package co.grandcircus.weatherAPIproxy;

public class Forecast {
	
	private int number;
	private String name;
	private String startTime;
	private String endTime;
	private boolean isDayTime;
	private int temperature;
	private String temperatureUnit;
	private String temperatureTrend;
	private String windSpeed;
	private String windDirection;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public boolean isDayTime() {
		return isDayTime;
	}
	public void setDayTime(boolean isDayTime) {
		this.isDayTime = isDayTime;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getTemperatureUnit() {
		return temperatureUnit;
	}
	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}
	public String getTemperatureTrend() {
		return temperatureTrend;
	}
	public void setTemperatureTrend(String temperatureTrend) {
		this.temperatureTrend = temperatureTrend;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

}
