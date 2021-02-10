package com.bwap.weatherapp.WeatherApp.UI;

import com.bwap.weatherapp.WeatherApp.backend.CurrentWeatherService;
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
public class CurrentView extends UI {

    @Autowired
    private CurrentWeatherService weatherService;
    private CurrentWeatherService weatherService5Day;

    private VerticalLayout mainLayout;
    private NativeSelect<String> unitSelect;
    private TextField cityTextField;
    private Button searchButton;
    private HorizontalLayout dashboard;
    private Label location;
    private Label currentWeatherCond;
    private Label currentWeatherCond2;
    private Label currentTemp;
    private Label currentTemp2;
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
    private Label weatherDescription2;
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
        descriptionLayout.setDefaultComponentAlignment(Alignment.TOP_LEFT);

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

        VerticalLayout pressureLayout = new VerticalLayout();
        pressureLayout.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        pressure = new Label("Pressure: -");
        pressureLayout.addComponents(pressure);

        humidity = new Label("Humidity: -");
        pressureLayout.addComponents(humidity);

        windSpeed = new Label("Wind speed: -");
        pressureLayout.addComponents(windSpeed);

        windDegree = new Label("Wind degree: -");
        pressureLayout.addComponents(windDegree);

        feelsLike = new Label("Feels like: -");
        pressureLayout.addComponents(feelsLike);

        mainDescriptionLayout.addComponents(descriptionLayout, pressureLayout);
        mainLayout.addComponents(dashboard, mainDescriptionLayout);

        // 2nd vertical layout for 5 day data

        // Description layout
        VerticalLayout descriptionLayout2 = new VerticalLayout();
        currentWeatherCond2 = new Label("Next 5 day");
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout2.addComponent(currentWeatherCond);
        descriptionLayout2.setDefaultComponentAlignment(Alignment.TOP_LEFT);

        // Latest weather data time
        dt2 = new Label("Lastly updated: -");
        descriptionLayout2.addComponents(dt2);

        // Weather description
        weatherDescription2 = new Label("Now: -");
        descriptionLayout2.addComponents(weatherDescription2);

        // Min Temperature
        minTemp2 = new Label("Min: -");
        descriptionLayout2.addComponents(minTemp2);

        // Max Temperature
        maxTemp2 = new Label("Max: -");
        descriptionLayout2.addComponents(maxTemp2);

        pop = new Label("Rain Probability: -");
        descriptionLayout2.addComponents(pop);

        VerticalLayout pressureLayout2 = new VerticalLayout();
        pressureLayout2.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        pressure2 = new Label("Pressure: -");
        pressureLayout2.addComponents(pressure2);

        humidity2 = new Label("Humidity: -");
        pressureLayout2.addComponents(humidity2);

        windSpeed2 = new Label("Wind speed: -");
        pressureLayout2.addComponents(windSpeed2);

        windDegree2 = new Label("Wind degree: -");
        pressureLayout2.addComponents(windDegree2);

        feelsLike2 = new Label("Feels like: -");
        pressureLayout2.addComponents(feelsLike2);

        mainDescriptionLayout.addComponents(descriptionLayout2, pressureLayout2);
        mainLayout.addComponents(dashboard, mainDescriptionLayout);

    }
    // method that updates our UI, pulling data from json file
    private void updateUI() throws JSONException {
        String city = cityTextField.getValue();
        String defaultUnit;
        weatherService.setCityName(city);
        weatherService5Day.setCityName(city);

        if(unitSelect.getValue().equals("F")){
            weatherService.setUnit("imperial");
            unitSelect.setValue("F");
            defaultUnit = "\u00b0"+"F";
        }else{
            weatherService.setUnit("metric");
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
            pop.setValue("Pressure: "+weatherService5Day.returnMain().getInt("pop"));
            pressure.setValue("Pressure: "+weatherService.returnMain().getInt("pressure"));
            humidity.setValue("Humidity: "+weatherService.returnMain().getInt("humidity"));
            windSpeed.setValue("Wind speed: "+weatherService.returnWind().getInt("speed"));
            windDegree.setValue("Wind degree: "+weatherService.returnWind().getInt("deg"));
            feelsLike.setValue("Feels Like: "+weatherService.returnMain().getDouble("feels_like"));

            weatherDescription2.setValue("Description: "+weatherDescriptionNew);
            minTemp2.setValue("Min temp: "+weatherService5Day.returnMain().getInt("temp_min")+unitSelect.getValue());
            maxTemp2.setValue("Max temp: "+weatherService5Day.returnMain().getInt("temp_max")+unitSelect.getValue());
            pressure2.setValue("Pressure: "+weatherService5Day.returnMain().getInt("pressure"));
            humidity2.setValue("Humidity: "+weatherService5Day.returnMain().getInt("humidity"));
            windSpeed2.setValue("Wind speed: "+weatherService5Day.returnWind().getInt("speed"));
            windDegree2.setValue("Wind degree: "+weatherService5Day.returnWind().getInt("deg"));
            feelsLike2.setValue("Feels Like: "+weatherService5Day.returnMain().getDouble("feels_like"));

            mainLayout.addComponents(dashboard, mainDescriptionLayout);




    }
}
