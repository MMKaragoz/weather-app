package com.mert.weatherapp.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mert.weatherapp.client.dto.response.VisualCrossingAPIResponseDto;
import com.mert.weatherapp.service.VisualCrossingAPIService;

@Service
public class VisualCrossingAPIServiceImpl implements VisualCrossingAPIService {

	@Value("${visualCrossingAPI.apiUrl}")
	private String apiUrl;
	
	@Value("${visualCrossingAPI.apiKey}")
	private String apiKey;
	
	private final RestTemplate restTemplate;
	
	public VisualCrossingAPIServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public VisualCrossingAPIResponseDto makeADailyRequest(String city) {
		
		String now = LocalDate.now().toString();
		
		String endpoint = apiUrl + city + "/" + now + "?include=days&unitGroup=metric&key=" + apiKey;
		VisualCrossingAPIResponseDto weatherInfo = restTemplate.getForObject(endpoint, VisualCrossingAPIResponseDto.class);
		return weatherInfo;
	}

	@Override
	public VisualCrossingAPIResponseDto makeAWeeklyRequest(String city) {
		String endpoint = apiUrl + city + "/next7days?include=days&unitGroup=metric&key=" + apiKey;
		VisualCrossingAPIResponseDto weatherInfo = restTemplate.getForObject(endpoint, VisualCrossingAPIResponseDto.class);
		return weatherInfo;
	}

	@Override
	public VisualCrossingAPIResponseDto makeAMonthlyRequest(String city) {
		String endpoint = apiUrl + city + "/next30days?include=days&unitGroup=metric&key=" + apiKey;
		VisualCrossingAPIResponseDto weatherInfo = restTemplate.getForObject(endpoint, VisualCrossingAPIResponseDto.class);
		return weatherInfo;
	}
	
	
	
}
