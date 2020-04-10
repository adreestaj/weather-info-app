package com.integral.weather.weatherInfoClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 'WeatherInfoClient' Interface is abstracted way to communicate with external API
 * Name tag is name of client
 * url = "${weather.info.app.url}" is URL configured in property file and pointing to External api.
 * feign client append this in abstracted to each request
 *  */
@Component
@FeignClient(url = "${weather.info.app.url}", name = "weatherClient")
public interface WeatherInfoClient {
    /*
     *'getWeatherInfoByCityName' is passing q and appid as request params to external service
     *  */
    @GetMapping
    String getWeatherInfoByCityName(@RequestParam("q") String cityName, @RequestParam("appid") String appid);

    /*
     *'getWeatherInfoByCityName' is passing lat,lon and appid as request params to external service
     *  */
    @GetMapping
    String getWeatherInfoByLatLon(@RequestParam("lat") String lat, @RequestParam("lon") String lon, @RequestParam("appid") String appid);


}
