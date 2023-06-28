package com.skosarev.designpatterns.chapter01.ducks;

import com.skosarev.designpatterns.chapter01.ducks.fly.FlyWithWings;
import com.skosarev.designpatterns.chapter01.ducks.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Я настоящая утка кряква");
    }
}
