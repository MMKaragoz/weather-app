package com.mert.weatherapp.client.dto.response;

import java.util.Objects;

public class WeatherForecastResponseDto {
	
	private String datetime;
	
	private double tempmax;
	
	private double tempmin;
	
	private double temp;
	
	private double feelslike;
	
	private double humidity;
	
	private double windspeed;
	
	private String sunrise;
	
	private String sunset;
	
	private String conditions;
	
	private String description;
	
	public WeatherForecastResponseDto() {
		
	}

	public WeatherForecastResponseDto(String datetime, double tempmax, double tempmin, double temp, double feelslike,
			double humidity, double windspeed, String sunrise, String sunset, String conditions, String description) {
		super();
		this.datetime = datetime;
		this.tempmax = tempmax;
		this.tempmin = tempmin;
		this.temp = temp;
		this.feelslike = feelslike;
		this.humidity = humidity;
		this.windspeed = windspeed;
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.conditions = conditions;
		this.description = description;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public double getTempmax() {
		return tempmax;
	}

	public void setTempmax(double tempmax) {
		this.tempmax = tempmax;
	}

	public double getTempmin() {
		return tempmin;
	}

	public void setTempmin(double tempmin) {
		this.tempmin = tempmin;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFeelslike() {
		return feelslike;
	}

	public void setFeelslike(double feelslike) {
		this.feelslike = feelslike;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conditions, datetime, description, feelslike, humidity, sunrise, sunset, temp, tempmax,
				tempmin, windspeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherForecastResponseDto other = (WeatherForecastResponseDto) obj;
		return Objects.equals(conditions, other.conditions) && Objects.equals(datetime, other.datetime)
				&& Objects.equals(description, other.description)
				&& Double.doubleToLongBits(feelslike) == Double.doubleToLongBits(other.feelslike)
				&& Double.doubleToLongBits(humidity) == Double.doubleToLongBits(other.humidity)
				&& Objects.equals(sunrise, other.sunrise) && Objects.equals(sunset, other.sunset)
				&& Double.doubleToLongBits(temp) == Double.doubleToLongBits(other.temp)
				&& Double.doubleToLongBits(tempmax) == Double.doubleToLongBits(other.tempmax)
				&& Double.doubleToLongBits(tempmin) == Double.doubleToLongBits(other.tempmin)
				&& Double.doubleToLongBits(windspeed) == Double.doubleToLongBits(other.windspeed);
	}

	@Override
	public String toString() {
		return "WeatherForecastResponseDto [datetime=" + datetime + ", tempmax=" + tempmax + ", tempmin=" + tempmin
				+ ", temp=" + temp + ", feelslike=" + feelslike + ", humidity=" + humidity + ", windspeed=" + windspeed
				+ ", sunrise=" + sunrise + ", sunset=" + sunset + ", conditions=" + conditions + ", description="
				+ description + "]";
	}
}
