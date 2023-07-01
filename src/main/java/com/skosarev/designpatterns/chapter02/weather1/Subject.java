package com.skosarev.designpatterns.chapter02.weather1;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
