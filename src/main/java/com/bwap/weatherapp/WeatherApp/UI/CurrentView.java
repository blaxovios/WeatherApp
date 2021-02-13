package com.bwap.weatherapp.WeatherApp.UI;

import com.bwap.weatherapp.WeatherApp.backend.services.CurrentWeatherService;
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

    private VerticalLayout mainLayout;
    private NativeSelect<String> unitSelect;
    private TextField cityTextField;
    private Button searchButton;
    private HorizontalLayout dashboard;
    private Label location;
    private Label currentWeatherCond;
    private Label currentWeatherCond2;
    private Label currentTemp;
    private HorizontalLayout mainDescriptionLayout;
    private HorizontalLayout mainDescriptionLayout2;
    private Label weatherDescription;
    private Label maxTemp;
    private Label minTemp;
    private Label humidity;
    private Label pressure;
    private Label dt;
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

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        mainLayout();
        setHeader();
        setLogo();
        setForm();
        dashboardTitle();
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
    }

    private void mainLayout() {
        iconImg = new Image();
        mainLayout = new VerticalLayout();
        mainLayout.setWidth("100%");
        mainLayout.setSpacing(true);
        mainLayout.setMargin(true);
        mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(mainLayout);
    }
    private void setHeader(){
        HorizontalLayout header = new HorizontalLayout();
        header.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        Label title = new Label("Weather Forecast");

        header.addComponent(title);

        mainLayout.addComponents(header);
    }
    // method to add an image logo for my main view
    private void setLogo(){
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
        ArrayList<String> items = new ArrayList<>();
        items.add("C");
        items.add("F");

        unitSelect.setItems(items);
        unitSelect.setValue(items.get(0));
        formLayout.addComponent(unitSelect);

        // add the city text field
        cityTextField = new TextField();
        cityTextField.setWidth("80%");
        formLayout.addComponent(cityTextField);

        // add the search button
        searchButton = new Button();
        searchButton.setIcon(VaadinIcons.SEARCH);
        formLayout.addComponent(searchButton);

        mainLayout.addComponents(formLayout);
    }
    private void dashboardTitle(){

        dashboard = new HorizontalLayout();
        dashboard.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        // current city location
        location = new Label("Currently in Athens");
        location.addStyleName(ValoTheme.LABEL_H2);
        location.addStyleName(ValoTheme.LABEL_LIGHT);

        // current temperature
        currentTemp = new Label("10C");
        currentTemp.setStyleName(ValoTheme.LABEL_BOLD);
        currentTemp.setStyleName(ValoTheme.LABEL_H1);

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

        // Latest weather data time
        dt = new Label("Lastly updated: -");
        descriptionLayout.addComponents(dt);

        // Weather description
        weatherDescription = new Label("Now: -");
        descriptionLayout.addComponents(weatherDescription);

        // Min Temperature
        minTemp = new Label("Min: -");
        descriptionLayout.addComponents(minTemp);

        // Max Temperature
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

        // Description layout
        VerticalLayout descriptionLayout2 = new VerticalLayout();
        currentWeatherCond2 = new Label("Next 5 Days");
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout2.addComponent(currentWeatherCond2);
        descriptionLayout2.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // Latest weather data time
        dt2 = new Label("Lastly updated: -");
        descriptionLayout2.addComponents(dt2);

        // Min Temperature
        minTemp2 = new Label("Min: -");
        descriptionLayout2.addComponents(minTemp2);

        // Max Temperature
        maxTemp2 = new Label("Max: -");
        descriptionLayout2.addComponents(maxTemp2);

        pop = new Label("Rain Probability: -");
        descriptionLayout2.addComponents(pop);

        pressure2 = new Label("Pressure: -");
        descriptionLayout2.addComponents(pressure2);

        humidity2 = new Label("Humidity: -");
        descriptionLayout2.addComponents(humidity2);

        windSpeed2 = new Label("Wind speed: -");
        descriptionLayout2.addComponents(windSpeed2);

        windDegree2 = new Label("Wind degree: -");
        descriptionLayout2.addComponents(windDegree2);

        feelsLike2 = new Label("Feels like: -");
        descriptionLayout2.addComponents(feelsLike2);

        mainDescriptionLayout.addComponents(descriptionLayout2);
        mainLayout.addComponents(mainDescriptionLayout2);

    }
    // method that updates our UI, pulling data from json file
    private void updateUI() throws JSONException {
        String city = cityTextField.getValue();
        String defaultUnit;
        weatherService.setCityName(city);
        weatherService5Day.setCityName2(city);

        if(unitSelect.getValue().equals("F")){
            weatherService.setUnit("imperial");
            weatherService5Day.setUnit2("imperial");
            unitSelect.setValue("F");
            defaultUnit = "\u00b0"+"F";
        }else{
            weatherService.setUnit("metric");
            weatherService5Day.setUnit2("metric");
            defaultUnit = "\u00b0"+"C";
            unitSelect.setValue("C");
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

            minTemp2.setValue("Min temp: "+weatherService5Day.returnListArray2().getInt(Integer.parseInt("temp_min")));
            maxTemp2.setValue("Max temp: "+weatherService5Day.returnListArray2().getInt(Integer.parseInt("temp_max")));
            pop.setValue("Rain Probability: "+weatherService5Day.returnPop().getInt("pop"));
            pressure2.setValue("Pressure: "+weatherService5Day.returnListArray2().getInt(Integer.parseInt("pressure")));
            humidity2.setValue("Humidity: "+weatherService5Day.returnListArray2().getInt(Integer.parseInt("humidity")));
            windSpeed2.setValue("Wind speed: "+weatherService5Day.returnWind2().getInt("speed"));
            windDegree2.setValue("Wind degree: "+weatherService5Day.returnWind2().getInt("deg"));
            feelsLike2.setValue("Feels Like: "+weatherService5Day.returnListArray2().getInt(Integer.parseInt("feels_like")));

            mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout2);

    }
}
