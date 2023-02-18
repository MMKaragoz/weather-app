package com.mert.weatherapp.service;

import com.mert.weatherapp.client.dto.response.VisualCrossingAPIResponseDto;

public interface WeatherService {

	VisualCrossingAPIResponseDto getDaily(String city);
	
	VisualCrossingAPIResponseDto getWeekly(String city);
	
	VisualCrossingAPIResponseDto getMonthly(String city);
}
