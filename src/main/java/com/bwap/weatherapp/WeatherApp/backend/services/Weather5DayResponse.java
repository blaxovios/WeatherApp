package com.bwap.weatherapp.WeatherApp.backend.services;

import com.bwap.weatherapp.WeatherApp.backend.weather5daydb.Sys;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Weather5DayResponse {
    public String cityName2;
    public String unit2;

    public void GetRestAPI(){
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpGet getRequest = new HttpGet("http://api.openweathermap.org/data/2.5/forecast?q="+getCityName2()+
                    "&units="+getUnit2()+"&cnt=1&appid=4b6f297ddf6233fcabf54ac13365be0d");
            getRequest.addHeader("accept", "application/json");
            HttpResponse response = httpClient.execute(getRequest);

            Sys sys = null;
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            sys = mapper.readValue(response.getEntity().getContent(), Sys.class);
        }catch (JsonMappingException e){
            System.out.println("JsonMappingException ERROR");
            e.printStackTrace();
        }catch (ClientProtocolException e){
            System.out.println("ClientProtocolException ERROR");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("IOException ERROR");
            e.printStackTrace();
        }
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
