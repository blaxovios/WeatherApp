/*package com.bwap.weatherapp.WeatherApp.backend;

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
    public String cityName;


    // get weather information by city name with different temperature unit, json file
    public JSONArray getWeatherFor5Days(){
        client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/forecast?q="+getCityName2()+"&units=metric&appid=4b6f297ddf6233fcabf54ac13365be0d")
                .build();

        try {
            response = client.newCall(request).execute();
            return new JSONArray(response.body().string());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }


    public JSONArray returnWeatherArray2() throws JSONException {
        JSONArray weatherArray2 = getWeatherFor5Days().getJSONArray(Integer.parseInt("list"));
        return weatherArray2;
    }

    public JSONObject returnMain2() throws JSONException {
        JSONObject main2 = getWeatherFor5Days().getJSONObject(Integer.parseInt("main"));
        return main2;
    }

    public JSONObject returnSys2() throws JSONException {
        JSONObject sys2 = getWeatherFor5Days().getJSONObject(Integer.parseInt("sys"));
        return sys2;
    }

    public JSONObject returnWind2() throws JSONException {
        JSONObject wind2 = getWeatherFor5Days().getJSONObject(Integer.parseInt("wind"));
        return wind2;
    }

    public JSONObject returnPop() throws JSONException {
        JSONObject pop = getWeatherFor5Days().getJSONObject(Integer.parseInt("pop"));
        return pop;
    }

    public JSONObject returnDateTime() throws JSONException {
        JSONObject dt = getWeatherFor5Days().getJSONObject(Integer.parseInt("dt_txt"));
        return dt;
    }

    public String getCityName2() {
        return cityName;
    }

    public void setCityName2(String cityName) {
        this.cityName = cityName;
    }

}
*/