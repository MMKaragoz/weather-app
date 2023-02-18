package com.mert.weatherapp.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.mert.weatherapp.client.dto.response.VisualCrossingAPIResponseDto;
import com.mert.weatherapp.service.VisualCrossingAPIService;
import com.mert.weatherapp.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	private final VisualCrossingAPIService visualCrossingAPIService;
	private final ModelMapper modelMapper;
	
	public WeatherServiceImpl(VisualCrossingAPIService visualCrossingAPIService, ModelMapper modelMapper) {
		this.visualCrossingAPIService = visualCrossingAPIService;
		this.modelMapper = modelMapper;
	}
	
	@Override
	public VisualCrossingAPIResponseDto getDaily(String city) {
		VisualCrossingAPIResponseDto response1 = visualCrossingAPIService.makeADailyRequest(city);
		VisualCrossingAPIResponseDto response = modelMapper.map(response1, VisualCrossingAPIResponseDto.class);
		return response;
	}

	@Override
	public VisualCrossingAPIResponseDto getWeekly(String city) {
		VisualCrossingAPIResponseDto response1 = visualCrossingAPIService.makeAWeeklyRequest(city);
		VisualCrossingAPIResponseDto response = modelMapper.map(response1, VisualCrossingAPIResponseDto.class);
		return response;
	}

	@Override
	public VisualCrossingAPIResponseDto getMonthly(String city) {
		VisualCrossingAPIResponseDto response1 = visualCrossingAPIService.makeAMonthlyRequest(city);
		VisualCrossingAPIResponseDto response = modelMapper.map(response1, VisualCrossingAPIResponseDto.class);
		return response;
	}

}
