
package com.bwap.weatherapp.WeatherApp.backend.weather5daydb;


public class Clouds {

    private long all;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clouds() {
    }

    /**
     * 
     * @param all
     */
    public Clouds(long all) {
        super();
        this.all = all;
    }

    public long getAll() {
        return all;
    }

    public void setAll(long all) {
        this.all = all;
    }

}
