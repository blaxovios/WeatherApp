package com.bwap.weatherapp.WeatherApp.backend.services;

import com.bwap.weatherapp.WeatherApp.backend.exception.WeatherAPIException;
import com.bwap.weatherapp.WeatherApp.backend.model.WeatherInfo;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.ErrorResponse;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Weather5DayResults;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.DaysList;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Main;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Weather;
import com.bwap.weatherapp.WeatherApp.backend.model.weatherdb.Wind;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class WeatherAPIService {
	
	private final String API_URL;
	private final String API_KEY;
	private final String cityName;
	
	
	public WeatherAPIService(String aPI_URL, String aPI_KEY, cityName) {
		API_URL = aPI_URL;
		API_KEY = aPI_KEY;
		cityName = cityName;
	}
	
	
	// get popular movies 
	/* https://api.themoviedb.org/3/discover/movie */
	
	public List<WeatherInfo> getWeather5DayForecast() throws WeatherAPIException {
		Weather5DayResults result = getAPIData(cityName, API_URL, API_KEY);
		List<WeatherInfo> weatherInfoDaysList = new ArrayList<>(result.getList().size());
		for (DaysList theDaysList : result.getList()) {
			weatherInfoDaysList.add(new WeatherInfo(theDaysList));
		}
		return weatherInfoDaysList;
	}

	
	// get API Data
	
	private Weather5DayResults getAPIData(String parameter, String API_URL, String API_KEY)
			throws WeatherAPIException {
		try {
			
			// https://api.themoviedb.org/3/discover/movie?primary_release_year=2020
			
			
			final URIBuilder uriBuilder = new URIBuilder(API_URL)
					.addParameter("{API key}", API_KEY)
					.addParameter("{city name}" ,cityName);
			if (parameter != null && !parameter.isBlank()) {
				uriBuilder.addParameter("q", parameter);
			}else {
					uriBuilder.addParameter("Athens", parameter);
				}
			final URI uri = uriBuilder.build();

			final HttpGet getRequest = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getStatusMessage() != null)
						throw new WeatherAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
				}

				return mapper.readValue(entity.getContent(), Weather5DayResults.class);
			} catch (IOException e) {
				throw new WeatherAPIException("Error requesting data from the TheMovieDB API.", e);
			}
		} catch (URISyntaxException e) {
			throw new WeatherAPIException("Unable to create request URI.", e);
		}
	}
	
	

}
