package com.integral.weather.dao;

import com.integral.weather.weatherInfoClient.WeatherInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/*
 * WeatherInfoDaoImpl is implementation of WeatherinfoDao a repo class
 * This class is repo layer used to communicate with external API's and DB
 *  */
@Repository
public class WeatherInfoDaoImpl implements WeatherInfoDao {

    @Autowired
    WeatherInfoClient weatherInfoClient;
    @Value("${weather.app.id}")
    private String appid;

    /*getWeatherInfoByCityName Is reading data from external API and
     *cache it against framework generated key w.r.t method name and params
     * Method accepting cityname as params and passing name and appid(reading from property file) to Feign client
     * */
    @Cacheable("weatherInfoCacheByCityName")
    @Override
    public String getWeatherInfoByCityName(String cityName) {
        return weatherInfoClient.getWeatherInfoByCityName(cityName, appid);
    }

    /*getWeatherInfoByCityName Is reading data from external API and
     *cache it against framework generated key w.r.t method name and params
     * Method accepting lat,lon as params and passing them along with appid(reading from property file) to Feign client
     * */
    @Cacheable("weatherInfoCacheByLatLon")
    @Override
    public String getWeatherInfoByLatLon(String lat, String lon) {
        return weatherInfoClient.getWeatherInfoByLatLon(lat, lon, appid);
    }
}
