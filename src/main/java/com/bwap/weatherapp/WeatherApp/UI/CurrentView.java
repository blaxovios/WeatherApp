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
    private HorizontalLayout mainDescriptionLayout_;
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
    private HorizontalLayout mainDescriptionLayout19;
    private HorizontalLayout mainDescriptionLayout20;
    private HorizontalLayout mainDescriptionLayout21;
    private HorizontalLayout mainDescriptionLayout22;
    private HorizontalLayout mainDescriptionLayout23;
    private HorizontalLayout mainDescriptionLayout24;
    private HorizontalLayout mainDescriptionLayout25;
    private HorizontalLayout mainDescriptionLayout26;
    private HorizontalLayout mainDescriptionLayout27;
    private HorizontalLayout mainDescriptionLayout28;
    private HorizontalLayout mainDescriptionLayout29;
    private HorizontalLayout mainDescriptionLayout30;
    private HorizontalLayout mainDescriptionLayout31;
    private HorizontalLayout mainDescriptionLayout32;
    private HorizontalLayout mainDescriptionLayout33;
    private HorizontalLayout mainDescriptionLayout34;
    private HorizontalLayout mainDescriptionLayout35;
    private HorizontalLayout mainDescriptionLayout36;
    private HorizontalLayout mainDescriptionLayout37;
    private HorizontalLayout mainDescriptionLayout38;
    private HorizontalLayout mainDescriptionLayout39;
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
    private Label maxTemp19;
    private Label maxTemp20;
    private Label maxTemp21;
    private Label maxTemp22;
    private Label maxTemp23;
    private Label maxTemp24;
    private Label maxTemp25;
    private Label maxTemp26;
    private Label maxTemp27;
    private Label maxTemp28;
    private Label maxTemp29;
    private Label maxTemp30;
    private Label maxTemp31;
    private Label maxTemp32;
    private Label maxTemp33;
    private Label maxTemp34;
    private Label maxTemp35;
    private Label maxTemp36;
    private Label maxTemp37;
    private Label maxTemp38;
    private Label maxTemp39;
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
    private Label minTemp19;
    private Label minTemp20;
    private Label minTemp21;
    private Label minTemp22;
    private Label minTemp23;
    private Label minTemp24;
    private Label minTemp25;
    private Label minTemp26;
    private Label minTemp27;
    private Label minTemp28;
    private Label minTemp29;
    private Label minTemp30;
    private Label minTemp31;
    private Label minTemp32;
    private Label minTemp33;
    private Label minTemp34;
    private Label minTemp35;
    private Label minTemp36;
    private Label minTemp37;
    private Label minTemp38;
    private Label minTemp39;
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
    private Label humidity19;
    private Label humidity20;
    private Label humidity21;
    private Label humidity22;
    private Label humidity23;
    private Label humidity24;
    private Label humidity25;
    private Label humidity26;
    private Label humidity27;
    private Label humidity28;
    private Label humidity29;
    private Label humidity30;
    private Label humidity31;
    private Label humidity32;
    private Label humidity33;
    private Label humidity34;
    private Label humidity35;
    private Label humidity36;
    private Label humidity37;
    private Label humidity38;
    private Label humidity39;
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
    private Label pressure19;
    private Label pressure20;
    private Label pressure21;
    private Label pressure22;
    private Label pressure23;
    private Label pressure24;
    private Label pressure25;
    private Label pressure26;
    private Label pressure27;
    private Label pressure28;
    private Label pressure29;
    private Label pressure30;
    private Label pressure31;
    private Label pressure32;
    private Label pressure33;
    private Label pressure34;
    private Label pressure35;
    private Label pressure36;
    private Label pressure37;
    private Label pressure38;
    private Label pressure39;
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
    private Label windSpeed19;
    private Label windSpeed20;
    private Label windSpeed21;
    private Label windSpeed22;
    private Label windSpeed23;
    private Label windSpeed24;
    private Label windSpeed25;
    private Label windSpeed26;
    private Label windSpeed27;
    private Label windSpeed28;
    private Label windSpeed29;
    private Label windSpeed30;
    private Label windSpeed31;
    private Label windSpeed32;
    private Label windSpeed33;
    private Label windSpeed34;
    private Label windSpeed35;
    private Label windSpeed36;
    private Label windSpeed37;
    private Label windSpeed38;
    private Label windSpeed39;
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
    private Label windDegree19;
    private Label windDegree20;
    private Label windDegree21;
    private Label windDegree22;
    private Label windDegree23;
    private Label windDegree24;
    private Label windDegree25;
    private Label windDegree26;
    private Label windDegree27;
    private Label windDegree28;
    private Label windDegree29;
    private Label windDegree30;
    private Label windDegree31;
    private Label windDegree32;
    private Label windDegree33;
    private Label windDegree34;
    private Label windDegree35;
    private Label windDegree36;
    private Label windDegree37;
    private Label windDegree38;
    private Label windDegree39;
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
    private Label feelsLike19;
    private Label feelsLike20;
    private Label feelsLike21;
    private Label feelsLike22;
    private Label feelsLike23;
    private Label feelsLike24;
    private Label feelsLike25;
    private Label feelsLike26;
    private Label feelsLike27;
    private Label feelsLike28;
    private Label feelsLike29;
    private Label feelsLike30;
    private Label feelsLike31;
    private Label feelsLike32;
    private Label feelsLike33;
    private Label feelsLike34;
    private Label feelsLike35;
    private Label feelsLike36;
    private Label feelsLike37;
    private Label feelsLike38;
    private Label feelsLike39;
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
    private Label dt19;
    private Label dt20;
    private Label dt21;
    private Label dt22;
    private Label dt23;
    private Label dt24;
    private Label dt25;
    private Label dt26;
    private Label dt27;
    private Label dt28;
    private Label dt29;
    private Label dt30;
    private Label dt31;
    private Label dt32;
    private Label dt33;
    private Label dt34;
    private Label dt35;
    private Label dt36;
    private Label dt37;
    private Label dt38;
    private Label dt39;
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
    private Label pop19;
    private Label pop20;
    private Label pop21;
    private Label pop22;
    private Label pop23;
    private Label pop24;
    private Label pop25;
    private Label pop26;
    private Label pop27;
    private Label pop28;
    private Label pop29;
    private Label pop30;
    private Label pop31;
    private Label pop32;
    private Label pop33;
    private Label pop34;
    private Label pop35;
    private Label pop36;
    private Label pop37;
    private Label pop38;
    private Label pop39;

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
        mainDescriptionLayout_ = new HorizontalLayout();
        mainDescriptionLayout_.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
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
        mainDescriptionLayout19 = new HorizontalLayout();
        mainDescriptionLayout19.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout20 = new HorizontalLayout();
        mainDescriptionLayout20.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout21 = new HorizontalLayout();
        mainDescriptionLayout21.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout22 = new HorizontalLayout();
        mainDescriptionLayout22.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout23 = new HorizontalLayout();
        mainDescriptionLayout23.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout24 = new HorizontalLayout();
        mainDescriptionLayout24.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout25 = new HorizontalLayout();
        mainDescriptionLayout25.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout26 = new HorizontalLayout();
        mainDescriptionLayout26.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout27 = new HorizontalLayout();
        mainDescriptionLayout27.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout28 = new HorizontalLayout();
        mainDescriptionLayout28.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout29 = new HorizontalLayout();
        mainDescriptionLayout29.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout30 = new HorizontalLayout();
        mainDescriptionLayout30.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout31 = new HorizontalLayout();
        mainDescriptionLayout31.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout32 = new HorizontalLayout();
        mainDescriptionLayout32.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout33 = new HorizontalLayout();
        mainDescriptionLayout33.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout34 = new HorizontalLayout();
        mainDescriptionLayout34.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout35 = new HorizontalLayout();
        mainDescriptionLayout35.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout36 = new HorizontalLayout();
        mainDescriptionLayout36.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout37 = new HorizontalLayout();
        mainDescriptionLayout37.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout38 = new HorizontalLayout();
        mainDescriptionLayout38.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        mainDescriptionLayout39 = new HorizontalLayout();
        mainDescriptionLayout39.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);


        // Description layout
        HorizontalLayout descriptionLayout_ = new HorizontalLayout();
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
        HorizontalLayout descriptionLayout19 = new HorizontalLayout();
        HorizontalLayout descriptionLayout20 = new HorizontalLayout();
        HorizontalLayout descriptionLayout21 = new HorizontalLayout();
        HorizontalLayout descriptionLayout22 = new HorizontalLayout();
        HorizontalLayout descriptionLayout23 = new HorizontalLayout();
        HorizontalLayout descriptionLayout24 = new HorizontalLayout();
        HorizontalLayout descriptionLayout25 = new HorizontalLayout();
        HorizontalLayout descriptionLayout26 = new HorizontalLayout();
        HorizontalLayout descriptionLayout27 = new HorizontalLayout();
        HorizontalLayout descriptionLayout28 = new HorizontalLayout();
        HorizontalLayout descriptionLayout29 = new HorizontalLayout();
        HorizontalLayout descriptionLayout30 = new HorizontalLayout();
        HorizontalLayout descriptionLayout31 = new HorizontalLayout();
        HorizontalLayout descriptionLayout32 = new HorizontalLayout();
        HorizontalLayout descriptionLayout33 = new HorizontalLayout();
        HorizontalLayout descriptionLayout34 = new HorizontalLayout();
        HorizontalLayout descriptionLayout35 = new HorizontalLayout();
        HorizontalLayout descriptionLayout36 = new HorizontalLayout();
        HorizontalLayout descriptionLayout37 = new HorizontalLayout();
        HorizontalLayout descriptionLayout38 = new HorizontalLayout();
        HorizontalLayout descriptionLayout39 = new HorizontalLayout();
        currentWeatherCond2 = new Label("Weather forecast for the next 5 Days for every 3 Hours");
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_BOLD);
        currentWeatherCond2.setStyleName(ValoTheme.LABEL_COLORED);
        descriptionLayout_.addComponent(currentWeatherCond2);
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
        descriptionLayout19.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout20.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout21.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout22.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout23.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout24.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout25.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout26.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout27.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout28.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout29.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout30.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout31.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout32.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout33.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout34.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout35.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout36.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout37.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout38.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        descriptionLayout39.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

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
        dt19 = new Label("Time: -");
        dt20 = new Label("Time: -");
        dt21 = new Label("Time: -");
        dt22 = new Label("Time: -");
        dt23 = new Label("Time: -");
        dt24 = new Label("Time: -");
        dt25 = new Label("Time: -");
        dt26 = new Label("Time: -");
        dt27 = new Label("Time: -");
        dt28 = new Label("Time: -");
        dt29 = new Label("Time: -");
        dt30 = new Label("Time: -");
        dt31 = new Label("Time: -");
        dt32 = new Label("Time: -");
        dt33 = new Label("Time: -");
        dt34 = new Label("Time: -");
        dt35 = new Label("Time: -");
        dt36 = new Label("Time: -");
        dt37 = new Label("Time: -");
        dt38 = new Label("Time: -");
        dt39 = new Label("Time: -");
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
        descriptionLayout19.addComponents(dt19);
        descriptionLayout20.addComponents(dt20);
        descriptionLayout21.addComponents(dt21);
        descriptionLayout22.addComponents(dt22);
        descriptionLayout23.addComponents(dt23);
        descriptionLayout24.addComponents(dt24);
        descriptionLayout25.addComponents(dt25);
        descriptionLayout26.addComponents(dt26);
        descriptionLayout27.addComponents(dt27);
        descriptionLayout28.addComponents(dt28);
        descriptionLayout29.addComponents(dt29);
        descriptionLayout30.addComponents(dt30);
        descriptionLayout31.addComponents(dt31);
        descriptionLayout32.addComponents(dt32);
        descriptionLayout33.addComponents(dt33);
        descriptionLayout34.addComponents(dt34);
        descriptionLayout35.addComponents(dt35);
        descriptionLayout36.addComponents(dt36);
        descriptionLayout37.addComponents(dt37);
        descriptionLayout38.addComponents(dt38);
        descriptionLayout39.addComponents(dt39);

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
        minTemp19 = new Label("Min: -");
        minTemp20 = new Label("Min: -");
        minTemp21 = new Label("Min: -");
        minTemp22 = new Label("Min: -");
        minTemp23 = new Label("Min: -");
        minTemp24 = new Label("Min: -");
        minTemp25 = new Label("Min: -");
        minTemp26 = new Label("Min: -");
        minTemp27 = new Label("Min: -");
        minTemp28 = new Label("Min: -");
        minTemp29 = new Label("Min: -");
        minTemp30 = new Label("Min: -");
        minTemp31 = new Label("Min: -");
        minTemp32 = new Label("Min: -");
        minTemp33 = new Label("Min: -");
        minTemp34 = new Label("Min: -");
        minTemp35 = new Label("Min: -");
        minTemp36 = new Label("Min: -");
        minTemp37 = new Label("Min: -");
        minTemp38 = new Label("Min: -");
        minTemp39 = new Label("Min: -");
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
        descriptionLayout19.addComponents(minTemp19);
        descriptionLayout20.addComponents(minTemp20);
        descriptionLayout21.addComponents(minTemp21);
        descriptionLayout22.addComponents(minTemp22);
        descriptionLayout23.addComponents(minTemp23);
        descriptionLayout24.addComponents(minTemp24);
        descriptionLayout25.addComponents(minTemp25);
        descriptionLayout26.addComponents(minTemp26);
        descriptionLayout27.addComponents(minTemp27);
        descriptionLayout28.addComponents(minTemp28);
        descriptionLayout29.addComponents(minTemp29);
        descriptionLayout30.addComponents(minTemp30);
        descriptionLayout31.addComponents(minTemp31);
        descriptionLayout32.addComponents(minTemp32);
        descriptionLayout33.addComponents(minTemp33);
        descriptionLayout34.addComponents(minTemp34);
        descriptionLayout35.addComponents(minTemp35);
        descriptionLayout36.addComponents(minTemp36);
        descriptionLayout37.addComponents(minTemp37);
        descriptionLayout38.addComponents(minTemp38);
        descriptionLayout39.addComponents(minTemp39);

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
        maxTemp19 = new Label("Max: -");
        maxTemp20 = new Label("Max: -");
        maxTemp21 = new Label("Max: -");
        maxTemp22 = new Label("Max: -");
        maxTemp23 = new Label("Max: -");
        maxTemp24 = new Label("Max: -");
        maxTemp25 = new Label("Max: -");
        maxTemp26 = new Label("Max: -");
        maxTemp27 = new Label("Max: -");
        maxTemp28 = new Label("Max: -");
        maxTemp29 = new Label("Max: -");
        maxTemp30 = new Label("Max: -");
        maxTemp31 = new Label("Max: -");
        maxTemp32 = new Label("Max: -");
        maxTemp33 = new Label("Max: -");
        maxTemp34 = new Label("Max: -");
        maxTemp35 = new Label("Max: -");
        maxTemp36 = new Label("Max: -");
        maxTemp37 = new Label("Max: -");
        maxTemp38 = new Label("Max: -");
        maxTemp39 = new Label("Max: -");
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
        descriptionLayout19.addComponents(maxTemp19);
        descriptionLayout20.addComponents(maxTemp20);
        descriptionLayout21.addComponents(maxTemp21);
        descriptionLayout22.addComponents(maxTemp22);
        descriptionLayout23.addComponents(maxTemp23);
        descriptionLayout24.addComponents(maxTemp24);
        descriptionLayout25.addComponents(maxTemp25);
        descriptionLayout26.addComponents(maxTemp26);
        descriptionLayout27.addComponents(maxTemp27);
        descriptionLayout28.addComponents(maxTemp28);
        descriptionLayout29.addComponents(maxTemp29);
        descriptionLayout30.addComponents(maxTemp30);
        descriptionLayout31.addComponents(maxTemp31);
        descriptionLayout32.addComponents(maxTemp32);
        descriptionLayout33.addComponents(maxTemp33);
        descriptionLayout34.addComponents(maxTemp34);
        descriptionLayout35.addComponents(maxTemp35);
        descriptionLayout36.addComponents(maxTemp36);
        descriptionLayout37.addComponents(maxTemp37);
        descriptionLayout38.addComponents(maxTemp38);
        descriptionLayout39.addComponents(maxTemp39);

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
        pop19 = new Label("Rain Probability: -");
        pop20 = new Label("Rain Probability: -");
        pop21 = new Label("Rain Probability: -");
        pop22 = new Label("Rain Probability: -");
        pop23 = new Label("Rain Probability: -");
        pop24 = new Label("Rain Probability: -");
        pop25 = new Label("Rain Probability: -");
        pop26 = new Label("Rain Probability: -");
        pop27 = new Label("Rain Probability: -");
        pop28 = new Label("Rain Probability: -");
        pop29 = new Label("Rain Probability: -");
        pop30 = new Label("Rain Probability: -");
        pop31 = new Label("Rain Probability: -");
        pop32 = new Label("Rain Probability: -");
        pop33 = new Label("Rain Probability: -");
        pop34 = new Label("Rain Probability: -");
        pop35 = new Label("Rain Probability: -");
        pop36 = new Label("Rain Probability: -");
        pop37 = new Label("Rain Probability: -");
        pop38 = new Label("Rain Probability: -");
        pop39 = new Label("Rain Probability: -");
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
        descriptionLayout19.addComponents(pop19);
        descriptionLayout20.addComponents(pop20);
        descriptionLayout21.addComponents(pop21);
        descriptionLayout22.addComponents(pop22);
        descriptionLayout23.addComponents(pop23);
        descriptionLayout24.addComponents(pop24);
        descriptionLayout25.addComponents(pop25);
        descriptionLayout26.addComponents(pop26);
        descriptionLayout27.addComponents(pop27);
        descriptionLayout28.addComponents(pop28);
        descriptionLayout29.addComponents(pop29);
        descriptionLayout30.addComponents(pop30);
        descriptionLayout31.addComponents(pop31);
        descriptionLayout32.addComponents(pop32);
        descriptionLayout33.addComponents(pop33);
        descriptionLayout34.addComponents(pop34);
        descriptionLayout35.addComponents(pop35);
        descriptionLayout36.addComponents(pop36);
        descriptionLayout37.addComponents(pop37);
        descriptionLayout38.addComponents(pop38);
        descriptionLayout39.addComponents(pop39);

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
        pressure19 = new Label("Pressure: -");
        pressure20 = new Label("Pressure: -");
        pressure21 = new Label("Pressure: -");
        pressure22 = new Label("Pressure: -");
        pressure23 = new Label("Pressure: -");
        pressure24 = new Label("Pressure: -");
        pressure25 = new Label("Pressure: -");
        pressure26 = new Label("Pressure: -");
        pressure27 = new Label("Pressure: -");
        pressure28 = new Label("Pressure: -");
        pressure29 = new Label("Pressure: -");
        pressure30 = new Label("Pressure: -");
        pressure31 = new Label("Pressure: -");
        pressure32 = new Label("Pressure: -");
        pressure33 = new Label("Pressure: -");
        pressure34 = new Label("Pressure: -");
        pressure35 = new Label("Pressure: -");
        pressure36 = new Label("Pressure: -");
        pressure37 = new Label("Pressure: -");
        pressure38 = new Label("Pressure: -");
        pressure39 = new Label("Pressure: -");
        descriptionLayout2.addComponent(pressure2);
        descriptionLayout3.addComponent(pressure3);
        descriptionLayout4.addComponent(pressure4);
        descriptionLayout5.addComponent(pressure5);
        descriptionLayout6.addComponent(pressure6);
        descriptionLayout7.addComponent(pressure7);
        descriptionLayout8.addComponent(pressure8);
        descriptionLayout9.addComponent(pressure9);
        descriptionLayout10.addComponent(pressure10);
        descriptionLayout11.addComponent(pressure11);
        descriptionLayout12.addComponent(pressure12);
        descriptionLayout13.addComponent(pressure13);
        descriptionLayout14.addComponent(pressure14);
        descriptionLayout15.addComponent(pressure15);
        descriptionLayout16.addComponent(pressure16);
        descriptionLayout17.addComponent(pressure17);
        descriptionLayout18.addComponent(pressure18);
        descriptionLayout19.addComponent(pressure19);
        descriptionLayout20.addComponent(pressure20);
        descriptionLayout21.addComponent(pressure21);
        descriptionLayout22.addComponent(pressure22);
        descriptionLayout23.addComponent(pressure23);
        descriptionLayout24.addComponent(pressure24);
        descriptionLayout25.addComponent(pressure25);
        descriptionLayout26.addComponent(pressure26);
        descriptionLayout27.addComponent(pressure27);
        descriptionLayout28.addComponent(pressure28);
        descriptionLayout29.addComponent(pressure29);
        descriptionLayout30.addComponent(pressure30);
        descriptionLayout31.addComponent(pressure31);
        descriptionLayout32.addComponent(pressure32);
        descriptionLayout33.addComponent(pressure33);
        descriptionLayout34.addComponent(pressure34);
        descriptionLayout35.addComponent(pressure35);
        descriptionLayout36.addComponent(pressure36);
        descriptionLayout37.addComponent(pressure37);
        descriptionLayout38.addComponent(pressure38);
        descriptionLayout39.addComponent(pressure39);
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
        humidity19 = new Label("Humidity: -");
        humidity20 = new Label("Humidity: -");
        humidity21 = new Label("Humidity: -");
        humidity22 = new Label("Humidity: -");
        humidity23 = new Label("Humidity: -");
        humidity24 = new Label("Humidity: -");
        humidity25 = new Label("Humidity: -");
        humidity26 = new Label("Humidity: -");
        humidity27 = new Label("Humidity: -");
        humidity28 = new Label("Humidity: -");
        humidity29 = new Label("Humidity: -");
        humidity30 = new Label("Humidity: -");
        humidity31 = new Label("Humidity: -");
        humidity32 = new Label("Humidity: -");
        humidity33 = new Label("Humidity: -");
        humidity34 = new Label("Humidity: -");
        humidity35 = new Label("Humidity: -");
        humidity36 = new Label("Humidity: -");
        humidity37 = new Label("Humidity: -");
        humidity38 = new Label("Humidity: -");
        humidity39 = new Label("Humidity: -");
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
        descriptionLayout19.addComponents(humidity19);
        descriptionLayout20.addComponents(humidity20);
        descriptionLayout21.addComponents(humidity21);
        descriptionLayout22.addComponents(humidity22);
        descriptionLayout23.addComponents(humidity23);
        descriptionLayout24.addComponents(humidity24);
        descriptionLayout25.addComponents(humidity25);
        descriptionLayout26.addComponents(humidity26);
        descriptionLayout27.addComponents(humidity27);
        descriptionLayout28.addComponents(humidity28);
        descriptionLayout29.addComponents(humidity29);
        descriptionLayout30.addComponents(humidity30);
        descriptionLayout31.addComponents(humidity31);
        descriptionLayout32.addComponents(humidity32);
        descriptionLayout33.addComponents(humidity33);
        descriptionLayout34.addComponents(humidity34);
        descriptionLayout35.addComponents(humidity35);
        descriptionLayout36.addComponents(humidity36);
        descriptionLayout37.addComponents(humidity37);
        descriptionLayout38.addComponents(humidity38);
        descriptionLayout39.addComponents(humidity39);

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
        windSpeed19 = new Label("Wind speed: -");
        windSpeed20 = new Label("Wind speed: -");
        windSpeed21 = new Label("Wind speed: -");
        windSpeed22 = new Label("Wind speed: -");
        windSpeed23 = new Label("Wind speed: -");
        windSpeed24 = new Label("Wind speed: -");
        windSpeed25 = new Label("Wind speed: -");
        windSpeed26 = new Label("Wind speed: -");
        windSpeed27 = new Label("Wind speed: -");
        windSpeed28 = new Label("Wind speed: -");
        windSpeed29 = new Label("Wind speed: -");
        windSpeed30 = new Label("Wind speed: -");
        windSpeed31 = new Label("Wind speed: -");
        windSpeed32 = new Label("Wind speed: -");
        windSpeed33 = new Label("Wind speed: -");
        windSpeed34 = new Label("Wind speed: -");
        windSpeed35 = new Label("Wind speed: -");
        windSpeed36 = new Label("Wind speed: -");
        windSpeed37 = new Label("Wind speed: -");
        windSpeed38 = new Label("Wind speed: -");
        windSpeed39 = new Label("Wind speed: -");
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
        descriptionLayout19.addComponents(windSpeed19);
        descriptionLayout20.addComponents(windSpeed20);
        descriptionLayout21.addComponents(windSpeed21);
        descriptionLayout22.addComponents(windSpeed22);
        descriptionLayout23.addComponents(windSpeed23);
        descriptionLayout24.addComponents(windSpeed24);
        descriptionLayout25.addComponents(windSpeed25);
        descriptionLayout26.addComponents(windSpeed26);
        descriptionLayout27.addComponents(windSpeed27);
        descriptionLayout28.addComponents(windSpeed28);
        descriptionLayout29.addComponents(windSpeed29);
        descriptionLayout30.addComponents(windSpeed30);
        descriptionLayout31.addComponents(windSpeed31);
        descriptionLayout32.addComponents(windSpeed32);
        descriptionLayout33.addComponents(windSpeed33);
        descriptionLayout34.addComponents(windSpeed34);
        descriptionLayout35.addComponents(windSpeed35);
        descriptionLayout36.addComponents(windSpeed36);
        descriptionLayout37.addComponents(windSpeed37);
        descriptionLayout38.addComponents(windSpeed38);
        descriptionLayout39.addComponents(windSpeed39);

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
        windDegree19 = new Label("Wind degree: -");
        windDegree20 = new Label("Wind degree: -");
        windDegree21 = new Label("Wind degree: -");
        windDegree22 = new Label("Wind degree: -");
        windDegree23 = new Label("Wind degree: -");
        windDegree24 = new Label("Wind degree: -");
        windDegree25 = new Label("Wind degree: -");
        windDegree26 = new Label("Wind degree: -");
        windDegree27 = new Label("Wind degree: -");
        windDegree28 = new Label("Wind degree: -");
        windDegree29 = new Label("Wind degree: -");
        windDegree30 = new Label("Wind degree: -");
        windDegree31 = new Label("Wind degree: -");
        windDegree32 = new Label("Wind degree: -");
        windDegree33 = new Label("Wind degree: -");
        windDegree34 = new Label("Wind degree: -");
        windDegree35 = new Label("Wind degree: -");
        windDegree36 = new Label("Wind degree: -");
        windDegree37 = new Label("Wind degree: -");
        windDegree38 = new Label("Wind degree: -");
        windDegree39 = new Label("Wind degree: -");
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
        descriptionLayout19.addComponents(windDegree19);
        descriptionLayout20.addComponents(windDegree20);
        descriptionLayout21.addComponents(windDegree21);
        descriptionLayout22.addComponents(windDegree22);
        descriptionLayout23.addComponents(windDegree23);
        descriptionLayout24.addComponents(windDegree24);
        descriptionLayout25.addComponents(windDegree25);
        descriptionLayout26.addComponents(windDegree26);
        descriptionLayout27.addComponents(windDegree27);
        descriptionLayout28.addComponents(windDegree28);
        descriptionLayout29.addComponents(windDegree29);
        descriptionLayout30.addComponents(windDegree30);
        descriptionLayout31.addComponents(windDegree31);
        descriptionLayout32.addComponents(windDegree32);
        descriptionLayout33.addComponents(windDegree33);
        descriptionLayout34.addComponents(windDegree34);
        descriptionLayout35.addComponents(windDegree35);
        descriptionLayout36.addComponents(windDegree36);
        descriptionLayout37.addComponents(windDegree37);
        descriptionLayout38.addComponents(windDegree38);
        descriptionLayout39.addComponents(windDegree39);

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
        feelsLike19 = new Label("Feels like: -");
        feelsLike20 = new Label("Feels like: -");
        feelsLike21 = new Label("Feels like: -");
        feelsLike22 = new Label("Feels like: -");
        feelsLike23 = new Label("Feels like: -");
        feelsLike24 = new Label("Feels like: -");
        feelsLike25 = new Label("Feels like: -");
        feelsLike26 = new Label("Feels like: -");
        feelsLike27 = new Label("Feels like: -");
        feelsLike28 = new Label("Feels like: -");
        feelsLike29 = new Label("Feels like: -");
        feelsLike30 = new Label("Feels like: -");
        feelsLike31 = new Label("Feels like: -");
        feelsLike32 = new Label("Feels like: -");
        feelsLike33 = new Label("Feels like: -");
        feelsLike34 = new Label("Feels like: -");
        feelsLike35 = new Label("Feels like: -");
        feelsLike36 = new Label("Feels like: -");
        feelsLike37 = new Label("Feels like: -");
        feelsLike38 = new Label("Feels like: -");
        feelsLike39 = new Label("Feels like: -");
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
        descriptionLayout19.addComponents(feelsLike19);
        descriptionLayout20.addComponents(feelsLike20);
        descriptionLayout21.addComponents(feelsLike21);
        descriptionLayout22.addComponents(feelsLike22);
        descriptionLayout23.addComponents(feelsLike23);
        descriptionLayout24.addComponents(feelsLike24);
        descriptionLayout25.addComponents(feelsLike25);
        descriptionLayout26.addComponents(feelsLike26);
        descriptionLayout27.addComponents(feelsLike27);
        descriptionLayout28.addComponents(feelsLike28);
        descriptionLayout29.addComponents(feelsLike29);
        descriptionLayout30.addComponents(feelsLike30);
        descriptionLayout31.addComponents(feelsLike31);
        descriptionLayout32.addComponents(feelsLike32);
        descriptionLayout33.addComponents(feelsLike33);
        descriptionLayout34.addComponents(feelsLike34);
        descriptionLayout35.addComponents(feelsLike35);
        descriptionLayout36.addComponents(feelsLike36);
        descriptionLayout37.addComponents(feelsLike37);
        descriptionLayout38.addComponents(feelsLike38);
        descriptionLayout39.addComponents(feelsLike39);

        mainDescriptionLayout_.addComponents(descriptionLayout_);
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
        mainDescriptionLayout19.addComponents(descriptionLayout19);
        mainDescriptionLayout20.addComponents(descriptionLayout20);
        mainDescriptionLayout21.addComponents(descriptionLayout21);
        mainDescriptionLayout22.addComponents(descriptionLayout22);
        mainDescriptionLayout23.addComponents(descriptionLayout23);
        mainDescriptionLayout24.addComponents(descriptionLayout24);
        mainDescriptionLayout25.addComponents(descriptionLayout25);
        mainDescriptionLayout26.addComponents(descriptionLayout26);
        mainDescriptionLayout27.addComponents(descriptionLayout27);
        mainDescriptionLayout28.addComponents(descriptionLayout28);
        mainDescriptionLayout29.addComponents(descriptionLayout29);
        mainDescriptionLayout30.addComponents(descriptionLayout30);
        mainDescriptionLayout31.addComponents(descriptionLayout31);
        mainDescriptionLayout32.addComponents(descriptionLayout32);
        mainDescriptionLayout33.addComponents(descriptionLayout33);
        mainDescriptionLayout34.addComponents(descriptionLayout34);
        mainDescriptionLayout35.addComponents(descriptionLayout35);
        mainDescriptionLayout36.addComponents(descriptionLayout36);
        mainDescriptionLayout37.addComponents(descriptionLayout37);
        mainDescriptionLayout38.addComponents(descriptionLayout38);
        mainDescriptionLayout39.addComponents(descriptionLayout39);

        mainLayout.addComponents(mainDescriptionLayout, mainDescriptionLayout_, mainDescriptionLayout2, mainDescriptionLayout3, mainDescriptionLayout4,
                mainDescriptionLayout5, mainDescriptionLayout6, mainDescriptionLayout7, mainDescriptionLayout8,
                mainDescriptionLayout9, mainDescriptionLayout10, mainDescriptionLayout11, mainDescriptionLayout12,
                mainDescriptionLayout13, mainDescriptionLayout14, mainDescriptionLayout15, mainDescriptionLayout16,
                mainDescriptionLayout17, mainDescriptionLayout18,mainDescriptionLayout19,mainDescriptionLayout20,
                mainDescriptionLayout21,mainDescriptionLayout22,mainDescriptionLayout23,mainDescriptionLayout24,
                mainDescriptionLayout25,mainDescriptionLayout26,mainDescriptionLayout27,mainDescriptionLayout28,
                mainDescriptionLayout29,mainDescriptionLayout30,mainDescriptionLayout31,mainDescriptionLayout32,
                mainDescriptionLayout33,mainDescriptionLayout34,mainDescriptionLayout35,mainDescriptionLayout36,
                mainDescriptionLayout37,mainDescriptionLayout38,mainDescriptionLayout39);

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
            if(i == 17) {
                dt19.setValue("Time: " + _dtTxt);
                minTemp19.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp19.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop19.setValue("Rain Probability: " + _pop);
                pressure19.setValue("Pressure: " + _pressure);
                humidity19.setValue("Humidity: " + _humidity);
                windSpeed19.setValue("Wind speed: " + _speed);
                windDegree19.setValue("Wind degree: " + _deg);
                feelsLike19.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 18) {
                dt20.setValue("Time: " + _dtTxt);
                minTemp20.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp20.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop20.setValue("Rain Probability: " + _pop);
                pressure20.setValue("Pressure: " + _pressure);
                humidity20.setValue("Humidity: " + _humidity);
                windSpeed20.setValue("Wind speed: " + _speed);
                windDegree20.setValue("Wind degree: " + _deg);
                feelsLike20.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 19) {
                dt21.setValue("Time: " + _dtTxt);
                minTemp21.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp21.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop21.setValue("Rain Probability: " + _pop);
                pressure21.setValue("Pressure: " + _pressure);
                humidity21.setValue("Humidity: " + _humidity);
                windSpeed21.setValue("Wind speed: " + _speed);
                windDegree21.setValue("Wind degree: " + _deg);
                feelsLike21.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 20) {
                dt22.setValue("Time: " + _dtTxt);
                minTemp22.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp22.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop22.setValue("Rain Probability: " + _pop);
                pressure22.setValue("Pressure: " + _pressure);
                humidity22.setValue("Humidity: " + _humidity);
                windSpeed22.setValue("Wind speed: " + _speed);
                windDegree22.setValue("Wind degree: " + _deg);
                feelsLike22.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 21) {
                dt23.setValue("Time: " + _dtTxt);
                minTemp23.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp23.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop23.setValue("Rain Probability: " + _pop);
                pressure23.setValue("Pressure: " + _pressure);
                humidity23.setValue("Humidity: " + _humidity);
                windSpeed23.setValue("Wind speed: " + _speed);
                windDegree23.setValue("Wind degree: " + _deg);
                feelsLike23.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 22) {
                dt24.setValue("Time: " + _dtTxt);
                minTemp24.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp24.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop24.setValue("Rain Probability: " + _pop);
                pressure24.setValue("Pressure: " + _pressure);
                humidity24.setValue("Humidity: " + _humidity);
                windSpeed24.setValue("Wind speed: " + _speed);
                windDegree24.setValue("Wind degree: " + _deg);
                feelsLike24.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 23) {
                dt25.setValue("Time: " + _dtTxt);
                minTemp25.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp25.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop25.setValue("Rain Probability: " + _pop);
                pressure25.setValue("Pressure: " + _pressure);
                humidity25.setValue("Humidity: " + _humidity);
                windSpeed25.setValue("Wind speed: " + _speed);
                windDegree25.setValue("Wind degree: " + _deg);
                feelsLike25.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 24) {
                dt26.setValue("Time: " + _dtTxt);
                minTemp26.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp26.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop26.setValue("Rain Probability: " + _pop);
                pressure26.setValue("Pressure: " + _pressure);
                humidity26.setValue("Humidity: " + _humidity);
                windSpeed26.setValue("Wind speed: " + _speed);
                windDegree26.setValue("Wind degree: " + _deg);
                feelsLike26.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 25) {
                dt27.setValue("Time: " + _dtTxt);
                minTemp27.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp27.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop27.setValue("Rain Probability: " + _pop);
                pressure27.setValue("Pressure: " + _pressure);
                humidity27.setValue("Humidity: " + _humidity);
                windSpeed27.setValue("Wind speed: " + _speed);
                windDegree27.setValue("Wind degree: " + _deg);
                feelsLike27.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 26) {
                dt28.setValue("Time: " + _dtTxt);
                minTemp28.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp28.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop28.setValue("Rain Probability: " + _pop);
                pressure28.setValue("Pressure: " + _pressure);
                humidity28.setValue("Humidity: " + _humidity);
                windSpeed28.setValue("Wind speed: " + _speed);
                windDegree28.setValue("Wind degree: " + _deg);
                feelsLike28.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 27) {
                dt29.setValue("Time: " + _dtTxt);
                minTemp29.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp29.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop29.setValue("Rain Probability: " + _pop);
                pressure29.setValue("Pressure: " + _pressure);
                humidity29.setValue("Humidity: " + _humidity);
                windSpeed29.setValue("Wind speed: " + _speed);
                windDegree29.setValue("Wind degree: " + _deg);
                feelsLike29.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 28) {
                dt30.setValue("Time: " + _dtTxt);
                minTemp30.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp30.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop30.setValue("Rain Probability: " + _pop);
                pressure30.setValue("Pressure: " + _pressure);
                humidity30.setValue("Humidity: " + _humidity);
                windSpeed30.setValue("Wind speed: " + _speed);
                windDegree30.setValue("Wind degree: " + _deg);
                feelsLike30.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 29) {
                dt31.setValue("Time: " + _dtTxt);
                minTemp31.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp31.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop31.setValue("Rain Probability: " + _pop);
                pressure31.setValue("Pressure: " + _pressure);
                humidity31.setValue("Humidity: " + _humidity);
                windSpeed31.setValue("Wind speed: " + _speed);
                windDegree31.setValue("Wind degree: " + _deg);
                feelsLike31.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 30) {
                dt32.setValue("Time: " + _dtTxt);
                minTemp32.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp32.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop32.setValue("Rain Probability: " + _pop);
                pressure32.setValue("Pressure: " + _pressure);
                humidity32.setValue("Humidity: " + _humidity);
                windSpeed32.setValue("Wind speed: " + _speed);
                windDegree32.setValue("Wind degree: " + _deg);
                feelsLike32.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 31) {
                dt33.setValue("Time: " + _dtTxt);
                minTemp33.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp33.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop33.setValue("Rain Probability: " + _pop);
                pressure33.setValue("Pressure: " + _pressure);
                humidity33.setValue("Humidity: " + _humidity);
                windSpeed33.setValue("Wind speed: " + _speed);
                windDegree33.setValue("Wind degree: " + _deg);
                feelsLike33.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 32) {
                dt34.setValue("Time: " + _dtTxt);
                minTemp34.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp34.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop34.setValue("Rain Probability: " + _pop);
                pressure34.setValue("Pressure: " + _pressure);
                humidity34.setValue("Humidity: " + _humidity);
                windSpeed34.setValue("Wind speed: " + _speed);
                windDegree34.setValue("Wind degree: " + _deg);
                feelsLike34.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 33) {
                dt35.setValue("Time: " + _dtTxt);
                minTemp35.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp35.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop35.setValue("Rain Probability: " + _pop);
                pressure35.setValue("Pressure: " + _pressure);
                humidity35.setValue("Humidity: " + _humidity);
                windSpeed35.setValue("Wind speed: " + _speed);
                windDegree35.setValue("Wind degree: " + _deg);
                feelsLike35.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 34) {
                dt36.setValue("Time: " + _dtTxt);
                minTemp36.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp36.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop36.setValue("Rain Probability: " + _pop);
                pressure36.setValue("Pressure: " + _pressure);
                humidity36.setValue("Humidity: " + _humidity);
                windSpeed36.setValue("Wind speed: " + _speed);
                windDegree36.setValue("Wind degree: " + _deg);
                feelsLike36.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 35) {
                dt37.setValue("Time: " + _dtTxt);
                minTemp37.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp37.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop37.setValue("Rain Probability: " + _pop);
                pressure37.setValue("Pressure: " + _pressure);
                humidity37.setValue("Humidity: " + _humidity);
                windSpeed37.setValue("Wind speed: " + _speed);
                windDegree37.setValue("Wind degree: " + _deg);
                feelsLike37.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 36) {
                dt38.setValue("Time: " + _dtTxt);
                minTemp38.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp38.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop38.setValue("Rain Probability: " + _pop);
                pressure38.setValue("Pressure: " + _pressure);
                humidity38.setValue("Humidity: " + _humidity);
                windSpeed38.setValue("Wind speed: " + _speed);
                windDegree38.setValue("Wind degree: " + _deg);
                feelsLike38.setValue("Feels Like: " + _feelsLike);
            }
            if(i == 37) {
                dt39.setValue("Time: " + _dtTxt);
                minTemp39.setValue("Min temp: " + tempMin + unitSelect.getValue());
                maxTemp39.setValue("Max temp: " + tempMax + unitSelect.getValue());
                pop39.setValue("Rain Probability: " + _pop);
                pressure39.setValue("Pressure: " + _pressure);
                humidity39.setValue("Humidity: " + _humidity);
                windSpeed39.setValue("Wind speed: " + _speed);
                windDegree39.setValue("Wind degree: " + _deg);
                feelsLike39.setValue("Feels Like: " + _feelsLike);
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

        mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout_, mainDescriptionLayout2, mainDescriptionLayout3, mainDescriptionLayout4,
                mainDescriptionLayout5, mainDescriptionLayout6, mainDescriptionLayout7, mainDescriptionLayout8,
                mainDescriptionLayout9, mainDescriptionLayout10, mainDescriptionLayout11, mainDescriptionLayout12,
                mainDescriptionLayout13, mainDescriptionLayout14, mainDescriptionLayout15, mainDescriptionLayout16,
                mainDescriptionLayout17, mainDescriptionLayout18,mainDescriptionLayout19,mainDescriptionLayout20,
                mainDescriptionLayout21,mainDescriptionLayout22,mainDescriptionLayout23,mainDescriptionLayout24,
                mainDescriptionLayout25,mainDescriptionLayout26,mainDescriptionLayout27,mainDescriptionLayout28,
                mainDescriptionLayout29,mainDescriptionLayout30,mainDescriptionLayout31,mainDescriptionLayout32,
                mainDescriptionLayout33,mainDescriptionLayout34,mainDescriptionLayout35,mainDescriptionLayout36,
                mainDescriptionLayout37,mainDescriptionLayout38,mainDescriptionLayout39);
    }
    // remove city from drop-down list by clicking delete button
    private void removeCity() throws JSONException{

        if(citySelect.getValue().equals(_name) || !cities.equals(_name)) {
            _name = citySelect.getValue();
            citySelect.setValue(_name);
            cities.remove(_name);
            citySelect.setItems(cities);
        }else Notification.show("City not removed");

        mainLayout.addComponents(dashboard, mainDescriptionLayout, mainDescriptionLayout_, mainDescriptionLayout2, mainDescriptionLayout3, mainDescriptionLayout4,
                mainDescriptionLayout5, mainDescriptionLayout6, mainDescriptionLayout7, mainDescriptionLayout8,
                mainDescriptionLayout9, mainDescriptionLayout10, mainDescriptionLayout11, mainDescriptionLayout12,
                mainDescriptionLayout13, mainDescriptionLayout14, mainDescriptionLayout15, mainDescriptionLayout16,
                mainDescriptionLayout17, mainDescriptionLayout18,mainDescriptionLayout19,mainDescriptionLayout20,
                mainDescriptionLayout21,mainDescriptionLayout22,mainDescriptionLayout23,mainDescriptionLayout24,
                mainDescriptionLayout25,mainDescriptionLayout26,mainDescriptionLayout27,mainDescriptionLayout28,
                mainDescriptionLayout29,mainDescriptionLayout30,mainDescriptionLayout31,mainDescriptionLayout32,
                mainDescriptionLayout33,mainDescriptionLayout34,mainDescriptionLayout35,mainDescriptionLayout36,
                mainDescriptionLayout37,mainDescriptionLayout38,mainDescriptionLayout39);
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
                if(i == 17) {
                    dt19.setValue("Time: " + _dtTxt);
                    minTemp19.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp19.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop19.setValue("Rain Probability: " + _pop);
                    pressure19.setValue("Pressure: " + _pressure);
                    humidity19.setValue("Humidity: " + _humidity);
                    windSpeed19.setValue("Wind speed: " + _speed);
                    windDegree19.setValue("Wind degree: " + _deg);
                    feelsLike19.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 18) {
                    dt20.setValue("Time: " + _dtTxt);
                    minTemp20.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp20.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop20.setValue("Rain Probability: " + _pop);
                    pressure20.setValue("Pressure: " + _pressure);
                    humidity20.setValue("Humidity: " + _humidity);
                    windSpeed20.setValue("Wind speed: " + _speed);
                    windDegree20.setValue("Wind degree: " + _deg);
                    feelsLike20.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 19) {
                    dt21.setValue("Time: " + _dtTxt);
                    minTemp21.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp21.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop21.setValue("Rain Probability: " + _pop);
                    pressure21.setValue("Pressure: " + _pressure);
                    humidity21.setValue("Humidity: " + _humidity);
                    windSpeed21.setValue("Wind speed: " + _speed);
                    windDegree21.setValue("Wind degree: " + _deg);
                    feelsLike21.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 20) {
                    dt22.setValue("Time: " + _dtTxt);
                    minTemp22.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp22.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop22.setValue("Rain Probability: " + _pop);
                    pressure22.setValue("Pressure: " + _pressure);
                    humidity22.setValue("Humidity: " + _humidity);
                    windSpeed22.setValue("Wind speed: " + _speed);
                    windDegree22.setValue("Wind degree: " + _deg);
                    feelsLike22.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 21) {
                    dt23.setValue("Time: " + _dtTxt);
                    minTemp23.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp23.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop23.setValue("Rain Probability: " + _pop);
                    pressure23.setValue("Pressure: " + _pressure);
                    humidity23.setValue("Humidity: " + _humidity);
                    windSpeed23.setValue("Wind speed: " + _speed);
                    windDegree23.setValue("Wind degree: " + _deg);
                    feelsLike23.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 22) {
                    dt24.setValue("Time: " + _dtTxt);
                    minTemp24.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp24.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop24.setValue("Rain Probability: " + _pop);
                    pressure24.setValue("Pressure: " + _pressure);
                    humidity24.setValue("Humidity: " + _humidity);
                    windSpeed24.setValue("Wind speed: " + _speed);
                    windDegree24.setValue("Wind degree: " + _deg);
                    feelsLike24.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 23) {
                    dt25.setValue("Time: " + _dtTxt);
                    minTemp25.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp25.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop25.setValue("Rain Probability: " + _pop);
                    pressure25.setValue("Pressure: " + _pressure);
                    humidity25.setValue("Humidity: " + _humidity);
                    windSpeed25.setValue("Wind speed: " + _speed);
                    windDegree25.setValue("Wind degree: " + _deg);
                    feelsLike25.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 24) {
                    dt26.setValue("Time: " + _dtTxt);
                    minTemp26.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp26.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop26.setValue("Rain Probability: " + _pop);
                    pressure26.setValue("Pressure: " + _pressure);
                    humidity26.setValue("Humidity: " + _humidity);
                    windSpeed26.setValue("Wind speed: " + _speed);
                    windDegree26.setValue("Wind degree: " + _deg);
                    feelsLike26.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 25) {
                    dt27.setValue("Time: " + _dtTxt);
                    minTemp27.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp27.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop27.setValue("Rain Probability: " + _pop);
                    pressure27.setValue("Pressure: " + _pressure);
                    humidity27.setValue("Humidity: " + _humidity);
                    windSpeed27.setValue("Wind speed: " + _speed);
                    windDegree27.setValue("Wind degree: " + _deg);
                    feelsLike27.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 26) {
                    dt28.setValue("Time: " + _dtTxt);
                    minTemp28.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp28.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop28.setValue("Rain Probability: " + _pop);
                    pressure28.setValue("Pressure: " + _pressure);
                    humidity28.setValue("Humidity: " + _humidity);
                    windSpeed28.setValue("Wind speed: " + _speed);
                    windDegree28.setValue("Wind degree: " + _deg);
                    feelsLike28.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 27) {
                    dt29.setValue("Time: " + _dtTxt);
                    minTemp29.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp29.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop29.setValue("Rain Probability: " + _pop);
                    pressure29.setValue("Pressure: " + _pressure);
                    humidity29.setValue("Humidity: " + _humidity);
                    windSpeed29.setValue("Wind speed: " + _speed);
                    windDegree29.setValue("Wind degree: " + _deg);
                    feelsLike29.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 28) {
                    dt30.setValue("Time: " + _dtTxt);
                    minTemp30.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp30.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop30.setValue("Rain Probability: " + _pop);
                    pressure30.setValue("Pressure: " + _pressure);
                    humidity30.setValue("Humidity: " + _humidity);
                    windSpeed30.setValue("Wind speed: " + _speed);
                    windDegree30.setValue("Wind degree: " + _deg);
                    feelsLike30.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 29) {
                    dt31.setValue("Time: " + _dtTxt);
                    minTemp31.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp31.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop31.setValue("Rain Probability: " + _pop);
                    pressure31.setValue("Pressure: " + _pressure);
                    humidity31.setValue("Humidity: " + _humidity);
                    windSpeed31.setValue("Wind speed: " + _speed);
                    windDegree31.setValue("Wind degree: " + _deg);
                    feelsLike31.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 30) {
                    dt32.setValue("Time: " + _dtTxt);
                    minTemp32.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp32.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop32.setValue("Rain Probability: " + _pop);
                    pressure32.setValue("Pressure: " + _pressure);
                    humidity32.setValue("Humidity: " + _humidity);
                    windSpeed32.setValue("Wind speed: " + _speed);
                    windDegree32.setValue("Wind degree: " + _deg);
                    feelsLike32.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 31) {
                    dt33.setValue("Time: " + _dtTxt);
                    minTemp33.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp33.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop33.setValue("Rain Probability: " + _pop);
                    pressure33.setValue("Pressure: " + _pressure);
                    humidity33.setValue("Humidity: " + _humidity);
                    windSpeed33.setValue("Wind speed: " + _speed);
                    windDegree33.setValue("Wind degree: " + _deg);
                    feelsLike33.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 32) {
                    dt34.setValue("Time: " + _dtTxt);
                    minTemp34.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp34.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop34.setValue("Rain Probability: " + _pop);
                    pressure34.setValue("Pressure: " + _pressure);
                    humidity34.setValue("Humidity: " + _humidity);
                    windSpeed34.setValue("Wind speed: " + _speed);
                    windDegree34.setValue("Wind degree: " + _deg);
                    feelsLike34.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 33) {
                    dt35.setValue("Time: " + _dtTxt);
                    minTemp35.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp35.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop35.setValue("Rain Probability: " + _pop);
                    pressure35.setValue("Pressure: " + _pressure);
                    humidity35.setValue("Humidity: " + _humidity);
                    windSpeed35.setValue("Wind speed: " + _speed);
                    windDegree35.setValue("Wind degree: " + _deg);
                    feelsLike35.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 34) {
                    dt36.setValue("Time: " + _dtTxt);
                    minTemp36.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp36.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop36.setValue("Rain Probability: " + _pop);
                    pressure36.setValue("Pressure: " + _pressure);
                    humidity36.setValue("Humidity: " + _humidity);
                    windSpeed36.setValue("Wind speed: " + _speed);
                    windDegree36.setValue("Wind degree: " + _deg);
                    feelsLike36.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 35) {
                    dt37.setValue("Time: " + _dtTxt);
                    minTemp37.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp37.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop37.setValue("Rain Probability: " + _pop);
                    pressure37.setValue("Pressure: " + _pressure);
                    humidity37.setValue("Humidity: " + _humidity);
                    windSpeed37.setValue("Wind speed: " + _speed);
                    windDegree37.setValue("Wind degree: " + _deg);
                    feelsLike37.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 36) {
                    dt38.setValue("Time: " + _dtTxt);
                    minTemp38.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp38.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop38.setValue("Rain Probability: " + _pop);
                    pressure38.setValue("Pressure: " + _pressure);
                    humidity38.setValue("Humidity: " + _humidity);
                    windSpeed38.setValue("Wind speed: " + _speed);
                    windDegree38.setValue("Wind degree: " + _deg);
                    feelsLike38.setValue("Feels Like: " + _feelsLike);
                }
                if(i == 37) {
                    dt39.setValue("Time: " + _dtTxt);
                    minTemp39.setValue("Min temp: " + tempMin + unitSelect.getValue());
                    maxTemp39.setValue("Max temp: " + tempMax + unitSelect.getValue());
                    pop39.setValue("Rain Probability: " + _pop);
                    pressure39.setValue("Pressure: " + _pressure);
                    humidity39.setValue("Humidity: " + _humidity);
                    windSpeed39.setValue("Wind speed: " + _speed);
                    windDegree39.setValue("Wind degree: " + _deg);
                    feelsLike39.setValue("Feels Like: " + _feelsLike);
                }
            }

            cityTextField.clear();

            mainLayout.addComponents(mainDescriptionLayout, mainDescriptionLayout_, mainDescriptionLayout2, mainDescriptionLayout3, mainDescriptionLayout4,
                    mainDescriptionLayout5, mainDescriptionLayout6, mainDescriptionLayout7, mainDescriptionLayout8,
                    mainDescriptionLayout9, mainDescriptionLayout10, mainDescriptionLayout11, mainDescriptionLayout12,
                    mainDescriptionLayout13, mainDescriptionLayout14, mainDescriptionLayout15, mainDescriptionLayout16,
                    mainDescriptionLayout17, mainDescriptionLayout18,mainDescriptionLayout19,mainDescriptionLayout20,
                    mainDescriptionLayout21,mainDescriptionLayout22,mainDescriptionLayout23,mainDescriptionLayout24,
                    mainDescriptionLayout25,mainDescriptionLayout26,mainDescriptionLayout27,mainDescriptionLayout28,
                    mainDescriptionLayout29,mainDescriptionLayout30,mainDescriptionLayout31,mainDescriptionLayout32,
                    mainDescriptionLayout33,mainDescriptionLayout34,mainDescriptionLayout35,mainDescriptionLayout36,
                    mainDescriptionLayout37,mainDescriptionLayout38,mainDescriptionLayout39);
        } else Notification.show("Cannot refresh weather data");
    }
}
