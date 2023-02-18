package com.mert.weatherapp.client.dto.response;

import java.util.List;

public class VisualCrossingAPIResponseDto {

	private String address;
	
	private List<WeatherForecastResponseDto> days;
	
	
	public VisualCrossingAPIResponseDto() {
		
	}
	
	public VisualCrossingAPIResponseDto(String address, List<WeatherForecastResponseDto> days) {
		this.days = days;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<WeatherForecastResponseDto> getDays() {
		return days;
	}

	public void setDays(List<WeatherForecastResponseDto> days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "VisualCrossingAPIResponseDto [days=" + days + ", resolvedAddress=" + address + "]";
	}
	
	
}
