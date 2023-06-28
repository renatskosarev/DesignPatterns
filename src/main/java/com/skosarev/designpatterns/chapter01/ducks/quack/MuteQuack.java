package com.skosarev.designpatterns.chapter01.ducks.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("* Тишина *");
    }
}
