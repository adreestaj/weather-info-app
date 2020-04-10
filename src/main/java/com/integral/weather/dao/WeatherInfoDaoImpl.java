package com.integral.weather.dao;

import com.integral.weather.weatherInfoClient.WeatherInfoClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

@Repository
public class WeatherInfoDaoImpl implements WeatherInfoDao {

    @Autowired
    WeatherInfoClient weatherInfoClient;
    @Value("${weather.app.id}")
    private String appid;

    @Cacheable("weatherInfoCacheByCityName")
    @Override
    public String getWeatherInfoByCityName(String cityName) {
        return weatherInfoClient.getWeatherInfoByCityName(cityName,appid);
    }

    @Cacheable("weatherInfoCacheByLatLon" )
    @Override
    public String getWeatherInfoByLatLon(String lat, String lon) {
        return weatherInfoClient.getWeatherInfoByLatLon(lat,lon,appid);
    }
}
