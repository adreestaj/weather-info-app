package com.integral.weather.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.integral.weather.base.ApiResponse;
import com.integral.weather.base.ResponseCode;
import com.integral.weather.service.WeatherInfoSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class WeatherInfoController {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    private WeatherInfoSrv weatherInfoSrv;

    /*
     * "readWeatherByCityName" End point is to read data with city and country code separated by comma
     * */
    @GetMapping(value = "/readWeatherByCityName", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse<Map<String, Object>>> getWeatherInfoByCityName(@RequestParam(value = "cityName", required = true) String cityName) throws Exception {
        String weatherInfo = weatherInfoSrv.getWeatherInfoByCityName(cityName);

        Map<String, Object> responseData = mapper.readValue(weatherInfo, Map.class);
        return new ResponseEntity<ApiResponse<Map<String, Object>>>(new ApiResponse<Map<String, Object>>(ResponseCode.SUCCESS_CODE, responseData), HttpStatus.OK);
    }

    /*
     * "readWeatherByLatLong" End point is to read data with latitude and longitude of any location
     * */
    @GetMapping("/readWeatherByLatLong")
    public ResponseEntity<ApiResponse<Map<String, Object>>> getWeatherInfoBylatlon(@RequestParam(value = "lat", required = true) String lat, @RequestParam(value = "lon", required = true) String lon) throws Exception {
        String weatherInfo = weatherInfoSrv.getWeatherInfoByLatLon(lat, lon);

        Map<String, Object> responseData = mapper.readValue(weatherInfo, Map.class);
        return new ResponseEntity<ApiResponse<Map<String, Object>>>(new ApiResponse<Map<String, Object>>(ResponseCode.SUCCESS_CODE, responseData), HttpStatus.OK);
    }
}
