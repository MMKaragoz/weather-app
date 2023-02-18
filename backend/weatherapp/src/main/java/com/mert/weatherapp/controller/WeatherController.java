package com.mert.weatherapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mert.weatherapp.client.dto.response.VisualCrossingAPIResponseDto;
import com.mert.weatherapp.service.WeatherService;

@RestController
@RequestMapping("api/v1/weather")
public class WeatherController {

	private final WeatherService weatherService;
	
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@GetMapping("/daily/{city}")
	public ResponseEntity<VisualCrossingAPIResponseDto> getDaily(@PathVariable String city) {
		VisualCrossingAPIResponseDto response = weatherService.getDaily(city);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/weekly/{city}")
	public ResponseEntity<VisualCrossingAPIResponseDto> getWeekly(@PathVariable String city) {
		VisualCrossingAPIResponseDto response = weatherService.getWeekly(city);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/monthly/{city}")
	public ResponseEntity<VisualCrossingAPIResponseDto> getMonthly(@PathVariable String city) {
		VisualCrossingAPIResponseDto response = weatherService.getMonthly(city);
		return ResponseEntity.ok(response);
	}
}
