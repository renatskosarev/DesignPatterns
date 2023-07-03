package com.skosarev.designpatterns.chapter03.coffee;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
