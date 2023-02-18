package com.mert.weatherapp.service;

import com.mert.weatherapp.client.dto.response.VisualCrossingAPIResponseDto;

public interface VisualCrossingAPIService {

	VisualCrossingAPIResponseDto makeADailyRequest(String city);
		
	VisualCrossingAPIResponseDto makeAWeeklyRequest(String city);
	
	VisualCrossingAPIResponseDto makeAMonthlyRequest(String city);
	
}
