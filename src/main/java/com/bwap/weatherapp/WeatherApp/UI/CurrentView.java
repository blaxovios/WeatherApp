package com.bwap.weatherapp.WeatherApp.UI;

import com.bwap.weatherapp.WeatherApp.backend.services.CurrentWeatherService;
import com.bwap.weatherapp.WeatherApp.backend.services.Location;
import com.bwap.weatherapp.WeatherApp.backend.services.Weather5DayService;
import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ClassResource;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

@SpringUI(path = "")
@Theme("valo")
public class CurrentView extends UI {

    @Autowired
    private CurrentWeatherService weatherService;
    @Autowired
    private Weather5DayService weatherService5Day;
    @Autowired
    private Location locationSignature;

    private VerticalLayout mainLayout;
    private NativeSelect<String> unitSelect;
    private NativeSelect<String> citySelect;
    private TextField cityTextField;
    private String city;
    private ArrayList<String> cities;
    private Button searchButton;
    private Button deleteButton;
    private HorizontalLayout dashboard;
    private Label location;
    private Label currentWeatherCond;
    private Label currentWeatherCond2;
    private Label currentTemp;
    private HorizontalLayout mainDescriptionLayout;
    private HorizontalLayout mainDescriptionLayout2;
    private HorizontalLayout mainDescriptionLayout3;
    private Label weatherDescription;
    private Label maxTemp;
    private Label minTemp;
    private Label humidity;
    private Label pressure;
    private Label windSpeed;
    private Label windDegree;
    private Label feelsLike;
    private Image iconImg;
    private Label maxTemp2;
    private Label minTemp2;
    private Label humidity2;
    private Label pressure2;
    private Label dt2;
    private Label windSpeed2;
    private Label windDegree2;
    private Label feelsLike2;
    private Label pop;
    private Label dt3;
    private Label minTemp3;
    private Label maxTemp3;
    private Label pop2;
    private Label pressure3;
    private Label humidity3;
    private Label windSpeed3;
    private Label windDegree3;
    private Label feelsLike3;

    // Main view function requests
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        mainLayout();
        setHeader();
        setLogo();
        setForm();
        try {
            dashboardTitle();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dashboardDetails();
        searchButton.addClickListener(clickEvent -> {
            if (!cityTextField.getValue().equals("")){
                try {
                    updateUI();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else
                Notification.show("Please enter the city name");
        });
        deleteButton.addClickListener(clickEvent -> {
            if (!cities.equals(city) && !cityTextField.equals(city)){
                try {
                    updateUI();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else
                Notification.show("Nothing happened");
        });
    }
    // Vaadin's UI Layouts below
    private void mainLayout() {
        // Set image
        iconImg = new Image();
        mainLayout = new VerticalLayout();
        mainLayout.setWidth("100%");
        mainLayout.setSpacing(true);
        mainLayout.setMargin(true);
        mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(mainLayout);
    }
    private void setHeader(){
        // Main header
        HorizontalLayout header = new HorizontalLayout();
        header.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        Label title = new Label("Weather Forecast");

        header.addComponent(title);

        mainLayout.addComponents(header);
    }
    private void setLogo(){
        // method to add an image logo for the main view
        HorizontalLayout logo = new HorizontalLayout();
        logo.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        Image img = new Image(null, new ClassResource("/static/weatherlogo.png"));
        logo.setWidth("240px");
        logo.setHeight("240px");
        logo.addComponent(img);

        mainLayout.addComponents(logo);
    }
    private void setForm(){
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        formLayout.setSpacing(true);
        formLayout.setMargin(true);

        // select Celsius or Fahrenheit
        unitSelect = new NativeSelect<>();
        ArrayList<String> tempUnits = new ArrayList<>();
        tempUnits.add("C");
        tempUnits.add("F");

        unitSelect.setItems(tempUnits);
        unitSelect.setValue(tempUnits.get(0));
        formLayout.addComponent(unitSelect);

        // select city from list
        citySelect = new NativeSelect<>("Cities");
        cities = new ArrayList<>();
        cities.add(city);

        citySelect.setValue(cities.get(0));
        formLayout.addComponent(citySelect);

        // remove city from list
        cities.remove(citySelect.equals(city));

        // add the city text field
        cityTextField = new TextField();
        cityTextField.setWidth("80%");
        formLayout.addComponent(cityTextField);

        // add the search button
        searchButton = new Button();
        searchButton.setIcon(VaadinIcons.SEARCH);
        formLayout.addComponent(searchButton);

        // add the delete button
        deleteButton = new Button();
        deleteButton.setIcon(VaadinIcons.DEL);
        formLayout.addComponent(deleteButton);

        mainLayout.addComponents(formLayout);
    }
    private void dashboardTitle() throws JSONException {

        dashboard = new HorizontalLayout();
        dashboard.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        // current city location
        location = new Label("Currently in: ");
        location.setValue("Currently in "+locationSignature.returnLocation().getString("city"));
        location.addStyleName(ValoTheme.LABEL_H2);
        location.addStyleName(ValoTheme.LABEL_LIGHT);

        // current temperature
        currentTemp = new Label("");
        weatherService.setCityName(locationSignature.returnLocation().getString("city"));
        weatherService.setUnit("metric");
        currentTemp.setValue("the temperature is "+weatherService.returnMain().getInt("temp")+unitSelect.getValue());
        currentTemp.setStyleName(ValoTheme.LABEL_LIGHT);
        currentTemp.setStyleName(ValoTheme.LABEL_H2);

        dashboard.addComponents(location, iconImg, currentTemp);
        mainLayout.addComponents(dashboard);
    }
    // Dashboard which shows weather details from JSON file
    private void dashboardDetails(){
        mainDescriptionLayout = new HorizontalLayout();
        mainDescriptionLayout.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // 1st vertical layout for current day data
        VerticalLayout descriptionLayout = new VerticalLayout();
        currentWeatherCond = new Label("Current weather conditions");
        currentWeatherCond.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout.addComponent(currentWeatherCond);
        descriptionLayout.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        weatherDescription = new Label("Now: -");
        descriptionLayout.addComponents(weatherDescription);

        minTemp = new Label("Min: -");
        descriptionLayout.addComponents(minTemp);

        maxTemp = new Label("Max: -");
        descriptionLayout.addComponents(maxTemp);

        pressure = new Label("Pressure: -");
        descriptionLayout.addComponents(pressure);

        humidity = new Label("Humidity: -");
        descriptionLayout.addComponents(humidity);

        windSpeed = new Label("Wind speed: -");
        descriptionLayout.addComponents(windSpeed);

        windDegree = new Label("Wind degree: -");
        descriptionLayout.addComponents(windDegree);

        feelsLike = new Label("Feels like: -");
        descriptionLayout.addComponents(feelsLike);

        mainDescriptionLayout.addComponents(descriptionLayout);
        mainLayout.addComponents(mainDescriptionLayout);

        // 2nd vertical layout for 5 day data
        mainDescriptionLayout2 = new HorizontalLayout();
        mainDescriptionLayout2.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout3 = new HorizontalLayout();
        mainDescriptionLayout3.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // Description layout
        VerticalLayout descriptionLayout2 = new VerticalLayout();
        VerticalLayout descriptionLayout3 = new VerticalLayout();
        currentWeatherCond2 = new Label("Next 5 Days");
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout2.addComponent(currentWeatherCond2);
        descriptionLayout2.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout3.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // Latest weather data time
        dt2 = new Label("Time: -");
        dt3 = new Label("Time: -");
        descriptionLayout2.addComponents(dt2);
        descriptionLayout3.addComponents(dt3);

        minTemp2 = new Label("Min: -");
        minTemp3 = new Label("Min: -");
        descriptionLayout2.addComponents(minTemp2);
        descriptionLayout3.addComponents(minTemp3);

        maxTemp2 = new Label("Max: -");
        maxTemp3 = new Label("Max: -");
        descriptionLayout2.addComponents(maxTemp2);
        descriptionLayout3.addComponents(maxTemp3);

        pop = new Label("Rain Probability: -");
        pop2 = new Label("Rain Probability: -");
        descriptionLayout2.addComponents(pop);
        descriptionLayout3.addComponents(pop2);

        pressure2 = new Label("Pressure: -");
        pressure3 = new Label("Pressure: -");
        descriptionLayout2.addComponents(pressure2);
        descriptionLayout3.addComponents(pressure3);

        humidity2 = new Label("Humidity: -");
        humidity3 = new Label("Humidity: -");
        descriptionLayout2.addComponents(humidity2);
        descriptionLayout3.addComponents(humidity3);

        windSpeed2 = new Label("Wind speed: -");
        windSpeed3 = new Label("Wind speed: -");
        descriptionLayout2.addComponents(windSpeed2);
        descriptionLayout3.addComponents(windSpeed3);

        windDegree2 = new Label("Wind degree: -");
        windDegree3 = new Label("Wind degree: -");
        descriptionLayout2.addComponents(windDegree2);
        descriptionLayout3.addComponents(windDegree3);

        feelsLike2 = new Label("Feels like: -");
        feelsLike3 = new Label("Feels like: -");
        descriptionLayout2.addComponents(feelsLike2);
        descriptionLayout3.addComponents(feelsLike3);

        mainDescriptionLayout.addComponents(descriptionLayout2, descriptionLayout3);
        mainLayout.addComponents(mainDescriptionLayout);

    }
    // method that updates our UI, pulling data from json file
    private void updateUI() throws JSONException {
        city = cityTextField.getValue();
        String defaultUnit;
        weatherService.setCityName(city);
        weatherService5Day.setCityName2(city);
        citySelect.setItems(city);
        cities.add(city);

        if(unitSelect.getValue().equals("F")){
            weatherService.setUnit("imperial");
            weatherService5Day.setUnit2("imperial");
            unitSelect.setValue(" F");
            defaultUnit = "\u00b0"+" F";
        }else{
            weatherService.setUnit("metric");
            weatherService5Day.setUnit2("metric");
            defaultUnit = "\u00b0"+" C";
            unitSelect.setValue(" C");
        }

        location.setValue("Currently in "+city);
        JSONObject mainObject = weatherService.returnMain();
        int temp = mainObject.getInt("temp");
        currentTemp.setValue(temp +defaultUnit);

        // Get weather icon from openweathermap.org
        String iconCode = null;
        String weatherDescriptionNew = null;
        JSONArray jsonArray = weatherService.returnWeatherArray();
            for (int i = 0; i< jsonArray.length();i++){
                JSONObject weatherObj = jsonArray.getJSONObject(i);
                iconCode = weatherObj.getString("icon");
                weatherDescriptionNew = weatherObj.getString("description");
            }

            iconImg.setSource(new ExternalResource("http://openweathermap.org/img/wn/"+iconCode+"@2x.png"));
            weatherDescription.setValue("Description: "+weatherDescriptionNew);
            minTemp.setValue("Min temp: "+weatherService.returnMain().getInt("temp_min")+unitSelect.getValue());
            maxTemp.setValue("Max temp: "+weatherService.returnMain().getInt("temp_max")+unitSelect.getValue());
            pressure.setValue("Pressure: "+weatherService.returnMain().getInt("pressure"));
            humidity.setValue("Humidity: "+weatherService.returnMain().getInt("humidity"));
            windSpeed.setValue("Wind speed: "+weatherService.returnWind().getInt("speed"));
            windDegree.setValue("Wind degree: "+weatherService.returnWind().getInt("deg"));
            feelsLike.setValue("Feels Like: "+weatherService.returnMain().getInt("feels_like"));

            String tempMin = null;
            String tempMax = null;
            String _pressure = null;
            String _humidity = null;
            String _feelsLike = null;
            String _pop = null;
            String _speed = null;
            String _deg = null;
            String _dtTxt = null;

            JSONArray jsonArray2 = weatherService5Day.returnListArray2();
            for (int i = 0; i< jsonArray2.length();i++){
                JSONObject weatherObj2 = jsonArray2.getJSONObject(i);
                tempMin = weatherObj2.getJSONObject("main").getString("temp_min");
                tempMax = weatherObj2.getJSONObject("main").getString("temp_max");
                _pressure = weatherObj2.getJSONObject("main").getString("pressure");
                _humidity = weatherObj2.getJSONObject("main").getString("humidity");
                _feelsLike = weatherObj2.getJSONObject("main").getString("feels_like");
                _pop = weatherObj2.getString("pop");
                _speed = weatherObj2.getJSONObject("wind").getString("speed");
                _deg = weatherObj2.getJSONObject("wind").getString("deg");
                _dtTxt = weatherObj2.getString("dt_txt");
            }

            dt2.setValue("Time: "+_dtTxt);
            minTemp2.setValue("Min temp: "+tempMin+unitSelect.getValue());
            maxTemp2.setValue("Max temp: "+tempMax+unitSelect.getValue());
            pop.setValue("Rain Probability: "+_pop);
            pressure2.setValue("Pressure: "+_pressure);
            humidity2.setValue("Humidity: "+_humidity);
            windSpeed2.setValue("Wind speed: "+_speed);
            windDegree2.setValue("Wind degree: "+_deg);
            feelsLike2.setValue("Feels Like: "+_feelsLike);


            dt3.setValue("Time: "+_dtTxt);
            minTemp3.setValue("Min temp: "+tempMin+unitSelect.getValue());
            maxTemp3.setValue("Max temp: "+tempMax+unitSelect.getValue());
            pop2.setValue("Rain Probability: "+_pop);
            pressure3.setValue("Pressure: "+_pressure);
            humidity3.setValue("Humidity: "+_humidity);
            windSpeed3.setValue("Wind speed: "+_speed);
            windDegree3.setValue("Wind degree: "+_deg);
            feelsLike3.setValue("Feels Like: "+_feelsLike);

            mainLayout.addComponents(mainLayout, dashboard, mainDescriptionLayout, mainDescriptionLayout2, mainDescriptionLayout3);

    }
}
