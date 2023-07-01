package com.skosarev.designpatterns.chapter02.weather2;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    float getTemperature();
    float getHumidity();
    float getPressure();
}
