package com.tesefire.dashy.model.weather;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponse {
    private List<WeatherDescription> weather;
    private MainInfo main;
    private String name;
}