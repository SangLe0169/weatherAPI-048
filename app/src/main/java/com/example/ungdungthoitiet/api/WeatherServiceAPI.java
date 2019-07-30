package com.example.ungdungthoitiet.api;


import com.example.ungdungthoitiet.model.CurrentWeather.CurrentWeatherResponse;
import com.example.ungdungthoitiet.model.ForecastWeather.ForecastWeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WeatherServiceAPI {

    @GET
    Call<CurrentWeatherResponse> getCurrentWeatherResponse(@Url String endUrl);

    @GET
    Call<ForecastWeatherResponse> getForecastWeatherResponse(@Url String forecastEndUrl);


}
