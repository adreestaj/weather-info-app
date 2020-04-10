package com.integral.weather.service;

public interface WeatherInfoSrv {
    String getWeatherInfoByCityName(String cityName);

    String getWeatherInfoByLatLon(String lat, String lon);

}
