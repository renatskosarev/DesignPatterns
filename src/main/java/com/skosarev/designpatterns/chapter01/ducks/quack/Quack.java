package com.skosarev.designpatterns.chapter01.ducks.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кря");
    }
}
