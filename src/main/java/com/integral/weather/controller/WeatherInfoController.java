package com.integral.weather.controller;

import com.integral.weather.base.ApiResponse;
import com.integral.weather.base.ResponseCode;

import com.integral.weather.service.WeatherInfoSrv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherInfoController {
    @Autowired
    private WeatherInfoSrv weatherInfoSrv;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        return name;
    }

    @GetMapping(value = "/readWeatherByCityName" )
    public ResponseEntity<ApiResponse<String>> getWeatherInfoByCityName (@RequestParam (value = "cityName",required = true)  String cityName){
        String weatherInfo =weatherInfoSrv.getWeatherInfoByCityName(cityName);
        return new ResponseEntity<ApiResponse<String>>( new ApiResponse<String>(ResponseCode.SUCCESS_CODE,weatherInfo), HttpStatus.OK);
    }


    @GetMapping("/readWeatherByLatLong")
    public ResponseEntity<ApiResponse<String>> getWeatherInfoBylatlon (@RequestParam (value = "lat",required = true) String lat,@RequestParam (value = "lon",required = true) String lon){
        String weatherInfo =weatherInfoSrv.getWeatherInfoByLatLon(lat,lon);
        return new ResponseEntity<ApiResponse<String>>( new ApiResponse<String>(ResponseCode.SUCCESS_CODE,weatherInfo), HttpStatus.OK);
    }
}
