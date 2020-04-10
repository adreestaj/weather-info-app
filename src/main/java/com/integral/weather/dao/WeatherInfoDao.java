package com.integral.weather.dao;

public interface WeatherInfoDao {

    public String getWeatherInfoByCityName(String cityName);
    public String getWeatherInfoByLatLon(String lat, String lon);


}
