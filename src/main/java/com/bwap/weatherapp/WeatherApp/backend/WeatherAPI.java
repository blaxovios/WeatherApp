package com.bwap.weatherapp.WeatherApp.backend;


import com.bwap.weatherapp.WeatherApp.backend.services.WeatherAPIService;

public class WeatherAPI {

	public static WeatherAPIService getMovieDBService() {
		// API key needed. Register and generate API KEY
		return new WeatherAPIService("api.openweathermap.org/data/2.5/forecast?q={city name}&appid=",
				"4b6f297ddf6233fcabf54ac13365be0d");
	}
	
}
