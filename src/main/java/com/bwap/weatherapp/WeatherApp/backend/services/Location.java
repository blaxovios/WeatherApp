package com.bwap.weatherapp.WeatherApp.backend.services;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class Location {
    public OkHttpClient client;
    public Response response;

    // get location API
    public JSONObject getLocation(){
        client = new OkHttpClient();
        String ipv6 = "2a02:587:2807:19e0:b5f8:cb83:6f58:e0f0";  // ENTER YOUR IPV6 ADDRESS HERE
        Request request = new Request.Builder()
                .url("https://ip-geolocation.whoisxmlapi.com/api/v1?apiKey=at_QMOGrXueRM8liMVZ95t3rd3Jon94d&ipAddress="+ipv6)
                .build();

        try {
            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public JSONObject returnLocation() throws JSONException {
        JSONObject location = getLocation().getJSONObject("location");
        return location;
    }
}