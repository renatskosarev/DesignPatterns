package com.skosarev.designpatterns.chapter01.ducks.fly;

import com.skosarev.designpatterns.chapter01.ducks.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я летаю на ракете!");
    }
}
