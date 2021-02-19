package com.bwap.weatherapp.WeatherApp.backend.services;

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
public class Weather5DayService {
    public OkHttpClient client;
    public Response response;
    public String cityName2;
    String unit2;


    // get weather information by city name with different temperature unit, json file
    public JSONObject getWeatherFor5Days(){
        client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/forecast?q="+getCityName2()+
                        "&units="+getUnit2()+"&cnt=40&appid=4b6f297ddf6233fcabf54ac13365be0d")
                .build();

        try {
            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public JSONArray returnListArray2() throws JSONException {
        JSONArray listArray2 = getWeatherFor5Days().getJSONArray("list");
        return listArray2;
    }

    public JSONObject returnDt2() throws JSONException {
        JSONObject dt2 = getWeatherFor5Days().getJSONObject("dt");
        return dt2;
    }

    public JSONObject returnMain2() throws JSONException {
        JSONObject main2 = getWeatherFor5Days().getJSONObject("main");
        return main2;
    }

    public JSONObject returnWind2() throws JSONException {
        JSONObject wind2 = getWeatherFor5Days().getJSONObject("wind");
        return wind2;
    }

    public JSONObject returnPop() throws JSONException {
        JSONObject pop = getWeatherFor5Days().getJSONObject("pop");
        return pop;
    }

    public JSONObject returnDateTime() throws JSONException {
        JSONObject dt = getWeatherFor5Days().getJSONObject("dt_txt");
        return dt;
    }

    public String getCityName2() {
        return cityName2;
    }

    public void setCityName2(String cityName2) {
        this.cityName2 = cityName2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

}
