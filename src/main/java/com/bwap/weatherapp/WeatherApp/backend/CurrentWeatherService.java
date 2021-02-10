package com.bwap.weatherapp.WeatherApp.backend;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
// Our pojo class which defines the current weather service entity
public class CurrentWeatherService {
    public OkHttpClient client;
    public Response response;
    public String cityName;
    String unit;

    // get weather information by city name with different temperature unit, json file
    public JSONObject getWeatherByCityName(){
        client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/weather?q="+getCityName()+"&units="+getUnit()+"&appid=4b6f297ddf6233fcabf54ac13365be0d")
                .build();

        try {
            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    // get weather information by city name with different temperature unit, json file
    public JSONObject getWeatherFor5Days(){
        client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/forecast?q="+getCityName()+"&appid=4b6f297ddf6233fcabf54ac13365be0d")
                .build();

        try {
            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public JSONArray returnWeatherArray() throws JSONException {
        JSONArray weatherArray = getWeatherByCityName().getJSONArray("weather");
        return weatherArray;
    }

    public JSONObject returnMain() throws JSONException {
        JSONObject main = getWeatherByCityName().getJSONObject("main");
        return main;
    }

    public JSONObject returnSys() throws JSONException {
        JSONObject sys = getWeatherByCityName().getJSONObject("sys");
        return sys;
    }

    public JSONObject returnWind() throws JSONException {
        JSONObject wind = getWeatherByCityName().getJSONObject("wind");
        return wind;
    }

    public JSONArray returnWeatherArray2() throws JSONException {
        JSONArray weatherArray2 = getWeatherFor5Days().getJSONArray("list");
        return weatherArray2;
    }

    public JSONObject returnMain2() throws JSONException {
        JSONObject main2 = getWeatherFor5Days().getJSONObject("main");
        return main2;
    }

    public JSONObject returnSys2() throws JSONException {
        JSONObject sys2 = getWeatherFor5Days().getJSONObject("sys");
        return sys2;
    }

    public JSONObject returnWind2() throws JSONException {
        JSONObject wind2 = getWeatherFor5Days().getJSONObject("wind");
        return wind2;
    }

    public JSONObject returnPop() throws JSONException {
        JSONObject pop = getWeatherFor5Days().getJSONObject("pop");
        return pop;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
