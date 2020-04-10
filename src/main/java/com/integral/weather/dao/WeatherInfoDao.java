package com.integral.weather.dao;

public interface WeatherInfoDao {

    String getWeatherInfoByCityName(String cityName);

    String getWeatherInfoByLatLon(String lat, String lon);


}
