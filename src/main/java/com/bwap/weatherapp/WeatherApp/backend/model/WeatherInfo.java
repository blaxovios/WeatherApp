package com.bwap.weatherapp.WeatherApp.backend.model;

import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.DaysList;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Main;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Weather;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Wind;

public class WeatherInfo {
	
	private final Double currentTemp;
	private final Double minTemp;
	private final Double maxTemp;
	private final java.util.List<Weather> weatherConditions;
	private final Double rainProbability;
	private final Double windSpeed;
	private final Integer windDirection;
	private final Integer dataTime;

	public WeatherInfo(Double currentTemp, Double minTemp, Double maxTemp, java.util.List weatherConditions,
					   Double rainProbability, Double windSpeed, Integer windDirection, Integer dataTime) {
		this.currentTemp = currentTemp;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.weatherConditions = weatherConditions;
		this.rainProbability = rainProbability;
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
		this.dataTime = dataTime;
	}

	public WeatherInfo(DaysList theDaysList, Main theMain, Wind theWind){
		this.currentTemp = theMain.getTemp();
		this.minTemp = theMain.getTempMin();
		this.maxTemp = theMain.getTempMax();
		this.weatherConditions = theDaysList.getWeather();
		this.rainProbability = theDaysList.getPop();
		this.windSpeed = theWind.getSpeed();
		this.windDirection = theWind.getDeg();
		this.dataTime = theDaysList.getDt();
	}

	public Double getCurrentTemp() {
		return currentTemp;
	}

	public Double getMinTemp() {
		return minTemp;
	}

	public Double getMaxTemp() {
		return maxTemp;
	}

	public java.util.List<Weather> getWeatherConditions() {
		return weatherConditions;
	}

	public Double getRainProbability() {
		return rainProbability;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public Integer getWindDirection() {
		return windDirection;
	}

	public Integer getDataTime() {
		return dataTime;
	}

	@Override
	public String toString() {
		return "WeatherInfo{" +
				"currentTemp='" + currentTemp + '\'' +
				", minTemp='" + minTemp + '\'' +
				", maxTemp='" + maxTemp + '\'' +
				", weatherConditions='" + weatherConditions + '\'' +
				", rainProbability='" + rainProbability + '\'' +
				", windSpeed='" + windSpeed + '\'' +
				", windDirection='" + windDirection + '\'' +
				", dataTime='" + dataTime + '\'' +
				'}';
	}
}
