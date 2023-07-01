package com.skosarev.designpatterns.chapter02.weather2;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Текущее состояние:\nТемпература - " + temperature + "\nВлажность: " + humidity);
    }
}
