
package com.integral.weather.base;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<String>> exceptionHandler(Exception ex) {
		StringWriter stackTrace = new StringWriter();
		ex.printStackTrace(new PrintWriter(stackTrace));
		String data = stackTrace.toString().length() > 250 ? stackTrace.toString().substring(0, 300): stackTrace.toString();
		ApiResponse<String> error = new ApiResponse<String>(ResponseCode.FAILURE_CODE, ex.getMessage() ,data);
		return new ResponseEntity<ApiResponse<String>>(error, HttpStatus.OK);
	}

}
