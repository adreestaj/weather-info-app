package com.integral.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class WeatherInfoModel {
    private String cityName;
    private String countryCode;
    private String lat;
    private String lon;

}
