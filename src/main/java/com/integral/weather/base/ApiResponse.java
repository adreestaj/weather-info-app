package com.integral.weather.base;

import org.springframework.lang.Nullable;

/*
 * Api response class is to streamline the API response across the application
 *  *Status code is customize status code returns Client in case failure or success
 *  Message is any customize text if there is information required to user
 * Data is actual response body of service
 *  */
public class ApiResponse<T> {

    private String statusCode;
    @Nullable
    private String message;
    private T data;

    public ApiResponse() {
        super();
    }

    public ApiResponse(String statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public ApiResponse(String statusCode, String message, T data) {
        super();
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}
