package com.integral.weather.weatherInfoClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@FeignClient(url = "${weather.info.app.url}", name = "weatherClient")
public interface WeatherInfoClient {

    @GetMapping
    public String getWeatherInfoByCityName(@RequestParam("q")String cityName,@RequestParam("appid") String appid);
    @GetMapping
    public String getWeatherInfoByLatLon(@RequestParam("lat")String lat,@RequestParam("lon") String lon,@RequestParam("appid") String appid);


}
