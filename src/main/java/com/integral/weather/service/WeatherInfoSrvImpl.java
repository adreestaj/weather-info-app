package com.integral.weather.service;


import com.integral.weather.dao.WeatherInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class WeatherInfoSrvImpl implements WeatherInfoSrv {

    @Autowired
    private WeatherInfoDao weatherInfoDao;
   @Override
    public String getWeatherInfoByCityName(String cityName) {

        return weatherInfoDao.getWeatherInfoByCityName(cityName);
    }

    @Override
    public String getWeatherInfoByLatLon(String lat, String lon) {
        return weatherInfoDao.getWeatherInfoByLatLon(lat,lon);
    }
}
