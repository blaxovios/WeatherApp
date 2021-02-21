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
@Theme("tests-valo-dark")
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
    private Button refreshButton;
    private HorizontalLayout dashboard;
    private HorizontalLayout formLayout;
    private Label location;
    private Label currentTemp;
    private Label currentWeatherCond;
    private Label currentWeatherCond2;
    private HorizontalLayout mainDescriptionLayout;
    private HorizontalLayout mainDescriptionLayout2;
    private HorizontalLayout mainDescriptionLayout3;
    private HorizontalLayout mainDescriptionLayout4;
    private HorizontalLayout mainDescriptionLayout5;
    private HorizontalLayout mainDescriptionLayout6;
    private HorizontalLayout mainDescriptionLayout7;
    private HorizontalLayout mainDescriptionLayout8;
    private HorizontalLayout mainDescriptionLayout9;
    private HorizontalLayout mainDescriptionLayout10;
    private HorizontalLayout mainDescriptionLayout11;
    private HorizontalLayout mainDescriptionLayout12;
    private HorizontalLayout mainDescriptionLayout13;
    private HorizontalLayout mainDescriptionLayout14;
    private HorizontalLayout mainDescriptionLayout15;
    private HorizontalLayout mainDescriptionLayout16;
    private HorizontalLayout mainDescriptionLayout17;
    private HorizontalLayout mainDescriptionLayout18;
    private Label weatherDescription;
    private Image iconImg;
    private String _name = null;
    private Label maxTemp;
    private Label maxTemp2;
    private Label maxTemp3;
    private Label maxTemp4;
    private Label maxTemp5;
    private Label maxTemp6;
    private Label maxTemp7;
    private Label maxTemp8;
    private Label maxTemp9;
    private Label maxTemp10;
    private Label maxTemp11;
    private Label maxTemp12;
    private Label maxTemp13;
    private Label maxTemp14;
    private Label maxTemp15;
    private Label maxTemp16;
    private Label maxTemp17;
    private Label maxTemp18;
    private Label minTemp;
    private Label minTemp2;
    private Label minTemp3;
    private Label minTemp4;
    private Label minTemp5;
    private Label minTemp6;
    private Label minTemp7;
    private Label minTemp8;
    private Label minTemp9;
    private Label minTemp10;
    private Label minTemp11;
    private Label minTemp12;
    private Label minTemp13;
    private Label minTemp14;
    private Label minTemp15;
    private Label minTemp16;
    private Label minTemp17;
    private Label minTemp18;
    private Label humidity;
    private Label humidity2;
    private Label humidity3;
    private Label humidity4;
    private Label humidity5;
    private Label humidity6;
    private Label humidity7;
    private Label humidity8;
    private Label humidity9;
    private Label humidity10;
    private Label humidity11;
    private Label humidity12;
    private Label humidity13;
    private Label humidity14;
    private Label humidity15;
    private Label humidity16;
    private Label humidity17;
    private Label humidity18;
    private Label pressure;
    private Label pressure2;
    private Label pressure3;
    private Label pressure4;
    private Label pressure5;
    private Label pressure6;
    private Label pressure7;
    private Label pressure8;
    private Label pressure9;
    private Label pressure10;
    private Label pressure11;
    private Label pressure12;
    private Label pressure13;
    private Label pressure14;
    private Label pressure15;
    private Label pressure16;
    private Label pressure17;
    private Label pressure18;
    private Label windSpeed;
    private Label windSpeed2;
    private Label windSpeed3;
    private Label windSpeed4;
    private Label windSpeed5;
    private Label windSpeed6;
    private Label windSpeed7;
    private Label windSpeed8;
    private Label windSpeed9;
    private Label windSpeed10;
    private Label windSpeed11;
    private Label windSpeed12;
    private Label windSpeed13;
    private Label windSpeed14;
    private Label windSpeed15;
    private Label windSpeed16;
    private Label windSpeed17;
    private Label windSpeed18;
    private Label windDegree;
    private Label windDegree2;
    private Label windDegree3;
    private Label windDegree4;
    private Label windDegree5;
    private Label windDegree6;
    private Label windDegree7;
    private Label windDegree8;
    private Label windDegree9;
    private Label windDegree10;
    private Label windDegree11;
    private Label windDegree12;
    private Label windDegree13;
    private Label windDegree14;
    private Label windDegree15;
    private Label windDegree16;
    private Label windDegree17;
    private Label windDegree18;
    private Label feelsLike;
    private Label feelsLike2;
    private Label feelsLike3;
    private Label feelsLike4;
    private Label feelsLike5;
    private Label feelsLike6;
    private Label feelsLike7;
    private Label feelsLike8;
    private Label feelsLike9;
    private Label feelsLike10;
    private Label feelsLike11;
    private Label feelsLike12;
    private Label feelsLike13;
    private Label feelsLike14;
    private Label feelsLike15;
    private Label feelsLike16;
    private Label feelsLike17;
    private Label feelsLike18;
    private Label dt2;
    private Label dt3;
    private Label dt4;
    private Label dt5;
    private Label dt6;
    private Label dt7;
    private Label dt8;
    private Label dt9;
    private Label dt10;
    private Label dt11;
    private Label dt12;
    private Label dt13;
    private Label dt14;
    private Label dt15;
    private Label dt16;
    private Label dt17;
    private Label dt18;
    private Label pop2;
    private Label pop3;
    private Label pop4;
    private Label pop5;
    private Label pop6;
    private Label pop7;
    private Label pop8;
    private Label pop9;
    private Label pop10;
    private Label pop11;
    private Label pop12;
    private Label pop13;
    private Label pop14;
    private Label pop15;
    private Label pop16;
    private Label pop17;
    private Label pop18;

    // Main view function requests
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        mainLayout();
        setHeader();
        setLogo();
        try {
            setForm();
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
            if (!(citySelect.getValue() == null)){
                try {
                    removeCity();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else
                Notification.show("Select a city to delete");
        });
        refreshButton.addClickListener(clickEvent -> {
            if (!(citySelect.getValue() == null)){
                try {
                    refreshUI();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else
                Notification.show("Select a city to refresh weather");
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
    private void setForm() throws JSONException {
        formLayout = new HorizontalLayout();
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

        // add city to the drop-down list
        citySelect = new NativeSelect<>("Cities");
        cities = new ArrayList<>();
        if(!cities.equals(_name)) {
            cities.add(_name);
        }

        citySelect.setItems(cities);
        citySelect.setValue(cities.get(0));
        formLayout.addComponent(citySelect);


        // remove city from list
        if(!cities.equals(_name)) {
            cities.remove(_name);
        }

        citySelect.setItems(cities);
        formLayout.addComponent(citySelect);

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

        // add the refresh button so we can choose a city from the list and get weather data
        refreshButton = new Button();
        refreshButton.setIcon(VaadinIcons.REFRESH);
        formLayout.addComponent(refreshButton);

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
        mainDescriptionLayout4 = new HorizontalLayout();
        mainDescriptionLayout4.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout5 = new HorizontalLayout();
        mainDescriptionLayout5.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout6 = new HorizontalLayout();
        mainDescriptionLayout6.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout7 = new HorizontalLayout();
        mainDescriptionLayout7.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout8 = new HorizontalLayout();
        mainDescriptionLayout8.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout9 = new HorizontalLayout();
        mainDescriptionLayout9.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout10 = new HorizontalLayout();
        mainDescriptionLayout10.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout11 = new HorizontalLayout();
        mainDescriptionLayout11.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout12 = new HorizontalLayout();
        mainDescriptionLayout12.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout13 = new HorizontalLayout();
        mainDescriptionLayout13.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout14 = new HorizontalLayout();
        mainDescriptionLayout14.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout15 = new HorizontalLayout();
        mainDescriptionLayout15.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout16 = new HorizontalLayout();
        mainDescriptionLayout16.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout17 = new HorizontalLayout();
        mainDescriptionLayout17.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout18 = new HorizontalLayout();
        mainDescriptionLayout18.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // Description layout
        HorizontalLayout descriptionLayout2 = new HorizontalLayout();
        HorizontalLayout descriptionLayout3 = new HorizontalLayout();
        HorizontalLayout descriptionLayout4 = new HorizontalLayout();
        HorizontalLayout descriptionLayout5 = new HorizontalLayout();
        HorizontalLayout descriptionLayout6 = new HorizontalLayout();
        HorizontalLayout descriptionLayout7 = new HorizontalLayout();
        HorizontalLayout descriptionLayout8 = new HorizontalLayout();
        HorizontalLayout descriptionLayout9 = new HorizontalLayout();
        HorizontalLayout descriptionLayout10 = new HorizontalLayout();
        HorizontalLayout descriptionLayout11 = new HorizontalLayout();
        HorizontalLayout descriptionLayout12 = new HorizontalLayout();
        HorizontalLayout descriptionLayout13 = new HorizontalLayout();
        HorizontalLayout descriptionLayout14 = new HorizontalLayout();
        HorizontalLayout descriptionLayout15 = new HorizontalLayout();
        HorizontalLayout descriptionLayout16 = new HorizontalLayout();
        HorizontalLayout descriptionLayout17 = new HorizontalLayout();
        HorizontalLayout descriptionLayout18 = new HorizontalLayout();
        currentWeatherCond2 = new Label("Next 5 Days for every 3 Hours");
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout2.addComponent(currentWeatherCond2);
        descriptionLayout2.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout3.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout4.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout5.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout6.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout7.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout8.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout9.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout10.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout11.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout12.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout13.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout14.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout15.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout16.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout17.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout18.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        // Latest weather data time
        dt2 = new Label("Time: -");
        dt3 = new Label("Time: -");
        dt4 = new Label("Time: -");
        dt5 = new Label("Time: -");
        dt6 = new Label("Time: -");
        dt7 = new Label("Time: -");
        dt8 = new Label("Time: -");
        dt9 = new Label("Time: -");
        dt10 = new Label("Time: -");
        dt11 = new Label("Time: -");
        dt12 = new Label("Time: -");
        dt13 = new Label("Time: -");
        dt14 = new Label("Time: -");
        dt15 = new Label("Time: -");
        dt16 = new Label("Time: -");
        dt17 = new Label("Time: -");
        dt18 = new Label("Time: -");
        descriptionLayout2.addComponents(dt2);
        descriptionLayout3.addComponents(dt3);
        descriptionLayout4.addComponents(dt4);
        descriptionLayout5.addComponents(dt5);
        descriptionLayout6.addComponents(dt6);
        descriptionLayout7.addComponents(dt7);
        descriptionLayout8.addComponents(dt8);
        descriptionLayout9.addComponents(dt9);
        descriptionLayout10.addComponents(dt10);
        descriptionLayout11.addComponents(dt11);
        descriptionLayout12.addComponents(dt12);
        descriptionLayout13.addComponents(dt13);
        descriptionLayout14.addComponents(dt14);
        descriptionLayout15.addComponents(dt15);
        descriptionLayout16.addComponents(dt16);
        descriptionLayout17.addComponents(dt17);
        descriptionLayout18.addComponents(dt18);

        minTemp2 = new Label("Min: -");
        minTemp3 = new Label("Min: -");
        minTemp4 = new Label("Min: -");
        minTemp5 = new Label("Min: -");
        minTemp6 = new Label("Min: -");
        minTemp7 = new Label("Min: -");
        minTemp8 = new Label("Min: -");
        minTemp9 = new Label("Min: -");
        minTemp10 = new Label("Min: -");
        minTemp11 = new Label("Min: -");
        minTemp12 = new Label("Min: -");
        minTemp13 = new Label("Min: -");
        minTemp14 = new Label("Min: -");
        minTemp15 = new Label("Min: -");
        minTemp16 = new Label("Min: -");
        minTemp17 = new Label("Min: -");
        minTemp18 = new Label("Min: -");
        descriptionLayout2.addComponents(minTemp2);
        descriptionLayout3.addComponents(minTemp3);
        descriptionLayout4.addComponents(minTemp4);
        descriptionLayout5.addComponents(minTemp5);
        descriptionLayout6.addComponents(minTemp6);
        descriptionLayout7.addComponents(minTemp7);
        descriptionLayout8.addComponents(minTemp8);
        descriptionLayout9.addComponents(minTemp9);
        descriptionLayout10.addComponents(minTemp10);
        descriptionLayout11.addComponents(minTemp11);
        descriptionLayout12.addComponents(minTemp12);
        descriptionLayout13.addComponents(minTemp13);
        descriptionLayout14.addComponents(minTemp14);
        descriptionLayout15.addComponents(minTemp15);
        descriptionLayout16.addComponents(minTemp16);
        descriptionLayout17.addComponents(minTemp17);
        descriptionLayout18.addComponents(minTemp18);

        maxTemp2 = new Label("Max: -");
        maxTemp3 = new Label("Max: -");
        maxTemp4 = new Label("Max: -");
        maxTemp5 = new Label("Max: -");
        maxTemp6 = new Label("Max: -");
        maxTemp7 = new Label("Max: -");
        maxTemp8 = new Label("Max: -");
        maxTemp9 = new Label("Max: -");
        maxTemp10 = new Label("Max: -");
        maxTemp11 = new Label("Max: -");
        maxTemp12 = new Label("Max: -");
        maxTemp13 = new Label("Max: -");
        maxTemp14 = new Label("Max: -");
        maxTemp15 = new Label("Max: -");
        maxTemp16 = new Label("Max: -");
        maxTemp17 = new Label("Max: -");
        maxTemp18 = new Label("Max: -");
        descriptionLayout2.addComponents(maxTemp2);
        descriptionLayout3.addComponents(maxTemp3);
        descriptionLayout4.addComponents(maxTemp4);
        descriptionLayout5.addComponents(maxTemp5);
        descriptionLayout6.addComponents(maxTemp6);
        descriptionLayout7.addComponents(maxTemp7);
        descriptionLayout8.addComponents(maxTemp8);
        descriptionLayout9.addComponents(maxTemp9);
        descriptionLayout10.addComponents(maxTemp10);
        descriptionLayout11.addComponents(maxTemp11);
        descriptionLayout12.addComponents(maxTemp12);
        descriptionLayout13.addComponents(maxTemp13);
        descriptionLayout14.addComponents(maxTemp14);
        descriptionLayout15.addComponents(maxTemp15);
        descriptionLayout16.addComponents(maxTemp16);
        descriptionLayout17.addComponents(maxTemp17);
        descriptionLayout18.addComponents(maxTemp18);

        pop2 = new Label("Rain Probability: -");
        pop3 = new Label("Rain Probability: -");
        pop4 = new Label("Rain Probability: -");
        pop5 = new Label("Rain Probability: -");
        pop6 = new Label("Rain Probability: -");
        pop7 = new Label("Rain Probability: -");
        pop8 = new Label("Rain Probability: -");
        pop9 = new Label("Rain Probability: -");
        pop10 = new Label("Rain Probability: -");
        pop11 = new Label("Rain Probability: -");
        pop12 = new Label("Rain Probability: -");
        pop13 = new Label("Rain Probability: -");
        pop14 = new Label("Rain Probability: -");
        pop15 = new Label("Rain Probability: -");
        pop16 = new Label("Rain Probability: -");
        pop17 = new Label("Rain Probability: -");
        pop18 = new Label("Rain Probability: -");
        descriptionLayout2.addComponents(pop2);
        descriptionLayout3.addComponents(pop3);
        descriptionLayout4.addComponents(pop4);
        descriptionLayout5.addComponents(pop5);
        descriptionLayout6.addComponents(pop6);
        descriptionLayout7.addComponents(pop7);
        descriptionLayout8.addComponents(pop8);
        descriptionLayout9.addComponents(pop9);
        descriptionLayout10.addComponents(pop10);
        descriptionLayout11.addComponents(pop11);
        descriptionLayout12.addComponents(pop12);
        descriptionLayout13.addComponents(pop13);
        descriptionLayout14.addComponents(pop14);
        descriptionLayout15.addComponents(pop15);
        descriptionLayout16.addComponents(pop16);
        descriptionLayout17.addComponents(pop17);
        descriptionLayout18.addComponents(pop18);

        pressure2 = new Label("Pressure: -");
        pressure3 = new Label("Pressure: -");
        pressure4 = new Label("Pressure: -");
        pressure5 = new Label("Pressure: -");
        pressure6 = new Label("Pressure: -");
        pressure7 = new Label("Pressure: -");
        pressure8 = new Label("Pressure: -");
        pressure9 = new Label("Pressure: -");
        pressure10 = new Label("Pressure: -");
        pressure11 = new Label("Pressure: -");
        pressure12 = new Label("Pressure: -");
        pressure13 = new Label("Pressure: -");
        pressure14 = new Label("Pressure: -");
        pressure15 = new Label("Pressure: -");
        pressure16 = new Label("Pressure: -");
        pressure17 = new Label("Pressure: -");
        pressure18 = new Label("Pressure: -");
        descriptionLayout2.addComponents(pressure2);
        descriptionLayout3.addComponents(pressure3);
        descriptionLayout4.addComponents(pressure4);
        descriptionLayout5.addComponents(pressure5);
        descriptionLayout6.addComponents(pressure6);
        descriptionLayout7.addComponents(pressure7);
        descriptionLayout8.addComponents(pressure8);
        descriptionLayout9.addComponents(pressure9);
        descriptionLayout10.addComponents(pressure10);
        descriptionLayout11.addComponents(pressure11);
        descriptionLayout12.addComponents(pressure12);
        descriptionLayout13.addComponents(pressure13);
        descriptionLayout14.addComponents(pressure14);
        descriptionLayout15.addComponents(pressure15);
        descriptionLayout16.addComponents(pressure16);
        descriptionLayout17.addComponents(pressure17);
        descriptionLayout18.addComponents(pressure18);

        humidity2 = new Label("Humidity: -");
        humidity3 = new Label("Humidity: -");
        humidity4 = new Label("Humidity: -");
        humidity5 = new Label("Humidity: -");
        humidity6 = new Label("Humidity: -");
        humidity7 = new Label("Humidity: -");
        humidity8 = new Label("Humidity: -");
        humidity9 = new Label("Humidity: -");
        humidity10 = new Label("Humidity: -");
        humidity11 = new Label("Humidity: -");
        humidity12 = new Label("Humidity: -");
        humidity13 = new Label("Humidity: -");
        humidity14 = new Label("Humidity: -");
        humidity15 = new Label("Humidity: -");
        humidity16 = new Label("Humidity: -");
        humidity17 = new Label("Humidity: -");
        humidity18 = new Label("Humidity: -");
        descriptionLayout2.addComponents(humidity2);
        descriptionLayout3.addComponents(humidity3);
        descriptionLayout4.addComponents(humidity4);
        descriptionLayout5.addComponents(humidity5);
        descriptionLayout6.addComponents(humidity6);
        descriptionLayout7.addComponents(humidity7);
        descriptionLayout8.addComponents(humidity8);
        descriptionLayout9.addComponents(humidity9);
        descriptionLayout10.addComponents(humidity10);
        descriptionLayout11.addComponents(humidity11);
        descriptionLayout12.addComponents(humidity12);
        descriptionLayout13.addComponents(humidity13);
        descriptionLayout14.addComponents(humidity14);
        descriptionLayout15.addComponents(humidity15);
        descriptionLayout16.addComponents(humidity16);
        descriptionLayout17.addComponents(humidity17);
        descriptionLayout18.addComponents(humidity18);

        windSpeed2 = new Label("Wind speed: -");
        windSpeed3 = new Label("Wind speed: -");
        windSpeed4 = new Label("Wind speed: -");
        windSpeed5 = new Label("Wind speed: -");
        windSpeed6 = new Label("Wind speed: -");
        windSpeed7 = new Label("Wind speed: -");
        windSpeed8 = new Label("Wind speed: -");
        windSpeed9 = new Label("Wind speed: -");
        windSpeed10 = new Label("Wind speed: -");
        windSpeed11 = new Label("Wind speed: -");
        windSpeed12 = new Label("Wind speed: -");
        windSpeed13 = new Label("Wind speed: -");
        windSpeed14 = new Label("Wind speed: -");
        windSpeed15 = new Label("Wind speed: -");
        windSpeed16 = new Label("Wind speed: -");
        windSpeed17 = new Label("Wind speed: -");
        windSpeed18 = new Label("Wind speed: -");
        descriptionLayout2.addComponents(windSpeed2);
        descriptionLayout3.addComponents(windSpeed3);
        descriptionLayout4.addComponents(windSpeed4);
        descriptionLayout5.addComponents(windSpeed5);
        descriptionLayout6.addComponents(windSpeed6);
        descriptionLayout7.addComponents(windSpeed7);
        descriptionLayout8.addComponents(windSpeed8);
        descriptionLayout9.addComponents(windSpeed9);
        descriptionLayout10.addComponents(windSpeed10);
        descriptionLayout11.addComponents(windSpeed11);
        descriptionLayout12.addComponents(windSpeed12);
        descriptionLayout13.addComponents(windSpeed13);
        descriptionLayout14.addComponents(windSpeed14);
        descriptionLayout15.addComponents(windSpeed15);
        descriptionLayout16.addComponents(windSpeed16);
        descriptionLayout17.addComponents(windSpeed17);
        descriptionLayout18.addComponents(windSpeed18);

        windDegree2 = new Label("Wind degree: -");
        windDegree3 = new Label("Wind degree: -");
        windDegree4 = new Label("Wind degree: -");
        windDegree5 = new Label("Wind degree: -");
        windDegree6 = new Label("Wind degree: -");
        windDegree7 = new Label("Wind degree: -");
        windDegree8 = new Label("Wind degree: -");
        windDegree9 = new Label("Wind degree: -");
        windDegree10 = new Label("Wind degree: -");
        windDegree11 = new Label("Wind degree: -");
        windDegree12 = new Label("Wind degree: -");
        windDegree13 = new Label("Wind degree: -");
        windDegree14 = new Label("Wind degree: -");
        windDegree15 = new Label("Wind degree: -");
        windDegree16 = new Label("Wind degree: -");
        windDegree17 = new Label("Wind degree: -");
        windDegree18 = new Label("Wind degree: -");
        descriptionLayout2.addComponents(windDegree2);
        descriptionLayout3.addComponents(windDegree3);
        descriptionLayout4.addComponents(windDegree4);
        descriptionLayout5.addComponents(windDegree5);
        descriptionLayout6.addComponents(windDegree6);
        descriptionLayout7.addComponents(windDegree7);
        descriptionLayout8.addComponents(windDegree8);
        descriptionLayout9.addComponents(windDegree9);
        descriptionLayout10.addComponents(windDegree10);
        descriptionLayout11.addComponents(windDegree11);
        descriptionLayout12.addComponents(windDegree12);
        descriptionLayout13.addComponents(windDegree13);
        descriptionLayout14.addComponents(windDegree14);
        descriptionLayout15.addComponents(windDegree15);
        descriptionLayout16.addComponents(windDegree16);
        descriptionLayout17.addComponents(windDegree17);
        descriptionLayout18.addComponents(windDegree18);

        feelsLike2 = new Label("Feels like: -");
        feelsLike3 = new Label("Feels like: -");
        feelsLike4 = new Label("Feels like: -");
        feelsLike5 = new Label("Feels like: -");
        feelsLike6 = new Label("Feels like: -");
        feelsLike7 = new Label("Feels like: -");
        feelsLike8 = new Label("Feels like: -");
        feelsLike9 = new Label("Feels like: -");
        feelsLike10 = new Label("Feels like: -");
        feelsLike11 = new Label("Feels like: -");
        feelsLike12 = new Label("Feels like: -");
        feelsLike13 = new Label("Feels like: -");
        feelsLike14 = new Label("Feels like: -");
        feelsLike15 = new Label("Feels like: -");
        feelsLike16 = new Label("Feels like: -");
        feelsLike17 = new Label("Feels like: -");
        feelsLike18 = new Label("Feels like: -");
        descriptionLayout2.addComponents(feelsLike2);
        descriptionLayout3.addComponents(feelsLike3);
        descriptionLayout4.addComponents(feelsLike4);
        descriptionLayout5.addComponents(feelsLike5);
        descriptionLayout6.addComponents(feelsLike6);
        descriptionLayout7.addComponents(feelsLike7);
        descriptionLayout8.addComponents(feelsLike8);
        descriptionLayout9.addComponents(feelsLike9);
        descriptionLayout10.addComponents(feelsLike10);
        descriptionLayout11.addComponents(feelsLike11);
        descriptionLayout12.addComponents(feelsLike12);
        descriptionLayout13.addComponents(feelsLike13);
        descriptionLayout14.addComponents(feelsLike14);
        descriptionLayout15.addComponents(feelsLike15);
        descriptionLayout16.addComponents(feelsLike16);
        descriptionLayout17.addComponents(feelsLike17);
        descriptionLayout18.addComponents(feelsLike18);

        mainDescriptionLayout2.addComponents(descriptionLayout2);
        mainDescriptionLayout3.addComponents(descriptionLayout3);
        mainDescriptionLayout4.addComponents(descriptionLayout4);
        mainDescriptionLayout5.addComponents(descriptionLayout5);
        mainDescriptionLayout6.addComponents(descriptionLayout6);
        mainDescriptionLayout7.addComponents(descriptionLayout7);
        mainDescriptionLayout8.addComponents(descriptionLayout8);
        mainDescriptionLayout9.addComponents(descriptionLayout9);
        mainDescriptionLayout10.addComponents(descriptionLayout10);
        mainDescriptionLayout11.addComponents(descriptionLayout11);
        mainDescriptionLayout12.addComponents(descriptionLayout12);
        mainDescriptionLayout13.addComponents(descriptionLayout13);
        mainDescriptionLayout14.addComponents(descriptionLayout14);
        mainDescriptionLayout15.addComponents(descriptionLayout15);
        mainDescriptionLayout16.addComponents(descriptionLayout16);
        mainDescriptionLayout17.addComponents(descriptionLayout17);
        mainDescriptionLayout18.addComponents(descriptionLayout18);
        mainLayout.addComponents(mainDescriptionLayout, mainDescriptionLayout2, mainDescriptionLayout3, mainDescriptionLayout4,
                mainDescriptionLayout5, mainDescriptionLayout6, mainDescriptionLayout7, mainDescriptionLayout8,
                mainDescriptionLayout9, mainDescriptionLayout10, mainDescriptionLayout11, mainDescriptionLayout12,
                mainDescriptionLayout13, mainDescriptionLayout14, mainDescriptionLayout15, mainDescriptionLayout16,
                mainDescriptionLayout17, mainDescriptionLayout18);

    }
    // method that updates our UI, pulling data from json file
    private void updateUI() throws JSONException {
        city = cityTextField.getValue();
        String defaultUnit;
        weatherService.setCityName(city);
        weatherService5Day.setCityName2(city);


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


        // Update dashboardDetails for current weather with values from CurrentWeatherService
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

        // Update dashboardDetails with values from Weather5DayService
        String tempMin = null;
        String tempMax = null;
        String _pressure = null;
        String _humidity = null;
        String _feelsLike = null;
        String _pop = null;
        String _speed = null;
        String _deg = null;
        String _dtTxt = null;

        // Reading jsonArray from weatherService5Day. Use "if" statements to pass values for every 3-Hour
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

            // Passing values to 1st column that represents our first 3-Hour forecast
            if(i == 0) {
                dt2.setValue("Time: " + _dtTxt);
                minTemp2.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp2.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop2.setValue("Rain Probability: " + _pop);
                pressure2.setValue("Pressure: " + _pressure);
                humidity2.setValue("Humidity: " + _humidity);
                windSpeed2.setValue("Wind speed: " + _speed);
                windDegree2.setValue("Wind degree: " + _deg);
                feelsLike2.setValue("Feels Like: " + _feelsLike);
                _name = weatherService5Day.returnName().getString("name");
            }

            // Trying to pass values to 2nd column that represents our second 3-Hour forecast
            if(i == 1) {
                dt3.setValue("Time: " + _dtTxt);
                minTemp3.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp3.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop3.setValue("Rain Probability: " + _pop);
                pressure3.setValue("Pressure: " + _pressure);
                humidity3.setValue("Humidity: " + _humidity);
                windSpeed3.setValue("Wind speed: " + _speed);
                windDegree3.setValue("Wind degree: " + _deg);
                feelsLike3.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 2) {
                dt4.setValue("Time: " + _dtTxt);
                minTemp4.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp4.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop4.setValue("Rain Probability: " + _pop);
                pressure4.setValue("Pressure: " + _pressure);
                humidity4.setValue("Humidity: " + _humidity);
                windSpeed4.setValue("Wind speed: " + _speed);
                windDegree4.setValue("Wind degree: " + _deg);
                feelsLike4.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 3) {
                dt5.setValue("Time: " + _dtTxt);
                minTemp5.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp5.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop5.setValue("Rain Probability: " + _pop);
                pressure5.setValue("Pressure: " + _pressure);
                humidity5.setValue("Humidity: " + _humidity);
                windSpeed5.setValue("Wind speed: " + _speed);
                windDegree5.setValue("Wind degree: " + _deg);
                feelsLike5.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 4) {
                dt6.setValue("Time: " + _dtTxt);
                minTemp6.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp6.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop6.setValue("Rain Probability: " + _pop);
                pressure6.setValue("Pressure: " + _pressure);
                humidity6.setValue("Humidity: " + _humidity);
                windSpeed6.setValue("Wind speed: " + _speed);
                windDegree6.setValue("Wind degree: " + _deg);
                feelsLike6.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 5) {
                dt7.setValue("Time: " + _dtTxt);
                minTemp7.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp7.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop7.setValue("Rain Probability: " + _pop);
                pressure7.setValue("Pressure: " + _pressure);
                humidity7.setValue("Humidity: " + _humidity);
                windSpeed7.setValue("Wind speed: " + _speed);
                windDegree7.setValue("Wind degree: " + _deg);
                feelsLike7.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 6) {
                dt8.setValue("Time: " + _dtTxt);
                minTemp8.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp8.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop8.setValue("Rain Probability: " + _pop);
                pressure8.setValue("Pressure: " + _pressure);
                humidity8.setValue("Humidity: " + _humidity);
                windSpeed8.setValue("Wind speed: " + _speed);
                windDegree8.setValue("Wind degree: " + _deg);
                feelsLike8.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 7) {
                dt9.setValue("Time: " + _dtTxt);
                minTemp9.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp9.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop9.setValue("Rain Probability: " + _pop);
                pressure9.setValue("Pressure: " + _pressure);
                humidity9.setValue("Humidity: " + _humidity);
                windSpeed9.setValue("Wind speed: " + _speed);
                windDegree9.setValue("Wind degree: " + _deg);
                feelsLike9.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 8) {
                dt10.setValue("Time: " + _dtTxt);
                minTemp10.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp10.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop10.setValue("Rain Probability: " + _pop);
                pressure10.setValue("Pressure: " + _pressure);
                humidity10.setValue("Humidity: " + _humidity);
                windSpeed10.setValue("Wind speed: " + _speed);
                windDegree10.setValue("Wind degree: " + _deg);
                feelsLike10.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 9) {
                dt11.setValue("Time: " + _dtTxt);
                minTemp11.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp11.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop11.setValue("Rain Probability: " + _pop);
                pressure11.setValue("Pressure: " + _pressure);
                humidity11.setValue("Humidity: " + _humidity);
                windSpeed11.setValue("Wind speed: " + _speed);
                windDegree11.setValue("Wind degree: " + _deg);
                feelsLike11.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 10) {
                dt12.setValue("Time: " + _dtTxt);
                minTemp12.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp12.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop12.setValue("Rain Probability: " + _pop);
                pressure12.setValue("Pressure: " + _pressure);
                humidity12.setValue("Humidity: " + _humidity);
                windSpeed12.setValue("Wind speed: " + _speed);
                windDegree12.setValue("Wind degree: " + _deg);
                feelsLike12.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 11) {
                dt13.setValue("Time: " + _dtTxt);
                minTemp13.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp13.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop13.setValue("Rain Probability: " + _pop);
                pressure13.setValue("Pressure: " + _pressure);
                humidity13.setValue("Humidity: " + _humidity);
                windSpeed13.setValue("Wind speed: " + _speed);
                windDegree13.setValue("Wind degree: " + _deg);
                feelsLike13.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 12) {
                dt14.setValue("Time: " + _dtTxt);
                minTemp14.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp14.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop14.setValue("Rain Probability: " + _pop);
                pressure14.setValue("Pressure: " + _pressure);
                humidity14.setValue("Humidity: " + _humidity);
                windSpeed14.setValue("Wind speed: " + _speed);
                windDegree14.setValue("Wind degree: " + _deg);
                feelsLike14.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 13) {
                dt15.setValue("Time: " + _dtTxt);
                minTemp15.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp15.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop15.setValue("Rain Probability: " + _pop);
                pressure15.setValue("Pressure: " + _pressure);
                humidity15.setValue("Humidity: " + _humidity);
                windSpeed15.setValue("Wind speed: " + _speed);
                windDegree15.setValue("Wind degree: " + _deg);
                feelsLike15.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 14) {
                dt16.setValue("Time: " + _dtTxt);
                minTemp16.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp16.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop16.setValue("Rain Probability: " + _pop);
                pressure16.setValue("Pressure: " + _pressure);
                humidity16.setValue("Humidity: " + _humidity);
                windSpeed16.setValue("Wind speed: " + _speed);
                windDegree16.setValue("Wind degree: " + _deg);
                feelsLike16.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 15) {
                dt17.setValue("Time: " + _dtTxt);
                minTemp17.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp17.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop17.setValue("Rain Probability: " + _pop);
                pressure17.setValue("Pressure: " + _pressure);
                humidity17.setValue("Humidity: " + _humidity);
                windSpeed17.setValue("Wind speed: " + _speed);
                windDegree17.setValue("Wind degree: " + _deg);
                feelsLike17.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 16) {
                dt18.setValue("Time: " + _dtTxt);
                minTemp18.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp18.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop18.setValue("Rain Probability: " + _pop);
                pressure18.setValue("Pressure: " + _pressure);
                humidity18.setValue("Humidity: " + _humidity);
                windSpeed18.setValue("Wind speed: " + _speed);
                windDegree18.setValue("Wind degree: " + _deg);
                feelsLike18.setValue("Feels Like: " + _feelsLike);
            }
        }

        // current city weather by IP from class Location
        location.setValue("Currently in "+_name);
        int temp = weatherService.returnMain().getInt("temp");
        currentTemp.setValue(temp +defaultUnit);

        // add the city name (_name) you asked from json file to the drop-down list we created above
        if(!cities.contains(_name)) {
            cities.add(_name);
        }
        citySelect.setItems(cities);

        cityTextField.clear();

        mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout2, mainDescriptionLayout3
        ,mainDescriptionLayout4,mainDescriptionLayout5,mainDescriptionLayout6,mainDescriptionLayout7
        ,mainDescriptionLayout8,mainDescriptionLayout9,mainDescriptionLayout10,mainDescriptionLayout11
        ,mainDescriptionLayout12,mainDescriptionLayout13,mainDescriptionLayout14,mainDescriptionLayout15
        ,mainDescriptionLayout16,mainDescriptionLayout17,mainDescriptionLayout18);
    }
    // remove city from drop-down list by clicking delete button
    private void removeCity() throws JSONException{

        if(citySelect.getValue().equals(_name) || !cities.equals(_name)) {
            _name = citySelect.getValue();
            citySelect.setValue(_name);
            cities.remove(_name);
            citySelect.setItems(cities);
        }else Notification.show("City not removed");

        mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout2, mainDescriptionLayout3
                ,mainDescriptionLayout4,mainDescriptionLayout5,mainDescriptionLayout6,mainDescriptionLayout7
                ,mainDescriptionLayout8,mainDescriptionLayout9,mainDescriptionLayout10,mainDescriptionLayout11
                ,mainDescriptionLayout12,mainDescriptionLayout13,mainDescriptionLayout14,mainDescriptionLayout15
                ,mainDescriptionLayout16,mainDescriptionLayout17,mainDescriptionLayout18);
    }
    // method that refreshes our UI, when selecting a city from the list
    private void refreshUI() throws JSONException {
        if(!citySelect.getValue().equals(_name)) {
            _name = citySelect.getValue();
            String defaultUnit;
            weatherService.setCityName(_name);
            weatherService5Day.setCityName2(_name);


            if (unitSelect.getValue().equals("F")) {
                weatherService.setUnit("imperial");
                weatherService5Day.setUnit2("imperial");
                unitSelect.setValue(" F");
                defaultUnit = "\u00b0" + " F";
            } else {
                weatherService.setUnit("metric");
                weatherService5Day.setUnit2("metric");
                defaultUnit = "\u00b0" + " C";
                unitSelect.setValue(" C");
            }

            // current city weather by IP from class Location
            location.setValue("Currently in " + _name);
            int temp = weatherService.returnMain().getInt("temp");
            currentTemp.setValue(temp + defaultUnit);

            // Update dashboardDetails with values from Weather5DayService
            String tempMin = null;
            String tempMax = null;
            String _pressure = null;
            String _humidity = null;
            String _feelsLike = null;
            String _pop = null;
            String _speed = null;
            String _deg = null;
            String _dtTxt = null;

            // Reading jsonArray from weatherService5Day. Use "if" statements to pass values for every 3-Hour
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

                // Passing values to 1st column that represents our first 3-Hour forecast
                if(i == 0) {
                    dt2.setValue("Time: " + _dtTxt);
                    minTemp2.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp2.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop2.setValue("Rain Probability: " + _pop);
                    pressure2.setValue("Pressure: " + _pressure);
                    humidity2.setValue("Humidity: " + _humidity);
                    windSpeed2.setValue("Wind speed: " + _speed);
                    windDegree2.setValue("Wind degree: " + _deg);
                    feelsLike2.setValue("Feels Like: " + _feelsLike);
                    _name = weatherService5Day.returnName().getString("name");
                }

                // Trying to pass values to 2nd column that represents our second 3-Hour forecast
                if(i == 1) {
                    dt3.setValue("Time: " + _dtTxt);
                    minTemp3.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp3.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop3.setValue("Rain Probability: " + _pop);
                    pressure3.setValue("Pressure: " + _pressure);
                    humidity3.setValue("Humidity: " + _humidity);
                    windSpeed3.setValue("Wind speed: " + _speed);
                    windDegree3.setValue("Wind degree: " + _deg);
                    feelsLike3.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 2) {
                    dt4.setValue("Time: " + _dtTxt);
                    minTemp4.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp4.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop4.setValue("Rain Probability: " + _pop);
                    pressure4.setValue("Pressure: " + _pressure);
                    humidity4.setValue("Humidity: " + _humidity);
                    windSpeed4.setValue("Wind speed: " + _speed);
                    windDegree4.setValue("Wind degree: " + _deg);
                    feelsLike4.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 3) {
                    dt5.setValue("Time: " + _dtTxt);
                    minTemp5.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp5.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop5.setValue("Rain Probability: " + _pop);
                    pressure5.setValue("Pressure: " + _pressure);
                    humidity5.setValue("Humidity: " + _humidity);
                    windSpeed5.setValue("Wind speed: " + _speed);
                    windDegree5.setValue("Wind degree: " + _deg);
                    feelsLike5.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 4) {
                    dt6.setValue("Time: " + _dtTxt);
                    minTemp6.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp6.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop6.setValue("Rain Probability: " + _pop);
                    pressure6.setValue("Pressure: " + _pressure);
                    humidity6.setValue("Humidity: " + _humidity);
                    windSpeed6.setValue("Wind speed: " + _speed);
                    windDegree6.setValue("Wind degree: " + _deg);
                    feelsLike6.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 5) {
                    dt7.setValue("Time: " + _dtTxt);
                    minTemp7.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp7.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop7.setValue("Rain Probability: " + _pop);
                    pressure7.setValue("Pressure: " + _pressure);
                    humidity7.setValue("Humidity: " + _humidity);
                    windSpeed7.setValue("Wind speed: " + _speed);
                    windDegree7.setValue("Wind degree: " + _deg);
                    feelsLike7.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 6) {
                    dt8.setValue("Time: " + _dtTxt);
                    minTemp8.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp8.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop8.setValue("Rain Probability: " + _pop);
                    pressure8.setValue("Pressure: " + _pressure);
                    humidity8.setValue("Humidity: " + _humidity);
                    windSpeed8.setValue("Wind speed: " + _speed);
                    windDegree8.setValue("Wind degree: " + _deg);
                    feelsLike8.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 7) {
                    dt9.setValue("Time: " + _dtTxt);
                    minTemp9.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp9.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop9.setValue("Rain Probability: " + _pop);
                    pressure9.setValue("Pressure: " + _pressure);
                    humidity9.setValue("Humidity: " + _humidity);
                    windSpeed9.setValue("Wind speed: " + _speed);
                    windDegree9.setValue("Wind degree: " + _deg);
                    feelsLike9.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 8) {
                    dt10.setValue("Time: " + _dtTxt);
                    minTemp10.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp10.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop10.setValue("Rain Probability: " + _pop);
                    pressure10.setValue("Pressure: " + _pressure);
                    humidity10.setValue("Humidity: " + _humidity);
                    windSpeed10.setValue("Wind speed: " + _speed);
                    windDegree10.setValue("Wind degree: " + _deg);
                    feelsLike10.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 9) {
                    dt11.setValue("Time: " + _dtTxt);
                    minTemp11.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp11.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop11.setValue("Rain Probability: " + _pop);
                    pressure11.setValue("Pressure: " + _pressure);
                    humidity11.setValue("Humidity: " + _humidity);
                    windSpeed11.setValue("Wind speed: " + _speed);
                    windDegree11.setValue("Wind degree: " + _deg);
                    feelsLike11.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 10) {
                    dt12.setValue("Time: " + _dtTxt);
                    minTemp12.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp12.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop12.setValue("Rain Probability: " + _pop);
                    pressure12.setValue("Pressure: " + _pressure);
                    humidity12.setValue("Humidity: " + _humidity);
                    windSpeed12.setValue("Wind speed: " + _speed);
                    windDegree12.setValue("Wind degree: " + _deg);
                    feelsLike12.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 11) {
                    dt13.setValue("Time: " + _dtTxt);
                    minTemp13.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp13.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop13.setValue("Rain Probability: " + _pop);
                    pressure13.setValue("Pressure: " + _pressure);
                    humidity13.setValue("Humidity: " + _humidity);
                    windSpeed13.setValue("Wind speed: " + _speed);
                    windDegree13.setValue("Wind degree: " + _deg);
                    feelsLike13.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 12) {
                    dt14.setValue("Time: " + _dtTxt);
                    minTemp14.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp14.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop14.setValue("Rain Probability: " + _pop);
                    pressure14.setValue("Pressure: " + _pressure);
                    humidity14.setValue("Humidity: " + _humidity);
                    windSpeed14.setValue("Wind speed: " + _speed);
                    windDegree14.setValue("Wind degree: " + _deg);
                    feelsLike14.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 13) {
                    dt15.setValue("Time: " + _dtTxt);
                    minTemp15.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp15.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop15.setValue("Rain Probability: " + _pop);
                    pressure15.setValue("Pressure: " + _pressure);
                    humidity15.setValue("Humidity: " + _humidity);
                    windSpeed15.setValue("Wind speed: " + _speed);
                    windDegree15.setValue("Wind degree: " + _deg);
                    feelsLike15.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 14) {
                    dt16.setValue("Time: " + _dtTxt);
                    minTemp16.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp16.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop16.setValue("Rain Probability: " + _pop);
                    pressure16.setValue("Pressure: " + _pressure);
                    humidity16.setValue("Humidity: " + _humidity);
                    windSpeed16.setValue("Wind speed: " + _speed);
                    windDegree16.setValue("Wind degree: " + _deg);
                    feelsLike16.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 15) {
                    dt17.setValue("Time: " + _dtTxt);
                    minTemp17.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp17.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop17.setValue("Rain Probability: " + _pop);
                    pressure17.setValue("Pressure: " + _pressure);
                    humidity17.setValue("Humidity: " + _humidity);
                    windSpeed17.setValue("Wind speed: " + _speed);
                    windDegree17.setValue("Wind degree: " + _deg);
                    feelsLike17.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 16) {
                    dt18.setValue("Time: " + _dtTxt);
                    minTemp18.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp18.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop18.setValue("Rain Probability: " + _pop);
                    pressure18.setValue("Pressure: " + _pressure);
                    humidity18.setValue("Humidity: " + _humidity);
                    windSpeed18.setValue("Wind speed: " + _speed);
                    windDegree18.setValue("Wind degree: " + _deg);
                    feelsLike18.setValue("Feels Like: " + _feelsLike);
                }
            }

            cityTextField.clear();

            mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout2, mainDescriptionLayout3
                    ,mainDescriptionLayout4,mainDescriptionLayout5,mainDescriptionLayout6,mainDescriptionLayout7
                    ,mainDescriptionLayout8,mainDescriptionLayout9,mainDescriptionLayout10,mainDescriptionLayout11
                    ,mainDescriptionLayout12,mainDescriptionLayout13,mainDescriptionLayout14,mainDescriptionLayout15
                    ,mainDescriptionLayout16,mainDescriptionLayout17,mainDescriptionLayout18);
        } else Notification.show("Cannot refresh weather data");
    }

}
