package com.skosarev.designpatterns.chapter01.ducks;

import com.skosarev.designpatterns.chapter01.ducks.fly.FlyNoWay;
import com.skosarev.designpatterns.chapter01.ducks.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я утка-приманка");
    }
}
