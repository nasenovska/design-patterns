package com.uni.patterns.observer;

public interface Observer {
    String getName();

    void update();

    void setTrainer(Observable observable);
}
