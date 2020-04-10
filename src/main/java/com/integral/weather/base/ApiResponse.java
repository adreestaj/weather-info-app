package com.integral.weather.base;

import org.springframework.lang.Nullable;

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
