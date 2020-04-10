package com.integral.weather.model;

import lombok.*;

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
