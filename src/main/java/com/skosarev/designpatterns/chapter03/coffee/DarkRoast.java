package com.skosarev.designpatterns.chapter03.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
