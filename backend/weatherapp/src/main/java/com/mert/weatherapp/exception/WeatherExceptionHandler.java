package com.mert.weatherapp.exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;

@ControllerAdvice
public class WeatherExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(WeatherExceptionHandler.class);

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse handleHttpClientErrorException(HttpClientErrorException ex) {
        logger.error("HttpClientErrorException occurred", ex);
        return new ErrorResponse(new Date(), HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(HttpStatusCodeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handleHttpStatusCodeException(HttpStatusCodeException ex) {
        logger.error("HttpStatusCodeException occurred", ex);
        return new ErrorResponse(new Date(), HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @ExceptionHandler(RestClientException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handleRestClientException(RestClientException ex) {
        logger.error("RestClientException occurred", ex);
        return new ErrorResponse(new Date(), HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handleException(Exception ex) {
        logger.error("Exception occurred", ex);
        return new ErrorResponse(new Date(), HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred while processing your request.");
    }
}
