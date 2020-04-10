package com.integral.weather.service;

public interface WeatherInfoSrv {
    public String getWeatherInfoByCityName(String cityName);
    public String getWeatherInfoByLatLon(String lat, String lon);

}
